package com.demo.beans;

public abstract class Shape 
{

	static int cnt;
	protected String color;
	protected int id;
	static {
		cnt=0;
	}
	public Shape(String color) {
		super();
		this.color = color;
		this.id=cnt++;
	}
	public Shape() {
		super();
		this.id=cnt++;
		
	}
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		Shape.cnt = cnt;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Shape color=" + color + ", id=" + id + "";
	}
	
	 public abstract float CalculateArea();
	
	 public abstract float CalculatePerimeter();
	
	
}
