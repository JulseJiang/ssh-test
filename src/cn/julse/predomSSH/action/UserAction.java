package cn.julse.predomSSH.action;

import cn.julse.predomSSH.db.user.UserDAO;
import cn.julse.predomSSH.db.user.Users;
import cn.julse.predomSSH.db.userGroup.UserGroup;
import cn.julse.predomSSH.db.userGroup.UserGroupDAO;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

public class UserAction extends ActionSupport {
    private int user_id;
    private Users newUser = new Users();
    private File user_pic;
    private String user_picFileName;
    private String user_picContentType;
    //=====================
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
//        return "list";
//        返回给手机的json字符串
        return "jsonList";
    }
    public String openModify(){
        try {
            long fileName = Calendar.getInstance().getTimeInMillis();
            String ext = user_picFileName.substring(user_picFileName.lastIndexOf("."));
            String lastFileName = fileName+ext;

            String pathName = ServletActionContext.getServletContext().getRealPath("/pics/"+lastFileName);
            File destFile = new File("pathName");
            FileUtils.copyFile(user_pic,destFile);

            newUser.setUser_pic("/pics/"+lastFileName);
            userDAO.modify(newUser);
            ugList = userGroupDAO.getAll();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "openModify";
    }
    public String modify(){
        try {
            userDAO.modify(newUser);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "modify";
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Users getNewUser() {
        return newUser;
    }

    public ArrayList<Users> getUserList() {
        return userList;
    }

    public ArrayList<UserGroup> getUgList() {
        return ugList;
    }

    public File getUser_pic() {
        return user_pic;
    }

    public void setUser_pic(File user_pic) {
        this.user_pic = user_pic;
    }

    public String getUser_picFileName() {
        return user_picFileName;
    }

    public void setUser_picFileName(String user_picFileName) {
        this.user_picFileName = user_picFileName;
    }

    public String getUser_picContentType() {
        return user_picContentType;
    }

    public void setUser_picContentType(String user_picContentType) {
        this.user_picContentType = user_picContentType;
    }
}
