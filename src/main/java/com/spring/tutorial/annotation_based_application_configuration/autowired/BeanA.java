package com.spring.tutorial.annotation_based_application_configuration.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements Bean{
    private BeanB beanB;
    private BeanC beanC;
    @Autowired
    BeanD beanD;

    @Autowired
    public BeanA (BeanB beanB, BeanC beanc) {
        this.beanB = beanB;
        this.beanC = beanc;
    }
    public BeanA (BeanB beanB) {
        this.beanB = beanB;
    }

    public void write () {
        beanB.write();
        beanC.write();
        beanD.write();
    }
}
