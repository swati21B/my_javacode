package fb_parallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC3_FBLogin extends TC1_FacebookLaunch{
	@Test
	public void loginFB()
	{
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("9588491388");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Test12345");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
		
	}
	

}
