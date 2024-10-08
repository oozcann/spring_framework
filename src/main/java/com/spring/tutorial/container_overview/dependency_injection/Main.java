package com.spring.tutorial.container_overview.dependency_injection;

import com.spring.tutorial.container_overview.class_path_xml_application_context.MyService;
import com.spring.tutorial.container_overview.dependency_injection.abstraction.BeanChild;
import com.spring.tutorial.container_overview.dependency_injection.abstraction.BeanParent;
import com.spring.tutorial.container_overview.dependency_injection.circular_dependency.BeanA;
import com.spring.tutorial.container_overview.lazy.BeanLazy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args) {

        // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dependency-injection-context.xml");
        // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("depends-on-context.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lazy-context.xml");
        /*
        BeanOne beanOne = applicationContext.getBean(BeanOne.class);
        beanOne.printClassBeans();

        System.out.println("************************");

        BeanFour beanFour = applicationContext.getBean(BeanFour.class);
        beanFour.printClassBeans();

        System.out.println("************************");

        BeanA beanA = applicationContext.getBean(BeanA.class);
        beanA.print();

        System.out.println("************************");
        */
        /* abstract tanımlandığı için çalıştırılamaz.
        BeanParent beanParent = applicationContext.getBean(BeanParent.class);
        beanParent.print();
        */
        /*
        System.out.println("************************");

        BeanChild beanChild = applicationContext.getBean(BeanChild.class);
        beanChild.print();
        */

        /*
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        */
        System.out.println("************");
        applicationContext.getBean(BeanLazy.class);
    }
}
