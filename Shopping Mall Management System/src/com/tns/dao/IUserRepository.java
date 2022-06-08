package com.tns.dao;

import com.tns.entities.User;

public interface IUserRepository 
{
	public void addNewUser(User user);
	public void  updateUser(User user);
	public void deleteUser(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}
