package poM.AmazonSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signInButton;
	
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
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
