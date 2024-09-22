package selenium.TestNG.Programs;

import org.testng.annotations.Test;

public class TwoPara_inSingleTC {
	@Test(priority=0, invocationCount=5)
	public void login()
	{
	System.out.println("login");	
	}
	@Test(priority=1, invocationCount=3)
	public void logout()
	{
	System.out.println("logout");	
	}
	@Test(priority=2, invocationCount=3, enabled=false)
	public void search()
	{
	System.out.println("search");	
	}
	@Test(priority=3, invocationCount=4, enabled=true)
	public void cart()
	{
	System.out.println("cart");	
	}
	
	
}
