package com.cogent;

public class Car {
	private Engine engine;
	
	public void letsGo() {
		
		engine.startEngine();
		System.out.println("We started our Journey ");
		System.out.println("we are travelling");
		System.out.println("we reached Our destination");
engine.stopEngine();
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
