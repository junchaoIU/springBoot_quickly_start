package com.wujunchao.top.springboot_quickly_start.entity;

import lombok.Data;

/**
 * @author: wujunchao
 * @date: 2021/07/23 10:17
 */

@Data
public class People {
    private long id;
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People(String name) {
        this.name = name;
    }
}
