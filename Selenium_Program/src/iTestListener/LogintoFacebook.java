package iTestListener;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import graphql.Assert;

@Listeners(iTestListener.SSListenerClass.class)
public class LogintoFacebook extends SSListenerClass{
	@Test
	public void testcase()
	{
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/");
	driver.manage().window().maximize();
	driver.findElement(By.name("email")).sendKeys("8149472499");
	driver.findElement(By.name("pass")).sendKeys("Swati@215");
	driver.findElement(By.name("login")).click();
	//failing the login
	Assert.assertTrue(false);
	}
}
