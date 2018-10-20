package com.capgemini.lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductArrList 
{
	ArrayList<Product> ProductList=new ArrayList<Product>();
	ArrayList<String> ProdList=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	public int getSize()
	{
		return ProductList.size();
	}
	public <T> void addProduct()
	{
		System.out.println("Enter product name: ");
		String prodName=sc.next();
		Product prod=new Product(prodName);
		ProductList.add(prod);
		ProdList.add(prodName);
		Collections.sort(ProdList);
	}
	public void display()
	{
		for(Product ee:ProductList)
		{
			System.out.println(ProductList);
		}
	}
}
