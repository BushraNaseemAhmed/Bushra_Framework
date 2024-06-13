package com.jsp.Employee_bidirectionl_dto;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

public class Address 
{
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", Locality=" + Locality + ", Nationality=" + Nationality + "]";
	}

	private int pincode;
	private String Locality;
	private String Nationality;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy="address")
	
	private Employee employee;

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getLocality() {
		return Locality;
	}

	public void setLocality(String locality) {
		Locality = locality;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
