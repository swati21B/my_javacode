package seleniumM.AirlineProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidLogin extends DDT_Login{
	WebDriver driver;
	//Step 1: locate each component with @FindBy annotation
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signInButton;
//Step 2: create separate methods for each element	
	public void login(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		DDT_Login log= new DDT_Login();
		log.loginfromExcel();
		username.sendKeys(log.UN);
		continuebutton.click();
		password.sendKeys(log.PWD);
		signInButton.click();
	}
	
	public void verifyassert(WebDriver driver)
	{
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "You are not redirected to home page");
	}
	
//Step 3: initialise the elements annotated by @FindBy
	public ValidLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this); 
	}
}
