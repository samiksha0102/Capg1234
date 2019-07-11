package com.cap.beans;

public class MobileBean {

	String city;
	public MobileBean(String string, String string2, int num) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MobileBean [city=" + city + ", bal=" + bal + ", name=" + name +   "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int bal;
	String name;
	
	
	
	
	
}
