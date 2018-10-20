import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculatorTestT 
{
	private int input;
	private int expected;
	@Parameterized.Parameters
	public  static Collection data()
	{
		return Arrays.asList(new Object[][] {{25,4},{100,1},{50,2},{10,10},{5,20}});
	}
	public CalculatorTestT(int input, int expected)
	{
		this.input=input;
		this.expected=expected;
	}
	
	@Test
	public void testMethod()
	{
		Calculator cc=new Calculator();
		System.out.println("Running parameterized tests");
		Assert.assertEquals(expected, cc.divide(input));
	}
}
