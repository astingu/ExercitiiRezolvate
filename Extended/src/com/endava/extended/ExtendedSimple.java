package com.endava.extended;

public class ExtendedSimple extends Simple
{
	public ExtendedSimple()
	{
		super();
		System.out.println("Hello world from a 0-arc constructor");
	}
	
	public ExtendedSimple(int a)
	{
		System.out.println("Hello world from a 1-arc constructor");
	}
	
	public ExtendedSimple(int a, int b)
	{
		System.out.println("Hello world from a 2-arc constructor");
	}
	
	
	
}
