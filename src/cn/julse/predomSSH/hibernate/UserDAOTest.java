package cn.julse.predomSSH.hibernate;

import cn.julse.predomSSH.spring.UserDAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserDAOTest {
    public static void main(String[] args){
        //创建共享区
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();
        String hql = "from UsersEntity ";
        Query query = session.createQuery(hql);
        List<UsersEntity> list = query.list();
        for(UsersEntity c:list){
            System.out.println(c);
        }
        t.commit();
        session.close();
        sessionFactory.close();
    }
}
