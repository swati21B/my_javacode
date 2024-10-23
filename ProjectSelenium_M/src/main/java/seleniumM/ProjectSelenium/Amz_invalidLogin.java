package seleniumM.ProjectSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_invalidLogin {
WebDriver driver;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signInButton;
	
	public void uname()
	{
		username.sendKeys("swatibodhale215@gmail.com");
	}
	public void continueB()
	{
		continuebutton.click();
	}
	public void PW()
	{
		password.sendKeys("");
	}
	public void sign_in()
	{
		signInButton.click();
	}
	
	
	public Amz_invalidLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
