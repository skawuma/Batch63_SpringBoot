package com.example.EmpManage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
 @Table(name="Employee_tbl")
public class Employee {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "EmployeeID")
     int id;
     @NotBlank(message = "Employee name cannot be blank")
	String name;
     @Size(min=2 ,max=10)
	String dept;
	float salary;
	public Employee(int id, String name, String dept, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
 
}
