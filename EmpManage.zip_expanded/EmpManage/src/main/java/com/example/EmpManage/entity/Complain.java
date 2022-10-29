package com.example.EmpManage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Complain_tbl")
public class Complain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long complainId;
	private long empId;
    private	String status;
	private String description;
	

public long getComplainId() {
		return complainId;
	}


	public void setComplainId(long complainId) {
		this.complainId = complainId;
	}


	public long getEmpId() {
		return empId;
	}


	public void setEmpId(long empId) {
		this.empId = empId;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Complain() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Complain [complainId=" + complainId + ", empId=" + empId + ", status=" + status + ", description="
				+ description + "]";
	}
	
}
