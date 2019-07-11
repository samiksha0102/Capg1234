package com.lab;

import java.util.Scanner;

public class Lab12 {
	 boolean flag=false;
	 int number;
boolean checkNumber()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	 number=sc.nextInt();
	 int dig=number%10;
	 number=number/10;
	 while(number>0)
	 
	 {if(dig<=number%10)
		 flag=true;
	 break;}
     
if(flag)
	 System.out.println("digits not in increasing order");
	 else
		 System.out.println("digits are in increasing order");
			
	sc.close();
	return flag;	
}
public static void main(String[] args) {
	Lab12 t=new Lab12();
	t.checkNumber();
}

}
