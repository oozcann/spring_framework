package com.spring.tutorial.container_overview.dependency_injection;

public class BeanOne {
    private BeanInterface beanTwo;
    private BeanInterface beanThree;

    public BeanOne (BeanInterface beanTwo, BeanInterface beanThree) {
        this.beanTwo = beanTwo;
        this.beanThree = beanThree;
    }

    public void printClassBeans () {
        System.out.println(beanTwo.toString());
        System.out.println(beanThree.toString());
    }
}
