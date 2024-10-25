package global;




import com.forest.demo.Entity.Forest_userEntity;
import global.Impl.variableImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Forest_variable implements variableImpl {

    @Override
    public String variableName(HttpSession session, Forest_userEntity model) {
        //存储用户名
        session.setAttribute("name",model.getForest_User_LoginName());
        session.setAttribute("id",model.getForest_User_ID());
        //2个小时
        session.setMaxInactiveInterval(2 * 60 * 60);
        return null;
    }
    //七天内免登录
    @Override
    public String variableNameTime(HttpSession session, Forest_userEntity model) {
        session.setAttribute("name",model.getForest_User_LoginName());
        session.setAttribute("id",model.getForest_User_ID());
        session.setMaxInactiveInterval(7 * 24 * 60 * 60);
        return null;
    }

    /**
     * 如果500表示没有名字
     * 如果200表示有名字
     * @param request
     * @return
     */
    @Override
    public int variableNameSession(HttpServletRequest request)  {
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
        if(name==null)
        {
            return 500;
        }
        return 200;
    }
    public String sessionName(HttpServletRequest request)  {
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
        return name;
    }



    public int sessionID(HttpServletRequest request)  {
        HttpSession session = request.getSession();
        Object userId = session.getAttribute("userId");
        System.out.println(userId);
        int u= (int) userId;
        return u;
    }
    /**
     * 如果500表示没有名字
     * 如果200表示有名字
     * @param request
     * @return
     */
    @Override
    public int variableYeZhuNameSession(HttpServletRequest request)  {
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("username");
        if(name==null)
        {
            return 500;
        }
        return 200;
    }

    public String variableYeZhuName(HttpServletRequest request)  {
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("username");
        return name;
    }

}
