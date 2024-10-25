package seleniumM.AirlineProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Registration {
WebDriver driver;
	
	@FindBy(id="ap_customer_name")
	WebElement name;
	
	@FindBy(name="email")
	WebElement mobNumber;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="continue")
	WebElement VerifyMobileNum;
	
	@FindBy(id="auth-verify-button")
	WebElement CreateAmazonAccount;
	
	@FindBy(xpath="//input[@name='cvf_captcha_input']")
	WebElement puzzleinputbox;
	
	public void AMZ_Registration(WebDriver driver) {
				
				name.sendKeys("Tests");
			
				mobNumber.sendKeys("9881456999");
			
				password.sendKeys("Test@1234");
			
				VerifyMobileNum.click();
				Assert.assertEquals(puzzleinputbox.isEnabled(), true, "You are not on puzzle page");
				
			}
	
	public Registration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
}
