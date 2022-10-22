package com.cogent.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	
	@Bean
	public  Coach getCoach() {
		
		return new Coach();
	}
	
	
	

}
