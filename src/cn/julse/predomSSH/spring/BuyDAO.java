package cn.julse.predomSSH.spring;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("buyDAO")
public class BuyDAO extends BasicDAO {

    @Override
    public List<Map<String, Object>> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<String, Object> getById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(Map<String, Object> user)
    {
        String sql = "insert buy(book_id,user_ID,buy_num,order_id) values(?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                user.get("book_id"),
                user.get("users_id"),
                user.get("buy_num"),
                user.get("orders_id")

        });

    }

    @Override
    public void modify(Map<String, Object> user) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub

    }

}
