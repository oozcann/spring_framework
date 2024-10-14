package com.spring.tutorial.annotation_based_application_configuration;

import com.spring.tutorial.annotation_based_application_configuration.autowired.BeanA;
import com.spring.tutorial.annotation_based_application_configuration.autowired.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args) {


        // ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("annotation-based-application-configuration.xml");
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(AppConfig.class);
/*
        BeanA beanA = annotationContext.getBean(BeanA.class);
        beanA.write();
 */
        annotationContext.getBean(MyService.class).write();
    }
}
