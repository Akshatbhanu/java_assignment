package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addNewEmployee();

	List<Employee> displayAll();

	Employee DisplayById(int _id);

	List<Employee> DisplayByName(String nm);

	List<Employee> sortSalary();

	List<Employee> sortName();

	int modifyId(int id, int n);

	int deleteById(int id);


	

}
