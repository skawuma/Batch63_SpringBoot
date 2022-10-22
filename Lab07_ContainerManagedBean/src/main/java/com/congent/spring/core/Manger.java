package com.congent.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.cogent.spring.core.Car;
//import com.cogent.spring.core.SpringConfig;

public class Manger {
public static void main(String[] args) {

	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
	
	Car car=ctx.getBean(Car.class);
	car.letsGo();
}
}
