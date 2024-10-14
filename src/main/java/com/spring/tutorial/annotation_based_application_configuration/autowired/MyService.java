package com.spring.tutorial.annotation_based_application_configuration.autowired;

public class MyService {
    private String name;
    private Bean bean;
    private String appName;

    public MyService(String name, Bean bean, String appName) {
        this.name = name;
        this.appName = appName;
        this.bean = bean;
        System.out.println(name + " created for " + appName);
    }

    public void write () {
        System.out.println(name + " triggered");
        bean.write();
    }
}
