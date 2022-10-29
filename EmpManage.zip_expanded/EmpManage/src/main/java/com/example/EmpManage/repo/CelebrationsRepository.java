package com.example.EmpManage.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.stereotype.Repository;

import com.example.EmpManage.entity.Celebrations;
//import com.example.EmpManage.entity.Employee;

public interface CelebrationsRepository  extends JpaRepository<Celebrations, Long>{
	
	 
	 
	 @Query(value = "SELECT e FROM Celebrations e ORDER  BY celebname")
public List <Celebrations> findALLSortedByName();
	
	/**
	@Query(value = "Select * from Employee order by id", nativeQuery=true)
	public  List <Employee> findAllSortedById();
	//List<Employee>findAllSortedById();
	
	
	@Modifying 
	@Transactional
	@Query(value = "Delete from Employee e   where  e. name = :name")
	public  void deleteByName(@Param("name")String name);
	 
	 
	**/
	

}
