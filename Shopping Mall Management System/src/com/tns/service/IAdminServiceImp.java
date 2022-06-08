package com.tns.service;

import com.tns.dao.IMalladminRepository;
import com.tns.dao.IMalladminRepositoryImp;
import com.tns.entities.Shop;
import com.tns.entities.User;

public  class IAdminServiceImp implements IAdminService
{
	private  IMalladminRepository Repository;
	
	public IAdminServiceImp()
	{
		Repository=(IMalladminRepository) new IMalladminRepositoryImp();
	}

	@Override
	public boolean approaveNewShop(Shop shop) {
		Repository.beginTransaction();
		Repository.approaveNewShop(shop);
		Repository.commitTransaction();
		return false;
	}

	@Override
	public void updateUser(User user) {
		Repository.beginTransaction();
		Repository.updateUser(user);
		Repository.commitTransaction();	
	}

	@Override
	public User login(User user) {
		Repository.beginTransaction();
		((IAdminServiceImp)Repository).login(user);
		Repository.commitTransaction();
		return user;
		
	}

	@Override
	public boolean logOut() {
		Repository.beginTransaction();
		((IAdminServiceImp)Repository).logOut();
		Repository.commitTransaction();
		return false;
	}

}