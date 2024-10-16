package com.spring.tutorial.jsr330;

import jakarta.inject.Named;

@Named("beanB")
public class BeanB implements Bean {
    public BeanB () {
        System.out.println("BeanB created!");
    }

    @Override
    public void execute() {
        System.out.println("BeanB executed!");
    }
}
