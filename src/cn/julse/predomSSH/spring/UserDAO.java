package cn.julse.predomSSH.spring;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Repository("userDAO")
public class UserDAO extends BasicDAO{
    @Resource(name="jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public  List<Map<String, Object>> getAll(){

        String sql = "select * from users";
        return jdbcTemplate.queryForList(sql);
    }

    public Map<String,Object> getById(int id){
        String sql = "select * from users where user_id = ?";
//        jdbcTemplate.queryForMap():只能按照主键查找时使用
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql,new Object[]{id});
        if (list != null && list.size()>0){
            return list.get(0);
        }
        return null;
    }

    public void add(Map<String, Object> user) {

    }

    public void modify(Map<String, Object> user) {

    }

    public void delete(int id) {

    }

    public void add(Users user) {
        String sql = "insert users(userGroup_id,user_name,user_address,user_code,user_phone,user_email,user_password) values(?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]
                {user.getUserGroup_id(),
                user.getUser_name(),
                user.getUser_address(),
                user.getUser_code(),
                user.getUser_phone(),
                user.getUser_email(),
                user.getUser_password()});
    }

    public void edit(Users user) {

    }
}