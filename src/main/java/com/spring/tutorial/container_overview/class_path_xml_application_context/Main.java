package com.spring.tutorial.container_overview.class_path_xml_application_context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        MyService myService = applicationContext.getBean(MyService.class);
        myService.sayHello();
    }
}
