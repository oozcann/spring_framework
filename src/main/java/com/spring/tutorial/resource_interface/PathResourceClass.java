package com.spring.tutorial.resource_interface;

import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;

import java.nio.file.Paths;

public class PathResourceClass extends AbstractResourceClass{
    public PathResourceClass() {}

    @Override
    protected Resource getResource() {
        return new PathResource(Paths.get("C://Users/ozcan/Desktop/kodlama_lazim_olabilir/employee_cagirma.txt"));
    }
}
