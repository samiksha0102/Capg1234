package parallel.com.service;

import parallel.com.beans.BankBean;

public interface BankServiceI {
	public BankBean getBankDetails1(final String accNo1);
	public BankBean getBankDetails(String accNo);
	
	public double withdrawAccount(String accNo,double wid);
	public double depositAccount(String accNo,double dep);
	public double fundTransfer(String accNo, String accNo1, int amt1);
	public boolean createAccount(String name, String address, double bal, String mobNo, String pwd,String accountType,String newAcc);
	public void printTrans();
	
	public int checkName(String name);
	public  int checkPwd(String pwd);
	public int validateMobNo(String mobNo);
	public String getNewAccountNo();
}

