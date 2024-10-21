package com.spring.tutorial.resource_interface;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class FileSystemResourceClass  extends AbstractResourceClass{
    public FileSystemResourceClass() {}

    @Override
    protected Resource getResource() {
        return new FileSystemResource("C://Users/ozcan/Desktop/kodlama_lazim_olabilir/employee_cagirma.txt");
    }
}
