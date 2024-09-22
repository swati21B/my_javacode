package program_TestNG_assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue_withMSG {
//WAP Assertion in TestNG with assertTrue(true,"message") and check the output
//WAP Assertion in TestNG with assertTrue(false,"message") and check the output
	@Test
	public void testassert()
	{
		//Assert.assertTrue(true, "expecting true and condition is true, passed");
		Assert.assertTrue(false, "expecting true condition");
//Note: message will only display if test fails
	}

}
