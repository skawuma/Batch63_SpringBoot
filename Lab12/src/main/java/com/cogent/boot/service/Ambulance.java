package com.cogent.boot.service;

import org.springframework.context.annotation.Bean;



public class Ambulance {
	@Bean
	public String ambulanceRole() {
		return "I transport Medically ill Patients";
	}

}
