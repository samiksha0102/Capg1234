package com.lab;

import java.util.*;
public class Lab92 {
	static HashMap charCount(String str) {
		HashMap<Character,Integer> t=new HashMap<Character,Integer>();
		char[] sa=str.toCharArray();
		for (char c:sa)
		{
				
				if(t.containsKey(c))
				{
						t.put(c, t.get(c)+1);
				}
				else
				{
						t.put(c, 1);
				}
		}
		return t;
		
	}
				
	public static void main(String[] args) {
		
		{Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
				//HashMap<Character,Integer> t=new HashMap<Character,Integer>();
				
				
		HashMap<Character,Integer> y=charCount(str);
		System.out.println(y);
		sc.close();}
		
	}
	}

