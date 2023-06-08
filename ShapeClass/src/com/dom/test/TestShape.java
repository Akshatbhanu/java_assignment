package com.dom.test;

import java.util.Scanner;

import com.dom.service.ShapeService;

public class TestShape 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do 
		{
			System.out.println("1- Add new Shape\n2- Display All \n3- Search by id\n4- Calculate Area and Perimeter\n5- Exit ");
			System.out.println("\nEnter your Choice: ");
			choice=sc.nextInt();
			
			ShapeService ss=new ShapeService();
			switch(choice)
			{
			case 1:
				System.out.println("1- Triangle \n2-Square \n3-Rectangle \n4-circle ");
				System.out.println("Enter choice : ");
				int ch=sc.nextInt();
				ss.addNewShape(ch);
				break;
			case 2:
				ss.displayAll();
				break;
			case 3:
				System.out.println("Enter id : ");
				int c=sc.nextInt();
				int a=ss.searchId(c);
				if(a!=-1)
					ss.display(a);
				else
					System.out.println("Not Found ..... ");
				break;
			case 4:
				System.out.println("Enter id : ");
				int i=sc.nextInt();
				String ans=ss.CalculateDetails(i);
				if(ans!=null)
					System.out.println(ans);
				else
					System.out.println("Not Found .....");
				break;
				
			case 6:
				sc.close();
				break;
			default:
				System.out.println("Invalid choice entered ");
			}
			
		}while(choice!=6);
	}

}
