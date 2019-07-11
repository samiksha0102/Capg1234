package com.lab;

import java.util.Scanner;
public class Lab13
 {
 static boolean checkNumber(int number)
{
	if(number==0)
		return false;
	while(number!=1)
	{
		if(number%2!=0)
			return false;
		number=number/2;
	}
	return true;
	
}
public static void main(String args[])
{Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int number=sc.nextInt();
	boolean check=checkNumber(number);
	if(check)
	{
		System.out.println(number+"is power of 2");}
		else
			System.out.println(number+"is not power of 2");
	sc.close();
	}}
