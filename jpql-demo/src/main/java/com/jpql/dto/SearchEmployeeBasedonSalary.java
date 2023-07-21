package com.jpql.dto;

import java.util.List;
import java.util.Scanner;

import com.jpql.dao.EmployeeDao;

public class SearchEmployeeBasedonSalary {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		EmployeeDao dao=new EmployeeDao();
		System.out.println("Enter the Salary from range");
		double sal1=s.nextDouble();
		System.out.println("Enter the Salary to range");
		double sal2=s.nextDouble();
		
		List<Employee> searchEmp=dao.searchEmployeeBasedonSalary(sal1,sal2);
		if(searchEmp.isEmpty())
			System.out.println("No records found");
		else
			System.out.println(searchEmp);
	}
}
