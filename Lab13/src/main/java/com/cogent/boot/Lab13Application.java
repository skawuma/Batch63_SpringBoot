package com.cogent.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab13Application {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(Lab13Application.class, args);
		
		Car car1 = ctx.getBean(Car.class);
		Car car2 = ctx.getBean(Car.class);
		System.out.println(car1==car2);
	}

}
