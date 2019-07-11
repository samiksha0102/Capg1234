package com.second.w;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first string");
	String s=sc.nextLine();
	int count=s.split(" ").length;
	System.out.println(count);
	}	
}
