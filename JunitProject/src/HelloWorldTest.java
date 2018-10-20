

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest 
{
	@Test
	public void testSay()
	{
		HelloWorld hello=new HelloWorld();
		assertEquals("Unexpected Result","Hello World!",hello.say());
	}
}
