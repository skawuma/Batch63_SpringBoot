package com.cogent;

public class Engine {
	private Engine engine;
	public Engine(Engine engine) {
		super();
		this.engine = engine;
	}
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void startEngine() {
	System.out.println("Engine started");	
	}
public void stopEngine() {
	System.out.println("Engine stopped");
	}
}
