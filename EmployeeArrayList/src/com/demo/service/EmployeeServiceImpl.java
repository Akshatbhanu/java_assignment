package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService
{

	private static EmployeeDao edao;
	
	public EmployeeServiceImpl() {
		super();
		edao=new EmployeeDaoImpl();
	}

	@Override
	public void addNewEmployee() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an id: ");
		int n=sc.nextInt();
		System.out.println("Enter a name : ");
		String nm=sc.next();
		System.out.println("Enter salary: ");
		int s=sc.nextInt();
		
		Employee e=new Employee(n,nm,s);
		edao.save(e);
		
	}

	@Override
	public List<Employee> displayAll() 
	{
		
		return edao.getAllEmployee();
	}

	@Override
	public Employee DisplayById(int _id) {
		
		return edao.findById(_id);
	}

	@Override
	public List<Employee> DisplayByName(String nm) {
		return edao.findByName(nm);
	}

	@Override
	public List<Employee> sortSalary() {
		
		return edao.sortBySalary();
	}

	@Override
	public List<Employee> sortName() {
		return edao.sortByName();
	}

	@Override
	public int modifyId(int id,int n) {
		return edao.UpdateId(id,n);
	}

	@Override
	public int deleteById(int id) {
		return edao.Delete(id);
		
	}

	
}
