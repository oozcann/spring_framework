package com.spring.tutorial.lifecycle_callbacks.InitDestroy;

public class BeanD {
    public BeanD () {
        System.out.println("BeanD created!");
    }
    public void initOverride () {
        System.out.println("init method run for BeanD");
    }
    public void destroyOverride () {
        System.out.println("destroy method run for BeanD");
    }
}
