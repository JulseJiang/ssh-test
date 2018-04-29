package cn.julse.predomSSH.spring;

import cn.julse.predomSSH.db.user.Users;

public class TestBean {
    private String name;
    private Users user;
    public void printData(){
        System.out.println("testBean "+name);
        System.out.println("user "+user);
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
