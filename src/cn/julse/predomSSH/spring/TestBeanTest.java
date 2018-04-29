package cn.julse.predomSSH.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* creat_user: julse@qq.com creat_date: 2018/4/26
**/
public class TestBeanTest {
    public static void main(String[] args){
        /*TestBean testBean = new TestBean();
        testBean.setName("xiaoming");
        testBean.printData();*/
        //创建共享区
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //取出共享区中的对象
        TestBean testBean = (TestBean) applicationContext.getBean("testBean");
        testBean.printData();
    }
}
