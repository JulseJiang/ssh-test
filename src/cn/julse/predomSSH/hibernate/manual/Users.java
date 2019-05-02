package cn.julse.predomSSH.hibernate.manual;

public class Users {
    /**
     * 定义成封装的对象类型，用于判定这个值是否存在。用基本类型，会自动赋值为0
     */
    private Integer users_Id;
    private String users_name;

    public Integer getUsers_Id() {
        return users_Id;
    }

    public void setUsers_Id(Integer users_Id) {
        this.users_Id = users_Id;
    }

    public String getUsers_name() {
        return users_name;
    }

    public void setUsers_name(String users_name) {
        this.users_name = users_name;
    }
}
