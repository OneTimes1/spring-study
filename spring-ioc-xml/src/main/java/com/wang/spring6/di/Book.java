package com.wang.spring6.di;

import lombok.Data;

@Data
public class Book {
    private String name;
    private Integer price;

    public Book() {
    }

    public Book(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
}
