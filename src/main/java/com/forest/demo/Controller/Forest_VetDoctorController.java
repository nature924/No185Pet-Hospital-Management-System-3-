package com.forest.demo.Controller;

import com.forest.demo.Entity.Forest_VetDoctorEntity;
import com.forest.demo.Mapper.Forest_VetDoctorMapper;
import com.forest.demo.Service.Forest_VetDoctorService;
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
public class Forest_VetDoctorController {
    //使用map存储数据
    private Map<String, Object> map = new HashMap<>();
    //数据页数和起始值
    private int count, num;
    //映射
    @Autowired
    private Forest_VetDoctorService forest_vetDoctorService;
    /**
     * insertSelective
     * 首次加载页面
     */
    @RequestMapping("/ForestVetDoctorEntitySelect")
    public Map<String, Object> insertSelective(@RequestBody Forest_VetDoctorEntity model, HttpServletRequest request, HttpSession session) {
        //求出统计的数据
        num = count(model);
        //判断是否登录
        if (new Forest_variable().variableNameSession(request) == 500) {
            map.put("code", 500);
            return map;
        }


        String nums = String.valueOf(session.getAttribute("num"));
        int tt = Integer.parseInt(nums);
        if (tt != 2 ) {
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
        List<Forest_VetDoctorEntity> list = forest_vetDoctorService.ForestVetDoctorEntitySelect(model);
        //存储xiaoc的登录名
        map.put("name", new Forest_variable().sessionName(request));
        //存储的数据
        map.put("doctor", list);
        //存储页数
        map.put("num", num);
        //状态码 200
        map.put("code", 200);
        return map;
    }

    /**
     * 求出统计的数据
     */
    public int count(Forest_VetDoctorEntity model) {
        //查询的统计数据
        count = forest_vetDoctorService.ForestVetDoctorEntityRow();
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
@RequestMapping("/ForestVetDoctorEntitySearch")
public Map<String, Object> ForestVetDoctorEntitySearch(@RequestBody Forest_VetDoctorEntity model, HttpServletRequest request) {
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
    List<Forest_VetDoctorEntity> list = forest_vetDoctorService.ForestVetDoctorEntitySearch(model);
    //存储xiaoc的登录名
    map.put("name", new Forest_variable().sessionName(request));
    //存储的数据
    map.put("doctor", list);
    //存储页数
    map.put("num", num);
    //状态码 200
    map.put("code", 200);
    return map;
}

    /**
     * 求出统计的数据
     */
    public int count1(Forest_VetDoctorEntity model) {
        //查询的统计数据
        count = forest_vetDoctorService.ForestVetDoctorEntitySearchRow(model);
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
    //详情
    @PostMapping("/Forest_VetDoctorEntityDetails")
    public Map<String, Object> Forest_VetDoctorEntityDetails(@RequestBody Forest_VetDoctorEntity model, HttpServletRequest request) {
        //判断是否登录
        if (new Forest_variable().variableNameSession(request) == 500) {
            map.put("code", 500);
            return map;
        }
        List<Forest_VetDoctorEntity> list = forest_vetDoctorService.Forest_VetDoctorEntityDetails(model);
        //存储的数据
        map.put("doctor", list);
        //状态码 200
        map.put("code", 200);
        return map;
    }
    //新增数据
    @PostMapping("/ForestVetDoctorEntityRegister")
    public  Map<String,Object> ForestVetDoctorEntityRegister(@RequestBody Forest_VetDoctorEntity forest_vetDoctorEntity){
        //设置时间的格式
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取时间的方法
        Date d = new Date();
        //将获取的时间转换成设置的时间格式进行存储
        forest_vetDoctorEntity.setForest_VetDoctor_Time(sf.format(d));
        forest_vetDoctorEntity.setForest_VetDoctor_Detail("生活上：活泼开朗、乐观上进、待人热情，可以和老师、同学友好相处。\n" +
                "学习上：能吃苦耐劳，用于承受压力，勇于创新。\n" +
                "工作上：担任项目助理一职，对待工作认真负责，善于沟通、喜欢积极地去帮助同学，有较强的抗压能力");

        int register=forest_vetDoctorService.ForestVetDoctorEntityRegister(forest_vetDoctorEntity);
        if(register==1){
            map.put("code",200);
            return map;
        }
        map.put("code",500);
        return map;
    }
    //编号详情
    @PostMapping("/ForestVetDoctorEntityID")
    public Map<String, Object> ForestVetDoctorEntityID(@RequestBody Forest_VetDoctorEntity model, HttpServletRequest request) {
        //判断是否登录
        if (new Forest_variable().variableNameSession(request) == 500) {
            map.put("code", 500);
            return map;
        }
        List<Forest_VetDoctorEntity> list = forest_vetDoctorService.ForestVetDoctorEntityID(model);
        //存储的数据
        map.put("doctor", list);
        //状态码 200
        map.put("code", 200);
        return map;
    }
    //更改数据
    @PostMapping("/ForestVetDoctorEntityUpdateAll")
    public Map<String, Object> ForestVetDoctorEntityUpdateAll(@RequestBody Forest_VetDoctorEntity model) {
        //设置时间的格式
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取时间的方法
        Date d = new Date();
        //将获取的时间转换成设置的时间格式进行存储
        model.setForest_VetDoctor_Time(sf.format(d));
        int list = forest_vetDoctorService.ForestVetDoctorEntityUpdateAll(model);
        if(list==1){
            map.put("code", 200);
            return map;
        }
        //状态码 200
        map.put("code", 400);
        return map;
    }
    //编号详情
    @PostMapping("/ForestVetDoctorEntityState")
    public Map<String, Object> ForestVetDoctorEntityState(@RequestBody Forest_VetDoctorEntity model, HttpServletRequest request) {
        //判断是否登录
        if (new Forest_variable().variableNameSession(request) == 500) {
            map.put("code", 500);
            return map;
        }
        int list = forest_vetDoctorService.ForestVetDoctorEntityState(model);
        if(list==1){
            map.put("code", 200);
            return map;
        }
        //状态码 200
        map.put("code", 400);
        return map;
    }


    /**
     * insertSelective
     * 首次加载页面
     */
    @RequestMapping("/ForestVetDoctorEntitySelect1")
    public Map<String, Object> insertSelective1(@RequestBody Forest_VetDoctorEntity model, HttpServletRequest request) {
        //求出统计的数据
        num = count2(model);
        System.out.println("dfgdfgfdgfdgfdgfdgfdgfd");
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
        List<Forest_VetDoctorEntity> list = forest_vetDoctorService.ForestVetDoctorEntitySelect1(model);
        //存储xiaoc的登录名
        map.put("name", new Forest_variable().sessionName(request));
        //存储的数据
        map.put("doctor", list);
        //存储页数1
        map.put("num", num);
        //状态码 200
        map.put("code", 200);
        return map;
    }

    /**
     * 求出统计的数据
     */
    public int count2(Forest_VetDoctorEntity model) {
        //查询的统计数据
        count = forest_vetDoctorService.ForestVetDoctorEntityRow1();
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
    @RequestMapping("/ForestVetDoctorEntitySearch1")
    public Map<String, Object> ForestVetDoctorEntitySearch1(@RequestBody Forest_VetDoctorEntity model, HttpServletRequest request) {
        //求出统计的数据
        num = count11(model);
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
        List<Forest_VetDoctorEntity> list = forest_vetDoctorService.ForestVetDoctorEntitySearch1(model);
        //存储xiaoc的登录名
        map.put("name", new Forest_variable().sessionName(request));
        //存储的数据
        map.put("doctor", list);
        //存储页数
        map.put("num", num);
        //状态码 200
        map.put("code", 200);
        return map;
    }

    /**
     * 求出统计的数据
     */
    public int count11(Forest_VetDoctorEntity model) {
        //查询的统计数据
        count = forest_vetDoctorService.ForestVetDoctorEntitySearchRow1(model);
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
}
