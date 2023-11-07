package com.wang.spring6.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    private static Logger logger = LoggerFactory.getLogger(UserTest.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取bean
        User user = (User) context.getBean("user");
        logger.info("根据id获取bean:"+user);
        //根据类型获取bean
        User user2 = context.getBean(User.class);
        logger.info("根据类型获取bean:"+user2);
        //根据类型和id获取bean
        User user3 = context.getBean("user", User.class);
        logger.info("根据类型和id获取bean:"+user3);
        //根据接口类型获取对应的实现类
        Person person = context.getBean(Person.class);
        person.sayHello();
    }
}
