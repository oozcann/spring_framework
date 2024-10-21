package com.spring.tutorial.resource_interface;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputStreamResourceClass extends AbstractResourceClass{
    public InputStreamResourceClass() {}

    @Override
    protected Resource getResource() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("C://Users/ozcan/Desktop/kodlama_lazim_olabilir/employee_cagirma.txt");
        } catch (Exception e) {
            System.out.println(e);
        }
        return new InputStreamResource(fileInputStream);
    }
}
