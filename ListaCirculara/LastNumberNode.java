package ListaCirculara;

import java.io.Serializable;

public class LastNumberNode implements Serializable{
	private class Node implements Serializable{
		String value;
		Node next;
		
		Node(String value, Node next){
			this.value = value;
			this.next = next;
		}
	}
	
	private Node first, last;
	
	public LastNumberNode(){
		first = null;
		last = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public int size(){
		int count = 1;
		Node p = first.next;
		
		while(p != first){
			count++;
			p = p.next;
		}
		
		return count;
	}
	
	public void add(String e){
	
		if(first == null){
			Node p = new Node(e, null);
			first = p;
			last = p;
		}
		else{
			Node p = new Node(e, first);
			last.next = p;
			last = p;
		}
	}
	
	public void print(){
		Node ref = first;
		for(int i = 0; i < size(); i++){
			System.out.println(ref.value + " ");
			ref = ref.next;
		}		
		
	}

}
