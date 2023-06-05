package day1;

import java.util.Scanner;

// Write a menu driven program to maintain student information. Modify Student class 
//created in previous assignment. Add a member gpa in student class, add a function in 
//student class to return GPA of a student
public class Assign3
{

	public static void main(String[] args) 
	{
		StudentService ss=new StudentService();
		
		int choice;
		do
		{
		System.out.print("\n1. Display All Student\n"
				+ "2. Insert new student\n"
				+ "3. Search by name\n"
				+ "4. Search by id\n"
				+ "5. calculate GPA of a student\n"
				+ "6. Exit\n");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
	
			ss.DisplayAll();
			
			break;
		
		case 2:
		
			ss.InsertData();
			break;
		
		case 3:
			sc.nextLine();
			System.out.println("Enter a name to search : ");
			String nm=sc.nextLine();
			ss.SearchByName(nm);
			break;
		case 4:
			
			System.out.println("Enter a id to search : ");
			int n=sc.nextInt();
			ss.SearchById(n);
			break;
		
		case 5:
		
			Scanner id=new Scanner(System.in);
			System.out.println("enter id which you want to calculate gpa->");
			int s=id.nextInt();
			ss.calculateGPA(s);
			break;
		
		case 6:
			sc.close();
			System.exit(0);
		}
		}while(choice!=6);
		
	}

}
