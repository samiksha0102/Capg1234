package com.lab;

import java.util.Scanner;

public class Lab55 {
static boolean isValid(int num)
{
if(num<=1)
	return false;
else
{
	for(int i=2;i<=num;i++)
	{
		if(num%2==0)
	return false;
	}
}
return true;
}

static void checkPrime(int n)
{
	int i=0;
	for(i=2;i<=n;i++)
{if(isValid(i))
	{	
		System.out.println(i+" ");
	}
 
 }
}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	
	 boolean result=checkPrime(5);
	 System.out.println(result);
}
}
