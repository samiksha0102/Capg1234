package com.Exceptions;

class Blast {
public void div(String b,String c)throws Exception {
	{
		int a=Integer.parseInt(b)/Integer.parseInt(c);
		System.out.println(a);
	}
}

public class ThrowsEx1{
	public void main(String[] args) {
		Blast o=new Blast();
	
	try {
	o.div("20", "0");
			
}
	catch(Exception be)
	{	
		System.out.println("error");
		be.printStackTrace();
	}
	}

}
 }
