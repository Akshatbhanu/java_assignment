package day1;

public class Student 
{
 private int studentId,m1,m2,m3;
 private String name;
 
	public Student() 
	{
		 studentId=0;
		 m1=0;
		 m2=0;m3=0;
		 name=null;
	}
	public Student(int id,String name,int m1,int m2,int m3) 
	{
		 studentId=id;
		 this.m1=m1;
		 this.m2=m2;
		 this.m3=m3;
		 this.name=name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() 
	{
		return "Student id: "+studentId+"\nStudent name: "+name+"\nMarks 1: "+m1+"\nMarks 2: "+m2+"\nMarks 3: "+m3;
	}
}
