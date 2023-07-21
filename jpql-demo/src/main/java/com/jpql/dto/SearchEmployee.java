package com.jpql.dto;

import java.util.List;
import java.util.Scanner;

import com.jpql.dao.EmployeeDao;

public class SearchEmployee {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		EmployeeDao dao=new EmployeeDao();
		System.out.println("Enter the name");
		String name=s.next();
		
		List<Employee> searchEmp=dao.searchBasedonName(name);
		if(searchEmp.isEmpty())
			System.out.println("No records found");
		else
			System.out.println(searchEmp);
	}
}
