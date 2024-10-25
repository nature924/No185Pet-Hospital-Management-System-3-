package global.Impl;



import com.forest.demo.Entity.Forest_userEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface variableImpl {
    //存储用户的姓名
    public String variableName(HttpSession session, Forest_userEntity model);
    //记住用户的用户名
    public String variableNameTime(HttpSession session, Forest_userEntity model);
    //取数据中的session值
    public int variableNameSession(HttpServletRequest request);
    public String sessionName(HttpServletRequest request);
    //
    //public String variableYeZhuName(HttpSession session, Forest_yezhumessage model);
    //取数据中的session值
    public int variableYeZhuNameSession(HttpServletRequest request);
    public int sessionID(HttpServletRequest request);



}
