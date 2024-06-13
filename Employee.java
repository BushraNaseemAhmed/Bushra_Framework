package com.jsp.Employee_bidirectionl_dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class Employee
{
	@Id
	private int id;
	private String Department;
	private String locality;
	private int salary;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Department=" + Department + ", locality=" + locality + ", salary=" + salary
				+ ", address=" + address + "]";
	}
	
	
	
}
