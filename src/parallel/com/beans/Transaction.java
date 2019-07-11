package parallel.com.beans;

import java.util.Date;
import java.util.Random;

public class Transaction {
private String accountType;
private double bal;
private int TransId;
private Date date;




 public Transaction(String accountType, double bal, int transId, Date date ) {
	super();
	this.accountType = accountType;
	this.bal = bal;
	TransId = transId;
	this.date=date;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
@Override
public String toString() {
	return "Transaction [accountType=" + accountType + ", bal=" + bal + ", TransId=" + TransId + ",date=" + date + "]";
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}
public int getTransId() {
	return TransId;
}
public void setTransId(int transId) {
	TransId = transId;
}
public int ran(int min,int max)
{Random r=new Random();
return r.nextInt((max-min)+1)+min;
}
}
