package com.serializableTest;

public class SubClasa extends SuperClasa {
	
	public static void main(String[] args){
	
		SubClasa child = new SubClasa();
		
		if(child instanceof SuperClasa){
			System.out.println("DA");
		}else
		{
			System.out.println("NU");
		}
	}
	
	
}
