package com.capgemini.lesson9;

public class Person 
{
	private String firstName;
	private String lastName;
	private Gender gender;
	private double phoneNumber; 
	public double getPhoneNumber() 
	{
		return phoneNumber;
	}
	public void setPhoneNumber(double phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public Gender getGender() 
	{
		return gender;
	}
	public void setGender(Gender gender) 
	{
		this.gender = gender;
	}
	public Person() 
	{
		super();
	}
	public Person(String firstName, String lastName, Gender gender, double phoneNumber) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}
	public void display(Person person1)
	{
		System.out.println("\nPerson Details:");
		System.out.println("---------------");
		System.out.println("\nFirst Name: " + person1.getFirstName());
		System.out.println("Last Name: " + person1.getLastName());
		System.out.println("Gender: " + person1.getGender());
		System.out.println("Numb: " + person1.getPhoneNumber());
	}
}
