package seleniumM.AirlineProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchResultPage {
WebDriver driver;

@FindBy(xpath="(//button[.='Book'])[1]")
WebElement BookButton;

@FindBy(xpath="//button[.='Proceed to traveller details']")
WebElement ProceedtoTravellerD;

@FindBy(xpath="(//span[@class='e5140519 _221e1ca9'])[1]")
WebElement ViewBaggageCancellation;

@FindBy(xpath="//div[@class='_7c598c35 a69d62e8']")
WebElement fareDetails;

@FindBy(xpath="//div[.='Taxes & Fees']")
WebElement TaxesandFees;

@FindBy(xpath="(//button[@class='_7e41f983 bba41d3c  _50baedd0  '])[1]")
WebElement applyOffer;

public void ApplyCoupon()
{
	applyOffer.click();
}

public void ViewBaggageCancellation()
{
	ViewBaggageCancellation.click();
}
public void fareDetails()
{
	fareDetails.click();
}
public void TaxesandFees()
{
	Assert.assertTrue(TaxesandFees.isDisplayed(), "You are not redirected to flight details page");
}



public void ClickoNBook()
{
	BookButton.click();
}
public void ProceedtoTravellerD()
{
	ProceedtoTravellerD.click();
}

public SearchResultPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}


}
