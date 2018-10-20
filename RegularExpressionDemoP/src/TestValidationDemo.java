import java.util.regex.Pattern;

import java.util.Scanner;

public class TestValidationDemo 
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter UR Name:");
		String eName=sc.next();
		String namepattern1="[A-z][a-z]+";
		String namePattern2="[0-9]+";
		System.out.println("You have entered : "+eName);
		if(Pattern.matches(namepattern1, eName))
		{
			System.out.println("Valid Name");
		}
		else
		{
			System.out.println(" In-valid Name");
		}
	}
}
