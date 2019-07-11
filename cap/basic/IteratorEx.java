package com.cap.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorEx {
	
		public static void main(String[] args) {
			ArrayList<String> a1=new ArrayList<String>();
			a1.add("samy");
			a1.add("shalu");
			a1.add("psk");
			a1.add("sagar");
			a1.add("sans");
			System.out.println(a1);
		Iterator it=a1.iterator() ;
		while(it.hasNext())
		{
		String name=(String)it.next();
		if(name.equals("psk"))
		{it.remove();
		}
		else {System.out.println(name);
		}
}
}
}
