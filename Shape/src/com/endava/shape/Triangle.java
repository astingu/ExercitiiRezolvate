package com.endava.shape;

public class Triangle extends Shape
{
	private double len;
	
	void setLen(double len)
	{
		this.len = len;
	}
	
	double getLen()
	{
		return len;
	}
	
	public double computeArea()
	{
		double area = Math.sqrt(3) / 4 * len * len;
		return area;
	}
	
	public void helloWorld()
	{
		super.helloWorld();
		System.out.println("Hello world from a triangle!");
	}
}
