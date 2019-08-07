package com.cg.frs.dto;

public class FlatOwner {
	private int ownerId;
	private String name;
	private String phNo;
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return "FlatOwner [ownerId=" + ownerId + ", name=" + name + ", phNo=" + phNo + "]";
	}
	public FlatOwner(int ownerId, String name, String phNo) {
		super();
		this.ownerId = ownerId;
		this.name = name;
		this.phNo = phNo;
	}
	public FlatOwner() {
		// TODO Auto-generated constructor stub
	}
}
