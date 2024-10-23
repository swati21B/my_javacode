package seleniumM.ProjectSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_Checkout {
	
WebDriver driver;

@FindBy(xpath="//input[@name='claimCode']")
WebElement EnterCoupon;

@FindBy(id="gcApplyButtonId-announce")
WebElement ApplyButton;

@FindBy(xpath="(//input[@name='placeYourOrder1'])[3]")
WebElement PlaceOrderandPayButton;

@FindBy(xpath="//span[.='Go to your orders']")
WebElement GotoOrdersLink;


public void Coupon()
{
	EnterCoupon.sendKeys("CLIP2COLLECT");
	ApplyButton.click();
}

public void PlaceOrderandPay()
{
	PlaceOrderandPayButton.click();
	Assert.assertEquals(GotoOrdersLink.isDisplayed(), true, "Sorry, You are not on amazon Thank you page");
	Reporter.log("You are on the Amazon Thanks page");
}

public Amz_Checkout(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}




}
