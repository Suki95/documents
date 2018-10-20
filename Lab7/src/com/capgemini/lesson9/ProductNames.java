package com.capgemini.lesson9;

import java.util.Scanner;

public class ProductNames {

	private static Scanner sC;

	public static void main(String[] args) {
		sC = new Scanner(System.in);
		System.out.println("Enter number of items: ");
		int n=sC.nextInt();
		String names[]=new String[n];
		System.out.println("Enter product names: ");
		for(int i=0;i<n;i++)
		{
			names[i]=sC.next();
		}
		String temp="Null";
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("Sorted Names: ");
		for(int i=0;i<n;i++)
		{
			System.out.println("Product Names: "+names[i]);
		}
		
}

}
