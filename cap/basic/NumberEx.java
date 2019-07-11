package com.cap.basic;

 class Number 
 {
public int n;
boolean value=false;
synchronized void even(int n)
{
	if(!value)

{
	try {wait();
}
catch(InterruptedException e)
{
	e.printStackTrace();
}
	}
this.n=n;
System.out.println(n);
value=false;
notify();
}
synchronized void odd(int n)
{
	if(value)
{
		try {wait();
}
catch(InterruptedException e)
{
	e.printStackTrace();
}
		}
this.n=n;
System.out.println(n);
value=false;
notify();
}

 }
class Odd implements Runnable
{
	Number num;

Odd(Number num)
{this.num=num;
Thread t=new Thread(this,"odd");
t.start();
}
public void run()
{for(int i=1;i<100;i=i+2)

num.odd(i);
}
}

 
 class Even implements Runnable
{
	Number num;
Even(Number num)
{
	this.num=num;
Thread t1=new Thread(this,"even");
t1.start();
}
public void run()
{for(int i=2;i<100;i=i+2)

num.even(i);
}

}


 public class NumberEx
{
	public static void main(String[] args) 
	{
	Number num=new Number();
	Even e=new Even(num);
	Odd d=new Odd(num);
	}
	}

	

