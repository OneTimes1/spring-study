package com.wang.spring6.bean.impl;

import com.wang.spring6.bean.Person;

public class Person2Impl implements Person {

    @Override
    public void sayHello() {
        System.out.println("Person2 sayHello");
    }
}
