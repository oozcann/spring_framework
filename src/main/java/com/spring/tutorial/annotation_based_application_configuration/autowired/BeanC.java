package com.spring.tutorial.annotation_based_application_configuration.autowired;

import org.springframework.stereotype.Component;

@Component
public class BeanC implements Bean{
    public BeanC() {

    }
    public void write () {
        System.out.println("BeanC write method!");
    }
}
