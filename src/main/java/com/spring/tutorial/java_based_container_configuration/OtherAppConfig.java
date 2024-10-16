package com.spring.tutorial.java_based_container_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherAppConfig {
    @Bean
    public BeanD beanD () {
        return new BeanD();
    }
}
