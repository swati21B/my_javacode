package amazon_practical;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonLogin extends BM_LaunchQuit{
@Test
public void login() throws InterruptedException
{
	WebElement signinlink = driver.findElement(By.id("nav-link-accountList"));
	signinlink.click();
	Thread.sleep(3000);
	WebElement username = driver.findElement(By.name("email"));
	username.sendKeys("7391021594");
	WebElement continueButton = driver.findElement(By.id("continue"));
	continueButton.click();
	WebElement Password = driver.findElement(By.id("ap_password"));
	Password.sendKeys("Test@123");
	WebElement SignIn = driver.findElement(By.id("signInSubmit"));
	SignIn.click();
	Thread.sleep(3000);
	WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("Shoes"+Keys.ENTER);
	WebElement FirstShoe = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
	FirstShoe.click();
}
	
}
