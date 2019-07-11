package com.lab;

import java.util.Scanner;
public class Lab3 {
	static int getSecondSmallest(int a[])
{
for(int i=0;i<a.length;i++)
{for(int j=i+1;j<a.length;j++)
{
	if(a[i]>a[j])
	{ int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
 }

}		
return a[1];
}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter elements");
	for(int i=0;i<a.length;i++)
		a[i]=sc.nextInt();
	int num=getSecondSmallest(a);
	System.out.println("second smallest element :"+ num);
	sc.close();
}}

