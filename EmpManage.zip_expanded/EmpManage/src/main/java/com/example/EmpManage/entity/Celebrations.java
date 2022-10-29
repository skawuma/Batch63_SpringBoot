package com.example.EmpManage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="Celebrations_tbl")
public class Celebrations {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long celebId;
	private String celebname;
	private Double celebbudjet;
	private int countppl;
	
	public Celebrations(long celebId, String celebname, Double celebbudjet, int countppl) {
		super();
		this.celebId = celebId;
		this.celebname = celebname;
		this.celebbudjet = celebbudjet;
		this.countppl = countppl;
	}

	public Celebrations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCelebId() {
		return celebId;
	}

	public void setCelebId(long celebId) {
		this.celebId = celebId;
	}

	public String getCelebname() {
		return celebname;
	}

	public void setCelebname(String celebname) {
		this.celebname = celebname;
	}

	public Double getCelebbudjet() {
		return celebbudjet;
	}

	public void setCelebbudjet(Double celebbudjet) {
		this.celebbudjet = celebbudjet;
	}

	public int getCountppl() {
		return countppl;
	}

	public void setCountppl(int countppl) {
		this.countppl = countppl;
	}

	@Override
	public String toString() {
		return "Celebrations [celebId=" + celebId + ", celebname=" + celebname + ", celebbudjet=" + celebbudjet
				+ ", countppl=" + countppl + "]";
	}
	

}
