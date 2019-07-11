package parallel.com.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import parallel.com.beans.BankBean;
import parallel.com.beans.*;


public class BankDao implements BankDaoI 
{
	String newAcc;
	static HashMap<String,BankBean> bankEntry=new HashMap<>();
	BankBean b =new BankBean(); 
	 
	 protected HashMap<String,BankBean > getBankEntry()
	{
        return bankEntry;
    }
	
	public BankDao()
	{
	
		
		/*BankBean a1=new BankBean("SAMIKSHA","MUMBAI",3450.00,"9406684724","01-02-1997","savings" );
		 bankEntry.put("5646315",a1);	
		BankBean a2=new BankBean("SHALINI","DELHI",1000.00,"8717804949","20-07-1997","current");
		 bankEntry.put("5646316",a2);
		BankBean a3=new BankBean("SAGAR","PUNE",4080.00,"9770082906","07-07-1996","savings");
		 bankEntry.put("5646317",a3);
		BankBean a4=new BankBean("VARSHA","MYSORE",6754.34,"9770009878","02-01-1996","current");
		 bankEntry.put("5646318",a4);
	    BankBean a5=new BankBean("RUCHI","BANGLORE",3785.50,"6267582906","05-03-1997","current");
	    bankEntry.put("5646319",a5);	
			*/
		 
	
}


	
	public BankBean  getBank(final String accNo) {
        return getBankEntry().get(accNo);
    }

	/**
     *  fetches bank details
     *
     * @param accNo
     * @return bank related to accNo
     */
	 public BankBean getBankDetails(final String accNo) {
	        validationCheck(accNo);
	        BankBean account = getBank(accNo);
	        return account;
	    }
	 public BankBean getBankDetails1(final String accNo1) {
	        validationCheck(accNo1);
	      
	        BankBean account = getBank(accNo1);
	        return account;
	    }
	    /**
	     *  method which will throw exception if number is NOT Found
	     *  Done separately so we can reuse it
	     *
	     * @param accNo
	     */
	    public void validationCheck(final String accNo) {
	        boolean noExists = getBankEntry().containsKey(accNo);
	        if (!noExists) {
	        	try {
	            throw new AccountNotFoundException("No Account found for this number=" +accNo);
	        }
	        	catch(AccountNotFoundException e)
	        	{e.printStackTrace();

	    }}}
	        
	        public int validateMobNo(final String mobNo) {
		        boolean mobNoExists = getBankEntry().containsKey(mobNo);
		        if (!mobNoExists || mobNo.length()!=10) {
		        	try {
		            throw new MobileNoInvalidException("please enter valid mobile number=" +mobNo);
		        }
		        	catch(MobileNoInvalidException e)
		        	{e.printStackTrace();
		        	}}
				return 0;
	    
	    
	    }

	   // @Override
	  
	        
	        public int checkName(String name) {
	        	if(name.matches("[A-Z][a-z]*"))
	        		
	        	
	System.out.println("name should start with alphabet");
				return 0;
	        }
	        
	        public int checkPwd(String pwd) {
	        	
	        	if(pwd.length()!=8)
				System.out.println("password should be atleast of 8 characters");
			return 0;
	        }
	        
	        	        

public double depositAccount(final String accNo,final double dep)
{BankBean account=getBankDetails(accNo);
double initBal=account.getBal();
double currBal=initBal+dep;
account.setBal(currBal);
printTransactions("DEPOSIT *****",initBal, currBal,1);
return currBal;
}






public double withdrawAccount(final String accNo,final double wid)
{BankBean account=getBankDetails(accNo);
double initBal=account.getBal();
double currBal=initBal-wid;
account.setBal(currBal);
printTransactions("WITHDRAW *****", initBal,currBal,1);
return currBal;
}

@Override
public double fundTransfer(String accNo,String accNo1,int amt1) {
	BankBean account=getBankDetails(accNo);
	double initBal=account.getBal();
	double currBal=initBal-amt1;
	account.setBal(currBal);
	
	BankBean account1=getBankDetails(accNo1);
	double initBal1=account1.getBal();
	double currBal1=initBal1+amt1;
	account1.setBal(currBal1);
	printTransactions("FUNDTRANSFER *****", initBal,currBal,1);
	return currBal;
	
	
}

static int i=0;
static String temp[]=new String[100];
static double temp1[]=new double[100];
static double temp2[]=new double[100];

public void printTrans()
{printTransactions("A",0,0,0);}

public static void printTransactions(String tran,double prevBal,double newBal,int a ) 
{
System.out.println();



i++;
temp[i]=tran;
temp1[i] = prevBal;
temp2[i] = newBal;
if(a!=1)
{System.out.println("TRANSACTION ***** PREVIOUSBALANCE ***** CURRENTBALANCE");
for(i=1;i<100;i++)
{
if(temp[i]!="A")
{
System.out.println(temp[i] +"*********"+ temp1[i] +"*********"+ temp2[i]);


}
else {
break;
}

}
}  

}


@Override
public String getNewAccountNo() {
	
	return newAcc;
}
@Override

	public boolean createAccount(BankBean b,String newAcc) {
		
	bankEntry.put(newAcc,b);
	return true;
	}





	
}






