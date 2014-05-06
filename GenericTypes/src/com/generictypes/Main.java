package com.generictypes;

public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
		OrderedPair<String, String> p2 = new OrderedPair<>("hello", "world");
		
		System.out.println(p2.getKey() + " " + p2.getValue());
		
	}

}
