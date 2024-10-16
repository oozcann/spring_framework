package com.spring.tutorial.java_based_container_configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main (String[] args) {

        // AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.register(AdditionalAppConfig.class);

        // ctx.register(AppConfig.class,AdditionalAppConfig.class); --> Böyle tek satırda da yapılabilir.

        // ctx.scan("com.spring.tutorial.java_based_container_configuration");

        ctx.refresh();

        ctx.close();

        /* Böyle de çağırılabiliyor.
        AppConfig appConfig = new AppConfig();
        appConfig.beanA();
        */
        /*
        for (String beanDefinitionName : annotationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        */

    }
}
