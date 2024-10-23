package seleniumM.ProjectSelenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Amz_AddtoCart {
	WebDriver driver;
@FindBy(id="add-to-cart-button")
WebElement addtoCartButton;

@FindBy(linkText="Go to Cart")
WebElement GotoCartButton;

@FindBy(xpath="(//i[@class='a-icon a-accordion-radio a-icon-radio-inactive'])[1]")
WebElement anotherwaytoBuy;

@FindBy(id="quantity")
WebElement Quantity;

@FindBy(xpath="(//span[@class='a-dropdown-prompt'])[1]")
WebElement ThreeQuantity;

@FindBy(xpath="(//input[@type='submit'])[10]")
WebElement deleteButton;

public void addtoCartmethod(WebDriver driver) throws InterruptedException
{
	Set<String> w1 = driver.getWindowHandles();
	Iterator<String> i1=w1.iterator();
	Thread.sleep(3000);
	String parentID= i1.next();//parent window id
	String childID= i1.next();//any child window id
	System.out.println("Parent window id->"+parentID);
	System.out.println("Child window id->"+childID);
	//moving control to child window
	driver.switchTo().window(childID);
	Thread.sleep(2000);
	if(addtoCartButton.isDisplayed())
	{
	int attempts=0;
	while(attempts<2) {
	try {
		addtoCartButton.click();
	}
	catch(ElementNotInteractableException e)
	{
		attempts++;
	}
	}
	}
	else {
		anotherwaytoBuy.click();
		addtoCartButton.click();
	}
	Assert.assertEquals(GotoCartButton.isDisplayed(), true, "Sorry, GotoCartButton is not present");
}

public void GotoCartpage()
{
	GotoCartButton.click();
	
}
public void selectQuantity()
{
	Assert.assertEquals(Quantity.isDisplayed(), true, "Quantity dropdown is not displayed");
	Select quant = new Select(Quantity);
	quant.selectByValue("3");
}
public void deleteQunatity()
{
	/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeSelected(Quantity));
	Assert.assertTrue(ThreeQuantity.isDisplayed());*/
	int attempts =0;
	while(attempts<2)
	{
		try {
			deleteButton.click();
			break;//break the loop if successfull
		}
		catch(StaleElementReferenceException e) {
			attempts++;//retry locating the element
		}
		
	}
	
}

	public Amz_AddtoCart(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

}
