package com.second.w;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {	
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s=sc.next();
System.out.println("enter the index");
int index=sc.nextInt();
System.out.println(s.charAt(index));
sc.close();
}
}
