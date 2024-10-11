package com.spring.tutorial.bean_post_processor;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class BeanA implements NameableEntity{

    private String name;

    public BeanA () {
        name = "name in constructor";
        System.out.println("BeanA created!");
        System.out.println(name);
    }

    @PostConstruct
    public void init () {
        System.out.println("init methot runs!");
    }

    @PreDestroy
    public void destroy () {
        System.out.println("destroy method runs!");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
