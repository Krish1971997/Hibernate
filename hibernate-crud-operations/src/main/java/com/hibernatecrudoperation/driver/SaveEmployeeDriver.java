package com.hibernatecrudoperation.driver;

import java.util.Scanner;

import com.hibernatecrudoperation.dao.EmployeeDao;
import com.hibernatecrudoperation.dto.Employee;

public class SaveEmployeeDriver {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	Employee employee=new Employee();
	EmployeeDao employeeDao=new EmployeeDao();
	
	/*
	 * System.out.println("Enter the employee ID"); int id=sc.nextInt();
	 * employee.setEmployeeId(id);
	 */
	
	System.out.println("Enter the employee name");
	String name=sc.next();
	employee.setName(name);
	
	System.out.println("Enter the employee mobileNumber");
	long nm=sc.nextLong();
	employee.setMobilenumber(nm);
	
	System.out.println("Enter the employee salary");
	double sl=sc.nextDouble();
	employee.setSalary(sl);
	
	System.out.println("Enter the employee email");
	String email=sc.next();
	employee.setEmail(email);
	
	System.out.println("Enter the employee Designation");
	String designation=sc.next();
	employee.setDesignation(designation);
	
	Employee saveemployee=employeeDao.saveEmployee(employee);
	if (saveemployee!=null) {
		System.out.println("Records inserted");
	}
	else
		System.out.println("Records inserted");
	
	}
}
