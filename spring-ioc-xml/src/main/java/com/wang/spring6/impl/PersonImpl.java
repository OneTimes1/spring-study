package com.wang.spring6.impl;

import com.wang.spring6.Person;

public class PersonImpl  implements Person {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
