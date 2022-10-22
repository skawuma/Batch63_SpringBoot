package com.cogent.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Manager {
public static void main(String[] args) {
	/**
	 * 1. Get the Spring Container-Factory
	 * BeanFactory
	 * ApplicationContext
	 **/
	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	/**
	 * Ask  Container to provide the required Bean
	 * **/
	Coach coach = context.getBean(Coach.class);
	/**
	 * Call the method- provideTraining
	**/
	coach.provideTraining();
	/**
	//Java Approach
	Coach thecoach = new Coach();
	thecoach.provideTraining();
	**/
}
}
