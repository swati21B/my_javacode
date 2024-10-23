package seleniumM.ProjectSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	WebDriver driver;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement AccountList;
	
	@FindBy(linkText="Start here.")
	WebElement register;
	
	@FindBy(linkText="Sign in")
	WebElement SignInClick;
	
	public void hoverover(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(AccountList).perform();
	}
	public void registration()
	{
		register.click();
	}
	public void signinClick() throws InterruptedException
	{
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		SignInClick.click();
	}
	
	public AmazonHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
