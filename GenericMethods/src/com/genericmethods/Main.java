package com.genericmethods;

public class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Box<Integer> integerBox = new Box<Integer>();
		
		Box<Integer> integerBox = new Box<>();
		integerBox.set(2);
		System.out.println(integerBox.get());
		
		

	}

}
