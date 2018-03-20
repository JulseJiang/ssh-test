package cn.julse.predomSSH.action;

import cn.julse.predomSSH.db.user.UserDAO;
import cn.julse.predomSSH.db.user.Users;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;

public class UserAction extends ActionSupport {
    private UserDAO userDAO = new UserDAO();
    private Users user = new Users();
    private int user_id = 1573;
    public String list(){
        return "list";
    }
    public String openModify(){
        try {
            user = userDAO.getById(user_id);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "openModify";
    }
}
