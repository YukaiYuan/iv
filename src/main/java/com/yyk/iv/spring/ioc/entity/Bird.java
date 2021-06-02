package com.yyk.iv.spring.ioc.entity;

import org.springframework.stereotype.Component;

@Component
public class Bird implements Pet {
    @Override
    public void move() {
        System.out.println("fly");
    }
}
