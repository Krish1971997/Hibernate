package com.hibernatecrudoperation.driver;

import java.util.Scanner;

import com.hibernatecrudoperation.dao.EmployeeDao;
import com.hibernatecrudoperation.dto.Employee;

public class UpdateEmployeDriver {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the employee ID to be updated:");
		int id = s.nextInt();

		EmployeeDao dao = new EmployeeDao();
		Employee empToBeUpdated = dao.getEmployee(id);
		if (empToBeUpdated != null) {
			System.out.println("1.Name\t2.Email\t3.Mobile Number\t4.Salary\t5.Designation");
			System.out.println("Enter what has to be updated");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the new name");
				String name=s.next();
				empToBeUpdated.setName(name);
				break;
			case 2:
				System.out.println("Enter the new email");
				String email=s.next();
				empToBeUpdated.setEmail(email);
				break;
			case 3:
				System.out.println("Enter the new mobile number");
				int mobile=s.nextInt();
				empToBeUpdated.setMobilenumber(mobile);
				break;
			case 4:
				System.out.println("Enter the new salary");
				double salary=s.nextDouble();
				empToBeUpdated.setSalary(salary);
				break;
			case 5:
				System.out.println("Enter the new designation");
				String designation=s.next();
				empToBeUpdated.setDesignation(designation);
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
			
			Employee emp=dao.updateEmployee(empToBeUpdated);
			if(emp!=null)
				System.out.println("Empoyee to be updated");
			else
				System.out.println("Empoyee to be not updated");
		} else
			System.out.println("Updated cannot be done because employee data not found");
	}
}
