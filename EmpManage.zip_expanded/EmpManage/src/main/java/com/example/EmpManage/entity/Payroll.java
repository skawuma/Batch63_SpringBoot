package com.example.EmpManage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payroll_tbl")
public class Payroll {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long payId;
	private String payName;
	private Double payAmount;
	private Double taxPaid;
	private int daysWorked;
	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payroll(Long payId, String payName, Double payAmount, Double taxPaid, int daysWorked) {
		super();
		this.payId = payId;
		this.payName = payName;
		this.payAmount = payAmount;
		this.taxPaid = taxPaid;
		this.daysWorked = daysWorked;
	}
	public Long getPayId() {
		return payId;
	}
	public void setPayId(Long payId) {
		this.payId = payId;
	}
	public String getPayName() {
		return payName;
	}
	public void setPayName(String payName) {
		this.payName = payName;
	}
	public Double getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}
	public Double getTaxPaid() {
		return taxPaid;
	}
	public void setTaxPaid(Double taxPaid) {
		this.taxPaid = taxPaid;
	}
	public int getDaysWorked() {
		return daysWorked;
	}
	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}
	@Override
	public String toString() {
		return "Payroll [payId=" + payId + ", payName=" + payName + ", payAmount=" + payAmount + ", taxPaid=" + taxPaid
				+ ", daysWorked=" + daysWorked + "]";
	}
	
	

}
