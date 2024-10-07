package com.spring.tutorial.container_overview.dependency_injection;

import org.springframework.beans.factory.annotation.Qualifier;

public class BeanFour {
    private BeanInterface beanTwo;
    private BeanInterface beanThree;

    public BeanFour (@Qualifier("beanTwo") BeanInterface beanTwo, BeanInterface beanThree) {
        this.beanTwo = beanTwo;
        this.beanThree = beanThree;
    }

    public void printClassBeans () {
        System.out.println(beanTwo.toString());
        System.out.println(beanThree.toString());
    }
}
