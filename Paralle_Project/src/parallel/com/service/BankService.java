package parallel.com.service;



import parallel.com.beans.BankBean;
import parallel.com.dao.BankDaoI;
import parallel.com.dao.IncorrectMobileNoException;

public class BankService implements BankServiceI
{
private BankDaoI bankdao;      //has-a
public BankDaoI getBankDao()
{return bankdao;
}



public void setBankDaoI(final BankDaoI bankdao){
    this.bankdao=bankdao;
}
public BankService(){
}
public  BankService(final BankDaoI bankdao ){
    this.bankdao=bankdao;
}
public void validateNumber(String accNo){
    if(accNo==null || accNo.length()!=10){
        throw new IncorrectMobileNoException("Incorrect account number");
    }
}

public BankBean getBankDetails(final String accNo) {
    validateNumber(accNo);
    BankBean account= getBankDao().getBankDetails(accNo);
    return account;
}
public double depositAccount(String accNo,double dep)
{ double currBal=getBankDaoI().getBankDetails(accNo);
		return currBal;
}


public double withdrawAccount(String accNo,double wid)
{ double currBal=getBankDaoI().getBankDetails(accNo);
		return currBal;
}
@Override
public int rechargeAccount(String mobileNo, double rechargeAmount) {
	// TODO Auto-generated method stub
	return 0;
}
}



