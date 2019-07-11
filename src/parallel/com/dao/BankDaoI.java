package parallel.com.dao;

import parallel.com.beans.BankBean;

public interface BankDaoI{

	public BankBean getBankDetails(String accNo);
	 public BankBean getBankDetails1(final String accNo1);
		public double withdrawAccount(String accNo,double wid);
		public double depositAccount(String accNo,double dep);
		public double fundTransfer(String accNo, String accNo1, int amt1);
		public String getNewAccountNo();
		public boolean createAccount(BankBean b,String newAcc );
		public void printTrans();
		public int checkName(String name);
		public int checkPwd(String pwd);
		public int validateMobNo(String mobNo);
}
