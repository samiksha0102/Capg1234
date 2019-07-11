package com.cap.basic;


	import java.util.*;
	public class  ListIteratorEx {
		
			public static void main(String[] args) {
				ArrayList<String> a1=new ArrayList<String>();
				a1.add("samy");
				a1.add("shalu");
				a1.add("psk");
				a1.add("sagar");
				a1.add("sans");
				System.out.println(a1);
				 ListIterator it=a1.listIterator();
			while(it.hasNext())
			{System.out.println(it.next()+" ");}
		
			while(it.hasPrevious()) {
			

			String name=(String)it.previous();
			if(name.equals("psk"))
			{it.set("Capgemini");
			
			System.out.println(it.next());
			it.previous();}
			else
			{System.out.println(name);
			
			}
			}
			}}
	
