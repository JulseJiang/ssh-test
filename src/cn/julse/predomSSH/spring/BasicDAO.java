package cn.julse.predomSSH.spring;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
* creat_user: julse@qq.com creat_date: 2018/5/15
**/
public abstract class BasicDAO {
    @Resource(name="jdbcTemplate")
    public JdbcTemplate jdbcTemplate;
    public abstract List<Map<String, Object>> getAll();
    public abstract Map<String,Object> getById(int id);
    public abstract void add(Map<String, Object> user);
    public abstract void modify(Map<String, Object> user);
    public abstract void delete(int id);
}
