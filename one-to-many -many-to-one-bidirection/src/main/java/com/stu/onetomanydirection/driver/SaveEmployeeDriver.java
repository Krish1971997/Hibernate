package com.stu.onetomanydirection.driver;

import java.util.ArrayList;
import java.util.List;

import com.stu.onetomanydirection.dao.DeviceDao;
import com.stu.onetomanydirection.dao.EmployeeDao;
import com.stu.onetomanydirection.dto.Device;
import com.stu.onetomanydirection.dto.Employee;

public class SaveEmployeeDriver {

	public static void main(String[] args) {

		Device device1 = new Device();
		device1.setDeviceName("Laptop");
		device1.setDateOfIssue("30/01/2023");

		int empid = 1;
		EmployeeDao dao = new EmployeeDao();
		Employee searchedEmp = dao.searchEmployee(empid);
		if (searchedEmp == null) {
			Employee employee = new Employee();
			employee.setName("Ramu");
			employee.setSalary(4.8);
			device1.setEmployee(employee);
		} else {
			device1.setEmployee(searchedEmp);
		}
	
		DeviceDao devicedao = new DeviceDao();
		Device savedevice=devicedao.saveDevice(device1);
		if(savedevice!=null) {
			System.out.println("Devie saved");
		} else {
			System.out.println("Device not saved");
		}
	}
}