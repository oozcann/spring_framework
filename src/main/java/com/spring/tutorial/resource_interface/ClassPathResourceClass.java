package com.spring.tutorial.resource_interface;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClassPathResourceClass extends AbstractResourceClass {

    public ClassPathResourceClass() {
    }

    @Override
    protected Resource getResource() {
        return new ClassPathResource("application.properties");
    }
}
