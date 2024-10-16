package com.spring.tutorial.java_based_container_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(OtherAppConfig.class)
public class AdditionalAppConfig {
    @Bean
    public BeanC beanC () {
        return new BeanC();
    }
}
