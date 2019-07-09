package parallel.com.dao;

import parallel.com.beans.BankBean;

public interface BankDaoI{

	public BankBean getBankDetails(String accNo);
	
		public double withdrawAccount(String accNo,double wid);
		public double depositAccount(String accNo,double dep);
		
		public double fundTransfer(String accNo);
}
