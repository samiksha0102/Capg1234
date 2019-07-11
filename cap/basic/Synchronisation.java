package com.cap.basic;
class First
{public synchronized void display(String msg)
	{
	System.out.println("["+msg);
	try {Thread.sleep(3000);}
	catch(InterruptedException e)
	{e.printStackTrace(); 	}System.out.println("]"); 	
	}
}
class Second extends Thread
{String msg; 		//welcome,new
First fobj;			//has-a
Second(String msg,First fobj){
	this.fobj=fobj;
	this.msg=msg;
	this.start();
}
public void run()
{fobj.display(msg);}
}
public class Synchronisation {
public static void main(String[] args) {
	First fnew=new First();
	Second ss=new Second("welcome",fnew);
	Second ss1=new Second("new",fnew);
	Second ss2=new Second("java programmer",fnew);
}}
	
	


