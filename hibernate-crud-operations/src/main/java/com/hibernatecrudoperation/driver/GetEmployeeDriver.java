package com.hibernatecrudoperation.driver;

import java.util.Scanner;

import com.hibernatecrudoperation.dao.EmployeeDao;
import com.hibernatecrudoperation.dto.Employee;

public class GetEmployeeDriver {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDao();
		System.out.println("Enter the employee number");
		int id=s.nextInt();
		
		Employee e=dao.getEmployee(id);
		if(e!=null)
			System.out.println("Records is found");
		else
			System.out.println("Records not found");
	}
}
