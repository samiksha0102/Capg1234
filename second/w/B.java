package com.second.w;
import com.first.W.*;
   class C{
 public void m1()
 {System.out.println("abc");}}
   public class B extends A
   {public void m2()
   {System.out.println("cfg");}
   public static void main(String args[])
   {B b=new B();   
   b.m2();
	b.S();
}
}