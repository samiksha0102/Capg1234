package banksystem_collection;

import java.util.HashMap;
import java.util.Scanner;



class AccountDetails1  {
	 private String name;
	 private String city;
	 private double bal;
	 private String phNo;
	 private String dob;
	
	 
	 public AccountDetails1(String string, String string2, double d, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	 
	 public String toString() {
			return "AccountDetails [name=" + name + ", city=" + city + ", bal=" + bal + ", phNo=" + phNo + ", dob=" + dob
					+ ",  getName()=" + getName() + ", getCity()=" + getCity() + ", getBal()=" + getBal()
					+ ", getPhNo()=" + getPhNo() + ", getDob()=" + getDob() + ", , getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
	 
}

	
	


public class BankingSystem {
	
	
public static void main(String[] args) {
		BankingSystem bs=new BankingSystem();
		
		
HashMap<String,AccountDetails1> t=new HashMap<String,AccountDetails1>();
	
	
		
		AccountDetails1  a1=new AccountDetails1("SAMIKSHA","MUMBAI",3450.00,"9406684724","01-02-1997" );
		AccountDetails1  a2=new AccountDetails1("SHALINI","DELHI",1000.00,"8717804949","20-07-1997");		
		AccountDetails1  a3=new AccountDetails1("SAGAR","PUNE",4080.00,"9770082906","07-07-1996");
		AccountDetails1 a4=new AccountDetails1("VARSHA","MYSORE",6754.34,"9770009878","02-01-1996");
		AccountDetails1  a5=new AccountDetails1("RUCHI","BANGLORE",3785.50,"6267582906","05-03-1997");
						t.put("5646315446",a1);	
						t.put("5646315448",a2);	
						t.put("5646315502",a3);	
						t.put("5646315504",a4);	
						t.put("5646315442",a5);	
		
		
		
		
		
		
					
		int i;
		String choice;
		
		do
		{
		
			System.out.println();
			System.out.println("    ********ENTER YOUR CHOICE********   ");
			System.out.println("PRESS 1 : TO CREATE ACCOUNT");
			System.out.println("PRESS 2  : TO DEPOSIT");
			System.out.println("PRESS 3  : TO WITHDRAW");
			System.out.println("PRESS 4  : TO SHOW BALANCE");
			System.out.println("PRESS 5  : FUND TRANSFER");
			System.out.println("PRESS 6  : PRINT TRANSACTION");
			System.out.println("PRESS 7  : EXIT");
	
			Scanner sc=new Scanner(System.in);
			i=sc.nextInt();
			
			switch(i)
			{
			case 1:
				
				bs.createAccount(t);
				break;
				
				
			case 2:
				bs.showBalance(t);
				break;
				
			case 3:
				bs.deposit(t);
				break;
				
			case 4:
				bs.withdraw(t);
				break;
				
			case 5: 
				bs.fundTransfer(t);
				break;
				
			case 6:
				bs.printTransaction(t);
				break;
				
			case 7:
				bs.exit();
			}	
				
			System.out.println("DO YOU WANT TO CONTINUE (Y OR N) ");
			choice=sc.next();
		}
		while(choice.equalsIgnoreCase("y"));
	}
	
	
	private void createAccount(HashMap t) {
		
		
		
		Object accNo;
		AccountDetails1 a = (AccountDetails1) t.get(accNo);
		Scanner sc=new Scanner(System.in);
		System.out.println(" WELCOME TO XYZ BANK ");
		System.out.println(" ENTER YOUR NAME ");
		String name=sc.next();
		a.setName(name);
		
		System.out.println(" ENTER YOUR DOB ");
		String dob=sc.next();
		a.setDob(dob);
		
		System.out.println(" ENTER YOUR NAME ");
		String phNo=sc.next();
		a.setPhNo(phNo);
		
		System.out.println(" ENTER YOUR CITY ");
		String city=sc.next();
		a.setCity(city);
		
		//a.set(accNo);
		System.out.println("ENTER BALANCE");
		double bal=sc.nextDouble();
		a.setBal(bal);
		
		if(t.containsKey(accNo))
		{System.out.println("ALREADY EXIST");
		}
		else
		{System.out.println("ACCOUNT CREATED");
		
		t.put(a,accNo);
		System.out.println(t);
		}
	}	
		
		
		
	
	private void showBalance(HashMap t) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ACCOUNT NUMBER = ");
		String accNo=sc.next();
        String num=sc.next();
        if(t.containsKey(accNo))
        { System.out.println();  }
	}
	private void deposit(HashMap t) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ACCOUNT NUMBER = ");
		int accNo=sc.nextInt();
        String num=sc.next();
        if(t.containsKey(accNo))
        {   
        	AccountDetails1 a=(AccountDetails1) t.get(accNo);
        	double bal=a.getBal();
        	
        	
        	double amt=sc.nextDouble();
			System.out.println(amt);
        	System.out.println("ENTER AMOUNT TO DEPOSIT = ");
        	
        	
        	System.out.println("AMOUNT TO DEPOSIT IS = "+amt);
    	
       
        System.out.println("AVAILABLE BALANCE IS = "+(bal+amt));}
        else {
        	System.out.println(" ENTERED NUMBER IS NOT PRESENT ");}
		
	}
	private void withdraw(HashMap t) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ACCOUNT NUMBER = ");
		int accNo=sc.nextInt();
        String num=sc.next();
        if(t.containsKey(accNo))
        {   
        	AccountDetails1 a=(AccountDetails1) t.get(accNo);
        	double bal=a.getBal();
        	
        	System.out.println("ENTER AMOUNT TO DEPOSIT = ");
        	double amt=sc.nextDouble();
        	//withdraw();
        	System.out.println("AMOUNT WITHDRAWN IS = "+amt);
    	
       
        System.out.println("REMAINING BALANCE IS = "+(bal-amt));}
        else {
        	System.out.println(" ENTERED NUMBER IS NOT PRESENT ");}
		
		
	}
	private void fundTransfer(HashMap t) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ACCOUNT NUMBER = ");
		int accNo=sc.nextInt();
        String num=sc.next();
        AccountDetails1 a=(AccountDetails1) t.get(accNo);
        if(t.containsKey(accNo))
        {   
        	
        System.out.println("ENTER ACCOUNT NUMBER TO TRANSFER ");
        
        	Object accNo1 = null;
			AccountDetails1 ad1= (AccountDetails1)t.get(accNo1);
        	if(t.containsKey(accNo1))
        	{System.out.println("ENTER AMOUNT");
        	double amt=sc.nextDouble();
        	double bal1=a.getBal()-amt;;
        	a.setBal(bal1);
        	t.put(accNo, ad1);
        	
        	double bal2=ad1.getBal()+amt;;
        	Object a1;
			ad1.setBal(bal2);
        	t.put(accNo, ad1);
        	System.out.println("AMOUNT TRANSFERRED");
        	}
        	
        	
        	}
        	
        	
		
		
		
		
	}
	private void printTransaction(HashMap t) {
		
		
	}


	private void exit() {
		
		System.exit(0);
	}

	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}