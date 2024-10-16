package com.spring.tutorial.jsr330;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public void execute (String beanName) {
        System.out.println("MyService injected to: " + beanName);
    }
}
