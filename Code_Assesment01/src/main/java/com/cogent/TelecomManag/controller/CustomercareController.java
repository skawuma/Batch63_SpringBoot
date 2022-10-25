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

import com.cogent.TelecomManag.entity.Customercare;
import com.cogent.TelecomManag.repo.CustomercareRepository;


@RestController
@RequestMapping("/api/customercare")
public class CustomercareController {
	@Autowired
	CustomercareRepository customercarerepository;
	
	@PostMapping("/addcustomercare")
	Customercare newCustomercare(@RequestBody Customercare customercare) {
		return customercarerepository.save(customercare);
	}
	@GetMapping ("/getcustomercare")
	//@RequestMapping(method=RequestMethod.GET,value "/users")
	List<Customercare>all(){
		return customercarerepository.findAll();
	}
	
	@DeleteMapping("/deletecustomercare/{id}")
	public String deleteCustomercare(@PathVariable("custId") long custId) {
		try {
		customercarerepository.deleteById(custId);
		return " DELETE SUCESSFULL!!";
		}catch(Exception e) {
			e.printStackTrace();
			return " UNABLE TO DELETE ID, PLEASE TRY AGAIN";
			}
		}
		

}
