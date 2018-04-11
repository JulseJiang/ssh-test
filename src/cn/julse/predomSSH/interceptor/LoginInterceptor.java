package cn.julse.predomSSH.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * 登录验证
* creat_user: julse@qq.com creat_date: 2018/4/3
**/
public class LoginInterceptor implements Interceptor {
    public void destroy() {

    }

    public void init() {

    }

    public String intercept(ActionInvocation invocation) throws Exception {
        //创建不需要验证的功能路径列表
        ArrayList<String> notLoginList = new ArrayList<String>();
        notLoginList.add("home/home!home.action");
        notLoginList.add("home/home!login.action");
        //获得当前请求路径
        HttpServletRequest request = ServletActionContext.getRequest();
        String path = request.getServletPath();//当前路径，contextPath是项目路径
        System.out.println("path"+path);
        //如果当前请求路径在不需要验证路径列表中，就放行
        if (notLoginList.contains(path)){
            System.out.println("放行");
            invocation.invoke();//放行
        }else {
            if (request.getSession().getAttribute("user")!=null){
                invocation.invoke();
            }
        }
        //否则进行登陆验证
        System.out.println("需要进行登陆验证");
        return "notLogin";
    }
}
