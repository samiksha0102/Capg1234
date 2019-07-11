package com.cap.basic;
class Account
{
	public int bal;
	public Account()
	{
		bal=3000;
	}
public synchronized  void withdraw(int amt) {
		try {Thread.sleep(3000);}
		catch(InterruptedException e)
		{e.printStackTrace(); 	}
		bal=bal-amt;
		System.out.println("amount withdrawn= "+amt);
		System.out.println("remaining balance= "+bal);
	}
	public synchronized  void deposit(int amt)
	{
		
		try {Thread.sleep(3000);}
		catch(InterruptedException e)
		{e.printStackTrace(); 	}
		bal=bal+amt;
		System.out.println("amount deposited ="+amt);
		System.out.println("new bal ="+bal);
	}
	public synchronized  void enquiry(){
	{try {Thread.sleep(3000);}
	catch(InterruptedException e)
	{e.printStackTrace(); 	}
	System.out.println("available balance= "+ bal);}
	
	}}
	class Transaction implements Runnable{
		Account obj;
		Transaction(Account a) {
			obj=a;		}
	public void run()
	{obj.deposit(900);
	obj.withdraw(400);
	obj.enquiry();
}
	}
public class SyncEX {
	public static void main(String[] args) throws Exception {
	Account a=new Account();
	Transaction w1=new Transaction(a);
	Thread t1=new Thread(w1);
	Thread t2=new Thread(w1);
	t1.start();
	t1.join();
	t2.start();
	t2.join();
	
	}
}

	

