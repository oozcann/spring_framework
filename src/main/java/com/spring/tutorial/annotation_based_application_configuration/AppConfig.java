package com.spring.tutorial.annotation_based_application_configuration;

import com.spring.tutorial.annotation_based_application_configuration.autowired.BeanC;
import com.spring.tutorial.annotation_based_application_configuration.autowired.BeanB;
import com.spring.tutorial.annotation_based_application_configuration.autowired.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(/* basePackages = "com.example"*/)
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Autowired
    BeanB beanB;
    @Autowired
    BeanC beanC;
    @Value("${app.name}")
    String appName;

    @Bean
    @Primary
    public MyService myService1() {
        return new MyService("Service 1", beanB, appName);
    }

    @Bean(name = "myService2")

    public MyService myService2() {
        return new MyService("Service 2",beanC, appName);
    }
}
