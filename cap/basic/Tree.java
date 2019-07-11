package com.cap.basic;

import java.util.*;

public class Tree {
public static void main(String[] args) {
	System.out.println("A".compareTo("Z"));
	System.out.println("K".compareTo("B"));
	System.out.println("A".compareTo("A"));
	System.out.println("A".compareTo("a"));
	System.out.println("A".compareToIgnoreCase("a"));
	System.out.println("AB".compareTo("ab"));
	TreeSet t= new TreeSet(new MyComparator());
	/*t.add(4);
	t.add(6);*/
	t.add("abc");
	t.add("ade");
	t.add("efg");
	System.out.println(t);}
}
	class MyComparator implements Comparator
	{public int compare(Object o1,Object o2) {
		/*Integer i1=(Integer)o1;
	Integer i2=(Integer)o2;*/
	String i3=o1.toString();
	String i4=o2.toString();
		/*if(i3<i4)
		return +1000;
		else if(i3>i4)
		return -1000;
		else return 0;*/
	return -i3.compareTo(i4);
}
}

