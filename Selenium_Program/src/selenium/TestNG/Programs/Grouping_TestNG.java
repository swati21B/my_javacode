package selenium.TestNG.Programs;

import org.testng.annotations.Test;

public class Grouping_TestNG {
@Test(groups= {"smoke", "system"})
	public void Test1()
	{
		System.out.println("Test1");
	}
@Test(groups= {"smoke"})
public void Test2()
{
	System.out.println("Test2");
}
@Test(groups= {"system"})
public void Test3()
{
	System.out.println("Test3");
}
@Test(groups= {"Test Integration"})
public void Test4()
{
	System.out.println("Test4");
}
@Test(groups= {"Test Integration", "Regression"})
public void Test5()
{
	System.out.println("Test5");
}
@Test(groups= {"Test Component"})
public void Test6()
{
	System.out.println("Test6");
}
}
