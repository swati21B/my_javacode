package seleniumM.AirlineProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Payment_page {
	
	WebDriver driver;

	@FindBy(xpath="//i[@class='d726bd8f _4d2636f0']")
	WebElement termsCheckbox;

	@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
	WebElement CreditDebit;
	
	@FindBy(name="ppw-accountHolderName")
	WebElement NickName;
	
	@FindBy(name="addCreditCardNumber")
	WebElement CardNumber;
	
	@FindBy(xpath="//button[.='Proceed to Payment']")
	WebElement ProceedtoPayment;
	
	@FindBy(xpath="(//span[@class='a-button-text a-declarative'])[1]")
	WebElement SelectMonthClick;
	
	@FindBy(xpath="//a[.='06']")
	WebElement month;
	@FindBy(xpath="(//span[@class='a-button-text a-declarative'])[2]")
	WebElement SelectYearClick;
	
	@FindBy(xpath="//a[.='2026']")
	WebElement year;
	
	@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	WebElement EnterCardDetails;
	
	@FindBy(xpath="//input[@id='pp-FEpadb-101']")
	WebElement EnterCVV;
	@FindBy(xpath="//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent']")
	WebElement FinalPay;
	
	public void FinalPay()
	{
		FinalPay.click();
	}
	
	public void SubmitCardDetails()
	{
		EnterCardDetails.click();
	}
	
	public void CVV()
	{
		EnterCVV.sendKeys("455");
		
	}
	
	public void termsCheckbox()
	{
		termsCheckbox.click();
	}

	public void ProceedtoPayment()
	{
		ProceedtoPayment.click();
	}
	public void PayMethods() throws InterruptedException
	{
		Thread.sleep(3000);
		CreditDebit.click();
	}
	
	public void CardDetails()
	{
		NickName.clear();
		NickName.sendKeys("Swati Wandhare");
	}
	
	public void CardNumber()
	{
		CardNumber.sendKeys("5425233430109903");
	}
	public void SelectMonthClick()
	{
		SelectMonthClick.click();
		month.click();
	}
	public void SelectYearClick()
	{
		SelectYearClick.click();
		year.click();
	}
	
	public Payment_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
