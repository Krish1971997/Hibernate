package com.jpql.driver;

import java.util.List;

import com.jpql.dao.EmployeeDao;
import com.jpql.dto.Employee;

public class GetAllEmployees {
	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDao();
		List<Employee> getemp= dao.getAllEmployees();
		if(getemp.isEmpty())
			System.out.println("No records found");
		else
			System.out.println(getemp);
	}

}
