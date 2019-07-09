package parallel.com.ui;

import java.util.Scanner;

import parallel.com.dao.*;


import parallel.com.beans.BankBean;
import parallel.com.dao.BankDao;

import parallel.com.service.BankService;
import parallel.com.service.BankServiceI;

public class BankUI 
{String accNo;
	  public void showMenu2()      //5
	  {			
		  
	  System.out.println();
	  System.out.println("##########  Enter Your Transaction Choice  ##########");
	  System.out.println("1. Account Details");
	  System.out.println("2. Show Balance");
	  System.out.println("3. Deposit");
	  System.out.println("4. Withdraw");
	  System.out.println("5. Fund Transfer");
	  System.out.println("6. Print Transaction");
	  
	  System.out.println("7. Exit");
}
	
	  public void showMenu1()      //5
	  {			
		  
	  System.out.println();
	  System.out.println("##########  Enter Your Transaction Choice  ##########");
	  System.out.println("1. YES");
	  System.out.println("2. NO");
	  System.out.println("3.BYE BYE");
	  
}
	

public int getOption(Scanner sc)   //7
{
    try 
    {
    	
        int option = sc.nextInt();
        return option;
    } 
    catch (Throwable e) {
        e.printStackTrace();
        return -1;
    }
}

private BankServiceI bs = new BankService(new BankDao());

public BankServiceI getBankService() {
    return bs;
}

public void choose(String accNo)    //3
{
    boolean run = true;
    while (run) {
        showMenu2();     //4
        Scanner scanner = new Scanner(System.in);
        int option = getOption(scanner);   //6   1
        if (option == -1)
        {
            run = false;
        }
        
        
        BankServiceI service = getBankService();
      	 BankBean account = service.getBankDetails(accNo);
        switch (option)   //input-1,flow-8
        {
	        case 1:
	       	 System.out.println();
	       	 System.out.println("###----Account Details----###");
	       	
	       	 System.out.println("Accoun Holder Name= " + account.getName());
             System.out.println("Account Type= " + account.getAccountType());
             //System.out.println("Current Balance= " + account.getBal());
             System.out.println("Address =" + account.getAddress());
             System.out.println("Mobile Number =" + account.getMobNo());
             
	       	 
	       	//accountdetails(accno, c,map);
	       	 break;
	       	 
	       	 
	        case 2:
           	 System.out.println();
           	 System.out.println("###----Balance----###");
           	
	       	 System.out.println("Accoun Holder Name= " + account.getName());
            System.out.println("Account Type= " + account.getAccountType());
            System.out.println("Current Balance= " + account.getBal());
           
           	//showbalance(accno, c ,map);
           	 break;

            case 3:
            	try {
            	System.out.println();
            	 System.out.println("###----Deposit----###");
            	 System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT");
            	 double dep=scanner.nextDouble();
            	  double currBal=service.depositAccount(accNo,dep);
            	 System.out.println("Accoun Holder Name= " + account.getName());
                 System.out.println("Account Type= " + account.getAccountType());
                 System.out.println("New Balance= " + currBal);
            	}
            	catch(Throwable e)
            	{
           System.out.println("page not found");
            	}
            	 break;
            	 
            case 4:
            	try {
            	 System.out.println();
            	 System.out.println("###----Withdraw----###");
            	 System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAW");
            	 double wid=scanner.nextDouble();
            	  double currBal=service.withdrawAccount(accNo,wid);
            	 System.out.println("Accoun Holder Name= " + account.getName());
                 System.out.println("Account Type= " + account.getAccountType());
                 System.out.println("New Balance= " + currBal);
            	
            	}
            	catch(InSufficientAmountException e)
            	{
           System.out.println("InSufficient balance");
            	}
            	break;

            	

            	 case 5:
            		 try {
            	 System.out.println();
            	 System.out.println("###----Fund Transfer----###");
            	 System.out.println("ENTER THE ACCOUNT NUMBER TO TRANSFER");
            	 String accNo1=scanner.next();
            	 double currBal=service.fundTransfer(accNo);
            	 double currBal1=service.fundTransfer(accNo1);
            	 
            		 }
            		 catch(Throwable e)
                 	{
                System.out.println("page not found");
                 	}
            	
            	 break;

            	 case 6:
            		 try {
            	 System.out.println();
            	 System.out.println("###----Print Transactions----###");
            		System.out.println();
            		 }catch(Throwable e)
             	{
            System.out.println("page not found");
             	}
            	 break;

            	 
            	 case 7:
            	 System.out.println();
            	 System.out.println("Bye Bye!!! Visit Again");
            	 System.exit(0);
            	 break; 

            	 default: {
                     run = false;
                     System.out.println("Thank you for Using Application !");
                 }
            	 }
        }
    }
            	 
public void choose1()    //3
{
	System.out.println("####------  XYZ BANK ------  ####");
	 System.out.println();
	 System.out.print("Enter 1 if you are an Existing User else Enter 2 : ");
	 showMenu1();
	 Scanner sc = new Scanner(System.in);
	 int option1=sc.nextInt();
	 
	 switch(option1)
	 {case 1:
		 try {
		 System.out.println();
		 System.out.println("WELCOME BACK");
		 System.out.println("ENTER YOUR ACCOUNT NUMBER");
		  accNo=sc.next();
		 BankServiceI service = getBankService();    //service (I)
        BankBean account = service.getBankDetails(accNo);
        System.out.println("WELCOME " + account.getName());
		 }
		 catch (AccountNotFoundException e) {
             System.out.println("Account No does not exist");}
          catch (IncorrectAccountNoException e) {
             System.out.println("Account number is not a correct account number");
         } catch (Throwable e) {
             System.out.println("sorry something went wrong");
         }
		 choose(accNo);
         break;
         
         
	 case 2:
		 System.out.println();
	 System.out.println("CREATE NEW ACCOUNT");
break;

	 default:
		 System.out.println("Thank you for Using Application !");

	 }}

            	  
public static void main(String[] args) {
BankUI ui = new BankUI();    //1
    ui.choose1();             //2
}

}
