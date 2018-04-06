package com.yunding.example.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * @TODO
 * @Author Hao Wan
 * @Verison
 * @Date2018/4/1-16-38
 */
public class TestUser {
    @Test
    public void  testUser(){
        // 加载是spring配置文件创建对象
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        // 得到配置的对象
        User user = (User) context.getBean("user");
        User user1 = (User) context.getBean("user");

        System.out.println(user);
        System.out.println(user1);
        user.add();
    }
    @Test
    public void jdsj(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) context.getBean("user");
        user.test();
        System.out.println("-----------------------");
        // 使用spring的set方法注入属性
        System.out.println(user.getUserName());
    }

}
