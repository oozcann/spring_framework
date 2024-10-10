package com.spring.tutorial.lifecycle_callbacks.PreDestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class BeanF {
    public BeanF () {
        System.out.println("BeanF created!");
    }

    @PostConstruct
    public void postConstructMethod () {
        System.out.println("postConstructMethod run for BeanF");
    }
    @PreDestroy
    public void preDestroyMethod () {
        System.out.println("preDestroyMethod run for BeanF");
    }
}
