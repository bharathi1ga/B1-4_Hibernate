package com.tns.service;

import com.tns.dao.IUserRepository;
import com.tns.dao.IUserRepositoryImp;
import com.tns.entities.User;

public class IUserServiceImp implements IUserService
{
private IUserRepository dao;
	
	public IUserServiceImp()
	{
		dao = new IUserRepositoryImp();
	}

	@Override
	public User addNewUser(User user) {
		dao.beginTransaction();
		dao.addNewUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) {
		dao.beginTransaction();
		((IUserServiceImp) dao).login(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public boolean logOut() {
		dao.beginTransaction();
		((IUserServiceImp) dao).logOut();
		dao.commitTransaction();
		return false;
	}

}
