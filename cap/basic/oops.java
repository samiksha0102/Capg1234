package com.cap.basic;

class poops {
	public void m1()
	{
	System.out.println("bhjfkhfhf");
	}
	public static void m2()
	{
	System.out.println("dggsfkhfhf");
	}
}
	 class soops extends poops
	{
	public void add()
	{
	int a=12;
	int b=41;
	 System.out.println((a+b));
	}
	}
	public class oops extends poops
	{
	public void sub(int a,int b)
	{
	 System.out.println((a-b));
	}
	
	public  static void main(String args[])
	{
		m2();
		oops t=new oops();
		soops f=new soops();
		t.m1();
		f.add();
		t.sub(65, 54);
		
	}
	}
