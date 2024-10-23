package seleniumM.AirlineProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FlightDetails {
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='_7c598c35 colorLink d7c291ce']")
	WebElement addAdult;

	@FindBy(xpath="//li[.='Female']")
	WebElement Gender;

	@FindBy(id="input-first_name")
	WebElement Fname;

	@FindBy(id="input-last_name")
	WebElement Lname;

	@FindBy(xpath="//button[.='Add adult']")
	WebElement AddAdultButton;
	
	@FindBy(xpath="//button[@class='_7e41f983 bba41d3c  _50baedd0  ada8b185 _6b9247a2']")
	WebElement ProceedwithSeatSelection;
	
	@FindBy(xpath="(//div[@class='_0d462540  _1b6b90e5  '])[135]")
	WebElement SelectSeat;
	
	@FindBy(xpath="(//div[@class='_0d462540  _1b6b90e5  '])[50]")
	WebElement SelectSeatBOM;
	
	@FindBy(xpath="(//div[.='Skip seat selection'])[1]")
	WebElement SkipSeatSelectionLink;
	
	@FindBy(xpath="//button[.='Select']")
	WebElement SelectClickGender;
	
	@FindBy(xpath="//button[@class='_7e41f983 bba41d3c  _50baedd0  ada8b185 _6b9247a2']")
	WebElement ClickonNext;
	
	public void ProceedwithSeat()
	{
		ClickonNext.click();
	}
	
	public void SelectSeatBOM()
	{
		SelectSeatBOM.click();
	}
	
	public void SelectClickGender()
	{
		SelectClickGender.click();
	}
	
	public void VerifySkipSelectionLink()
	{
		Assert.assertEquals(SkipSeatSelectionLink.isDisplayed(), true, "Sorry, skip selection link is not present");
	}
	
	
	public void addNewAdult()
	{
		addAdult.click();
	}
	public void AddGender()
	{
		Gender.click();
	}

	public void P1FirstName()
	{
		Fname.sendKeys("Teena");
	}

	public void P1LastName()
	{
		Lname.sendKeys("Bodhale");
	}

	public void AddAdultButton()
	{
		AddAdultButton.click();
	}

	public void P2FirstName()
	{
		Fname.sendKeys("Swara");
	}

	public void P2LastName()
	{
		Lname.sendKeys("Bodhale");
	}
	public void ProceedwithSeatSelection() throws InterruptedException
	{
		Thread.sleep(1000);
		ProceedwithSeatSelection.click();
	}
	
	public void SelectSeat()
	{
		SelectSeat.click();
	}
	public void ClickonSkipSelection()
	{
		SkipSeatSelectionLink.click();
	}
	
	
	public FlightDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
