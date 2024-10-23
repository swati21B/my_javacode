package selenium.TestNG.Programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_Annotations {
	@BeforeSuite
	public void a()
	{
		System.out.println("D");	
	}
	@BeforeTest
	public void b()
	{
		System.out.println("C");	
	}
	@BeforeClass
	public void c()
	{
		System.out.println("B");	
	}
	@BeforeMethod
	public void d()
	{
		System.out.println("A");
	}
	@Test
	public void TestCase1()
	{
	System.out.println("1");	
	}
	@AfterMethod
	public void e()
	{
		System.out.println("2");
	}
	@AfterClass
	public void f()
	{
		System.out.println("3");
	}
	@AfterTest
	public void g()
	{
		System.out.println("4");
	}
	@AfterSuite
	public void h()
	{
		System.out.println("5");
	}
}
