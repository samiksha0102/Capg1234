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
	  System.out.println("**************************************************************************************************");
	  System.out.println("##########  Enter Your Transaction Choice  ##########");
	  System.out.println("1. Account Details");
	  System.out.println("2. Show Balance");
	  System.out.println("3. Deposit");
	  System.out.println("4. Withdraw");
	  System.out.println("5. Fund Transfer");
	  System.out.println("6. Print Transaction");
	  System.out.println("7. Go to Menu");
	  System.out.println("8. Exit");
}
	
	  public void showMenu1()      //5
	  {			
		  
	  System.out.println();
	  System.out.println();
	  System.out.println("##########  Enter Your Transaction Choice  ##########");
	  System.out.println("1. YES");
	  System.out.println("2. NO");
	  System.out.println("3.EXIT");
	  
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
	       	 System.out.println("******************************************************************************************");
	       	 System.out.println("###----Account Details----###");
	       	
	       	 System.out.println("Account Holder Name= " + account.getName());
	       	
			System.out.println("Account Number " +accNo);
	       	 System.out.println("Account Type= " + account.getAccountType());
            
             System.out.println("Address =" + account.getAddress());
             System.out.println("Mobile Number =" + account.getMobNo());
             
	       	 
	       	
	       	 break;
	       	 
	       	 
	        case 2:
           	 System.out.println();
           	 System.out.println("******************************************************************************************");
           	 System.out.println("###----Balance----###");
           	
	       	 System.out.println("Accoun Holder Name= " + account.getName());
            System.out.println("Account Type= " + account.getAccountType());
            System.out.println("Current Balance= " + account.getBal());
           
           	
           	 break;

            case 3:
            	try {
            	System.out.println();
            	System.out.println("**********************************************************************************");
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
            	 System.out.println("********************************************************************************");
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
            	 System.out.println("****************************************************************************************");
            	 System.out.println("###----Fund Transfer----###");
            	 System.out.println("ENTER THE ACCOUNT NUMBER TO TRANSFER");
            	 String accNo1=scanner.next();
            	 System.out.println("ENTER THE AMOUNT NUMBER TO TRANSFER");
            	 int amt1=scanner.nextInt();
            	 double currBal=service.fundTransfer(accNo,accNo1,amt1);
            	 System.out.println("New Balance= " + currBal);
            	 
            		 }
            		 catch(Throwable e)
                 	{
                System.out.println("page not found");
                 	}
            	
            	 break;

            	 case 6:
            		 try {
            	 System.out.println();
            	 System.out.println("*********************************************************************************************");
            	 System.out.println("###----Print Transactions----###");
            	 service.printTrans();
            		System.out.println();
            		
            		 }catch(Throwable e)
             	{
            System.out.println("page not found");
             	}
            	 break;

            	 case 7:
            		 
            		 {
            			 System.out.println();
            		 
            		 choose1();
            	 break;
            		 }
            	 
            	 
            	 
            	 
            	 case 8:
            	 System.out.println();
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
	System.out.println("************ ------  XYZ BANK ------  *****************");
	 System.out.println();
	 System.out.print("Enter 1 if you are an Existing User else Enter 2 : ");
	 System.out.println();
	 showMenu1();
	 Scanner sc = new Scanner(System.in);
	 int option1=sc.nextInt();
	 
	 switch(option1)
	 {case 1:
		 try {
		 System.out.println();
		 System.out.println("WELCOME BACK!!!!!!");
		 System.out.println();
		 System.out.println("ENTER YOUR ACCOUNT NUMBER");
		  accNo=sc.next();
		 BankServiceI service = getBankService();    //service (I)
        BankBean account = service.getBankDetails(accNo);
       
		System.out.println("PASSWORD ");
		String pwd =sc.next();
		String pwd1 =account.getPwd();
		if(pwd.equals(pwd1))
			 System.out.println("WELCOME " + account.getName());
		 
		 else
		 {System.out.println("Incorrect password,Try again!!");
          System.out.println();
          choose1();
		 }
	 }
		 catch (AccountNotFoundException e) {
             System.out.println("Account No does not exist");}
          catch (IncorrectAccountNoException e) {
             System.out.println("Account number is not a correct account number");
         } catch (Throwable e) {
             System.out.println("Enter correct account number");
         }
		 choose(accNo);
         break;
         
         
	 case 2:
		 try {
		 System.out.println();
	  System.out.println("######-----CREATE NEW ACCOUNT-----#####");
	  System.out.println();
	  BankServiceI service = getBankService();  
	  
	  String name;
	  int t1=0;
	  do {
	  
	  System.out.println("ENTER YOUR NAME");
       name=sc.next();
      t1=service.checkName(name);
      
	  }while(t1!=1);
	  
	  
	  String pwd;
	  int t2=0;
	  do {
      System.out.println("ENTER YOUR PASSWORD");
       pwd=sc.next();
      
      t2=service.checkPwd(pwd);
	  }while(t2!=1);
      
	  
	  String mobNo;
	  int t3=0;
	  do {
	  
      System.out.println("ENTER YOUR MOBILE NUMBER");
       mobNo=sc.next();
       t3=service.validateMobNo(mobNo);
	  }while(t3!=1);
     
      System.out.println("ENTER YOUR ACCOUNT TYPE");
      String accountType =sc.next();
      System.out.println("ENTER YOUR ADDRESS");
      String address=sc.next();
      
      System.out.println("ENTER initial BALANCE");
      double bal=sc.nextDouble();
     double d=Double.valueOf(mobNo);
    int newAc=(int)(d/1000);
     
     
      String newAcc=Integer.toString(newAc);
       service = getBankService();
     
      
      boolean b=service.createAccount(name,  address,  bal,  mobNo,  pwd, accountType,newAcc);
      if(b==true)
      {
    	  System.out.println("****ACCOUNT CREATED*****");
    	  System.out.println();
    	  choose(newAcc);
      }
      else
      {System.out.println("*****Insufficient details*****");
      }
		 }
		 catch(MobileNoInvalidException e)
		 {System.out.println("Please enter correct mobile number");}
	 
		 catch (Throwable e) {
             System.out.println("######  UNABLE TO CREATE YOUR ACCOUNT  #####");
         }
	 break;

	 default:
		 System.out.println("Thank you for Using Application !");

	 }
	 sc.close();}

            	  
public static void main(String[] args) {
BankUI ui = new BankUI();    //1
    ui.choose1();             //2
}

}
