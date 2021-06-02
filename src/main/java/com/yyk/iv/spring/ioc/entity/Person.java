package com.yyk.iv.spring.ioc.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//注解装配
@Component("person")
public class Person {

    @Value("1")
    private Long id;

    @Value("Jack")
    private String name;

    //依赖注入
    @Autowired
    private Pet pet;

    public void call(){
        pet.move();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
