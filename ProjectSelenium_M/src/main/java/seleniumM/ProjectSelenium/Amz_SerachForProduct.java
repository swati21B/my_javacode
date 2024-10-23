package seleniumM.ProjectSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Amz_SerachForProduct {
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(xpath="//div[@class='two-pane-results-container']/div/div")
	List<WebElement> autosuggestion;
	
	@FindBy(id="s-result-sort-select")
	WebElement drodownSortBy;
	
	@FindBy(id="searchDropdownBox")
	WebElement categoryDropdown;
	@FindBy(id="nav-search-submit-button")
	WebElement SearchButton;
	
	@FindBy(id="s-result-sort-select")
	WebElement sortBy;
	
	@FindBy(linkText="Gift Ideas")
	WebElement LinkGiftIdeas;
	
	public void searchproduct(WebDriver driver)
	{
		this.driver= driver;
		searchBox.sendKeys("soap for bath");
		autosuggestion.size();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(SearchButton));
		autosuggestion.get(2).click();
		Assert.assertEquals(drodownSortBy.isDisplayed(), true, "You are not navigate to search result page");
		
	}
	public void SelectCategory(WebDriver driver) throws InterruptedException
	{
		this.driver= driver;
		Select s1 = new Select(categoryDropdown);
		s1.selectByValue("search-alias=beauty");
		searchBox.sendKeys("kajal");
		Thread.sleep(1000);
		autosuggestion.size();
		autosuggestion.get(2).click();
		Assert.assertEquals(driver.getTitle(), "Amazon.in : kajal pencil", "Sorry, you are on wrong page");
	}
	public void sortByDropdown(WebDriver driver)
	{
		Select s2 = new Select(sortBy);
		s2.selectByVisibleText("Price: High to Low");
		Assert.assertEquals(LinkGiftIdeas.isDisplayed(),true, "Sorry, Gift Ideas link is not present");
		/*driver.navigate().refresh();
		s2.selectByIndex(3);//here index starts from 0
		driver.navigate().refresh();
		s2.selectByValue("s-result-sort-select_4");*/
	}
	public Amz_SerachForProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
