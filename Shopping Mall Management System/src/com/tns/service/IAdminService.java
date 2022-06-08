package com.tns.service;

import com.tns.entities.Shop;
import com.tns.entities.User;

public interface IAdminService 
{
	 public   boolean approaveNewShop(Shop shop);
	 public   void updateUser(User user);
	 public  User login(User user);
	 public   boolean logOut();

}
