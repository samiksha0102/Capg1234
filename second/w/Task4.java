package com.second.w;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first string");
	String s=sc.nextLine();
	
	System.out.println("enter second string");
	String t=sc.next();
	{
	if (s.endsWith(t))
		System.out.println("yes");
	else
		System.out.println("no");
}
}
}
