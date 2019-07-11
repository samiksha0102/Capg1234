package com.cap.basic;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(2);
	a1.add(1);
	a1.add(7);
	a1.add(3);
	a1.add(9);
	Collections.sort(a1);
	 Integer[] a= a1.toArray(new Integer[10]);
	System.out.println(a[1]);
	
	ArrayList a2=new ArrayList();
	a2.add(4);
	a2.add(4);
	a2.add("samy");
	a2.add('a');
	a2.add("abc");
	a2.addAll(a1);
	a2.remove(2);
	System.out.println(a2.lastIndexOf("abc"));
	System.out.println(a2.isEmpty());
	System.out.println(a2.contains("samy"));
	System.out.println(a2.size());
	//a2.removeAll(a1);
	//a2.clear();
	//System.out.println(a2.iterator());
	System.out.println(a2.containsAll(a1));
	a2.retainAll(a1);
	System.out.println(a1);
	System.out.println(a2);
}
}
