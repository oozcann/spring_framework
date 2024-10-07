package com.spring.tutorial.container_overview.dependency_injection.circular_dependency;

public class BeanA {
    private BeanB beanB;

    public BeanA (BeanB beanB) {
        this.beanB = beanB;
    }

    public void print () {
        System.out.println(beanB.toString());
    }
}
