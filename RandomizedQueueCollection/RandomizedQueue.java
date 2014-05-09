package collection.randomizedqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomizedQueue<Item>{
	
	List<Item> randQueue;
	
	public RandomizedQueue(){
		//construct an empty randomizedQueue
		randQueue = new ArrayList<>();
	}
	
	 public boolean isEmpty(){
		 if (randQueue.isEmpty())
			 return true;
		 else
			 return false;
		 
	 }
	 
	 public int size(){
		 int len = randQueue.size();
		 
		 return len;
	 }
	 
	 public void enqueue(Item item){
		 try{		
			 if(item != null)
				 randQueue.add(item);
		 }catch(NullPointerException e){
			 System.out.println("Null Pointer Exception!");
		 };
	 }
	 
	 public Item dequeue(){
		 try{
			 if(!this.isEmpty()){
				 Random generator = new Random();
				 int index = generator.nextInt(this.size());
				 randQueue.remove(index);
				 return randQueue.get(index);
				
			 } 
		 }catch(NoSuchElementException e){
			 System.out.println("No Such Element Exception!");
		 }
		 
		 return null;
		 
	 }
	 
	 public Item sample(){
		 try{
			 if(!this.isEmpty()){
				 Random generator = new Random();
				 int index = generator.nextInt(this.size());
				 return randQueue.get(index);
				
			 } 
		 }catch(NoSuchElementException e){
			 System.out.println("No Such Element Exception!");
		 }
		 
		 return null;
	 }
	 
	 public Iterator<Item> iterator(){
		 return new IteratorClass();
	 }

	 
	 private class IteratorClass<Item> implements Iterator<Item>{
		 int count = 0;

		 public IteratorClass()
		 {
			 Collections.shuffle(randQueue);
		 }
		 
		 @Override
		 public boolean hasNext(){
			 while(count - randQueue.size() < 0 )
				 return true;
			 
			 return false;
		 }

		@Override
		public Item next() {
			try{
				if((count < randQueue.size()))	
					return  (Item) randQueue.get(count++);
		}catch(IndexOutOfBoundsException e){
			 System.out.println("Index Out Of Bounds Exception!");
		}
			
			return null;
			
			
		}

		@Override
		public void remove() {
			randQueue.remove(count);
		}
		 
	 }
	
}
