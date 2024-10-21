package com.spring.tutorial.resource_interface;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class AbstractResourceClass {
    abstract protected Resource getResource();
    public void writeFile () {
        try {
            Resource resource = getResource();
            if (resource.exists()) {

                try (InputStream inputStream = resource.getInputStream();
                     BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

                    String outputPath = "src/main/resources/output.txt";
                    try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputPath))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                            writer.write(line);
                            writer.newLine();
                        }
                    }
                }
            } else {
                System.out.println("application.properties kaynağı mevcut değil.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
