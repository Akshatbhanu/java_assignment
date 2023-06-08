package com.dom.service;

import java.util.Scanner;

import com.demo.beans.Circle;
import com.demo.beans.Rectangle;
import com.demo.beans.Shape;
import com.demo.beans.Square;
import com.demo.beans.Triangle;

public class ShapeService 
{
	Scanner sc=new Scanner(System.in);
	static Shape[] shapeList;
	static int cnt;
	static 
	{
		shapeList=new Shape[30];
		cnt=0;
	}

	public void addNewShape(int ch) 
	{
		
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter a base height side1, side2 :");
			int h,b,s1,s2;
			h=sc.nextInt();
			b=sc.nextInt();
			s1=sc.nextInt();
			s2=sc.nextInt();
			
			shapeList[cnt++]=new Triangle("red",h,b,s1,s2);
			
			break;
		case 2:
			System.out.println("Enter a side : ");
			s1=sc.nextInt();
			shapeList[cnt++]=new Square("Black",s1);
			break;
		case 3:
			System.out.println("Enter 2 sides : ");
			s1=sc.nextInt();
			s2=sc.nextInt();
			shapeList[cnt++]=new Rectangle("Green",s1,s2);
			break;
			
		case 4:
			System.out.println("Enter radius: ");
			s1=sc.nextInt();
			shapeList[cnt++]=new Circle("Blue",s1);
			
			break;
		default :
			System.out.println("Invalid choice Entered ");
			
		
		}
		
		
	}

	public void displayAll() 
	{
		System.out.println("__________________________");
		for(int i=0;i<cnt;i++)
		{
			
			System.out.println(shapeList[i]);
			System.out.println("__________________________");
			
		}
	}
	public int searchId(int id) 
	{
		for(int a=0;a<cnt;a++)
		{
			if(shapeList[a].getId()==id)
			{
				return a;
			}		
		}
		return -1;
	}

	public void display(int i) 
	{
		System.out.println(shapeList[i]);
		
	}
	
	public String CalculateDetails(int id) 
	{
		int pos=searchId(id);
		if(pos!=-1) 
		{
			float area=shapeList[pos].CalculateArea();
			float perimeter=shapeList[pos].CalculatePerimeter();
			return "Area : "+area+" , Perimeter : "+perimeter;
		}
		else 
		{
			return null;
		}
		
	}


}
