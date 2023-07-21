package com.jpql.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpql.dto.Employee;

public class EmployeeDao {

	private final static EntityManagerFactory FACTORY;
	
	static {
		FACTORY =Persistence.createEntityManagerFactory("dev");
	}
	
	public List<Employee> getAllEmployees() {
		EntityManager manager=FACTORY.createEntityManager();
		String jpql="from Employee";
		Query  query=manager.createQuery(jpql);
		List<Employee> getallemps =query.getResultList();
		return getallemps;
	}
	public List searchBasedonName(String name) {
		EntityManager manager=FACTORY.createEntityManager();
		//String jpql="from Employee where name=?1";
		String jpql="from Employee where name=:str";
		Query query=manager.createQuery(jpql);
		//query.setParameter(1, name);
		query.setParameter("str", name);
		return query.getResultList();
	}
	public List<Employee> searchEmployeeBasedonSalary(double sal1, double sal2) {
		EntityManager manager=FACTORY.createEntityManager();
		String jpql="from Employee where salary between :sal1 and :sal2 ";
		Query query=manager.createQuery(jpql);
		
		query.setParameter("sal1", sal1);
		query.setParameter("sal2", sal2);
		return query.getResultList();
	}
	public boolean hikeEmplpoyeeSalary() {
		EntityManager manager=FACTORY.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		String jpql="Update Employee set salary=salary+salary*0.1 where salary<900000";
		
		tx.begin();
		Query query=manager.createQuery(jpql);
		int rowsAffected=query.executeUpdate();
		tx.commit();
		return rowsAffected!=0;
	}
}
