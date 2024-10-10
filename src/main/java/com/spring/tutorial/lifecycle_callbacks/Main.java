package com.spring.tutorial.lifecycle_callbacks;

import com.spring.tutorial.lifecycle_callbacks.InitDestroy.BeanC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycle-callbacks-context.xml");
        // applicationContext.getBean(BeanA.class);
        // applicationContext.getBean(BeanB.class);
        // ((ClassPathXmlApplicationContext) applicationContext).close();
        // applicationContext.close();
        applicationContext.registerShutdownHook();
    }
}
