package com.cap.basic;

 class Parent {
	static int a=10;
	public Parent()
	{System.out.println("default constructor");}
	public Parent(int a)
	{System.out.println("paramet"+a);}
	public void a1()

	{System.out.println();}
}
 class Child extends Parent
{static int a=20;
 public Child()
{
	 super();
	 this.a1();
	 System.out.println(this.a);
	 System.out.println(super.a);
	 System.out.println(this);
	 
	 System.out.println("def");}
 


}
 
 
