package com.lab;

public class Lab51{
	  static void check(String firstName,String lastName)throws MyException2
		{if(firstName.isEmpty()||lastName.isEmpty())
			throw new MyException2(firstName,lastName);
				
		else
		{
			System.out.println("welcome"+firstName+""+lastName);
			
		}
		}

	
	public static void main(String[] args) throws MyException2 {
	String firstName="";
	String lastName="";
	check(firstName,lastName);

	}
	}

	class MyException2 extends Exception{
	
	String firstName;
	String lastName;
	public MyException2(String firstName,String lastName)
	{this.firstName=firstName;
	this.lastName=lastName;
	}
	public String toString()
	{
		return("invalid user");
		
	}
	}
	