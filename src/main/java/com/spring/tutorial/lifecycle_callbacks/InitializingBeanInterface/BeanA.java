package com.spring.tutorial.lifecycle_callbacks.InitializingBeanInterface;

import org.springframework.beans.factory.InitializingBean;

public class BeanA implements InitializingBean {
    public BeanA () {
        System.out.println("BeanA Constructor triggered!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet method run for BeanA");
    }
}
