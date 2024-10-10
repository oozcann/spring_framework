package com.spring.tutorial.lifecycle_callbacks.PostConstruct;

import jakarta.annotation.PostConstruct;

public class BeanE {
    public BeanE () {
        System.out.println("BeanE created!");
    }

    @PostConstruct
    public void postConstructMethod () {
        System.out.println("postConstructMethod run for BeanE");
    }
}
