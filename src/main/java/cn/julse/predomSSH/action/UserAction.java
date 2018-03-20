package cn.julse.predomSSH.action;

import cn.julse.predomSSH.db.user.UserDAO;
import cn.julse.predomSSH.db.user.Users;
import cn.julse.predomSSH.db.userGroup.UserGroup;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.SQLException;
import java.util.ArrayList;

public class UserAction extends ActionSupport {
    private int user_id;
    private Users user;
    private ArrayList<Users> userList;
    private ArrayList<UserGroup> ugList;
    //=====================
    private UserDAO userDAO = new UserDAO();


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

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public ArrayList<Users> getUserList() {
        return userList;
    }

    public ArrayList<UserGroup> getUgList() {
        return ugList;
    }
}
