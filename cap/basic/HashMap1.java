package com.cap.basic;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class HashMap1 {
public static void main(String[] args) {
	HashMap h=new HashMap();
	h.put("samy", 123);
	h.put("sj", 267);
	h.put("samiksha", 123);
	h.put("samy", 283);
	System.out.println(h.get("sj"));
	System.out.println(h);
	
	LinkedHashMap h1=new LinkedHashMap();
	h1.put("samy", 123);
	h1.put("sj", 267);
	h1.put("samiksha", 123);
	h1.put("samy", 283);
	System.out.println(h1.get("sj"));
	System.out.println(h1);
	
	
	TreeMap h2=new TreeMap();
	h2.put("samy", 123);
	h2.put("sj", 267);
	h2.put("tsk", 123);
	h2.put("samy", 283);
	System.out.println(h2.get("sj"));
	System.out.println(h2.lowerKey("sj"));
	System.out.println(h2.higherKey("sj"));
	System.out.println(h2);
}
class MyComp implements Comparator{
	public int compare(Object obj1,Object obj2)
	{String s1=obj1.toString();
	String s2=obj2.toString();
	return s2.compareTo(s1);	}
}
}
