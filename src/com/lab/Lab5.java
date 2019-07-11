package com.lab;

import java.util.Scanner;

public class Lab5 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int n1=1,n2=1,sum=0;
	while(num>0)
	{System.out.println(n1+" "+n2+" ");
	sum=n1+n2;
	n1=n2;
	n2=sum;
	}
sc.close();		
}
}
