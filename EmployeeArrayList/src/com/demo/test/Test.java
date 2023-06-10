package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		EmployeeService es= new EmployeeServiceImpl();
		int choice;
		
		do {
			System.out.println("1. Add new Employee\n2. Display all\n3. Disaly by id\n4. Display by name");
			System.out.println("5. Sort by sal\n6. Sort by name\n7. Modify sal\n8. Delete by id\n9. Exit");
			System.out.println("choice : ");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					es.addNewEmployee();
					break;
				case 2:
					List<Employee> e=es.displayAll();
					
					e.forEach(a->System.out.println(a));
					
					break;
				case 3:
					System.out.println("Enter id : ");
					int _id=sc.nextInt();					
					Employee e1=es.DisplayById(_id);
					if(e1!=null)
						System.out.println(e1);
					else
						System.out.println("Not Found......");
					break;
				case 4:
					System.out.println("Enter name: ");
					String nm=sc.next();
					List<Employee> tlist=es.DisplayByName(nm);
					if(tlist!=null)
					{
						tlist.forEach(a->{System.out.println(a);});
					}
					else
						System.out.println("Not Found.......");
					break;
				case 5:
					
					tlist=es.sortSalary();
					if(tlist!=null)
					{
						tlist.forEach(a->{System.out.println(a);});
					}
					else
						System.out.println("Not Found.......");
					
					break;
					
				case 6:
					
					tlist=es.sortName();
					if(tlist!=null)
					{
						tlist.forEach(a->{System.out.println(a);});
					}
					else
						System.out.println("Not Found.......");
					
					break;
				case 7:
					System.out.println("Enter id : ");
					int id=sc.nextInt();		
					System.out.println("Enter value to updated : ");
					int n=sc.nextInt();
					int i=es.modifyId(id,n);
					if(i==-1)
					{
						System.out.println("Not Found.....");
					}
					else
						System.out.println("Updated......");
					break;
				case 8:
					System.out.println("Enter id : ");
					id=sc.nextInt();		
					 i=es.deleteById(id);
					if(i==-1)
					{
						System.out.println("Not Found.....");
					}
					else
						System.out.println("deleted......");
					break;
					
					
				case 9:
					sc.close();
					System.out.println("");
					
					break;
					default: 
						System.out.println("Invalid choice Entered !!!");
			}
		}while(choice!=9);
		
		
	}

}
