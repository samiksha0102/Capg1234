package com.lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Lab85 {
		public static void main(String[] args) {
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter your string");
					String str=sc.next();
					char[] ch=str.toCharArray();
					char[]ch1=ch;
					
					 Arrays.sort(ch);
					 
					 
	                IsOrder( ch,ch1);
					
		}	
	static boolean IsOrder( char[] ch2,char[] ch1)	
	{
					int n= ch1.length;
					char[] ch =ch1;
					for(int i=0;i<n;i++)
					
					{if(ch1[i]<ch[i])
						System.out.println("alphabetical order");
					else
						System.out.println("not");
					}
					return true;}
}
					