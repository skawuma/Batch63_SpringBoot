package com.cogent.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.cogent.boot.controller.Hospital;
import com.cogent.boot.service.Ambulance;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(DemoApplication.class, args);
	Hospital hospital = ctx.getBean(Hospital.class);
	 hospital.showRoles();
	 
	}
	@Bean
	public Ambulance getAmbulance() {
		return new Ambulance();
	}

}
