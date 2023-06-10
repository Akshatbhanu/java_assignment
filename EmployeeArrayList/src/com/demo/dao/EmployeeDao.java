package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao 
{

	void save(Employee e);
	
	List<Employee> getAllEmployee();

	Employee findById(int _id);

	List<Employee> findByName(String nm);

	List<Employee> sortBySalary();

	List<Employee> sortByName();

	int UpdateId(int id, int n);

	int Delete(int id);



	
}
