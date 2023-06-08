package com.demo.beans;

public class Circle  extends Shape{
	private int radius;

	public Circle(String color,int radius) {
		super(color);
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public float CalculateArea() 
	{
		return 3.14f*radius*radius;
	}
	public float CalculatePerimeter() 
	{
		return 2*(float)Math.PI*radius;
	}
	@Override
	public String toString() {
		Shape s=this;
		return "Circle: radius : " + radius+"\nid : "+s.id+ "\ncolor : "+s.color;
	}

}
