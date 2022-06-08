package com.tns.service;

import com.tns.dao.IItemRepository;
import com.tns.dao.IItemRepositoryImp;
import com.tns.dao.IOrderRepository;
import com.tns.dao.IOrderRepositoryImp;
import com.tns.entities.Item;
import com.tns.entities.Order;

public class IOrderServiceImp implements IOrderService
{
	//Establishing connection between Service and Repository
		private IOrderRepository dao3;	
		public IOrderServiceImp()
		{
			dao3 = new IOrderRepositoryImp();
		}

		@Override
		public Order addOrder(Order order) {
			dao3.beginTransaction();
			dao3.addOrder(order);
			dao3.commitTransaction();
			return order;
		}

		@Override
		public Order updateOrder(Order order) {
			dao3.beginTransaction();
			dao3.updateOrder(order);
			dao3.commitTransaction();
			return order;
		}

		@Override
		public Order searchOrderById(int id) {
			Order order = dao3.searchOrderById(id);
			return order;
		}

		@Override
		public boolean cancelMall(int id) {
			dao3.beginTransaction();
			((IOrderServiceImp) dao3).cancelMall(id);
			dao3.commitTransaction();
			return false;
		}

		@Override
		public Item addItem(Item item) {
			dao3.beginTransaction();
			((IItemRepositoryImp) dao3).addItem(item);
			dao3.commitTransaction();
			return item;
		}


}
