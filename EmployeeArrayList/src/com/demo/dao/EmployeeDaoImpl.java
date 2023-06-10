package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.comparators.*;
public class EmployeeDaoImpl implements  EmployeeDao
{

	private static List<Employee> elist;
	static 
	{
		elist=new ArrayList<>();	
		elist.add(new Employee(11,"Akshat",66666));
		elist.add(new Employee(12,"Rohan",55555));
		elist.add(new Employee(13,"Anuradha",33333));
		elist.add(new Employee(14,"Aashima",88888));	
	}
	@Override
	public void save(Employee e) {
		elist.add(e);
		
	}
	


	@Override
	public List<Employee> getAllEmployee() 
	{
		return elist;	
		
	}
	


	@Override
	public Employee findById(int _id) 
	{
		int pos=elist.indexOf(new Employee(_id));//equals 
		System.out.println(pos);
		if(pos!=-1)
		{
			return elist.get(pos);
		}
		return null;
	}



		@Override
		public List<Employee> findByName(String nm) {
			List<Employee> findlst=new ArrayList<>();
			for(Employee  ob:elist) {
				if(ob.getEname().equals(nm)) {
					findlst.add(ob);
				}
				
			}
			if(findlst.size()>0) {
				return findlst;
			}
			return null;
		}

	@Override
	public List<Employee> sortBySalary()
	{
		List<Employee> sallist=new ArrayList<>();
		for(Employee ob :elist)
		{
			sallist.add(ob);
		}
		sallist.sort(null);
		return sallist;
	}



	@Override
	public List<Employee> sortByName() {
		List<Employee> sallist=new ArrayList<>();
		for(Employee ob :elist)
		{
			sallist.add(ob);
		}

		//Comparator<Employee> c=(o1,o2)->{return o1.getEname().compareTo(o2.getEname());};

		sallist.sort(new Mycomparator());
		return sallist;

	}


	@Override
	public int UpdateId(int id,int n) 
	{
		int pos=elist.indexOf(new Employee(id));
		System.out.println(pos);
		
		if(pos!=-1)
		{
			elist.get(pos).setSal(n);
			return pos;
		}
		return -1;
		
	}



	@Override
	public int Delete(int id) {
		int pos=elist.indexOf(new Employee(id));//equals 
		System.out.println(pos);
		if(pos!=-1)
		{
			elist.remove(pos);
			return pos;
		}
		return -1;
	}

}
