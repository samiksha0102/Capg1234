package com.lab;

import java.io.File;
import java.util.Scanner;

public class Lab84 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter file name");
	String fname=sc.nextLine();
	fname+=".txt";
	File f=new File(fname);
	
	if(f.exists())
	{
		System.out.println("File exists");
    
	if(f.canRead())
	{
		System.out.println("File is readable");
    }
	if(f.canWrite())
	{ 
		System.out.println("File is writable");
    }
	System.out.println("length of file"+f.length());
	System.out.println("Type = "+fname.substring(fname.lastIndexOf(".")));
     }
	else
	{ 
		System.out.println("File does not exist");
	}
	sc.close();
	}
}


