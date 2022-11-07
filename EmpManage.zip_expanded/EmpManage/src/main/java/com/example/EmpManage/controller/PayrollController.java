package com.example.EmpManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmpManage.entity.Payroll;
import com.example.EmpManage.repo.PayrollRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/payroll")
public class PayrollController {
	
	
	 @Autowired
	PayrollRepository payrollRepository;
	
	

@PostMapping("/addpayroll")
Payroll newPayroll(@RequestBody Payroll payroll) {  	
	return payrollRepository.save(payroll);
}

	
	@GetMapping ("/getpayroll")
	//@RequestMapping(method=RequestMethod.GET,value "/users")
	List<Payroll>all(){
		return payrollRepository.findAll();
	}
		
		@DeleteMapping("/deletepayroll/{payId}")
		public String deletePayroll(@PathVariable("payId") long payId) {
			try {
			payrollRepository.deleteById(payId);
			return " DELETE SUCESSFULL!!";
			}catch(Exception e) {
				e.printStackTrace();
				return " UNABLE TO DELETE ID, PLEASE TRY AGAIN";
				}
		
	}
	 

}
