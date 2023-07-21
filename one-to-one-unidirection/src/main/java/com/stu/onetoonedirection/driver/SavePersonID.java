package com.stu.onetoonedirection.driver;

import java.util.Scanner;

import com.stu.onetoonedirection.dao.PersonDao;
import com.stu.onetoonedirection.dto.PanCard;
import com.stu.onetoonedirection.dto.Person;

public class SavePersonID {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Person name");
		String name=s.next();
		System.out.println("Enter age");
		int age=s.nextInt();
		
		System.out.println("Enter the dob");
		int dob=s.nextInt();
		System.out.println("Enter the address");
		String address=s.next();
		
		Person person=new Person();
		person.setAge(age);
		person.setName(name);
		
		PanCard panCard=new PanCard();
		panCard.setAddress(address);
		panCard.setDob(dob);
		
		person.setPanNumber(panCard);
		
		PersonDao dao=new PersonDao();
		Person savePerson=dao.savePerson(person);
		if(savePerson!=null)
			System.out.println("Person saved");
		else
			System.out.println("Person not saved");
		
		
	}
}
