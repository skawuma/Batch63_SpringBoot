package com.example.EmpManage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmpManage.entity.Employee;
import com.example.EmpManage.repo.EmployRepository;


@Service
public class EmployeeService {
	
	@Autowired
	EmployRepository employRepository;
	
	
	public  List<Employee> performSorting() {
		
		System.out.println("In service Layer");
		return employRepository.findALLSortedByName();
	}

}
