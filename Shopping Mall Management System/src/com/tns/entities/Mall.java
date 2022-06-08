package com.tns.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Mall")
public class Mall 
{
	@Id
	private int Id;
	private MallAdmin mallAdmin;
	private String mallName;
	private String location;
	private Shop shops_id;
	private String categories;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public MallAdmin getMallAdmin() {
		return mallAdmin;
	}
	public void setMallAdmin(MallAdmin mallAdmin) {
		this.mallAdmin = mallAdmin;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Shop getShops_id() {
		return shops_id;
	}
	public void setShops_id(Shop shops_id) {
		this.shops_id = shops_id;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	

}
