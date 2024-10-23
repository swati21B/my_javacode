package seleniumM.ProjectSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_OrdersPage {
	WebDriver driver;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement AccountList;
	
	@FindBy(xpath="//span[.='Your Orders']")
	WebElement OrdersLink;
	
	@FindBy(xpath="//select[@id='time-filter']")
	WebElement pastOrderDropdown;
	
	@FindBy(partialLinkText="Write a product")
	WebElement productReview;
	
	@FindBy(linkText="community guidelines")
	WebElement reviewPage;
	
	public void hoverover(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(AccountList).perform();
		OrdersLink.click();
	}
	
	public void OrderFilter()
	{
		Select s1= new Select(pastOrderDropdown);
		s1.selectByValue("year-2023");
	}
	public void ReviewTheOrder()
	{
		productReview.click();
	}
	public void verifyreviewPage()
	{
		Assert.assertTrue(reviewPage.isDisplayed(), "Sorry, you are not on Review page");
		Reporter.log("You are on the product review page");
	}
	
	public Amz_OrdersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}
