package com.cogent.TelecomManag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.TelecomManag.entity.Plans;
import com.cogent.TelecomManag.repo.PlansRepository;

@RestController 
@RequestMapping("/api/plans")
public class PlansController {
	@Autowired
	PlansRepository plansrepository;
	
	@PostMapping("/addplans")
	Plans newPlans(@RequestBody Plans plans) {
		return plansrepository.save(plans);
	}
	
	@GetMapping ("/getplans")
	//@RequestMapping(method=RequestMethod.GET,value "/users")
	
	List<Plans>all(){
		return plansrepository.findAll();
	}
	
	@DeleteMapping("/deleteplans/{id}")
	public String deletePlans(@PathVariable("planid") long planid) {
		try {
		plansrepository.deleteById(planid);
		return " DELETE SUCESSFULL!!";
		}catch(Exception e) {
			e.printStackTrace();
			return " UNABLE TO DELETE ID, PLEASE TRY AGAIN";
			}
		}
		
	
	
	
	
	

}
