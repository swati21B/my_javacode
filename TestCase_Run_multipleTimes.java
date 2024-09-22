package selenium.TestNG.Programs;

import org.testng.annotations.Test;

public class TestCase_Run_multipleTimes {
	//default invocation count in TestNG is 1
	@Test(invocationCount=5)
	public void test()
	{
		System.out.println("Test");
	}

}
