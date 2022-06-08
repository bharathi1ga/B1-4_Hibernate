package com.tns.dao;

import com.tns.entities.Mall;

public interface IMallRepository
{
	public Mall addMall(Mall mall);
	public Mall updateMall(Mall mall);
	public Mall searchMall(int id);

	
	public  void commitTransaction();
	public  void beginTransaction();

}
