package cn.julse.predomSSH.action;

import cn.julse.predomSSH.db.user.Users;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.validation.SkipValidation;

/**
 * 登录，进入主界面
* creat_user: julse@qq.com creat_date: 2018/3/13
**/
public class HomeAction extends ActionSupport{
   private String user_email;
   private String user_password;
    /**
     * 打开login,不进行验证
     */
//    @SkipValidation
    public String home(){
        return "home";
    }
//   @Validations(
//           //验证规则
//           requiredStrings = {
//                   /**
//                    * fieldName:被验证的变量名
//                    * message：出错提示信息
//                    * shortCircuit：短路（遇到错误不继续进行）
//                    * trim：去掉头尾空格
//                    * type：ValidatorType.FIELD只对一个字段进行验证
//                    * key:国际化
//                    */
//                @RequiredStringValidator(fieldName = "user_email",message = "email can not be none",shortCircuit = true,trim = true,type = ValidatorType.FIELD),
//                @RequiredStringValidator(fieldName = "user_password",message = "user_password can not be none",shortCircuit = true,trim = true,type = ValidatorType.FIELD)
//           },
//           emails = {
//                @EmailValidator(fieldName = "user_email",message = "email are not true",shortCircuit = true,type = ValidatorType.FIELD)
//           }
//   )
   public String login(){
       //       todo:后续开发从数据库中获取的用户信息 new Users()
       ServletActionContext.getRequest().getSession().setAttribute("user",new Users());
       return "login";
   }

    /**
     * 顶部页面
     * @return
     */
   public String top(){
       return "top";
   }

    /**
     * 左侧页面
     * @return
     */
    public String left(){
        return "top";
    }
    public String main(){
        return "main";
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}
