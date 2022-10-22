package com.cogent.ElectManag.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =" Purchase_tbl")
public class Purchase {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	Long id;
	String prdName;
    Date purchaseDate;
    Date deliverydate;
    String customerFeed;
    
	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Purchase(Long id, String prdName, Date purchaseDate, Date deliverydate, String customerFeed) {
		super();
		this.id = id;
		this.prdName = prdName;
		this.purchaseDate = purchaseDate;
		this.deliverydate = deliverydate;
		this.customerFeed = customerFeed;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Date getDeliverydate() {
		return deliverydate;
	}

	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}

	public String getCustomerFeed() {
		return customerFeed;
	}

	public void setCustomerFeed(String customerFeed) {
		this.customerFeed = customerFeed;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", prdName=" + prdName + ", purchaseDate=" + purchaseDate + ", deliverydate="
				+ deliverydate + ", customerFeed=" + customerFeed + "]";
	}
    

}
