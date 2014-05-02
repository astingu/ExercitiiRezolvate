package com.endava.shape;

public class ShapeTest 
{
	
	public double computeShapeArea(Shape a)
	{
		return a.computeArea();
	}
	
	
	public static void main(String[] args) 
	{
		Shape rec = new Rectangle();
		((Rectangle)rec).setLen(2);
		((Rectangle)rec).setWid(3);
		ShapeTest obj = new ShapeTest();
		Shape circ = new Circle();
		((Circle)circ).setRadius(3);
		Shape trian = new Triangle();
		((Triangle) trian).setLen(4);
		
		System.out.println(obj.computeShapeArea(rec));
		((Rectangle)rec).helloWorld();
		System.out.println(obj.computeShapeArea(circ));
		((Circle)circ).helloWorld();
		System.out.println(obj.computeShapeArea(trian));
		((Triangle) trian).helloWorld();
	}

}
