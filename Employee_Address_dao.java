package com.jsp.Employee_bidirectionl_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Employee_bidirectionl_dto.Employee;

public class Employee_Address_dao 
{
 private EntityManagerFactory entityManagerFactory=null;
 private EntityManager entityManager=null;
 private EntityTransaction entityTransaction=null;
 
 public EntityManager getEntityManager()
 {
	 entityManagerFactory=Persistence.createEntityManagerFactory("roshan");
	 entityManager=entityManagerFactory.createEntityManager();
	 return entityManager;
 }
 public void saveEmployee(Employee employee) 
 {
	 entityManager=getEntityManager();
	 entityTransaction=entityManager.getTransaction();
	 entityTransaction.begin();
	 entityManager.persist(employee);
	 entityTransaction.commit();
 }
}
