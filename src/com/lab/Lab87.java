package com.lab;

import java.util.Scanner;

public class Lab87 {
public static void main(String[] args) {
	boolean valid=false;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");
	String name=sc.nextLine();
	name+="_job";
	
	int i=name.indexOf("_");
	String s=name.substring(0,i);
	System.out.println(s);
	valid=check(s);

if(valid==true)
{System.out.println("name is valid");

}
else
{System.out.println("not valid");
}
sc.close();
return;}

private static boolean check(String name) {
	boolean result=false;
	
	if(name.length()<8)
		result=false;
	else
		result=true;
	return result;
}
}
