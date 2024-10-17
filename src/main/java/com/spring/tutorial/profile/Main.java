package com.spring.tutorial.profile;

import com.spring.tutorial.profile.annotation.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args) {


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        // ctx.getEnvironment().setActiveProfiles("dev");
        ctx.refresh();

        /*
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("profile-context.xml");
        classPathXmlApplicationContext.getEnvironment().setActiveProfiles("dev");
        classPathXmlApplicationContext.refresh();
        */

        /*
        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        */

    }
}
