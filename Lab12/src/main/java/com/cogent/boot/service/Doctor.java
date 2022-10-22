package com.cogent.boot.service;

import org.springframework.stereotype.Component;

@Component
public class Doctor {
	public String doctorRole() {
		return "I prescribe Medication";
	}

}
