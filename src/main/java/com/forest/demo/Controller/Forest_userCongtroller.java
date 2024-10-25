package com.forest.demo.Controller;

import com.forest.demo.Entity.Forest_VetDoctorEntity;
import com.forest.demo.Entity.Forest_userEntity;
import com.forest.demo.Service.Forest_userService;
import global.Forest_variable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Forest_userCongtroller {
    //map存储数据
    private Map<String, Object> map = new HashMap<>();
    //数据页数和起始值
    private int count, num;
    //service层的映射
    @Autowired
    Forest_userService  forest_userService;
    //全局访问类
    private Forest_variable Forest_variable = new Forest_variable();
    //存储数据
    private List<Forest_userEntity> list;
    //登录
    @PostMapping("/login")
    public  Map<String,Object> login(@RequestBody Forest_userEntity forest_userEntity, HttpSession session){
        //用户登录
        forest_userEntity.setForest_User_Grade(1);
        forest_userEntity.setForest_User_State(1);
        list=forest_userService.ForestUserEntityLogin(forest_userEntity);
        if(list.size()==0){
            map.put("code",500);
            return map;
        }
        forest_userEntity.setForest_User_ID(list.get(0).getForest_User_ID());
        //使用全局变量存储  将编号 和 登录名存储到session中
        session.setAttribute("num", 1);
        Forest_variable.variableName(session, forest_userEntity);
        map.put("code",200);
        return map;
    }
    //管理登录
    @PostMapping("/UserLogin")
    public  Map<String,Object> UserLogin(@RequestBody Forest_userEntity forest_userEntity, HttpSession session){
        //用户登录
        forest_userEntity.setForest_User_Grade(2);
        forest_userEntity.setForest_User_State(1);
        list=forest_userService.ForestUserEntityLogin(forest_userEntity);
        if(list.size()==0){
            map.put("code",500);
            return map;
        }
        forest_userEntity.setForest_User_ID(list.get(0).getForest_User_ID());
        //使用全局变量存储  将编号 和 登录名存储到session中
        session.setAttribute("num", 2);
        Forest_variable.variableName(session, forest_userEntity);
        map.put("code",200);
        return map;
    }
    //注册
    @PostMapping("/register")
    public  Map<String,Object> register(@RequestBody Forest_userEntity forest_userEntity){
        forest_userEntity.setForest_User_Grade(1);
        //设置时间的格式
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取时间的方法
        Date d = new Date();
        //将获取的时间转换成设置的时间格式进行存储
        forest_userEntity.setForest_User_Time(sf.format(d));
        forest_userEntity.setForest_User_State(2);
        if(forest_userEntity.getEmailNum().equals(forest_userEntity.getForest_User_Code())){
            int register=forest_userService.ForestUserEntityRegister(forest_userEntity);
            if(register==1){
                map.put("code",200);
                return map;
            }
        }else{
            map.put("code",400);
            return map;
        }

        map.put("code",500);
        return map;
    }
    //判断用户是否存在
    @PostMapping("/ForestUserEntityIfExitLogin")
    public  Map<String,Object> ForestUserEntityIfExitLogin(@RequestBody Forest_userEntity forest_userEntity){
        list=forest_userService.ForestUserEntityIfExitLogin(forest_userEntity);
        if(list.size()==0){
            map.put("code",200);
            return map;
        }
        map.put("code",500);
        return map;
    }
    //判断身份证是否存在
    @PostMapping("/ForestUserEntityIfExitCard")
    public  Map<String,Object> ForestUserEntityIfExitCard(@RequestBody Forest_userEntity forest_userEntity){
        list=forest_userService.ForestUserEntityIfExitCard(forest_userEntity);
        if(list.size()==0){
            map.put("code",200);
            return map;
        }
        map.put("code",500);
        return map;
    }

    @PostMapping("/ForestUserEntitySelect")
    public Map<String, Object> insertSelective(@RequestBody Forest_userEntity model, HttpServletRequest request, HttpSession session) {
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
        List<Forest_userEntity> list = forest_userService.ForestUserEntitySelect(model);
        //存储xiaoc的登录名
        map.put("name", new Forest_variable().sessionName(request));
        //存储的数据
        map.put("user", list);
        //存储页数
        map.put("num", num);
        //状态码 200
        map.put("code", 200);
        return map;
    }

    /**
     * 求出统计的数据
     */
    public int count(Forest_userEntity model) {
        //查询的统计数据
        count = forest_userService.ForestUserEntityRow();
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
    @PostMapping("/ForestUserEntitySearch")
    public Map<String, Object> ForestVetDoctorEntitySearch(@RequestBody Forest_userEntity model, HttpServletRequest request) {
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
        List<Forest_userEntity> list = forest_userService.ForestUserEntitySearch(model);
        //存储xiaoc的登录名
        map.put("name", new Forest_variable().sessionName(request));
        //存储的数据
        map.put("user", list);
        //存储页数
        map.put("num", num);
        //状态码 200
        map.put("code", 200);
        return map;
    }

    /**
     * 求出统计的数据
     */
    public int count1(Forest_userEntity model) {
        //查询的统计数据
        count = forest_userService.ForestUserEntitySearchRow(model);
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
    @PostMapping("/ForestUserEntityState")
    public Map<String, Object> ForestUserEntityState(@RequestBody Forest_userEntity model, HttpServletRequest request) {
        //判断是否登录
        if (new Forest_variable().variableNameSession(request) == 500) {
            map.put("code", 500);
            return map;
        }
        int list = forest_userService.ForestUserEntityState(model);
        if(list==1){
            map.put("code", 200);
            return map;
        }
        //状态码 200
        map.put("code", 400);
        return map;
    }
}
