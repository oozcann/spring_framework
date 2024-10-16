package com.spring.tutorial.jsr330;

import com.spring.tutorial.annotation_based_application_configuration.autowired.BeanB;
import com.spring.tutorial.annotation_based_application_configuration.autowired.BeanC;
import com.spring.tutorial.annotation_based_application_configuration.autowired.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.spring.tutorial.jsr330")
public class AppConfig {

}
