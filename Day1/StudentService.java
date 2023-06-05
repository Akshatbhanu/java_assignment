package day1;
import java.util.*;
public class StudentService 
{
	static Student s[];
	static int cnt;
	float gpa;
	static
	{
		s=new Student[10];
		cnt=0;
	}
	public void InsertData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name->");
		String N=sc.nextLine();
		System.out.println("enter id number->");
		int Id=sc.nextInt();
		System.out.println("enter first marks ->");
		int x=sc.nextInt();
		System.out.println("enter second marks->");
		int y=sc.nextInt();
		System.out.println("enter third marks->");
		int z=sc.nextInt();
		 s[cnt]=new Student(Id,N,x,y,z);
		 cnt++;
	}
	public void SearchByName(String name)
	{
		for(int i=0;i<cnt;i++)
		{ 
		
			if(s[i].getName().equals(name))
			{
				System.out.println(s[i]);
				return;
			}
		}
		
		System.out.println("Student not found ");
	}
	public void SearchById(int id)
	{
		for(int i=0;i<cnt;i++)
		{ 
		
			if(s[i].getStudentId()==id)
			{
				System.out.println(s[i]);
				return ;
			}
			
		}
		System.out.println("Student not found ");
	}
	public void calculateGPA(int id)
	{
		
		float d=s[id].getM1()/3.0f+s[id].getM2()/2.0f+s[id].getM3()/4.0f;
		System.out.println(d);
		
	}
	
	public void DisplayAll()
	{
		for(int i=0;i<cnt;i++)
		{
		
		System.out.println(s[i]);
		}
	}
}
