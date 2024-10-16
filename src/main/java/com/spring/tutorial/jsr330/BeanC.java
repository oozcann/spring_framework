package com.spring.tutorial.jsr330;

import jakarta.inject.Named;

@Named("beanC")
public class BeanC implements Bean {
    public BeanC () {
        System.out.println("BeanC created!");
    }

    @Override
    public void execute() {
        System.out.println("BeanC executed!");
    }
}
