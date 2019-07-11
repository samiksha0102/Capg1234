package com.cap.basic;

class Past
{
		static void add() 
		{
			System.out.println("default method");

		}
		static void add(int a,int b) 
		{
			System.out.println((a+b));

		}
}
public class Overriding extends Past{
		static void add(int a,int b)
			{
				System.out.println((a*b));// same method of parent class but different implementation 
			}
		public static void main(String args[])
			{
				add();
				add(11,24);//it will give the output of overrided method
				
			}


}
