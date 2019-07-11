package com.cap.basic;

import java.util.*;

public class VectorEx {
	public static void main(String[] args) {
		Vector l=new Vector();
		l.addElement("samy");
		l.add(1);
		l.addElement('r');
		l.addElement("jain");
		l.add(1, "cse");
		Vector l1=new Vector(15);
		l1.addAll( l);
		System.out.println(l1.size());
		System.out.print(l1.capacity());
	  l1.firstElement();
	  l1.removeElement('r');
	  System.out.println(l);
	  System.out.println(l1);
	}

}
