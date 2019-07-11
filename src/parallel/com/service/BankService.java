package parallel.com.service;


import parallel.com.beans.BankBean;
import parallel.com.dao.BankDaoI;
import parallel.com.dao.InSufficientAmountException;
import parallel.com.dao.IncorrectAccountNoException;



public class BankService implements BankServiceI
{

private BankDaoI bankdao;      //has-a
public BankDaoI getBankDaoI()
{
	return bankdao;
}



public void setBankDaoI(final BankDaoI bankdao){
    this.bankdao=bankdao;
}



public BankService(){
}

public  BankService(final BankDaoI bankdao ){
    this.bankdao=bankdao;
}



public void validateAccNo(String accNo){
    if(accNo==null || accNo.length()!=7){
        throw new IncorrectAccountNoException("Incorrect Account number");
    }
}


public int validateMobNo(String mobNo){
    if(mobNo==null || mobNo.length()!=10){
    
        System.out.println("Incorrect MOBILE number");
        return 0;
    }
    else
	return 1;
	
}






public BankBean getBankDetails(final String accNo) {
    validateAccNo(accNo);
    BankBean account= getBankDaoI().getBankDetails(accNo);
    return account;
}

public void validateAmt(double wid)
{if(wid<=0)
	throw new InSufficientAmountException("Insufficient balance");
}





public double depositAccount(String accNo,double dep)
{ 
double currBal=getBankDaoI().depositAccount(accNo, dep);
		return currBal;
}





public double withdrawAccount(String accNo,double wid)
{ double currBal=getBankDaoI().withdrawAccount(accNo, wid);
		return currBal;
}



@Override
public double fundTransfer(String accNo,String accNo1, int amt1) {
	double currBal=getBankDaoI().fundTransfer(accNo, accNo1, amt1);
	return currBal;	
	
}
public boolean createAccount(String name, String address, double bal, String mobNo, String pwd,String accountType,String newAcc) {
	BankBean b=new BankBean();
	b.setAddress(address);
	b.setBal(bal);
	b.setMobNo(mobNo);
	b.setName(name);
	b.setPwd(pwd);
	b.setAccountType(accountType);
	getBankDaoI().createAccount(b,newAcc);
	
	
	return true;
}



@Override
public BankBean getBankDetails1( final String accNo1) {
	validateAccNo(accNo1);
	BankBean account=getBankDaoI().getBankDetails1(accNo1);
	return account;
}



@Override
public String getNewAccountNo() {
	String newAcc=getBankDaoI().getNewAccountNo();
	return newAcc;
}



@Override
public void printTrans() {
	getBankDaoI().printTrans();
	
}



@Override
public int checkName(String name) {
	
	if(name.matches("[A-Z][a-z]*"))
	  return 1;
	else
		System.out.println("name should start with alphabet");
	

	return 0;
		        }




@Override
public int checkPwd(String pwd) {

	
	if(pwd.length()>=8)
		return 1;
	else
	System.out.println("password should be atleast of 8 characters");
	return 0;
	

}






}



