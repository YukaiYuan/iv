package com.yyk.iv.spring.ioc.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//当有多个实现类时,spring并不知道注入哪个,需要Primary注解
@Primary
public class Dog implements Pet {
    @Override
    public void move() {
        System.out.println("Running");
    }
}
