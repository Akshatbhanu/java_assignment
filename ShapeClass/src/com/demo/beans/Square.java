package com.demo.beans;

public class Square  extends Shape
{
	private int side;

	
	
	public Square() 
	{
		super();
		
	}
	public Square(String color,int side) 
	{
		super(color);
		this.side = side;
		
	}
	
	public int getSide() {
		return side;
	}
	public void setSide(int side) 
	{
		this.side = side;
	}
	
	@Override
	public String toString() 
	{
		Shape s=this;
		return "Square side : " + side +"\nid : "+s.id+ "\ncolor : "+s.color;
	}
	
	public float CalculateArea()
	{
		return (float)side*side;
	}
	
	public float CalculatePerimeter()
	{
		return (float)4*side;
	}
	

}
