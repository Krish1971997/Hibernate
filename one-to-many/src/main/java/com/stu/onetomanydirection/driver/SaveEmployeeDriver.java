package com.stu.onetomanydirection.driver;

import java.util.ArrayList;
import java.util.List;

import com.stu.onetomanydirection.dao.EmployeeDao;
import com.stu.onetomanydirection.dto.Device;
import com.stu.onetomanydirection.dto.Employee;

public class SaveEmployeeDriver {

	public static void main(String[] args) {
		
		Employee employee1=new Employee();
		employee1.setName("Krishna");
		employee1.setSalary(4.8);
		
		List<Device> devices=new ArrayList<>();
		Device device1=new Device();
		device1.setDeviceName("Laptop");
		device1.setDateOfIssue("30/01/2023");
		devices.add(device1);
		
		Device device2=new Device();
		device2.setDeviceName("Headphone");
		device2.setDateOfIssue("30/01/2023");
		devices.add(device2);
		
		Device device3=new Device();
		device3.setDeviceName("Mouse");
		device3.setDateOfIssue("30/01/2023");
		devices.add(device3);
		
		employee1.setIssuedDevices(devices);
		
		EmployeeDao dao=new EmployeeDao();
		Employee saveEmp=dao.SaveEmployee(employee1);
		if(saveEmp!=null)
			System.out.println("Employee saved");
		else
			System.out.println("Employee not saved");
	}
}
