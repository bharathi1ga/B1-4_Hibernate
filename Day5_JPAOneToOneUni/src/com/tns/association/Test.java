package com.tns.association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee e=new Employee();
		e.setEmployeeName("Bharathi");
		
		Address a=new Address();
		a.setAddressId(22);
		a.setStreet("dwarakangar");
		a.setCity("Bangalore");
		a.setState("karnataka");
		
		e.setAddress(a);
		em.persist(e);
		System.out.println("Row inserted");
		em.getTransaction().commit();
		factory.close();
	}

}
