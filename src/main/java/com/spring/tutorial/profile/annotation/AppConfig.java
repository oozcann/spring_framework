package com.spring.tutorial.profile.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan("com.spring.tutorial.profile")
@PropertySource("classpath:application.properties")
public class AppConfig {
    public AppConfig () {

    }
}
