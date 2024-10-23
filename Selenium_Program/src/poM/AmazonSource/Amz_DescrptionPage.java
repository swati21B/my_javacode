package poM.AmazonSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_DescrptionPage {
	WebDriver driver;
	@FindBy(xpath="(//div[@class='a-section a-spacing-base'])[2]")
	WebElement productTwo;
	
	public void clickonproduct()
	{
		productTwo.click();
	}
	public Amz_DescrptionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
