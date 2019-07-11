package com.lab;

import java.util.Scanner;
public class Operators {
	void check()
{int num,dig = 0,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
num=sc.nextInt();
sc.close();
while(num>0)
{dig=num%10;

sum+=(dig*dig*dig);

num=num/10;}
System.out.println(sum);
}
public static void main(String[] args) {
	Operators o=new Operators();
	o.check();
}}


