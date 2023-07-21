package com.hibernatecrudoperation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernatecrudoperation.dto.Employee;

public class EmployeeDao {

	public Employee saveEmployee(Employee employee) {
		EntityManagerFactory enitymangerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=enitymangerFactory.createEntityManager();
		
		EntityTransaction tx=entityManager.getTransaction();
		try {
			tx.begin();
			entityManager.persist(employee);
			tx.commit();
			return employee;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		}
	}
	
	public Employee getEmployee(int EmployeeID) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		
		Employee emp=manager.find(Employee.class, EmployeeID);
		return emp;
		
	}

	public Employee updateEmployee(Employee empToBeUpdated) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		
		EntityTransaction tx=manager.getTransaction();
		try {
			tx.begin();
			manager.merge(empToBeUpdated);
			tx.commit();
			return empToBeUpdated;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		}
	}

	public Employee deleteEmployee(Employee empToBeUpdated) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		
		EntityTransaction tx=manager.getTransaction();
		try {
			tx.begin();
			Employee emp=manager.merge(empToBeUpdated);
			manager.remove(emp);
			tx.commit();
			return empToBeUpdated;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		}
	}

}
