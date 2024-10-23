package program_TestNG_assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse_withMSG {
@Test

//WAP Assertion in TestNG with assertFalse(true,"message") and check the output
//WAP Assertion in TestNG with assertFalse(false,"message") and check the output
public void assertfalseMsg()
{
	//Assert.assertFalse(false, "expecting false and condition is false, Passed the test");
	Assert.assertFalse(true, "expecting false condition");
}

}
