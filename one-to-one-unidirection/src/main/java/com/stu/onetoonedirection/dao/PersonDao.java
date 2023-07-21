package com.stu.onetoonedirection.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.stu.onetoonedirection.dto.Person;

public class PersonDao {

	private final static EntityManagerFactory FACTORY;
	static {
		FACTORY=Persistence.createEntityManagerFactory("dev");
	}

	public Person savePerson(Person person) {
		EntityManager manager=FACTORY.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		
		try {
			tx.begin();
			manager.persist(person);
			//manager.persist(person.getPersonId());
			tx.commit();
			return person;
		}catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		}
	}

	public Person searchPerson(int id) {
		EntityManager manager=FACTORY.createEntityManager();
		return manager.find(Person.class, id);
	}
}

