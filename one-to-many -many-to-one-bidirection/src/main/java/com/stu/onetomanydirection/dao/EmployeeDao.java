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

	public Employee searchEmployee(int  id) {
		EntityManager manager=FACTORY.createEntityManager();
		return manager.find(Employee.class, id);
	}
	
}
