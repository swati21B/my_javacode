package selenium.TestNG.Programs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleTestAnnotation_Execution {
	@Test //SRK
	public void launch()
	{
		System.out.println("launch");
	}
	@Test //Salman
	public void quit()
	{
		System.out.println("quit");
	}
	@Test //Akshay
	public void addtoCart()
	{
		System.out.println("addtoCart");
	}
	@BeforeMethod //bodyguard 1
	public void signin()
	{
		System.out.println("Sign in");
	}
	@AfterMethod //bodyguard 2
	public void search()
	{
		System.out.println("Search");
	}

}
