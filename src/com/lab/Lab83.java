package com.lab;

import java.util.Scanner;

public class Lab83 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your string");
	String str=sc.nextLine();
	str+=sc.next();
	
	int i=0,wc=1,cc=0,lc=1;
	for(i=0;i<str.length();i++)
	{
		if(str.charAt(i)==' ' )
			{wc+=1;}
			if(str.charAt(i)=='\n')
			{	lc+=1;}
			else
				cc++;}
System.out.println("number of characters :"+cc);
System.out.println("number of words :"+wc);
System.out.println("number of lines:"+lc);
sc.close();
}
}
