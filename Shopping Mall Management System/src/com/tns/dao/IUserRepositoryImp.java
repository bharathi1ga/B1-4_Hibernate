package com.tns.dao;

import javax.persistence.EntityManager;

import com.tns.entities.User;

public class IUserRepositoryImp implements IUserRepository
{
	private EntityManager entityManager;

	public IUserRepositoryImp() 
	{
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public void addNewUser(User user) {
		entityManager.persist(user);
		
	}

	@Override
	public void updateUser(User user) {
		entityManager.merge(user);
		
	}

	@Override
	public void deleteUser(int id) {
		User user = entityManager.find(User.class, id);
		entityManager.remove(id);
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