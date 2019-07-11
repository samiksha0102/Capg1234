package com.lab;

import java.util.Scanner;

public class Lab11 {
void calculateDifference()
{
int i,a=0,b=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter first natural number");
int n=sc.nextInt();
for(i=1;i<=n;i++)
	{
	b+=i;
	 a+=i*i;
	} int sum=(a-(b*b));
	sc.close();
System.out.println("sum= "+sum);

}
public static void main(String[] args) {
	Lab11 t=new Lab11();
	t.calculateDifference();
}
}
