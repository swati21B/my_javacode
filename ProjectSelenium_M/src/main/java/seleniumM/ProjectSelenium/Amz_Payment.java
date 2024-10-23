package seleniumM.ProjectSelenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_Payment {
	WebDriver driver;

@FindBy(name="proceedToRetailCheckout")
WebElement ProceedCheckout;

@FindBy(name="submissionURL")
WebElement Add_radiobutton;

@FindBy(xpath="(//input[@class='a-button-input'])[2]")
WebElement UseThisAddressButton;

@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
WebElement CreditDebit;

@FindBy(xpath="//input[@value='instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false']")
WebElement NetBanking;

@FindBy(xpath="//input[@value='instrumentId=amzn1.pm.poa.YW16bjEucG9hOmFtem4xLnBvYS5wb2RhLlVuaWZpZWRQYXltZW50c0ludGVyZmFjZTox.QTNVTlJTVzRCQ0o2SFg&isExpired=false&paymentMethod=UnifiedPaymentsInterface&tfxEligible=false']")
WebElement OtherUPI;

@FindBy(xpath="//input[@value='instrumentId=EMI&isExpired=false&paymentMethod=CC&tfxEligible=false']")
WebElement EMI;


@FindBy(xpath="//a[.='Enter card details']")
WebElement cardDetails;

@FindBy(name="ApxSecureIframe")
WebElement iframe;

@FindBy(name="addCreditCardNumber")
WebElement CardNumber;

@FindBy(name="ppw-accountHolderName")
WebElement NickName;

@FindBy(name="ppw-expirationDate_month")
WebElement ExpiryDate;

@FindBy(name="ppw-expirationDate_year")
WebElement ExpiryYear;

@FindBy(xpath="(//span[.='Enter card details'])[1]")
WebElement EnterCardDetails;

@FindBy(xpath="//input[@id='field']")
WebElement EnterCVV;

@FindBy(name="apx-secure-field-addCreditCardVerificationNumber")
WebElement IframeCVV;


@FindBy(xpath="(//input[@class='a-button-input'])[7]")
WebElement UseThisPayment;

@FindBy(name="secureDataHandler")
WebElement iframe2;

@FindBy(xpath="(//span[.='Save card & continue'])[1]")
WebElement SaveCardContinue;

@FindBy(xpath="(//input[@name='submissionURL'])[2]")
WebElement radioaddress;

@FindBy(xpath="//span[@id='orderSummaryPrimaryActionBtn-announce']")
WebElement UseAddress;

@FindBy(xpath="//span[@id='spcViewButtonId-announce']")
WebElement ReviewOrderbutton;

public void Checkout() throws InterruptedException
{
	Thread.sleep(2000);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	ProceedCheckout.click();
}
public void address()
{
	if(Add_radiobutton.isSelected())
	{
		UseThisAddressButton.click();
	}
	
}
public void PayMethods() throws InterruptedException
{
	Thread.sleep(3000);
	CreditDebit.click();
}
public void EnterCard_D(WebDriver driver) throws InterruptedException
{
	Thread.sleep(2000);
	/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(cardDetails));*/
	cardDetails.click();
}
public void cardDetails(WebDriver driver)
{
	driver.switchTo().frame(iframe);
	/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(CardNumber));*/
	CardNumber.sendKeys("5425233430109903");
	NickName.sendKeys(Keys.CONTROL+"a" +Keys.BACK_SPACE);
	NickName.sendKeys("Swati Bodhale");
	driver.switchTo().defaultContent();
}

public void expiryDateYear()
{
	Select s1 = new Select(ExpiryDate);
	s1.selectByVisibleText("4");
	Select s2 = new Select(ExpiryYear);
	s2.selectByValue("2026");
}

public void SubmitCardDetails()
{
	EnterCardDetails.click();
}

public void CVV()
{
	driver.switchTo().frame(IframeCVV);
	EnterCVV.sendKeys("455");
	driver.switchTo().defaultContent();
}

public void PaymentSubmit()
{
	UseThisPayment.click();
}

public void SaveTheCard(WebDriver driver)
{
	driver.switchTo().frame(iframe2);
	SaveCardContinue.click();
	driver.switchTo().defaultContent();
}

public void UseAddress(WebDriver driver)
{
	radioaddress.click();
	UseAddress.click();
	ReviewOrderbutton.click();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    boolean isUrlCorrect =    wait.until(ExpectedConditions.urlMatches("amazon"));

    System.out.println(isUrlCorrect);

}

public void callEachPayment() throws InterruptedException
{
	Thread.sleep(2000);
	CreditDebit.click();
	NetBanking.click();
	OtherUPI.click();
	EMI.click();
}

public Amz_Payment(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
