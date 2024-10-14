package com.spring.tutorial.annotation_based_application_configuration.autowired;

import org.springframework.stereotype.Component;

@Component
public class BeanD implements Bean{
    public BeanD() {

    }
    public void write () {
        System.out.println("BeanD write method!");
    }
}
