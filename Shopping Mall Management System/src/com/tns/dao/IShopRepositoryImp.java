package com.tns.dao;

import javax.persistence.EntityManager;

import com.tns.entities.Order;
import com.tns.entities.Shop;
import com.tns.entities.ShopOwner;

public class IShopRepositoryImp implements IShopRepository
{
	//Start JPA LifeCycle
		private EntityManager entityManager;
		public IShopRepositoryImp() 
		{
			entityManager=JPAUtil.getEntityManager();
		}
		//Create operation - Repo/DAO
		@Override
		public Shop addShop(Shop shop) {
			entityManager.persist(shop);
			return shop;
		}
		//Update operation
		@Override
		public Shop updateShop(Shop shop) {
			entityManager.merge(shop);
			return shop;
		}
		//Retrieve operation
		@Override
		public Shop searchShopById(int id) {
			Shop shop = entityManager.find(Shop.class, id);
			return shop;
		}
		//Delete operation
		@Override
		public Shop deleteShop(int id) {
			Shop shop = entityManager.find(Shop.class, id);
			entityManager.remove(shop);
			return shop;
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
