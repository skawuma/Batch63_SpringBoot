package com.cogent.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public Engine getEngine()
	{
		return new Engine();
	}
	@Bean
	public Car getCar() {
		return new Car(new Engine());
	}

}
