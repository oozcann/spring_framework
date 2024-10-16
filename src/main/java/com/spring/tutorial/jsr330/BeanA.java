package com.spring.tutorial.jsr330;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

    @Inject
    public BeanA (MyService myService, @Named("beanB") Bean bean, @Qualifier("beanC") Bean bean2) {
        System.out.println("BeanA created!");
        myService.execute("BeanA");
        bean.execute();
        bean2.execute();
    }
}
