package com.cg.frs.dto;

public class FlatRegistrationDTO {
	private int ownerId;
	  private int registerId;
	 
	private String flatType;
	  private long flatArea;
	  private double depositAmount;
	  private double rentAmount;
	
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public int getRegisterId() {
		return registerId;
	}
	public void setRegisterId(int registerId) {
		this.registerId = registerId;
	}
	public String getFlatType() {
		return flatType;
	}
	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}
	public long getFlatArea() {
		return flatArea;
	}
	public void setFlatArea(long flatArea) {
		this.flatArea = flatArea;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public double getRentAmount() {
		return rentAmount;
	}
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	@Override
	public String toString() {
		return "RegistrationDTO [ownerId=" + ownerId + ", registerId=" + registerId + ", flatType=" + flatType
				+ ", flatArea=" + flatArea + ", depositAmount=" + depositAmount + ", rentAmount=" + rentAmount + "]";
	}
	public FlatRegistrationDTO(int ownerId, int registerId, String flatType, long flatArea, double depositAmount,
			double rentAmount) {
		super();
		this.ownerId = ownerId;
		this.registerId = registerId;
		this.flatType = flatType;
		this.flatArea = flatArea;
		this.depositAmount = depositAmount;
		this.rentAmount = rentAmount;
	}
	
	  public FlatRegistrationDTO() {}  
}
