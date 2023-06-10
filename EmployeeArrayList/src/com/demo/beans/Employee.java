package com.demo.beans;

public class Employee implements Comparable<Employee>
{

	private int empid;
	private String ename;
	private int sal;
	public Employee(int empid, String ename, int sal)
	{
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
	}
	public Employee() 
	{
		super();
		
	}
	
	
	public Employee(int empid) {
		super();
		this.empid = empid;
	}
	public int getEmpid() 
	{
		return empid;
	}
	public void setEmpid(int empid) 
	{
		this.empid = empid;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	public int getSal() 
	{
		return sal;
	}
	public void setSal(int sal) 
	{
		this.sal = sal;
	}
	
	@Override
	public String toString() 
	{
		
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	public int compareTo(Employee ob)
	{
		if(ob.getSal()>this.sal)
			return -1;
		else if(ob.getSal()==this.sal)
			return 0;
		else
			return 1;
//		return this.ename.compareTo(ob.ename);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee temp = (Employee)obj;
		
		return temp.empid == this.empid;
	}
	
	
}
