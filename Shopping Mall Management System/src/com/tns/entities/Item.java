package com.tns.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Item")
public class Item implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	//@Column(name="ID")
	private int id;
	//@Column(name="Name")
	private String name;
	//@Column(name="Price")
	private int price;
	//@Column(name="Manufacturing_Date")
	private String manufacturingDate;
	//@Column(name="Expiry_Date")
	private String expiryDate;
	//@Column(name="Category")
	private String category;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	public String setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
		return manufacturingDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public String setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
		return expiryDate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", manufacturingDate=" + manufacturingDate
				+ ", expiryDate=" + expiryDate + ", Category=" + category + "]";
	}
	
}