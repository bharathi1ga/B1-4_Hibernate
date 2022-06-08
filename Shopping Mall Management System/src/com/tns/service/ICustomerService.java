package com.tns.service;

import java.util.List;


import com.tns.entities.Item;
import com.tns.entities.Mall;
import com.tns.entities.User;

public interface ICustomerService 
{
	public abstract List<Item>searchItem(String itemName);
	public abstract Item orderItem(Item item);
	public abstract Mall searchMall(int id);
	public abstract boolean cancelOrder(int orderId);
	public abstract User login(User user);
	public abstract boolean logOut();
}
