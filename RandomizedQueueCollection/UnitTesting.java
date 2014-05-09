package collection.randomizedqueue;

import java.util.Iterator;

public class UnitTesting {

	public static void main(String[] args) {
		RandomizedQueue<Integer> randomizedQueue = new RandomizedQueue<Integer>();
		
		int i = 0;
		while(i < 10)
			randomizedQueue.enqueue(i++);
		/*
		Integer del = randomizedQueue.dequeue();
		System.out.println(del);
		System.out.println(randomizedQueue.size());
		
		Integer sample = randomizedQueue.sample();
		System.out.println(sample);
		System.out.println(randomizedQueue.size());
		*/
		
		Iterator<Integer> itr = randomizedQueue.iterator();
		
		while(itr.hasNext()){
			Integer value = itr.next();
			System.out.println(value);
		}
		
		


	}

}
