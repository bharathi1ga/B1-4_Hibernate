package com.tns.dao;

import javax.persistence.EntityManager;

import com.tns.entities.Employee;


public class IEmployeeDaoImp implements IEmployeeDao
{
	private EntityManager entityManager;
	public IEmployeeDaoImp() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public void addEmployee(Employee employee) {
		entityManager.persist(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		entityManager.merge(employee);
		
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee employee=entityManager.find(Employee.class,id);
		return employee;
		
	}

	@Override
	public  boolean deleteEmployee(int id) {
		Employee employee=entityManager.find(Employee.class,id);
		entityManager.remove(id);
		return false;
		
		
	}
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	

	

}
