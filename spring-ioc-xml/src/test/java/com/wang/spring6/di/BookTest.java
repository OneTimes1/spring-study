package com.wang.spring6.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
    /**
     * get/set方法测试
     */
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book",Book.class);
        System.out.println(book);
    }

    /**
     * 构造器注入测试
     */
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("bookCon",Book.class);
        System.out.println(book);
    }

    /**
     * 特殊字处理
     */
    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book3",Book.class);
        System.out.println(book);
    }
}
