package cn.julse.predomSSH.spring;

public class TestBean {
    private String name;

    public void printData(){
        System.out.println("testBean "+name);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
