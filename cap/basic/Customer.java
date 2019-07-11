package com.cap.basic;

import java.util.HashMap;
import java.util.Scanner;

public class Customer {
	String name;
	String city;
	int bal;
	public Customer(String name,String city,int bal) {	
this.name=name;
this.city=city;
this.bal=bal;
	
}}
class Details{
	public static void accDetails()
	{
		HashMap<String,Customer> t=new HashMap<String,Customer>();
		Customer c1=new Customer("samy","Mumbai",100);
				Customer c2=new Customer("shalu","delhi",1000);		
						Customer c3=new Customer("sagar","pune",1080);
						t.put("5646315446",c1);	
						t.put("89898915446",c2);	
						t.put("9876515446",c3);	
		}			

	public static void main(String[] args) {
		System.out.println("enter mobile number");
      Scanner sc=new Scanner(System.in);
		String mobile=sc.next();
		
	
		System.out.println(" Press 1 to show details");
		System.out.println("Press 2 to recharge");
		System.out.println("Press 3 to exit");
		
	}
}