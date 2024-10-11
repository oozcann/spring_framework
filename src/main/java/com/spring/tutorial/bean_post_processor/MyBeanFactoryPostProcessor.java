package com.spring.tutorial.bean_post_processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        if (beanFactory.containsBeanDefinition("beanA")) {
            String beanAClassName = beanFactory.getBeanDefinition("beanA").getBeanClassName();
            System.out.println(beanAClassName + " written in postProcessBeanFactory");
        }
    }
}
