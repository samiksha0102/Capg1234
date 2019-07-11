package com.lab;

import java.util.*;

public class Lab32 
{public static void main(String[] args) {
	
	{Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
			HashMap<Character,Integer> charCountMap=new HashMap<Character,Integer>();
			char[] sa=str.toCharArray();
			for (char c:sa)
			{
					if(charCountMap.containsKey(c))
					{
							charCountMap.put(c, charCountMap.get(c)+1);
					}
					else
					{
							charCountMap.put(c, 1);
					}
			}
	System.out.println(charCountMap);
	sc.close();}
	
}
}