package com.spring.tutorial.java_based_container_configuration;

public class BeanB {
    public BeanB (BeanA beanA) {
        System.out.println("BeanB created!");
        beanA.execute();
    }
}
