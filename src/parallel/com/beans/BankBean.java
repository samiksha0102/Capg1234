package parallel.com.beans;

public class BankBean 
{  @Override
	public String toString() {
		return "BankBean [accountType=" + accountType + ", bal=" + bal + ", name=" + name + ", pwd=" + pwd
				+ ", address=" + address + ", mobNo=" + mobNo + ", getAccountType()=" + getAccountType() + ", getBal()="
				+ getBal() + ", getName()=" + getName() + ", getPwd()=" + getPwd() + ", getAddress()=" + getAddress()
				+ ", getMobNo()=" + getMobNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

private String accountType;
private double bal;
private String name;
private String pwd;
private String address;
private String mobNo;     //bean,dtop,vo,pojo,entity

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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	 public BankBean() 
	  {
	this.name = name;
	 this.address = address;
	 this.bal = bal;
	 this.mobNo = mobNo;
	 this.pwd=pwd;
	 this.accountType=accountType;
	 
	  }
	
	 }
