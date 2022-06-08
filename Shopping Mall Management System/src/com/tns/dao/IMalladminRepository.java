package com.tns.dao;

import com.tns.entities.MallAdmin;
import com.tns.entities.Shop;
import com.tns.entities.User;

public interface IMalladminRepository 
{
	public void addNewMalladmin(MallAdmin malladmin);
	public void updateMalladmin(MallAdmin malladmin);
	public void deleteMalladmin(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	public void updateUser(User user);
	public void approaveNewShop(Shop shop);
	
}
