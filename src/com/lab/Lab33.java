package com.lab;

import java.util.Arrays;
import java.util.Scanner;

public class Lab33 {
static String[] getSort(String s[])
{
int l=s.length;
int mid=l/2;
if(l%2!=0)
{
	for(int i=0;i<(mid)+1;i++)
	{s[i]=s[i].toUpperCase();
	}
for(int i=mid;i<(l)+1;i++)
	{s[i]=s[i].toLowerCase();
	}
}
else
	{for(int i=0;i<mid;i++)
		{s[i]=s[i].toUpperCase();
		}
for(int i=mid;i<l;i++)
	{s[i]=s[i].toLowerCase();
	}
}

return s;
}

public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the size");
	  int n=sc.nextInt();
	  String s[]=new String[n];
	 System.out.println("enter string");
		
	for(int i=0;i<n;i++)
	{s[i]=sc.next();
	}
	String array[]=getSort(s);
System.out.println(Arrays.toString(array));
sc.close();}
}

