package com.capgemini.lesson9;

public class Product 
{
	private String productNames;

	public String getProductNames() 
	{
		return productNames;
	}

	public void setProductNames(String productNames) 
	{
		this.productNames = productNames;
	}

	@Override
	public String toString() {
		return "Product [productNames=" + productNames + "]";
	}

	public Product() 
	{
		super();
	}

	public Product(String productNames) 
	{
		super();
		this.productNames = productNames;
	}
	
	
}
