package com.endava.breakLabel;

public class breakLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b= true;
		first:{
			second:{
				third:{
					System.out.println("Inside the third block");
					if(b)
					{
						break second;
					}
				}
				System.out.println("Inside the second block");
			}
			System.out.println("Inside the first block");
		}

	}

}
