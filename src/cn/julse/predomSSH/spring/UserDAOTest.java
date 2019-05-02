package cn.julse.predomSSH.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class UserDAOTest {
    public static void main(String[] args){
        //创建共享区
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO = (UserDAO) applicationContext.getBean("userDAO");
        System.out.println(userDAO.getAll().toString());
//        sql = "insert users(userGroup_id,user_name,user_address,user_code,user_phone,user_email,user_password) values(?,?,?,?,?,?,?)";
//        Map<String,Object> user =
    }
}
