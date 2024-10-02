package com.spring.tutorial.exercises;

import com.spring.tutorial.spring_IoC.BeanA;
import com.spring.tutorial.spring_IoC.BeanB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercisesApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExercisesApplication.class, args);

		BeanA beanA = new BeanA();
		BeanB beanB = new BeanB(beanA);
		System.out.println(beanB.toString());

	}

}
