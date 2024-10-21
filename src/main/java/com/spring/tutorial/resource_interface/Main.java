package com.spring.tutorial.resource_interface;

import com.spring.tutorial.jsr330.AppConfig;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main (String[] args) {

        /*
        UrlResourceClass urlResourceClass = new UrlResourceClass();
        urlResourceClass.getFile();
        */
        /*
        ClassPathResourceClass classPathResourceClass = new ClassPathResourceClass();
        classPathResourceClass.writeFile();
        */
        /*
        FileSystemResourceClass fileSystemResourceClass = new FileSystemResourceClass();
        fileSystemResourceClass.writeFile();
        */
        /*
        PathResourceClass pathResourceClass = new PathResourceClass();
        pathResourceClass.writeFile();
        */
        /* örnek olarak yazdım, servlet olmadığında çalışmıyor.
        ServletContextResourceClass servletContextResourceClass = new ServletContextResourceClass(servletContext);
        servletContextResourceClass.writeFile();
        */
        /*
        InputStreamResourceClass inputStreamResourceClass = new InputStreamResourceClass();
        inputStreamResourceClass.writeFile();
        */
        /*
        ByteArrayResourceClass byteArrayResourceClass = new ByteArrayResourceClass();
        byteArrayResourceClass.writeFile();
        */
        /*
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        Resource resource = applicationContext.getResource("classpath:application.properties");
        */

    }
}
