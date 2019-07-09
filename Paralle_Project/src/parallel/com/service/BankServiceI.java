package parallel.com.service;

import parallel.com.beans.BankBean;

public interface BankServiceI {
	public BankBean getBankDetails(String accNo);
	public double withdrawAccount(String accNo,double wid);
	public double depositAccount(String accNo,double dep);
	public double fundTransfer(String accNo);
    
}

