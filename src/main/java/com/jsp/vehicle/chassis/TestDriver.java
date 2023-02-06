package com.jsp.vehicle.chassis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDriver {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Chassis chassis=new Chassis();
		Vehicle vehicle=new Vehicle();
		
		chassis.setNumber(11121314);
		chassis.setVehicle(vehicle);
		
		
		vehicle.setBrand("suzuki");
		vehicle.setName("alto");
		vehicle.setChassis(chassis);
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityManager.persist(chassis);
		entityTransaction.commit();
	}

}
