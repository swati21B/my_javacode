package selenium.TestNG.Programs;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
//dependsOnMethods parameter is used in TestNG to make sure a particular test case only runs if the other test case[on which it is depending] is success else it will be skip.
@Test
public void login()
{
	System.out.println("login");
}
@Test(dependsOnMethods="login")
public void logout()
{
	System.out.println("logout");
}

//In the above program testcase logout is depending on testcase login which means logout will executed only if login will be successful.

}
