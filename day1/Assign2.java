package day1;

import java.util.Scanner;

//Write a program to maintain student information.  student store studid, name, m1, 
//m2 and m3 (marks of 3 subjects ). 

public class Assign2
{

	
	public static void main(String[] args)
	{
//		Scanner sc=new Scanner(System.in);
		StudentService s = new StudentService ();
		s.InsertData();
		
		s.InsertData();
		s.DisplayAll();
//		sc.close();
	}

}
