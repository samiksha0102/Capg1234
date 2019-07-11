package com.lab;

import java.util.Scanner;

public class Lab1 {
int n;	
void calculateSum(int x,int y)
{Scanner sc=new Scanner(System.in);
System.out.println("enter upto which you have to calculate the sum =");
int n=sc.nextInt();
	int s=((n/x)*(2*x+(n/x-1)*x)/2);
	int s1=((n/y)*(2*y+(n/y-1)*y)/2);
	//int s2=((n/x*y)*(2*x*y+(n/x*y-1)*x*y)/2);
	int sum=s+s1;
	System.out.println("sum="+ sum);
	sc.close();
}
public static void main(String[] args) {
	Lab1 t=new Lab1();
	t.calculateSum( 3, 5);
	
}
}