package com.second.w;

import java.util.Scanner;

public class TasK3 {
	
		public static void main(String[] args) {	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.next();
	System.out.println("enter the sequence");
	String t=sc.next();
	{
	if (s.contains(t))
		System.out.println("valid");
	else
		System.out.println("invalid");}
	
	sc.close();
	}
}
