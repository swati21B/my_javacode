package selenium.TestNG.Programs;

import org.testng.annotations.Test;

public class Disable_TestCase {
	@Test(enabled=false)
	public void test()
	{
		System.out.println("Test");
	}
	@Test
	public void test2()
	{
		System.out.println("Test 2");
	}
	@Test(enabled=true)
	public void test3()
	{
		System.out.println("Test 3");
	}
}
