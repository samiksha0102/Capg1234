package parallel.com.dao;

import java.util.HashMap;
import java.util.Map;


import parallel.com.beans.BankBean;



public class BankDao implements BankDaoI {
	private HashMap<String,Transaction> bankEntry1;
	private HashMap<String,BankBean> bankEntry;
	protected HashMap<String,BankBean > getBankEntry()
	{
        return bankEntry;
    }
	String newAcc;
	public BankDao()
	{
	
		 bankEntry=new HashMap<>();
		BankBean a1=new BankBean("SAMIKSHA","MUMBAI",3450.00,"9406684724","01-02-1997" );
		 bankEntry.put("5646315",a1);	
		BankBean a2=new BankBean("SHALINI","DELHI",1000.00,"8717804949","20-07-1997");
		 bankEntry.put("5646316",a2);
		BankBean a3=new BankBean("SAGAR","PUNE",4080.00,"9770082906","07-07-1996");
		 bankEntry.put("5646317",a3);
		BankBean a4=new BankBean("VARSHA","MYSORE",6754.34,"9770009878","02-01-1996");
		 bankEntry.put("5646318",a4);
	    BankBean a5=new BankBean("RUCHI","BANGLORE",3785.50,"6267582906","05-03-1997");
	    bankEntry.put("5646319",a5);	
			
		 int a=bankEntry.size();
		int b=5646315+a;
		 newAcc=Integer.toString(b);
	
}
	bankEntry1 =new HashMap<>();
	
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
	            throw new AccountNotFoundException("No Account found for this number=" +accNo);
	        }

	    }

	    /**
	     * We can return the balance after recharge in double but in the question integer is used so
	     * using integer for total balance
	     *
	     */
	   // @Override
	  

public double depositAccount(final String accNo,final double dep)
{BankBean account=getBankDetails(accNo);
double initBal=account.getBal();
double currBal=initBal+dep;
account.setBal(currBal);
return currBal;
}






public double withdrawAccount(final String accNo,final double wid)
{BankBean account=getBankDetails(accNo);
double initBal=account.getBal();
double currBal=initBal-wid;
account.setBal(currBal);
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
	return currBal;
	
	
}
public boolean createAccount(BankBean b)	
{bankEntry.put(newAcc,b);
	return true;
	}


}



