package day1;
import java.util.*;
public class StudentService 
{
	static Student s[];
	static int cnt;
	public StudentService()
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
	public void DisplayAll()
	{
		for(int i=0;i<cnt;i++)

		{
		System.out.println("Student details :");
		System.out.println("________________________");
		System.out.println("Student id ->"+s[i].getStudentId());
		System.out.println("Student name ->"+s[i].getName());
		System.out.println("marks 1 : "+s[i].getM1());
		System.out.println("marks 2 : "+s[i].getM2());
		System.out.println("marks 3 : "+s[i].getM3());
		}
	}
}
