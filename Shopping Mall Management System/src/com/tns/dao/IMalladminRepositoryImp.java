package com.tns.dao;

import javax.persistence.EntityManager;

import com.tns.entities.MallAdmin;

public class IMalladminRepositoryImp 
{
	public abstract class MalladminRepositoryImp implements IMalladminRepository
	{
		private EntityManager entityManager;

		public MalladminRepositoryImp() 
		{
			entityManager=JPAUtil.getEntityManager();
		}@Override
		public void addNewMalladmin(MallAdmin malladmin) 
		{
			entityManager.persist(malladmin);
			
		}

		@Override
		public void updateMalladmin(MallAdmin malladmin) 
		{
			entityManager.merge(malladmin);
			
		}

		@Override
		public void deleteMalladmin(int id) 
		{
			MallAdmin malladmin = entityManager.find(MallAdmin.class, id);
			entityManager.remove(malladmin);
		}

		@Override
		public void beginTransaction() 
		{
			entityManager.getTransaction().begin();
		}
		
		@Override
		public void commitTransaction() 
		{
			entityManager.getTransaction().commit();	
		}

		
    }
}
