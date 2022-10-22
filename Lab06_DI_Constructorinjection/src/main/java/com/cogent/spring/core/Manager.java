 package com.cogent.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Manager {
public static void main(String[] args) {
	
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
	
	Car car=ctx.getBean(Car.class);
	car.letsGo();
}
}
