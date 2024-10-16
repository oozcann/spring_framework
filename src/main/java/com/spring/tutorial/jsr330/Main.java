package com.spring.tutorial.jsr330;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main (String[] args) {

        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        /*
        for (String beanDefinitionName : annotationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        */

    }
}
