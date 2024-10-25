package com.forest.demo.Controller;

import com.forest.demo.Entity.Forest_Customer_PetsEntity;
import com.forest.demo.Entity.Forest_HistoryRecordEntity;
import com.forest.demo.Entity.Forest_PetsEntity;
import com.forest.demo.Mapper.Forest_Customer_PetsMapper;
import com.forest.demo.Service.Forest_Customer_PetsService;
import com.forest.demo.Service.Forest_HistoryRecordService;
import com.forest.demo.Service.Forest_PetsService;
import global.Forest_variable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
public class Forest_PetsController {
    //使用map存储数据
    private Map<String, Object> map = new HashMap<>();
    //数据页数和起始值
    private int count, num;
    //映射
    @Autowired
    private Forest_PetsService forest_PetsService;
    @Autowired
    private Forest_Customer_PetsService forest_customer_petsService;
    @Autowired
    private Forest_HistoryRecordService forest_historyRecordService;
    /**
     * insertSelective
     * 首次加载页面
     */
    @PostMapping("/ForestPetsEntitySelect")
    public Map<String, Object> ForestPetsEntitySelect(@RequestBody Forest_PetsEntity model, HttpServletRequest request) {
        //求出统计的数据
        num = count(model);
        //判断是否登录
        if (new Forest_variable().variableNameSession(request) == 500) {
            map.put("code", 500);
            return map;
        }
        //判断是否是首页
        if (model.getNum() != 0) {
            //若不是首页，则获取起始值
            int ss = model.getNum() * model.getSize();
            //存储起始值
            model.setNum(ss);
        }
        //查询的起始页
        List<Forest_PetsEntity> list = forest_PetsService.ForestPetsEntitySelect(model);
        //存储xiaoc的登录名
        map.put("name", new Forest_variable().sessionName(request));
        //存储的数据
        map.put("Pets", list);
        //存储页数
        map.put("num", num);
        //状态码 200
        map.put("code", 200);
        return map;
    }

    /**
     * 求出统计的数据
     */
    public int count(Forest_PetsEntity model) {
        //查询的统计数据
        count = forest_PetsService.ForestPetsEntityRow();
        //判断求出页数
        if (count % model.getSize() == 0) {
            num = count / model.getSize();
        } else {
            num = count / model.getSize() + 1;
        }
        //如果信息大于8页  只显示8页
        if (num >= 8) {
            return 8;
        }
        return num;
    }
    //搜索数据
    @PostMapping("/ForestPetsEntitySearch")
    public Map<String, Object> ForestPetsEntitySearch(@RequestBody Forest_PetsEntity model, HttpServletRequest request) {
        //求出统计的数据
        num = count1(model);
        //判断是否登录
        if (new Forest_variable().variableNameSession(request) == 500) {
            map.put("code", 500);
            return map;
        }
        //判断是否是首页
        if (model.getNum() != 0) {
            //若不是首页，则获取起始值
            int ss = model.getNum() * model.getSize();
            //存储起始值
            model.setNum(ss);
        }
        //查询的起始页
        List<Forest_PetsEntity> list = forest_PetsService.ForestPetsEntitySearch(model);
        //存储xiaoc的登录名
        map.put("name", new Forest_variable().sessionName(request));
        //存储的数据
        map.put("Pets", list);
        //存储页数
        map.put("num", num);
        //状态码 200
        map.put("code", 200);
        return map;
    }

    /**
     * 求出统计的数据
     */
    public int count1(Forest_PetsEntity model) {
        //查询的统计数据
        count = forest_PetsService.ForestPetsEntitySearchRow(model);
        //判断求出页数
        if (count % model.getSize() == 0) {
            num = count / model.getSize();
        } else {
            num = count / model.getSize() + 1;
        }
        //如果信息大于8页  只显示8页
        if (num >= 8) {
            return 8;
        }
        return num;
    }
    //新增数据
    @PostMapping("/ForestPetsEntityRegister")
    public  Map<String,Object> ForestPetsEntityRegister(@RequestBody Forest_PetsEntity forest_PetsEntity){
        //设置时间的格式
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取时间的方法
        Date d = new Date();
        //将获取的时间转换成设置的时间格式进行存储
        forest_PetsEntity.setForest_Pets_Time(sf.format(d));
        int register=forest_PetsService.ForestPetsEntityRegister(forest_PetsEntity);

        forest_PetsEntity.setNum(0);
        forest_PetsEntity.setSize(20);
        List<Forest_PetsEntity> list = forest_PetsService.ForestPetsEntitySelect(forest_PetsEntity);

        Forest_Customer_PetsEntity f=new Forest_Customer_PetsEntity();
        f.setForest_Customer_ID(forest_PetsEntity.getForest_Customer_ID());
        f.setForest_Pets_ID(list.get(0).getForest_Pets_ID());
        f.setForest_Customer_Pets_Time(sf.format(d));

        int forestRegister=forest_customer_petsService.ForestCustomerPetsEntityAdd(f);

        if(register==1&&forestRegister==1){
            map.put("code",200);
            return map;
        }
        map.put("code",500);
        return map;
    }
    //编号详情
    @PostMapping("/ForestPetsEntityID")
    public Map<String, Object> ForestPetsEntityID(@RequestBody Forest_PetsEntity model, HttpServletRequest request) {
        //判断是否登录
        if (new Forest_variable().variableNameSession(request) == 500) {
            map.put("code", 500);
            return map;
        }
        List<Forest_PetsEntity> list = forest_PetsService.ForestPetsEntityID(model);
        //存储的数据
        map.put("Pets", list);
        //状态码 200
        map.put("code", 200);
        return map;
    }
    //更改数据
    @PostMapping("/ForestPetsEntityUpdateAll")
    public Map<String, Object> ForestPetsEntityUpdateAll(@RequestBody Forest_PetsEntity model) {
        //设置时间的格式
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取时间的方法
        Date d = new Date();
        //将获取的时间转换成设置的时间格式进行存储
        model.setForest_Pets_Time(sf.format(d));
        int list = forest_PetsService.ForestPetsEntityUpdateAll(model);
        if(list==1){
            map.put("code", 200);
            return map;
        }
        //状态码 200
        map.put("code", 400);
        return map;
    }

    //宠物详情
    @PostMapping("/ForestCustomerPetsEntitySearchPetsAll")
    public Map<String, Object> ForestCustomerPetsEntitySearchPetsAll(@RequestBody Forest_Customer_PetsEntity model, HttpSession session) {
        List<Forest_Customer_PetsEntity> list =forest_customer_petsService.ForestCustomerPetsEntitySearchPetsAll(model);
        if(list.size()==0){
            //状态码 200
            map.put("code", 500);
            return map;
        }
        Forest_HistoryRecordEntity HistoryRecord=new Forest_HistoryRecordEntity();
        //设置时间的格式
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取时间的方法
        Date d = new Date();
        //将获取的时间转换成设置的时间格式进行存储
        HistoryRecord.setForest_User_Pets_Time(sf.format(d));
        HistoryRecord.setForest_Pets_ID(list.get(0).getForest_Pets_ID());
        HistoryRecord.setForest_User_ID((Integer) session.getAttribute("id"));
        forest_historyRecordService.ForestUserPetsEntityAdd(HistoryRecord);
        //存储的数据
        map.put("customerPet", list);
        //状态码 200
        map.put("code", 200);
        return map;
    }

}
