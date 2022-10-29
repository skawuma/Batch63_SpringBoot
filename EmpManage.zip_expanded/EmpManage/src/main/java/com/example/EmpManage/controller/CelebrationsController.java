
package com.example.EmpManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmpManage.entity.Celebrations;
//import com.example.EmpManage.entity.Employee;
import com.example.EmpManage.repo.CelebrationsRepository;
import com.example.EmpManage.service.CelebrationsService;

@RestController

@RequestMapping("/api/celebrations")
public class CelebrationsController {
	
	@Autowired
	CelebrationsRepository celebRepository;
	

	
	@Autowired
	CelebrationsService celebservice;
	
	@GetMapping ("/getsortByName")
	List<Celebrations>findAllSortedByName(){
		
		return celebservice.performSorting();
	}
		
		
		@GetMapping ("/getCelebrations")
		//@RequestMapping(method=RequestMethod.GET,value "/users")
		List<Celebrations>all(){
			return celebservice.all();
		}
		
		@PostMapping("/addcelebrations")
		Celebrations newCelebrations(@RequestBody Celebrations celebrations) {  	
			return celebRepository.save(celebrations);
		}

}
