package com.congent.spring.core;

import org.springframework.stereotype.Component;

@Component
public class Car {

	private  Engine engine;
	
	 public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	void letsGo() {
		 
		 engine.runEngine();
		 System.out.println("we are travelling");
	 }
	  
	
}
