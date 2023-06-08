package com.demo.beans;

public class Rectangle extends Shape
{
	private int length,breadth;

	
	public Rectangle() {
		super();
	}
	
	
	public Rectangle(String color, int length, int breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}


	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	
	@Override
	public String toString() {
		Shape s=this;
		return "Rectangle: \nlength : " + length + "\nbreadth : " + breadth +"\nid : "+s.id+ "\ncolor : "+s.color;
	}
	
	public float CalculateArea() 
	{
		return length*breadth;
	}
	public float CalculatePerimeter() 
	{
		return 2*(length+breadth);
	}
	
}
