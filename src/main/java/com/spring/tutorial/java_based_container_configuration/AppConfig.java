package com.spring.tutorial.java_based_container_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "cleanUp")
    public BeanA beanA () {
        return new BeanA();
    }

    @Bean
    public BeanB beanB () {
        return new BeanB(beanA());
    }
}
