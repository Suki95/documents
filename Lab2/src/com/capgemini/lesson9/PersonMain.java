package com.capgemini.lesson9;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) 
	{
		Person person1=new Person();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person's first name:");
		String firstName=sc.next();
		System.out.println("Enter person's last name:");
		String lastName=sc.next();
		System.out.println("Enter person's gender(M/F):");
		String gen=sc.next();
		Gender gender= Gender.valueOf(gen);
		System.out.println("Enter person's phone no.:");
		double num=sc.nextDouble();
		person1=new Person(firstName,lastName,gender, num);
		person1.display(person1);
	}

}
