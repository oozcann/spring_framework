package com.spring.tutorial.container_overview.dependency_injection.circular_dependency;

public class BeanB {

    private BeanA beanA;

    /*
    public BeanB (BeanA beanA) {
        this.beanA = beanA;
    }
    */

    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }

    @Override
    public String toString() {
        return "beanB without circular dependency";
    }
}
