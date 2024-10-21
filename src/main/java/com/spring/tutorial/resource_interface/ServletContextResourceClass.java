package com.spring.tutorial.resource_interface;

import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.context.support.ServletContextResource;

public class ServletContextResourceClass extends AbstractResourceClass {

    private ServletContext servletContext;

    public ServletContextResourceClass(@Autowired ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    @Override
    protected Resource getResource() {
        return new ServletContextResource(servletContext,"WEB-INF/sample.txt");
    }
}
