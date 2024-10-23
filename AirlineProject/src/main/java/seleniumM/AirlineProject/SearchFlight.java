package seleniumM.AirlineProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchFlight {
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(linkText="Book flight tickets")
	WebElement BookFlightTickets;
	
	@FindBy(xpath="(//span[@class=\"_76efd884 sizeMini colorTertiary\"])[1]")
	WebElement source;
	@FindBy(xpath="//p[.='New Delhi']")
	WebElement sourceCity;
	
	@FindBy(xpath="(//span[@class='_76efd884 sizeMini colorTertiary'])[2]")
	WebElement destination;
	
	@FindBy(xpath="//p[.='Mumbai']")
	WebElement destinationCity;
	
	@FindBy(xpath="(//span[.='18'])[1]")
	WebElement DateOfTravel;
	
	@FindBy(xpath="(//span[.='19'])[1]")
	WebElement DateOfTravel2;
	
	@FindBy(xpath="(//span[.='20'])[1]")
	WebElement DateOfTravel3;
	
	@FindBy(xpath="(//button[.='2'])[1]")
	WebElement NumofTraveller;
	
	@FindBy(xpath="(//button[.='1'])[1]")
	WebElement SinglePasseneger;
	
	@FindBy(xpath="(//i[@class='_4b539ab8'])[3]")
	WebElement EconomyClass;
	
	
	@FindBy(xpath="(//button[.='Search'])[1]")
	WebElement searchButton;
	
	@FindBy(xpath="//button[.='Clear all']")
	WebElement FilterClearAll;
	
	@FindBy(xpath="//span[.='Round Trip']")
	WebElement radioRoundTrip;
	
	@FindBy(xpath="(//span[.='27'])[1]")
	WebElement ReturnDate;	
	
	@FindBy(xpath="(//span[.='Premium Economy'])[2]")
	WebElement PremEconomy;	
	
	@FindBy(xpath="//span[.='Premium Economy']")
	WebElement BackPremEconomy;	
	
	@FindBy(xpath="//span[.='Business']")
	WebElement Businessclass;	
	
	@FindBy(xpath="(//button[.='Book'])[1]")
	WebElement BookButton;
	
	
	public void SinglePasseneger()
	{
		SinglePasseneger.click();
	}
	
	public void searchforticketBooking()
	{
		searchBox.sendKeys("airline tickets booking" +Keys.ENTER);
		BookFlightTickets.click();
	}
	
	public void searchSource(WebDriver driver) throws InterruptedException
	{
		
		source.click();
		Thread.sleep(1000);
		sourceCity.click();
			//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			//wait.until(ExpectedConditions.visibilityOf(source));
			//Thread.sleep(1000);
		
		
	}
	public void searchDestination(WebDriver driver)
	{
		//destination.click();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOf(destination));
		destinationCity.click();
		
	}
	public void travelDate() throws InterruptedException
	{
		Thread.sleep(1000);
		DateOfTravel.click();
	}
	
	public void travelDate2() throws InterruptedException
	{
		Thread.sleep(1000);
		DateOfTravel2.click();
	}
	public void travelDate3() throws InterruptedException
	{
		Thread.sleep(1000);
		DateOfTravel3.click();
	}
	
	public void ReturnDate()
	{
		ReturnDate.click();
	}
	public void NumofTraveller() throws InterruptedException
	{
		Thread.sleep(1000);
		NumofTraveller.click();
	}
	public void EconomyClass()
	{
		EconomyClass.click();
	}
	
	public void searchButton()
	{
		searchButton.click();
		Assert.assertEquals(FilterClearAll.isDisplayed(), true, "You are not redirected to search result page");
	}
	public void radioRoundTrip()
	{
		radioRoundTrip.click();
	}	
	
	public void PremEconomyBusiness(WebDriver driver)
	{
		BackPremEconomy.click();
		Assert.assertEquals(driver.getTitle(), "Flight Bookings on Amazon", "Sorry, search result page is not displayed");
	}	
	
	public void Businessclass()
	{
		Businessclass.click();
		
	}
	public void VerifyBusinessClasspage()
	{
		Assert.assertTrue(BookButton.isDisplayed(), "You are not selected with business class");
	}
	
	
	
	public SearchFlight(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
