package com.lab;
class AgeException extends Exception {
		int age;
		public AgeException  ()
		{
			this.age=age;
		}
		public String toString()
		{ return "invalid age";}
		}

	public class Lab52 {

			  static void check( int age)throws AgeException 
				{if(age<15)
					throw new AgeException ();
						
				else
				
					System.out.println("age is valid");
					
				}
				
		
		
			public static void main(String[] args) throws AgeException 
			{
				Lab52.check(10);
				/*System.out.println("bbbbb");*/
			}


}
