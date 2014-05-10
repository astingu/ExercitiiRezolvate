package com.oneThread;

public class OneThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello world from runnable interface implemented!");
	}
	
	public static void main(String[] args){
		Thread oneThread = new Thread(new OneThread());
		
		oneThread.start();
	}
	

}
