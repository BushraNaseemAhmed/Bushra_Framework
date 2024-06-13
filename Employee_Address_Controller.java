package com.jsp.Employee_bidirectionl_controller;

import com.jsp.Employee_bidirectionl_dao.Employee_Address_dao;
import com.jsp.Employee_bidirectionl_dto.Address;
import com.jsp.Employee_bidirectionl_dto.Employee;

public class Employee_Address_Controller 
{
public static void main(String[] args) 
{
	Employee employee=new Employee();
	employee.setId(3001);
	employee.setDepartment("Development");
	employee.setLocality("Thane");
	employee.setSalary(89000);

	
	
	Address address=new Address();
	
	address.setEmployee(employee);
	address.setLocality("Thane");
	address.setPincode(401107);
	address.setNationality("Indian");
	
	
	employee.setAddress(address);
	
	Employee_Address_dao dao=new Employee_Address_dao();
	dao.saveEmployee(employee);
}
}
