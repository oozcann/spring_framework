package com.spring.tutorial.resource_interface;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;

public class ByteArrayResourceClass extends AbstractResourceClass{

    public ByteArrayResourceClass() {}

    @Override
    protected Resource getResource() {
        byte[] byteArray = "Hello, Spring!".getBytes();
        return new ByteArrayResource(byteArray);
    }
}
