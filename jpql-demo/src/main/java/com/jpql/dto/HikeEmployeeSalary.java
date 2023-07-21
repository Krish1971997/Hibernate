package com.jpql.dto;

import com.jpql.dao.EmployeeDao;

public class HikeEmployeeSalary {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDao();
		
		boolean isHiked=dao.hikeEmplpoyeeSalary();
		if(isHiked)
			System.out.println("Hike is done");
		else
			System.out.println("not done");
	}
}
