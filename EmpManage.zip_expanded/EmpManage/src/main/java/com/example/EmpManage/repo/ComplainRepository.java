package com.example.EmpManage.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmpManage.entity.Complain;

public interface ComplainRepository extends JpaRepository<Complain, Long> {

}
