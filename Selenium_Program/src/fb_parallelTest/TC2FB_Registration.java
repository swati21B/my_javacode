package fb_parallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC2FB_Registration extends TC1_FacebookLaunch{
	
@Test
public void FBRegisterForm() throws InterruptedException
{
	WebElement createAcc =driver.findElement(By.linkText("Create new account"));
	createAcc.click();
	Thread.sleep(3000);
	WebElement Fname= driver.findElement(By.xpath("//input[@name='firstname']"));
	Fname.sendKeys("Radha");
	WebElement Lname=driver.findElement(By.name("lastname"));
	Lname.sendKeys("Test");
	WebElement mob=driver.findElement(By.name("reg_email__"));
	mob.sendKeys("9588491388");
	WebElement pass=driver.findElement(By.id("password_step_input"));
	pass.sendKeys("Test12345");
	WebElement day=driver.findElement(By.id("day"));
	Select s1= new Select(day);
	s1.selectByValue("9");
	WebElement month =driver.findElement(By.id("month"));
	Select s2= new Select(month);
	s2.selectByIndex(10);
	WebElement year =driver.findElement(By.id("year"));
	Select s3 = new Select(year);
	s3.selectByVisibleText("1994");
	WebElement radio=driver.findElement(By.xpath("//label[.='Female']"));
	radio.click();
	WebElement submit=driver.findElement(By.name("websubmit"));
	submit.click();
	
}

}
