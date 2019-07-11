package com.lab;

import java.util.Scanner;

public class Lab54 {
 public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	

System.out.println("Enter your choice");
String choice=sc.next();
 {
	 switch(choice)
	 {
	 case "red":
	 { System.out.println("stop");
		 break;
	 }
	 case "yellow":
	 {
		 System.out.println("ready");
		 break;
	 }
	 case "green":
	 {System.out.println("go");
	 break;
	 
	 }
	 
	 default:
	 {System.out.println("wrong");
	 break;
	 }
	  }
}

 }}	
