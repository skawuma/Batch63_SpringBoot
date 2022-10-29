package com.example.EmpManage.repo;

import java.util.List;

//import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.EmpManage.entity.Employee;
 

public interface EmployRepository extends JpaRepository<Employee , Integer> {
	
	@Query(value = "SELECT e FROM Employee e ORDER  BY name")
public List <Employee> findALLSortedByName();
	
	
	@Query(value = "Select * from Employee order by id", nativeQuery=true)
	public  List <Employee> findAllSortedById();
	//List<Employee>findAllSortedById();
	
	
	@Modifying 
	@Transactional
	@Query(value = "Delete from Employee e   where  e. name = :name")
	public  void deleteByName(@Param("name")String name);
	
	/**
	@Transactional
	@Modifying	
 @Query("update Employee e set e.salary =?2 where u.id =?1")
	public void updateById(int id,float salary);   	
	**/
}