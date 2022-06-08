package com.tns.service;

import java.util.List;

import com.tns.dao.ICustomerRepository;
import com.tns.dao.ICustomerRepositoryImp;
import com.tns.entities.Item;
import com.tns.entities.Mall;
import com.tns.entities.User;



public class ICustomerServiceImp implements ICustomerService
{
	//Establishing connection between Service and Repository
	private ICustomerRepository dao1;
	public ICustomerServiceImp()
	{
		dao1 = new ICustomerRepositoryImp();
	}
	@Override
	public List<Item> searchItem(String itemName) {
		return ((ICustomerServiceImp) dao1).searchItem(itemName);
	}

	@Override
	public Item orderItem(Item item) {
		return ((ICustomerServiceImp) dao1).orderItem(item);
	}

	@Override
	public Mall searchMall(int id) {
		return ((ICustomerServiceImp) dao1).searchMall(id);
	}

	@Override
	public boolean cancelOrder(int orderId) {
		return ((ICustomerServiceImp) dao1).cancelOrder(orderId);
	}

	@Override
	public User login(User user) {
		dao1.beginTransaction();
		((IUserServiceImp) dao1).login(user);
		dao1.commitTransaction();
		return user;
	}

	@Override
	public boolean logOut() {
		dao1.beginTransaction();
		((IUserServiceImp) dao1).logOut();
		dao1.commitTransaction();
		return false;
	}
	
}
