package poM.AmazonSource;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCart_ProceedPayment {
	WebDriver driver;

	//scenario: Login to amaozn->seaching->wsihlist->cart->payment option selection Credit card
@FindBy(id="add-to-cart-button")
WebElement addtoCart;

@FindBy(name="proceedToRetailCheckout")
WebElement ProceedCheckout;

@FindBy(name="submissionURL")
WebElement Add_radiobutton;

@FindBy(xpath="(//input[@class='a-button-input'])[2]")
WebElement UseThisAddressButton;

@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
WebElement PaymentMethod;

@FindBy(linkText="Enter card details")
WebElement cardDetails;


public void AddtoCart(WebDriver driver) throws InterruptedException
{
	Set<String> w1 = driver.getWindowHandles();
	Iterator<String> i1=w1.iterator();
	String parentID= i1.next();//parent window id
	String childID= i1.next();//any child window id
	System.out.println(parentID);
	System.out.println(childID);
	//moving control to child window
	driver.switchTo().window(childID);
	Thread.sleep(2000);
	addtoCart.click();
}
public void Checkout() throws InterruptedException
{
	Thread.sleep(2000);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	ProceedCheckout.click();
}
public void address() throws InterruptedException
{
	if(Add_radiobutton.isSelected())
	{
		UseThisAddressButton.click();
		Thread.sleep(2000);
	}
	
}
public void PayMethods()
{
	
	PaymentMethod.click();
}
public void EnterCard_D()
{
	
	cardDetails.click();
}


public AddtoCart_ProceedPayment(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}

