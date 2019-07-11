package com.lab;

import java.util.*;
import java.util.Map.Entry;

public class Lab91 {

			public static void main(String[] args) {
				
				HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
				h1.put(1, 20);
				h1.put(4, 40);
				h1.put(5, 85);
				h1.put(3, 60);
			ArrayList l1=new ArrayList();
			l1=(ArrayList)getValues(h1);
				System.out.println(l1);
			}

			 static List getValues(HashMap h1) {
				ArrayList l=new ArrayList();
				
				Set s=h1.entrySet();
				Iterator it=s.iterator();
				while(it.hasNext())
				{Entry e=(Entry)it.next();
				l.add(e.getValue());
				}
			Collections.sort(l);
				return l;
				
			}
}
