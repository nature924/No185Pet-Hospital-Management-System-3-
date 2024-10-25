package com.forest.demo.Controller;

import com.forest.demo.Entity.Forest_HistoryRecordEntity;
import com.forest.demo.Service.Forest_HistoryRecordService;
import global.Forest_variable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Forest_HistoryRecordController {
    //使用map存储数据
    private Map<String, Object> map = new HashMap<>();
    //数据页数和起始值
    private int count, num;
    //映射
    @Autowired
    private Forest_HistoryRecordService forest_historyRecordService;


    /**
     * insertSelective
     * 首次加载页面
     */
    @PostMapping("/ForestUserPetsEntitySelect")
    public Map<String, Object> ForestUserPetsEntitySelect(@RequestBody Forest_HistoryRecordEntity model, HttpServletRequest request) {
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
        List<Forest_HistoryRecordEntity> list = forest_historyRecordService.ForestUserPetsEntitySelect(model);
        //存储xiaoc的登录名
        map.put("name", new Forest_variable().sessionName(request));
        //存储的数据
        map.put("UserPet", list);
        //存储页数
        map.put("num", num);
        //状态码 200
        map.put("code", 200);
        return map;
    }

    /**
     * 求出统计的数据
     */
    public int count(Forest_HistoryRecordEntity model) {
        //查询的统计数据
        count = forest_historyRecordService.ForestUserPetsEntityRow();
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
    @PostMapping("/ForestUserPetsEntitySearch")
    public Map<String, Object> ForestUserPetsEntitySearch(@RequestBody Forest_HistoryRecordEntity model, HttpServletRequest request) {
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
        List<Forest_HistoryRecordEntity> list = forest_historyRecordService.ForestUserPetsEntitySearch(model);
        //存储xiaoc的登录名
        map.put("name", new Forest_variable().sessionName(request));
        //存储的数据
        map.put("UserPet", list);
        //存储页数
        map.put("num", num);
        //状态码 200
        map.put("code", 200);
        return map;
    }

    /**
     * 求出统计的数据
     */
    public int count1(Forest_HistoryRecordEntity model) {
        //查询的统计数据
        count = forest_historyRecordService.ForestUserPetsEntitySearchRow(model);
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
    @PostMapping("/ForestUserPetsEntityAdd")
    public  Map<String,Object> ForestUserPetsEntityAdd(@RequestBody Forest_HistoryRecordEntity forest_customerEntity){
        //设置时间的格式
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取时间的方法
        Date d = new Date();
        //将获取的时间转换成设置的时间格式进行存储
        forest_customerEntity.setForest_User_Pets_Time(sf.format(d));
        int register=forest_historyRecordService.ForestUserPetsEntityAdd(forest_customerEntity);
        if(register==1){
            map.put("code",200);
            return map;
        }
        map.put("code",500);
        return map;
    }
}
