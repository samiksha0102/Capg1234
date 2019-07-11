package com.Exceptions;


import java.util.Scanner;
class MyException3 extends Exception2{
private String userName;
private String paswd;
public MyException3(String userName,String passwd)
{this.userName=userName;
this.paswd=passwd;
}
public String toString()
{
	return("invalid user");
	
}
public class Throw{
	void check(String userName,String passwd)throws MyException3
	{if(userName.equals("capg")&&paswd.equals("capgemini"))
			System.out.println("welcome");
	else
		throw  new MyException3(userName,paswd);
	}
}

public static void main(String[] args) {
	

Scanner sc= new Scanner(System.in);
System.out.println("enter username");
 String userName=sc.next();
System.out.println("enter password");
String paswd=sc.next();

}	
}
