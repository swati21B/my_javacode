package program_TestNG_assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import graphql.Assert;

public class AssertTrue {
	//WAP Assertion in TestNG with assertTrue(true) and check the output
	WebDriver driver;
	@Test
	public void TestTrueCondition()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement search =driver.findElement(By.xpath("//textarea[@name='q']"));
/*Assert.assertTrue method used to verify that a given condition is true. 
 * If the condition is false, the test will fail, and an AssertionError will be thrown. 
 * This method is particularly useful for validating boolean expressions in your test cases.*/
		Assert.assertTrue(search.isDisplayed());//passed boolean condition true
		 
		if (search.isDisplayed()) {
	            search.sendKeys("India");
	        } else {
	            System.out.println("Field is not enabled");
	        }
		//driver.quit();
//WAP Assertion in TestNG with assertTrue(false) and check the output
//below line will throw an AssertException: condition expected to be true
		
	//Assert.assertTrue(false);//passed boolean condition as false
	}

}
