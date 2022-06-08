package com.tns.service;

import com.tns.entities.Employee;

public interface IEmployeeService
{
	public void addEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public Employee searchEmployee(int id);
	public boolean removeEmployee(int id);
	
	

}
