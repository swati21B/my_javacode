package seleniumM.ProjectSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonLogin {

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
	public void un()
	{
		username.sendKeys("swatibodhale215@gmail.com");
	}
	public void contiButton()
	{
		continuebutton.click();;
	}
	public void PWD()
	{
		password.sendKeys("Prisha@07");
	}
	public void signin()
	{
		signInButton.click();
		
	}
	public void verifyassert(WebDriver driver)
	{
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "You are not redirected to home page");
	}
	
//Step 3: initialise the elements annotated by @FindBy
	public AmazonLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this); 
	}


}
