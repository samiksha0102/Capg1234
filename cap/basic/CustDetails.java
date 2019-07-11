package com.cap.basic;
import java.util.*;
	 class Customer1 {
			String city;
		int bal;
		public Customer1(String name,String city,int bal) {	
	this.name=name;
	this.city=city;
	this.bal=bal;
		
	}
		String name;
		public String toString() {
			return "Customer1 [name=" + name + ", city=" + city + ", bal=" + bal + "]";
		}}
	public class CustDetails {
		public static void main(String[] args) 
		{
			HashMap<String,Customer1> t=new HashMap<String,Customer1>();
			Customer1 c1=new Customer1("samy","Mumbai",100);
					Customer1 c2=new Customer1("shalu","delhi",1000);		
							Customer1 c3=new Customer1("sagar","pune",1080);
							t.put("5646315446",c1);	
							t.put("89898915446",c2);	
							t.put("9876515446",c3);	
							
			 Scanner sc=new Scanner(System.in);
			 while(true) {
			System.out.println(" Press 1 to show details");
			System.out.println("Press 2 to recharge");
			System.out.println("Press 3 to exit");
			int i=sc.nextInt();
			
			switch(i)
			{
			case (1):
			{ System.out.println("enter mobile number");
					String num=sc.next();
					if(t.containsKey(num))
						{System.out.println(t.get(num));}
					else System.out.println("entered number is invalid");
					break;
					
			}

			case(2): 
				{
					System.out.println("enter mobile number");
			        String num=sc.next();
			        if(t.containsKey(num))
			        {
			        	System.out.println("enter recharge amount");
			        	int amount=sc.nextInt();
			        	Customer1 c=(Customer1)t.get(num);
			        	c.bal+=amount;
			        	System.out.println(t.get(num));
			        }
				else
					System.out.println(" entered number is not valid");
			}
			
			case (3):   
			{	System.exit(0);	
						break;
						}
				
			}
	}
	}
	}
