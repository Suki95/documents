import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest 
{
	static Calculator calc=null;
	@BeforeClass
	public static void setUp()
	{
		calc=new Calculator();
		System.out.println("Setup is called "
				+ "Before the execution of "
				+ "all test cases.");
	}
	@AfterClass
	public static void tearDown()
	{
		System.out.println("tearDown is call once "
				+ "Before the execution of "
				+ "all test cases.");
	}
	@Before
	public void init()
	{
		System.out.println("init is call once "
				+ "Before the execution of "
				+ "each test cases.");
	}
	@After
	public void destroy()
	{
		System.out.println("destroy is call once "
				+ "Before the execution of "
				+ "each test cases.");
	}
	@Test
	public void testDivide1()
	{
		Assert.assertEquals(1,calc.divide(100));
	}
	@Test
	@Ignore
	public void testDivide2()
	{
		Assert.assertEquals(20,calc.divide(5));
	}
	@Test(expected=ArithmeticException.class)
	public void testDivide3()
	{
		Assert.assertEquals(1,calc.divide(0));
	}
}
