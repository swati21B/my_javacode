package program_TestNG_assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalseCondition {
	@Test
	public void testfalseAssert()
	{
//WAP Assertion in TestNG with assertFalse(false) and check the output
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///E:/Automation%20MKT/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement radio=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		/*The Assert.assertFalse method in TestNG is used to verify that a given condition is false. 
 * If the condition is true, the test will fail, and an AssertionError will be thrown along with the provided message. 
 * This method is particularly useful for validating that certain conditions are not met in your test cases.
*/
		Assert.assertFalse(radio.isSelected(), "radio button not selected");
		if(!radio.isSelected())
		{
			
			System.out.println("radio button is not selected");
		}
		else
		{
			System.out.println("click on the radio button");
			radio.click();
		} 
//WAP Assertion in TestNG with assertFalse(true) and check the output
//below line gives AssertionError: condition fails expected [false] but found [true]
		//Assert.assertFalse(true, "message is condition expecting as false");
	}

}
