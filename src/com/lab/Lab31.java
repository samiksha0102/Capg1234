package com.lab;

import java.util.Arrays;
import java.util.Scanner;

public class Lab31 {
	
static int[] getSorted(int arr[])
{int a[]=new int[arr.length];
int j=(a.length)-1;
for(int i=0;i<a.length;i++)
	{a[j]=arr[i];
	j--;
	
	}
return a;
	}
 public static void main(String[] args) {
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	   System.out.println("enter elements");
		
		for( int i=0;i<n;i++)
		{	 arr[i]=sc.nextInt();}
	
	int a[]=getSorted(arr);
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	sc.close();
}}
