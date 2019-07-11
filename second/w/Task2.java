package com.second.w;
public class Task2 {
public static void main(String[] args) {	
String s="java standard edition";
	String a[]=s.split(" ");
	for(String t:a)
	{
		String first=t.substring(0,1);
	String second=t.substring(1);
	System.out.println(first.toUpperCase()+second.toLowerCase()+"");
	}
}
}