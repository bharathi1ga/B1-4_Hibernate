package com.tns.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Shop")
public class Shop implements Serializable
{
	private static final long serialVersioUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int shopId;
	//@Column(name="Category")
	private String Category;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="shopEmployee_ID")
	private Employee shopEmployeeID;
	//@Column(name="shopName")
	private String shopName;
	//@Column(name="customers")
	private String customers;
	//@Column(name="shopStatus")
	private String shopStatus;
	@JoinColumn(name="shopOwner")
	private String shopOwner;
	//@Column(name="leaseStatus")
	private String leaseStatus;
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public Employee getShopEmployeeID() {
		return shopEmployeeID;
	}
	public void setShopEmployeeID(Employee shopEmployeeID) {
		this.shopEmployeeID = shopEmployeeID;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getCustomers() {
		return customers;
	}
	public void setCustomers(String customers) {
		this.customers = customers;
	}
	public String getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}
	public String getShopOwner() {
		return shopOwner;
	}
	public void setShopOwner(String shopOwner) {
		this.shopOwner = shopOwner;
	}
	public String getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	
	
	

}
