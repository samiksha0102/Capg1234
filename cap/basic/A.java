package com.cap.basic;

 interface C {
void add();
}
interface B{
	void add();
}
public class A implements C,B
{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=4,b =5,c;
		c=a+b;
		System.out.println(c);
	}
	public static void main(String args[])
	{A w=new A();
	w.add();
	}
	
	
	}
