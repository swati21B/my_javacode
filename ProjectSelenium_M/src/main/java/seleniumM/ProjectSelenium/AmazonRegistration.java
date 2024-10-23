package seleniumM.ProjectSelenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonRegistration extends Amz_Registra_DataDriven{
	
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
	
	public void AMZ_Registration(WebDriver driver) throws EncryptedDocumentException, IOException {
		Amz_Registra_DataDriven reg = new Amz_Registra_DataDriven();
				
				reg.RegisterDataFromExcel();
				name.sendKeys(reg.NameL);
			
				mobNumber.sendKeys(reg.MobileNum);
			
				password.sendKeys(reg.Password);
			
				VerifyMobileNum.click();
				Assert.assertEquals(puzzleinputbox.isEnabled(), true, "You are not on puzzle page");
				
			}
	
	public AmazonRegistration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	

}
