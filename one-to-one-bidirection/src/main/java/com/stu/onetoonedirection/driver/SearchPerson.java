package com.stu.onetoonedirection.driver;

import java.util.Scanner;

import com.stu.onetoonedirection.dao.PersonDao;
import com.stu.onetoonedirection.dto.PanCard;
import com.stu.onetoonedirection.dto.Person;

public class SearchPerson {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Person ID");
		int id=s.nextInt();
		
		PersonDao dao=new PersonDao();
		Person search=dao.searchPerson(id);
		if(search!=null) {
			System.out.println("Person ID: "+search.getPersonId());
			System.out.println("Person Name: "+search.getName());
			System.out.println("Person Age: "+search.getAge());
			
			PanCard saveperson=search.getPanNumber();
			System.out.println("Pan nmber : "+saveperson.getPanNumber());
			System.out.println("Pan Address : "+saveperson.getAddress());
			System.out.println("Pan DOB : "+saveperson.getDob());
		}
	}
}
