package com.ThreadsWithoutChunks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Threads implements Runnable{
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> resultList = new ArrayList<Integer>();
 
		static int index = 0;
		
		public Threads(List<Integer> list, List<Integer> resultList){
			
			this.list = list;
			this.resultList = resultList;
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
			
			Integer aux = null;
			while(true){
				synchronized(list){
					if(index == list.size())
						break;
					else{
						aux = list.get(index);
						index++;
					}	
			    }
				
				if(isPrime(aux)) {
				
					synchronized(resultList){
						resultList.add(aux);
				    }
					
					}	
		    }	
		}
		
	
		public static void main(String[] args) {
			
			Random generator = new Random();


			List<Integer> list = new ArrayList<Integer>();
			List<Integer> resultList = new ArrayList<Integer>();
			
			for(int i = 0; i < 20; i++)
				list.add(generator.nextInt(100));

			System.out.println("Lista initiala: ");
			for(int k = 0; k < list.size(); k++){
				System.out.print(list.get(k) + " ");
			}


			Threads obj1 = new Threads(list, resultList);
			Thread thread1 = new Thread(obj1);

			Threads obj2 = new Threads(list, resultList);
			Thread thread2 = new Thread(obj2);

			Threads obj3 = new Threads(list, resultList);
			Thread thread3 = new Thread(obj3);

			Threads obj4 = new Threads(list, resultList);
			Thread thread4 = new Thread(obj4);

			Threads obj5 =new Threads(list, resultList);
			Thread thread5 = new Thread(obj5);

			thread1.start();
			thread2.start();
			thread3.start();
			thread4.start();
			thread5.start();
			
			try {
				thread1.join();
				thread2.join();
				thread3.join();
				thread4.join();
				thread5.join();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("\nLista finala: ");
			for(int k = 0; k < resultList.size(); k++){
				System.out.print(resultList.get(k) + " ");
			}

	

		}

		

}
