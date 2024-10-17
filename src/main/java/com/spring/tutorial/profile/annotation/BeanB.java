package com.spring.tutorial.profile.annotation;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class BeanB {
    public BeanB() {
        System.out.println("BeanB created! --> dev");
    }
}
