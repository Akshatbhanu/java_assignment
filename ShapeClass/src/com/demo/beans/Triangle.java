package com.demo.beans;

public class Triangle extends Shape{
	private int base,height,s1,s2;

	public Triangle(String c,int base, int height, int s1, int s2) {
		super(c);
		this.base = base;
		this.height = height;
		this.s1 = s1;
		this.s2 = s2;
	}

	public Triangle() {
		super();
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getS1() {
		return s1;
	}

	public void setS1(int s1) {
		this.s1 = s1;
	}

	public int getS2() {
		return s2;
	}

	public void setS2(int s2) {
		this.s2 = s2;
	}
	@Override
	public String toString() {
		Shape s=this;
		return "Triangle base : " + base + "\n height : " + height + "\n s1 : " + s1 + "\n s2 : " + s2 + "\nid : "+s.id+"\ncolor : "+s.color;
	}
	public float CalculateArea() 
	{
		return 0.5f*base*height;
	}
	public float CalculatePerimeter() 
	{
		return base+s2+s1;
	}
}
