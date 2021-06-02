package com.yyk.iv;

import com.yyk.iv.spring.ioc.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IvApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext= SpringApplication.run(IvApplication.class, args);
        Person person = applicationContext.getBean(Person.class);
        System.out.println("Name is " + person.getName());
        person.call();
    }

}
