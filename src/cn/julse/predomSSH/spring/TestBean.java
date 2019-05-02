package cn.julse.predomSSH.spring;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Component("testBean")
 * 注释：这是一个普通java类
* creat_user: julse@qq.com creat_date: 2018/5/3
**/
@Component("testBean")
public class TestBean {
    @Value("mengxiang")
    private String name;
    //name是个普通值，用value来注入值
    @Resource(name="users")
    private Users user;

    private Log log = LogFactory.getLog(TestBean.class);
    //user是个特殊类,要从共享区取数据
    public void printData(){
        System.out.println("testBean "+name);
        System.out.println("user "+user);
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
