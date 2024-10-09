package com.spring.tutorial.container_overview.bean_scopes;

public class BeanPrototype {
    public BeanPrototype () {
        System.out.println("BeanPrototype created!");
    }
    public void initMethod () {
        System.out.println("Init method in BeanPrototype runs");
    }
}
