package com.Exceptions;

public class Except1 {
public static void main(String[] args) {
	try {
		int a=6/3;
			try {
				
				int b=67/0;
			}
			catch(ArithmeticException e){
			System.out.println(e);
			}
			try {
				int t[]=new int[7];
				t[8]=9;
			}
			catch(ArrayIndexOutOfBoundsException ae)
			{	System.out.println(ae);

			
				
			}
			finally {
				System.out.println("always executes");
			}
			System.out.println("bla bla bla");
	}
	catch(Exception e)
	{System.out.println("handled");
	}
}

	}
	

