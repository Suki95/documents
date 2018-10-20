package com.cg.mps.dto;

public class Mobile 
{
	private int mobId;
	private String mobName;
	private int price;
	private String quantity;
	public int getMobId() 
	{
		return mobId;
	}
	public void setMobId(int mobId) 
	{
		this.mobId = mobId;
	}
	public String getMobName() 
	{
		return mobName;
	}
	public void setMobName(String mobName) 
	{
		this.mobName = mobName;
	}
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	public String getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(String quantity) 
	{
		this.quantity = quantity;
	}
	
	public Mobile(int mobId, String mobName, int price, String quantity) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Mobile() 
	{
		super();
	}
	
	@Override
	public String toString() {
		return "Mobile [mobId=" + mobId + ", mobName=" + mobName + ", price=" + price + ", quantity=" + quantity + "]";
	}
}
