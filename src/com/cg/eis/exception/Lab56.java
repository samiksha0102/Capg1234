package com.cg.eis.exception;

 class EmployeeException extends Exception {
	double empSal;
	public EmployeeException (double empSal)
	{
		this.empSal=empSal;
	}
	public String toString()
	{ return "LOW SALARY";}
	}

public class Lab56 {

		  static void check( double empSal)throws EmployeeException 
			{if(empSal<3000)
				throw new EmployeeException(empSal);
					
			else
			
				System.out.println("SALARY IS GOOD");
				
			}
			
	
	
		public static void main(String[] args) throws EmployeeException
		{
			Lab56.check(2000);
			/*System.out.println("bbbbb");*/
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
