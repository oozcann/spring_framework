package com.spring.tutorial.annotation_based_application_configuration.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanB implements Bean{

    @Value("@Value injection completed!")
    String valueInjection;

    public BeanB() {

    }
    public void write () {
        System.out.println("BeanB write method!");
        System.out.println(valueInjection);
    }
}
