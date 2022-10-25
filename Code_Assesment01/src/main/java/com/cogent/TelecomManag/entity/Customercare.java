package com.cogent.TelecomManag.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Customercare_tbl")
public class Customercare {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long custId;
	private String compdescrip;
	private long userId;
	private String compStat;
	
	
	public Customercare(long custId, String compdescrip, long userId, String compStat) {
		super();
		this.custId = custId;
		this.compdescrip = compdescrip;
		this.userId = userId;
		this.compStat = compStat;
	}

	public Customercare() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public String getCompdescrip() {
		return compdescrip;
	}

	public void setCompdescrip(String compdescrip) {
		this.compdescrip = compdescrip;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getCompStat() {
		return compStat;
	}

	public void setCompStat(String compStat) {
		this.compStat = compStat;
	}

	@Override
	public String toString() {
		return "Customercare [custId=" + custId + ", compdescrip=" + compdescrip + ", userId=" + userId + ", compStat="
				+ compStat + "]";
	}
	

}
