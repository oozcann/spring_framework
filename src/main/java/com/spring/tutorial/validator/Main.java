package com.spring.tutorial.validator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.DataBinder;

public class Main {
    public static void main (String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

    }
}
