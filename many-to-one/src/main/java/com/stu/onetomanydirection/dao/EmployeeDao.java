package com.stu.onetomanydirection.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.stu.onetomanydirection.dto.Device;
import com.stu.onetomanydirection.dto.Employee;

public class EmployeeDao {
	
	private final static EntityManagerFactory FACTORY;
	static {
		FACTORY=Persistence.createEntityManagerFactory("dev");
	}
	
	public Employee SaveEmployee(Employee employee) {
		EntityManager manager=FACTORY.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		
		try {
			tx.begin();
			manager.persist(employee);
			tx.commit();
			return employee;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		}
	}
	
}
