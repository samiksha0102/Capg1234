package com.cap.basic;
import java.util.*;
public class StackEx {
	public static void main(String[] args) {
Stack s=new Stack();
	s.push(2);
	s.push("s");
	s.push('r');
	s.push(23);
	System.out.println(s);
	s.pop();
	System.out.println(s);
	System.out.println(s.search('r'));
	//System.out.println(s.toArray());
	System.out.println(s.size());
	System.out.println(s);
	System.out.println(s.remove(0));
	System.out.println(s);
	System.out.println(s.capacity());
	//System.out.println(s.ensureCapacity(5));
	System.out.println(s.toString());
	
	
	
	
	
	
	
	}
}
