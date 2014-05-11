package com.tasksThreads;

import java.util.Random;

public class OneThread  implements Runnable {
	
		
		int[] list;
		int[] resultList;
		
		public OneThread(){
			Random generator = new Random();
			int dim = generator.nextInt(20);
			list = new int[dim];
			
			for(int i = 0; i < dim; i++)
				list[i] = generator.nextInt(100);
			
			System.out.println("Lista initiala: ");
			for(int k = 0; k < dim; k++){
				System.out.print(list[k] + " ");
			}
			
			resultList = new int[dim];
		}
		
		/* verify if a number is prime */
		public boolean isPrime(int number){
			
			int j = 2;
			boolean result = true;
			
			while (j <= number / 2)
			{
				if (number % j == 0)
				{
					result = false;
				}
				j++;
			}
			
			return result;
		}
		
		@Override
		public void run() {
			int j = 0;
			for(int i = 0; i < list.length; i++)
				if(isPrime(list[i])){
					resultList[j++] = list[i];
				}
			
			System.out.println("\nLista cu numere prime este: ");
			for(int k = 0; k < j; k++){
				System.out.print(resultList[k] + " ");
			}
					
			
		}

		public static void main(String[] args) {
			OneThread test = new OneThread();
			Thread thread = new Thread(test);
			
			thread.start();
			
		}

}
