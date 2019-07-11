package com.lab2;

public abstract class Item {
	private int uid;
	 private String title; 
	private int number;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}public int getnumber() {
		return number;
	}
	public void setnumber(int number) {
		this.number = number;
	}
}
