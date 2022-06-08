package com.tns.dao;

import com.tns.entities.Employee;

public interface IEmployeeDao
{
	public void addEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public Employee searchEmployee(int id);
	public boolean deleteEmployee(int id);
	
	public void beginTransaction();
	public void commitTransaction();
	

}
