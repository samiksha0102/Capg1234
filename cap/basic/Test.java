package com.cap.basic;

public class Test {
public void m1()
{
System.out.println("bhjfkhfhf");
}
public static void m2()
{
System.out.println("dggsfkhfhf");
}
public int add()
{
int a=12;
int b=41;
return a+b;
}
public int sub(int a,int b)
{
return a-b;
}
public  static void main(String args[])
{
	Test.m2();
	Test t=new Test();
	t.m1();
	int add=t.add();
	int minus=t.sub(45,32);
	System.out.println(add+""+minus);
}

}
