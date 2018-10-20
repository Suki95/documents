package com.cg.mps.dto;

import java.sql.Date;

public class Customer 
{
	private int mobId;
	private String custMailId;
	private String custName;
	private String phoneNum;
	private int purchaseId;
	private Date purchaseDate;
	
	public int getMobId() 
	{
		return mobId;
	}
	public void setMobId(int mobId) 
	{
		this.mobId = mobId;
	}
	public String getCustMailId() 
	{
		return custMailId;
	}
	public void setCustMailId(String custMailId) 
	{
		this.custMailId = custMailId;
	}
	public String getCustName() 
	{
		return custName;
	}
	public void setCustName(String custName) 
	{
		this.custName = custName;
	}
	public String getPhoneNum() 
	{
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}
	public int getPurchaseId() 
	{
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) 
	{
		this.purchaseId = purchaseId;
	}
	public Date getPurchaseDate() 
	{
		return purchaseDate;
	}
	@Override
	public String toString() {
		return "Customer [mobId=" + mobId + ", custMailId=" + custMailId + ", custName=" + custName + ", phoneNum="
				+ phoneNum + ", purchaseId=" + purchaseId + ", purchaseDate=" + purchaseDate + "]";
	}
	public void setPurchaseDate(Date purchaseDate) 
	{
		this.purchaseDate = purchaseDate;
	}
	
	public Customer() 
	{
		super();
	}
	public Customer(int purchaseId, String custName, String custMailId, String phoneNum, Date purchaseDate, int mobileId ) 
	{
		super();
		this.mobId = mobileId;
		this.custMailId = custMailId;
		this.custName = custName;
		this.phoneNum = phoneNum;
		this.purchaseId = purchaseId;
		this.purchaseDate = purchaseDate;
	}
}
