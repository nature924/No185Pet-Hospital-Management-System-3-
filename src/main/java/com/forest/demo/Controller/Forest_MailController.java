package com.forest.demo.Controller;

import com.forest.demo.Entity.Forest_MailEntity;
import com.forest.demo.Service.Forest_MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Forest_MailController {
    private  Map<String,Object> map=new HashMap<>();

    @Autowired
    Forest_MailService mailService;


    @RequestMapping("goEmail")
    public Map<String,Object> goEmail(@RequestBody Forest_MailEntity mails) throws  Exception{
        int num = (int) ((Math.random() * 9 + 1) * 100000);
        //系统发送账号
        mails.setFrom("wh508377132@163.com");
        //发送邮件内容
        String names=String.valueOf(num);
        mails.setContent("请尽快输入验证码："+names);
        //发送邮件标题
        mails.setSubject("重要通知：");
        //发送邮件收件人的账号
        mails.setTo(mails.getCc());
        //邮件接收人的姓名
        //邮件的发送的调用函数
        mailService.sendSimpleMail(mails.getFrom(),mails.getTo(),mails.getTo(),mails.getSubject(),mails.getContent(),mails.getName());
        //返回值
        map.put("code",200);
        map.put("emailNum",names);
        return map;
    }
}
