package com.cap.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task 
{

public static void main(String[] args)throws IOException 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter username");
	String username=sc.next();
	System.out.println("enter password");
	String password=sc.next();
	FileReader f=new FileReader("CAPGEMINI");
	BufferedReader fr=new BufferedReader(f);
	String line=fr.readLine();
	
	while(line!=null)                         //by using while loop
{
		if (line.equals(username))
		{
		line=fr.readLine();
		{
			if(line.equals(password))
				{ 
				System.out.println("LOGIN SUCCESSFULL");
				break;
				}
			else
			{ 
				System.out.println("unauthorised user");
			}
		}

		{
			System.out.println("unauthorised user");
			break;
		}
}
	
}
	sc.close();
	f.close();
	
}	
}

