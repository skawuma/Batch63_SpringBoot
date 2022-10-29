package com.example.EmpManage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;

import com.example.EmpManage.entity.Celebrations;

import com.example.EmpManage.repo.CelebrationsRepository;



@Service
public class CelebrationsService {
	@Autowired
	CelebrationsRepository celebRepository;
	
public  List<Celebrations> performSorting() {
		
		System.out.println("In service Layer");
		return celebRepository.findALLSortedByName();
	}

 public List<Celebrations>all(){
	return celebRepository.findAll();

	
}

 
}
