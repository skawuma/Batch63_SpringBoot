package com.cogent.TelecomManag.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Plans_tbl")

public class Plans {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long planid;
	private String planname;
	private Double plancost;
	private String Validity;
	
	public Plans(long planid, String planname, Double plancost, String validity) {
		super();
		this.planid = planid;
		this.planname = planname;
		this.plancost = plancost;
		Validity = validity;
	}

	public Plans() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getPlanid() {
		return planid;
	}

	public void setPlanid(long planid) {
		this.planid = planid;
	}

	public String getPlanname() {
		return planname;
	}

	public void setPlanname(String planname) {
		this.planname = planname;
	}

	public Double getPlancost() {
		return plancost;
	}

	public void setPlancost(Double plancost) {
		this.plancost = plancost;
	}

	public String getValidity() {
		return Validity;
	}

	public void setValidity(String validity) {
		Validity = validity;
	}

	@Override
	public String toString() {
		return "Plans [planid=" + planid + ", planname=" + planname + ", plancost=" + plancost + ", Validity="
				+ Validity + "]";
	}

}
