package com.wang.spring6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {
        //加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //从配置文件中获取user对象
        User user = (User) context.getBean("user");
        System.out.println(user);
        //调用user对象的相关方法
        user.add();
    }
}
