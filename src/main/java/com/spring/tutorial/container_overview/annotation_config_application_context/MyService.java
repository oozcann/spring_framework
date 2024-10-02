package com.spring.tutorial.container_overview.annotation_config_application_context;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class MyService {
    public void sayHello () {
        System.out.println("Hello, there!");
    }
}
