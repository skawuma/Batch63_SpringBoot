package com.example.EmpManage;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.EmpManage.controller.EmployeeController;

@SpringBootTest
class EmpManageApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test 
	void testingsum() {
		EmployeeController em = new EmployeeController();
	//	assertEquals(30,em.sum());
		//assertEquals(30,em.sum());
	}

	@Test 
	void testinghello() {
		EmployeeController e = new EmployeeController();
	///	assertEquals("samuel",e.hello());
	}
	
}
