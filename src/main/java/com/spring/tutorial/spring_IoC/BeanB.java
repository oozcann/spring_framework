package com.spring.tutorial.spring_IoC;

public class BeanB {
    private BeanA beanA;

    public BeanB (BeanA beanA) {
        this.beanA = beanA;
    }

    @Override
    public String toString() {
        return "in BeanB" + beanA.toString();
    }
}
