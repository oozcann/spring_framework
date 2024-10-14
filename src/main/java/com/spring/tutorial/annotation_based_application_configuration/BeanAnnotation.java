package com.spring.tutorial.annotation_based_application_configuration;

import org.springframework.stereotype.Component;

@Component
public class BeanAnnotation {
    public BeanAnnotation() {
        System.out.println("BeanAnnotation created!");
    }
}
