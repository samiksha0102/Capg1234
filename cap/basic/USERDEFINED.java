package com.cap.basic;

import java.util.Scanner;



class Throw extends Exception{
private String accNo;
public void Throw(String accNo)
{this.accNo=accNo;
}
public String toString()
{
	return("invalid account number");
	
}}
public class USERDEFINED {
	
  static void check(String accNo)throws Throw  
	{
	 if(accNo!=null&&accNo.length()==10)
			System.out.println("welcome");
	else
		throw new Throw();
	}


public static void main(String[] args) throws Throw {
	

Scanner sc= new Scanner(System.in);
String accNo=sc.next();
USERDEFINED.check(accNo);

sc.close();

}

}


