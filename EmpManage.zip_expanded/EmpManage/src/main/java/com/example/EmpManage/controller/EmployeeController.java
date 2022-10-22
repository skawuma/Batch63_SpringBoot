
package com.example.EmpManage.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmpManage.entity.Employee;
import com.example.EmpManage.repo.EmployRepository;

@RestController

@RequestMapping("/api/employee")
public class EmployeeController {

	//http method TO CREATE API ENDPOINTS
	// GET
	//POST
	//PUT
	//DELETE
	// GET OPERATION READ OF CRUD


	@Autowired
	EmployRepository employRepository;
	
	

@PostMapping("/addemployee")
Employee newEmployee(@RequestBody Employee employee) {  	
	return employRepository.save(employee);
}

	
	@GetMapping ("/getemployee")
	//@RequestMapping(method=RequestMethod.GET,value "/users")
	List<Employee>all(){
		return employRepository.findAll();
	}
	
	@DeleteMapping("/deleteemployee/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		try {
		employRepository.deleteById(id);
		return " DELETE SUCESSFULL!!";
		}catch(Exception e) {
			e.printStackTrace();
			return "UNABLE TO DELETE";
			}
		}
	}
	
	
	/**
	
	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") int id)
	  throws ResourceNotFoundException {
	{
	    Employee employee = employRepository.findById(id)
	      .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));

	    employRepository.delete(employee);
	    Map<String, Boolean> response = new HashMap<>();
	    response.put("deleted", Boolean.TRUE);
	    return response;
	}
	
	**/
	/**
	@DeleteMapping("/deleteemployee"){
		Employee
	return employeeRepository.deleteById(id)
			
	}
	**/
	
	
	/**
	//business Logic to be tested
	public int sum() {
		int a=10;
		int b=20;
		
		return (a+b);
	}

	@GetMapping("/hello")
	public String hello() {	
		return "samuel";
	}
	**/   



