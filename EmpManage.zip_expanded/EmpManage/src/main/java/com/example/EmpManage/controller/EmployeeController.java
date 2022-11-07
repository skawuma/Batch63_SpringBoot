
package com.example.EmpManage.controller;
import java.util.List;
//import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.EmpManage.entity.Employee;
import com.example.EmpManage.repo.EmployRepository;
import com.example.EmpManage.service.EmployeeService;
@RestController
@CrossOrigin
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	EmployRepository employRepository;
	@Autowired
	EmployeeService employeeservice;

	@PostMapping("/addemployee")
	Employee newEmployee(@RequestBody Employee employee) {  	
	
		return employRepository.save(employee);
	}

	
    @PutMapping("/updateemployee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") int id,@RequestBody Employee employeeDetails) {
        Employee updateEmployee = employRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not exist with id: " + id));

        updateEmployee.setName(employeeDetails.getName());
        updateEmployee.setSalary(employeeDetails.getSalary());
        updateEmployee.setDept(employeeDetails.getDept());

        employRepository.save(updateEmployee);

        return ResponseEntity.ok(updateEmployee);
    }

	@GetMapping ("/getemployee")
	//@RequestMapping(method=RequestMethod.GET,value "/users")
	List<Employee>all(){
		return employRepository.findAll();
	}

	@GetMapping ("/getsortByName")
	List<Employee>findAllSortedByName(){

		return employeeservice.performSorting();
		//return employRepository.findALLSortedByName();
	}

	@GetMapping ("/getsortById")
	List<Employee>findAllSortedById(){
		return employRepository.findAllSortedById();
	}


	@DeleteMapping("/deleteemployee/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		try {
			employRepository.deleteById(id);
			return " DELETE SUCESSFULL!!";
		}catch(Exception e) {
			e.printStackTrace();
			return " UNABLE TO DELETE ID, PLEASE TRY AGAIN";
		}
	}

	@DeleteMapping("/deleteemployee/{name}")
	public String deleteName(@PathVariable("iname") String name) {
		try {
			employRepository.deleteByName(name);
			return " DELETE SUCESSFULL!!";
		}catch(Exception e) {
			e.printStackTrace();
			return " UNABLE TO DELETE ID, PLEASE TRY AGAIN";
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



