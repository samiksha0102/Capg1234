package com.cap.basic;

import java.util.Enumeration;
import java.util.Vector;

public class Enum1 {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add("a");
	v.add("b");
	v.add("c");
	v.add("d");
	v.add("e");
	System.out.println(v);
	Enumeration y=v.elements();
	while(y.hasMoreElements())
		System.out.println(y.nextElement());
	}
}
