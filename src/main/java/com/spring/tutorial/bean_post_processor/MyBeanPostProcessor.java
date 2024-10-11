package com.spring.tutorial.bean_post_processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before initialization in postProcessBeforeInitialization: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After initialization in postProcessAfterInitialization: " + beanName);
        if (bean instanceof NameableEntity) {
            ((NameableEntity) bean).setName("Name changed by postProcessAfterInitialization method.");
        }
        return bean;
    }
}
