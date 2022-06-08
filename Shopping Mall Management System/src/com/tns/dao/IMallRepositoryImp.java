package com.tns.dao;

import javax.persistence.EntityManager;

import com.tns.entities.Mall;

public class IMallRepositoryImp implements IMallRepository
{
	private EntityManager entityManager;
	
	public IMallRepositoryImp()
	{
		entityManager=JPAUtil.getEntityManager();
	}
	@Override
	public Mall addMall(Mall mall) {
		entityManager.persist(mall);
		return mall;
	}

	@Override
	public Mall updateMall(Mall mall) {
		entityManager.merge(mall);
		return mall;
	}

	@Override
	public Mall searchMall(int id) {
		Mall mall= entityManager.find(Mall.class,id);
		return mall;
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	

}
