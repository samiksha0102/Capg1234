package com.cap.basic;

import java.util.*;

public class LinkListEx {
	
		public static void main(String[] args) {
			LinkedList l=new LinkedList();
			l.add("samy");
			l.add(1);
			l.add('r');
			l.add("jain");
			l.add(1, "cse");
			LinkedList l1=new LinkedList();
			  l1.addAll( l);
			System.out.println(l1.size());
			System.out.println(l1.getLast());
		  l1.addFirst(6);
		 System.out.println( l1.indexOf('r'));
		  System.out.println(l);
		  System.out.println(l1);
		}

	}


