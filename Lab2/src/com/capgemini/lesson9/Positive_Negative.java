package com.capgemini.lesson9;

import java.util.Scanner;

public class Positive_Negative {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
s = new Scanner(System.in);
System.out.print("Enter the number to be checked:");
n=s.nextInt();
if(n>0)
{
	System.out.println("The given number" +n+" is Positive.");
}
else if(n<0)
{
	System.out.println("The given number " +n+" is Negative.");
}
else
{
	System.out.println("The given number is neither Positive nor Negative.");
}
}
	}