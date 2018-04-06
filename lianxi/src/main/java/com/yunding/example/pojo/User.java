package com.yunding.example.pojo;

/**
 * @TODO
 * @Author Hao Wan
 * @Verison
 * @Date2018/4/1-16-37
 */
public class User {
    private String userName;
    private Service service;
    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void add(){
        System.out.println("add..............");
    }

    public void test(){
        System.out.println("jsfdhksjh"+userName);
        service.add();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
