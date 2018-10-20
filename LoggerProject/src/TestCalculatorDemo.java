import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestCalculatorDemo 
{
	private static Scanner sc;
	private static int c;

	public static void main(String[] args)
	{
		Logger myLogger=Logger.getLogger(TestCalculatorDemo.class);
		PropertyConfigurator.configure("log4j.properties");
		sc = new Scanner(System.in);
		myLogger.debug("This is a debug message.");
		myLogger.warn("This is a warn message.");
		myLogger.fatal("This is a fatal message.");
		System.out.println("Enter a: ");
		int a=sc.nextInt();
		myLogger.info("User Entered a : "+a);
		System.out.println("Enter b: ");
		int b=sc.nextInt();
		myLogger.info("User entered b : "+b);
		c = 0;
		try
		{
		    c=a/b;
		    myLogger.info("c = "+c);
		    System.out.println("Divison of a/b is : "+c);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
			myLogger.error("Divisor is 0"+ae.getMessage());
		}
	}

}
