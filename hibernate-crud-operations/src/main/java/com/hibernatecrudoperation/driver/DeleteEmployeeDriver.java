package com.hibernatecrudoperation.driver;

import java.util.Scanner;

import com.hibernatecrudoperation.dao.EmployeeDao;
import com.hibernatecrudoperation.dto.Employee;

public class DeleteEmployeeDriver {
	
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDao();
		System.out.println("Enter the empoyee ID to be deleted");
		int id=s.nextInt();
		
		Employee emp=dao.getEmployee(id);
		if(emp!=null) {
		Employee empToBeDeleted=dao.deleteEmployee(emp);
		if(empToBeDeleted!=null) {
			System.out.println("Data is deleted");
		}
		else {
			System.out.println("Data not deleted");
		}
	}
		else
			System.out.println("Employee cannot be deleted because Employee ID not found");
	}

}
