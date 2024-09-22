package dataProviderAnnotation;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonRegist_6SetofValues {
	WebDriver driver;
	@DataProvider(name="RegistrationData")
	public Object[][] Reg_Details()
	{
		Object[][] datainput =new Object[6][3];
		//Set 1
		datainput[0][0]="Teena";
		datainput[0][1]="7391021599";
		datainput[0][2]="Teena@123";
		//set 2
		datainput[1][0]="Teena Bodhale";
		datainput[1][1]="7391021599";
		datainput[1][2]="Teena@123";
		//set 3
		datainput[2][0]="Teena";
		datainput[2][1]="7391021599";
		datainput[2][2]="Teena@123";
		//set 4
		datainput[3][0]="123456 Teena";
		datainput[3][1]="7391021599";
		datainput[3][2]="Teena@123";
		//set 5
		datainput[4][0]="Teena";
		datainput[4][1]="7391021599";
		datainput[4][2]="Teena@123";
		//set 6
		datainput[5][0]="Teena";
		datainput[5][1]="7391021599";
		datainput[5][2]="Teena@123";  
		return datainput;
	}
	
@Test(dataProvider="RegistrationData")
public void amazonRegistration(String name, String mobNum, String PWD)
{
	driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	WebElement Accounts =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	Actions hover = new Actions(driver);//with the actions class invokes the constructor driver
	hover.moveToElement(Accounts).perform();
	WebElement registrionform=driver.findElement(By.linkText("Start here."));
	registrionform.click();
	WebElement YourName= driver.findElement(By.name("customerName"));
	YourName.sendKeys(name);
	WebElement MobNum= driver.findElement(By.name("email"));
	MobNum.sendKeys(mobNum);
	WebElement Password= driver.findElement(By.name("password"));
	Password.sendKeys(PWD);
	WebElement Button_VerifyMobileNum=driver.findElement(By.xpath("//input[@id='continue']"));
	Button_VerifyMobileNum.click();
	String currentpageTitle =driver.getTitle();
	String ExpectedTitle= "Authentication required";
	assertEquals(currentpageTitle,ExpectedTitle, "You are on wrong page");
}

}
