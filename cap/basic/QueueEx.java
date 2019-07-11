package com.cap.basic;
import java.util.*;
public class QueueEx {
	public static void main(String args[]){  
	PriorityQueue<String> queue=new PriorityQueue<String>();  
	queue.add("Amit");  
	queue.add("Vijay");  
	queue.add("Karan");  
	queue.add("Jai");  
	queue.add("Rahul"); 
	System.out.println(queue); 
	System.out.println(queue.element());  
	System.out.println(queue.peek());  
	System.out.println("head:"+queue.poll());        //null
	System.out.println("head:"+queue.remove());      //exception
	System.out.println(queue);
	
	System.out.println("iterating the queue elements:");  
	Iterator itr=queue.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	queue.remove();  //fifo
	queue.poll();    //fifo
	System.out.println("after removing two elements:");  
	Iterator<String> itr2=queue.iterator();  
	while(itr2.hasNext()){  
	System.out.println(itr2.next());  
	}  
	}  
	}  

