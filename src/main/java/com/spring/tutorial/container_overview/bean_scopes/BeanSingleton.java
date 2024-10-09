package com.spring.tutorial.container_overview.bean_scopes;

public class BeanSingleton {

    private BeanPrototype beanPrototype;

    public BeanSingleton (BeanPrototype beanPrototype) {
        this.beanPrototype = beanPrototype;
    }
}
