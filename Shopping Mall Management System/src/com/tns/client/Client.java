package com.tns.client;

import com.tns.entities.Customer;
import com.tns.entities.Employee;
import com.tns.entities.Item;
import com.tns.entities.Mall;
import com.tns.entities.MallAdmin;
import com.tns.entities.Order;
import com.tns.entities.Shop;
import com.tns.entities.ShopOwner;
import com.tns.entities.User;
import com.tns.service.IEmployeeService;
import com.tns.service.IEmployeeServiceImp;
import com.tns.service.IShopService;
import com.tns.service.IShopServiceImp;

public class Client 
{

	public static void main(String[] args)
	{
		//CRUD operation calling activity
		Employee employee=new Employee();
		IEmployeeService service=new IEmployeeServiceImp();
		//Create operation
		employee.setId(1001);
		employee.setName("Bharathi");
		employee.setDob("20/12/2000");
		employee.setSalary((float) 25000.00);
		employee.setAddress("Bangalore");
		employee.setDesignation("Bangalore");
		employee.getShop_id();
		
		
		Shop shop=new Shop();
		IShopService service1=new IShopServiceImp();
		shop.setShopId(101);
		shop.setCategory("4 Star");
		shop.setShopName("Trends");
		shop.setCustomers("friends dressess");
		shop.setShopStatus("Open");
		shop.setShopOwner("ABCDE");
		shop.setLeaseStatus("2 years");
		
		MallAdmin mallAdmin = new MallAdmin();
		IShopService service2 = new IShopServiceImp();
		
		//MallAdmin class
		//create operation
		mallAdmin.setId(0001);
		mallAdmin.setName("Yash");
		mallAdmin.setPassword("abc321");
		mallAdmin.setPhone("9087654321");
		
		//Mall Class
				Mall mall = new Mall();
				mall.setId(001);
				mall.setMallName("Orion");
				mall.setLocation("Bengaluru");
				mall.setCategories("Regional");
				
				
				//ShopOwner Class
				ShopOwner owner = new ShopOwner();
				owner.setId(05);
				owner.setName("Sudeep");
				owner.setDob("18-06-1998");
				owner.setAddress("Mysuru");
				//owner.setShop_id(04);
				
				//Item Class
				Item item = new Item();
				item.setId(02);
				item.setName("Pizza");
				item.setPrice(350);
				item.setManufacturingDate("31-05-2022");
				item.setExpiryDate("02-06-2022");
				item.setCategory("Veg");
		
				//Order Class
				Order order = new Order();
				order.setId(23);
				//order.setCustomer_id(07);
				//order.setShop_id(18);
				order.setTotal(550.0f);
				order.setPaymentMode("Online");
				order.setDateofPurchase("25-05-2022");
				
				//Customer Class
				Customer customer = new Customer();
				customer.setId(12);
				customer.setName("Shubha");
				customer.setOrder_id(20);
				customer.setPhone("9845704023");
				customer.setEmail("abc@gmail.com");
				
				//User Class
				User user = new User();
				user.setId(05);
				user.setName("Dhoni");
				user.setPassword("xt@32");
				user.setType("Regular");	
		
		
		
		
		

	}

}
