package com.cogent.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cogent.boot.service.Ambulance;
import com.cogent.boot.service.Doctor;
import com.cogent.boot.service.Nurse;
import com.cogent.boot.service.Patient;
@Component
public class Hospital {
	@Autowired
	Patient patient;
	@Autowired
	Ambulance ambulance;


	@Autowired
	public void setAmbulance(Ambulance ambulance) {
		this.ambulance = ambulance;
	}

	Nurse nurse;


	public Hospital(Nurse nurse) {
		super();
		this.nurse = nurse;
	}

	@Autowired
	Doctor doctor;

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	public void showRoles() {
		System.out.println(ambulance.ambulanceRole());
		System.out.println(patient.patientRole());
		System.out.println(nurse.nurseRole());
		System.out.println(doctor.doctorRole());


	}



}
