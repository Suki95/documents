package com.capgemini.lesson9;

import java.util.Scanner;

public class ProductMain 
{

	private static Scanner sc;

	public static void main(String[] args) 
	{
		int choice = 0;
		sc = new Scanner(System.in);
		System.out.println("1. Add product"
				+ "\t2. Display products"
				+ "\t3.Exit");
		
		ProductArrList ProductList=new ProductArrList();
		while(choice!=3)
		{
			System.out.println("Enter your Choice");
			choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			ProductList.addProduct();
			break;
		case 2:
			ProductList.display();
			break;
			default:
				break;
		}
		}
	}

}
