package cn.julse.predomSSH.spring;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
/**
 * @author zhangxiaohua
 *
 */
@Repository("orderDAO")
public class OrderDAO extends BasicDAO
{

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
        String sql = "insert orders(order_user,order_dataTime,order_total,order_id) values(?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                user.get("users_id"),
                user.get("orders_date"),
                user.get("orders_totalPrice"),
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
