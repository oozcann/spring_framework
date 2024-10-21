package com.spring.tutorial.resource_interface;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.InputStream;
import java.net.URL;

public class UrlResourceClass {
    public UrlResourceClass() {

    }

    public void getFile () {
        try {
            URL url = new URL("https://persign.perfektive.com/logo1.png");
            Resource resource = new UrlResource(url);

            if (resource.exists()) {
                InputStream inputStream = resource.getInputStream();
                inputStream.close();
            } else {
                System.out.println("Kaynak mevcut değil.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
