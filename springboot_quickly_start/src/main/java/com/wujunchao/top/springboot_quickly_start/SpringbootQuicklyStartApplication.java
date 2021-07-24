package com.wujunchao.top.springboot_quickly_start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringbootQuicklyStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootQuicklyStartApplication.class, args);
        System.out.println("Hello world!");
    }
}
