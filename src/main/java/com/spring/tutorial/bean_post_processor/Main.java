package com.spring.tutorial.bean_post_processor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-post-processor-context.xml");

        BeanA bean = applicationContext.getBean(BeanA.class);
        System.out.println(bean.getName());

        applicationContext.close();
    }
}
