package com.wang.spring6.bean.impl;

import com.wang.spring6.bean.Person;

public class PersonImpl  implements Person {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
