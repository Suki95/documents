package com.capgemini.lesson9;

import java.util.Scanner;

public class GetIpAddress {

	private static Scanner sC;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
String firstName, lastName, gender;
int age;
float weight;

sC = new Scanner(System.in);

System.out.print("Enter First name: ");
firstName=sC.nextLine();

System.out.print("Enter Last name: ");
lastName=sC.nextLine();

System.out.print("Enter Gender(M/F): ");
gender=sC.next();

System.out.print("Enter Age: ");
age=sC.nextInt();

System.out.print("Enter Weight: ");
weight=sC.nextFloat();

System.out.println("\nPerson Details:");
System.out.println("---------------");
System.out.println("\nFirst Name: " + firstName);
System.out.println("Last Name: " + lastName);
System.out.println("Gender: " + gender);
System.out.println("Age: " + age);
System.out.println("Weight: " + weight);
	}

}
