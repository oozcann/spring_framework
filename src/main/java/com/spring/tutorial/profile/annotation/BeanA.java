package com.spring.tutorial.profile.annotation;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class BeanA {
    public BeanA () {
        System.out.println("BeanA created! --> prod");
    }
}
