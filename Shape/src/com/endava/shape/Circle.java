package com.endava.shape;

public class Circle extends Shape
{
	private double radius;
	
	void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	double getRadius()
	{
		return radius;
	}
	
	public double computeArea()
	{
		double area = Math.PI * (radius * radius);
		
		return area;
	}
	
	public void helloWorld()
	{
		super.helloWorld();
		System.out.println("Hello world from a circle!");
	}
}
