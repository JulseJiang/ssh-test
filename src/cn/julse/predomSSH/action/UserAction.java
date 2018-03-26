package cn.julse.predomSSH.action;

import cn.julse.predomSSH.db.user.UserDAO;
import cn.julse.predomSSH.db.user.Users;
import cn.julse.predomSSH.db.userGroup.UserGroup;
import cn.julse.predomSSH.db.userGroup.UserGroupDAO;
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
    private UserGroupDAO userGroupDAO = new UserGroupDAO();


    public String list(){
        try {
            userList=userDAO.getAll();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "list";
    }
    public String openModify(){
        try {
            user = userDAO.getById(user_id);
            ugList = userGroupDAO.getAll();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "openModify";
    }
    public String modify(){

        return "modify";
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
