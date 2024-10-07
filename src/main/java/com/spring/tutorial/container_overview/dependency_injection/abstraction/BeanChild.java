package com.spring.tutorial.container_overview.dependency_injection.abstraction;

import java.util.Properties;

public class BeanChild {
    private Properties adminEmails;

    public BeanChild (Properties adminEmails) {
        this.adminEmails = adminEmails;
    }

    public void print () {
        adminEmails.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }

    public Properties getAdminEmails() {
        return adminEmails;
    }

    public void setAdminEmails(Properties adminEmails) {
        this.adminEmails = adminEmails;
    }
}
