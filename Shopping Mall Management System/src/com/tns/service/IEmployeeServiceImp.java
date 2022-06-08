package com.tns.service;


import com.tns.dao.IEmployeeDao;
import com.tns.dao.IEmployeeDaoImp;
import com.tns.entities.Employee;

public class IEmployeeServiceImp implements IEmployeeService
{
	private IEmployeeDao dao;
    public IEmployeeServiceImp()
    {
    	dao=new IEmployeeDaoImp();
    }
	@Override
	public void addEmployee(Employee employee) {
		dao.beginTransaction();
		dao.addEmployee(employee);
		dao.commitTransaction();
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee employee=dao.searchEmployee(id);
		return employee;
	}

	@Override
	public boolean removeEmployee(int id) {
		dao.beginTransaction();
		dao.deleteEmployee(id);
		dao.commitTransaction();
		return false;
		
	}

}
