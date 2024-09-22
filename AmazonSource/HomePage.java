package poM.AmazonSource;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	//Step 1: locate each component with @FindBy annotation
	
	@FindBy(xpath="//span[@class='nav-line-1 nav-progressive-content']")
	WebElement AccountList;
	
	@FindBy(linkText="Sign in")
	WebElement SignInClick;
//Step 2: create separate methods for each element
	
	//as the actions class is parameterised hence, we need to pass parameters to method as well.
	public void hovertoAccountsList(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(AccountList).perform();
	}
	public void signinClick() throws InterruptedException
	{
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		SignInClick.click();
	}
//Step 3: initialise the elements
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
