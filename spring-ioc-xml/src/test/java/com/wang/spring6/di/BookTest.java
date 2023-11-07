package com.wang.spring6.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean(Book.class);
        System.out.println(book);
    }
}
