package selenium.TestNG.Programs;

import org.testng.annotations.Test;

public class Priority_Test {
	//DEfault priority of any test in TestNG is zero.
	@Test(priority=3)
	public void logout()
	{
	System.out.println("logout");	
	}
	@Test(priority=1)
	public void register()
	{
	System.out.println("register");	
	}
	@Test(priority=2)
	public void login()
	{
	System.out.println("login");	
	}
	
	
}
