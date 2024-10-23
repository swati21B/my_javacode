package poM.AmazonSource;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(xpath="//div[@class='two-pane-results-container']/div/div")
	List<WebElement> autosuggestion;
	
	
	
	public void searchproduct() throws InterruptedException
	{
		searchBox.sendKeys("babycare");
		Thread.sleep(2000);
		autosuggestion.get(3).click();
		
	}
	
	
	public SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
