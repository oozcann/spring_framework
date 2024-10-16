package com.spring.tutorial.java_based_container_configuration;

public class BeanA {
    public BeanA () {
        System.out.println("BeanA created!");
    }

    public void execute () {
        System.out.println("BeanA execute method triggered!");
    }
    public void init () {
        System.out.println("BeanA init method triggered!");
    }
    public void cleanUp () {
        System.out.println("BeanA destroy method triggered!");
    }
}
