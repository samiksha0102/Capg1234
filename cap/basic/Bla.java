package com.cap.basic;

import java.util.Scanner;
public class Bla {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name");
	String eName=sc.next();
	System.out.println("enter your salary");
	int eSal=sc.nextInt();
	System.out.println("enter your id");
	int empId=sc.nextInt();
	System.out.println(eName+" "+eSal+" "+empId);
	sc.close();
	
}
}
