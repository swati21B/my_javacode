package selenium.TestNG.Programs;

import org.testng.annotations.Test;

public class Priority_Program_withNegative {
	@Test(priority=0)
	public void login()
	{
	System.out.println("login");	
	}
	@Test(priority=-1)
	public void register()
	{
	System.out.println("register");	
	}
	@Test(priority=-2)
	public void logout()
	{
	System.out.println("logout");	
	}
}
