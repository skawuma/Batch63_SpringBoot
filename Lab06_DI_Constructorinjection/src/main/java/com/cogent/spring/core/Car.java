package com.cogent.spring.core;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
 private Engine engine;
@Autowired
public Car(Engine engine) {
	super();
	this.engine = engine;
}
 
 public void letsGo() {
	 engine.startEngine();
	 System.out.println("Enjoying my Tour");
	 engine.stopEngine();
 }

public Car() {
	super();
	// TODO Auto-generated constructor stub
}
  
}


