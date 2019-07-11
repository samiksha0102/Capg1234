package com.cap.basic;

public class Lab {
	public static void main(String[] args) {
		String w= new  String("y");

		String r= new  String("Y");

		System.out.println(w.compareTo(r));
		System.out.println(w.equals(r));
	
	 System.out.println(w.compareToIgnoreCase(r));
	 System.out.println(r.toLowerCase());
	System.out.println(w.toUpperCase());
	//System.out.println(w.charAt(2));
	System.out.println(w.concat(r));
	System.out.println(w.split(r));
	}


}
