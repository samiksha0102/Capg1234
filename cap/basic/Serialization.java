package com.cap.basic;

	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectOutputStream;
	import java.io.Serializable;

	public class Student implements Serializable {
		
	private String name ;
	private String address;
	private  int sNo;
	public String getname()
	{return name;
	}
	public void setname( String name)
	{this.name=name;}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public class Serialization{
	public static void main(String[] args)throws IOException {
		Student s=new Student();
		s.setsNo(11);
		s.setname("sandeep");
		s.setAddress("234 abc");
		FileOutputStream f=new FileOutputStream("you.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(s);
		System.out.println("success");
		o.close();
	}
	}}	

	

