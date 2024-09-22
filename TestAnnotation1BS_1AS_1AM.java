package selenium.TestNG.Programs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//There is a class with 3 @ Test annotations.1 @BS, 1 @AS and 1 @ AM. What is the order of execution.
//Write a program for the above scenario to understand the order of execution
public class TestAnnotation1BS_1AS_1AM {
@Test
public void launch()
{
	System.out.println("launch");
}
@Test
public void search()
{
	System.out.println("search");
}
@Test
public void addtocart()
{
	System.out.println("Add to cart");
}
@BeforeSuite
public void GetURL()
{
	System.out.println("Get URL");
}
@AfterSuite
public void close()
{
	System.out.println("Close");
}
@AfterMethod
public void Quit()
{
	System.out.println("Quit");
}

}
