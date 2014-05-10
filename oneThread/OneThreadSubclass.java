package com.oneThread;

public class OneThreadSubclass extends Thread {
		public void run(){
			System.out.println("Hello World from a subclass of Thread class!");
		}
		
		public static void main(String[] args){
			
			OneThreadSubclass thread = new OneThreadSubclass();
			
			thread.start();
			
		}
}
