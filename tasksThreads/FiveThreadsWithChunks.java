package com.tasksThreads;

import java.util.Random;

public class FiveThreadsWithChunks implements Runnable {

	int[] chunk;
	int[] resultList = new int[20];
	int start, end;
	int contor;
	
	
	public FiveThreadsWithChunks(int[] chunk, int start, int end){
		this.chunk = chunk;
		this.start = start;
		this.end = end;
		contor = 0;
	
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

		for(int i = start; i < end; i++)
			if(isPrime(chunk[i])){
				resultList[contor++] = chunk[i];
			}
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		Random generator = new Random();
		int[] list = new int[20];
		int[] result = new int[20];
		
		for(int i = 0; i < 20; i++)
			list[i] = generator.nextInt(100);
		
		System.out.println("Lista initiala: ");
		for(int k = 0; k < 20; k++){
			System.out.print(list[k] + " ");
		}

		
		FiveThreadsWithChunks obj1 = new FiveThreadsWithChunks(list, 0, 4);
		Thread thread1 = new Thread(obj1);
		
		FiveThreadsWithChunks obj2 = new FiveThreadsWithChunks(list, 4, 8);
		Thread thread2 = new Thread(obj2);
		
		FiveThreadsWithChunks obj3 = new FiveThreadsWithChunks(list, 8, 12);
		Thread thread3 = new Thread(obj3);
		
		FiveThreadsWithChunks obj4 = new FiveThreadsWithChunks(list, 12, 16);
		Thread thread4 = new Thread(obj4);
		
		FiveThreadsWithChunks obj5 = new FiveThreadsWithChunks(list, 16, 20);
		Thread thread5 = new Thread(obj5);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		thread1.join();
	    thread2.join();
	    thread3.join();
	    thread4.join();
	    thread5.join();
	    
	    int j = 0;
	    for(int i = 0; i < obj1.contor; i++)
	    	result[j++] = obj1.resultList[i];
	    
	    for(int i = 0; i < obj2.contor; i++)
	    	result[j++] = obj2.resultList[i];
	    
	    for(int i = 0; i < obj3.contor; i++)
	    	result[j++] = obj3.resultList[i];
	    
	    for(int i = 0; i < obj4.contor; i++)
	    	result[j++] = obj4.resultList[i];
	    
	    for(int i = 0; i < obj5.contor; i++)
	    	result[j++] = obj5.resultList[i];
	    
	    
		System.out.println("\nLista finala: ");
		for(int k = 0; k < j; k++){
			System.out.print(result[k] + " ");
		}
	    
	    
	    
	}


}
