package com.endava.shape;

public class Rectangle extends Shape
{
	private double len, wid;
	
	void setLen(double len)
	{
		this.len = len;
	}
	
	double getLen()
	{
		return len;
	}
	
	void setWid(double wid)
	{
		this.wid = wid;
	}
	
	double getWid()
	{
		return wid;
	}
	
	public double computeArea()
	{
		double area = len * wid;
		return area;
	}
	
	public void helloWorld()
	{
		super.helloWorld();
		System.out.println("Hello world from a rectangle!");
	}
}
