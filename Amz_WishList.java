package poM.AmazonSource;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amz_WishList {
	WebDriver driver;
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement wishlistbutton;
	
	@FindBy(linkText="View Your List")
	WebElement ViewLIst;
	
	@FindBy(xpath="//span[@id='continue-shopping']")
	WebElement continueShop;
	
	public void addingtoWishList(WebDriver driver)
	{
		Set<String> w1=driver.getWindowHandles();
		Iterator<String> i1= w1.iterator();
		String parent =i1.next();
		String child =i1.next();
		driver.switchTo().window(child);
		wishlistbutton.click();
	}
	public void checkViewListButton()
	{
		Assert.assertEquals(ViewLIst.isDisplayed(), true, "View Your List button is not displayed");
	}
	public void continueShopping()
	{
		continueShop.click();
	}
	
	
	public Amz_WishList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
