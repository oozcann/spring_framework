package com.spring.tutorial.container_overview.class_path_xml_application_context;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    public void sayHello () {
        System.out.println("Hello, there! (From XML config)");
    }
}
