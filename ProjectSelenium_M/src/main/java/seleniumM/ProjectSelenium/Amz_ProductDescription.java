package seleniumM.ProjectSelenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Amz_ProductDescription {
	WebDriver driver;
	
	@FindBy(xpath="(//div[@class='a-section a-spacing-base'])[2]")
	WebElement productTwo;
	
	@FindBy(xpath="//h2[.=' Product description  ']")
	WebElement Productdescription;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[8]")
	WebElement price;

	@FindBy(xpath="//h2[.='Customer reviews']")
	WebElement review;

	public void clickonproduct(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Amazon"));
		productTwo.click();
	}
	
	
	public Amz_ProductDescription(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void VerifyProductDescription(WebDriver driver) {
		Set<String> w1=driver.getWindowHandles();
		Iterator<String> i1= w1.iterator();
		String parent =i1.next();
		String child =i1.next();
		driver.switchTo().window(child);
		Assert.assertEquals(Productdescription.isDisplayed(), true, "Sorry, you are on wrong page");
		Assert.assertEquals(price.isDisplayed(), true, "Sorry, you are not on product description page");
		Assert.assertEquals(review.isDisplayed(), true, "Sorry, review is not present on this page");
		
	}

}
