package com.spring.tutorial.lifecycle_callbacks.InitDestroy;

public class BeanC {
    public BeanC () {
        System.out.println("BeanC created!");
    }
    public void init () {
        System.out.println("init method run for BeanC");
    }
    public void destroy () {
        System.out.println("destroy method run for BeanC");
    }
}
