

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorTest.class,CalculatorTestT.class,HelloWorldTest.class})

public class TestMySuite 
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("Now running the Test Suite");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("The test Suite is completed");
	}
}
