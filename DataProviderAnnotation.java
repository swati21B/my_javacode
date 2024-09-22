package dataProviderAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
//we can test same TC with multiple set of data with @DataProvider annotation
//First we create data with the method
	@DataProvider(name="data") //give name to the DataProvider
	public Object[][] amazon() //return type is 2 dimensional obj
	{
		return new Object[][] { {"shoes"},{"comb"},{"earrings"},{"brush"},{"himalaya cream"}};//returning the obj of the object class
	}
	@Test(dataProvider="data")
	public void search(String value) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Thread.sleep(2000);
		search.sendKeys(value +Keys.ENTER);
		Thread.sleep(2000);
		String PageTitle = driver.getTitle();
		Assert.assertTrue(PageTitle.contains(value), "The page title does not contain the search term!");
		driver.quit();
	}

}
