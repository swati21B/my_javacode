package dataProviderAnnotation;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import graphql.Assert;

public class AmazonLogin_4_SetofValues {
	WebDriver driver;
@DataProvider(name="logindetails")
public Object[][] amazonUNPW()
{
	//create instance 0f object class
	Object[][] data= new Object[4][2];
	//set 1
	data[0][0]="7391021594";
	data[0][1]="Prisha@07";
	//set 2
		data[1][0]="+917391021594";
		data[1][1]="Prisha@07";
	//set 3
		data[2][0]="swatibodhale215@gmail.com";
		data[2][1]="Prisha@07";
	//set 4
		data[3][0]="swatibodhale@gmail.com";
		data[3][1]="Prisha@07";
		return data;
	
}
@Test(dataProvider="logindetails")
public void logintoAmazon(String UN, String PW)
{
	driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	//as soon as launch an app it's good to use implicit wait as it applicable to throughout the program
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	WebElement Accounts =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	Actions hover = new Actions(driver);//with the actions class invokes the constructor driver
	hover.moveToElement(Accounts).perform();
	WebElement signin =driver.findElement(By.linkText("Sign in"));
	signin.click();
	WebElement username = driver.findElement(By.name("email"));
	username.sendKeys(UN);
	WebElement continueButton = driver.findElement(By.id("continue"));
	continueButton.click();
	WebElement Password = driver.findElement(By.id("ap_password"));
	Password.sendKeys(PW);
	WebElement SignIn = driver.findElement(By.id("signInSubmit"));
	SignIn.click();
	/*String curreentURL=driver.getCurrentUrl();
	String expectedURL="https://www.amazon.in/?ref_=nav_signin";
	assertEquals(curreentURL, expectedURL, "Amazon homepage url doesn't match");*/
	String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
    String actualTitle = driver.getTitle();
    assertEquals(actualTitle, expectedTitle, "Amazon homepage title doesn't match");
}

}
