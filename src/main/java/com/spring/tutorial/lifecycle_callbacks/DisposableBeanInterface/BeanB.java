package com.spring.tutorial.lifecycle_callbacks.DisposableBeanInterface;

import org.springframework.beans.factory.DisposableBean;

public class BeanB implements DisposableBean {
    public BeanB () {
        System.out.println("BeanB created!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method run for BeanB");
    }
}
