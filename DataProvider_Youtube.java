package dataProviderAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Youtube {
	@DataProvider(name="names")
	public Object[][] youtubesearchvalues()
	{
		return new Object[][] {{"MKT"},{"Testing"},{"Java"},{"Selenium"},{"SQL"}};
	}

	@Test(dataProvider="names")
	public void youtubesearch(String values) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@name='search_query']"));
		search.sendKeys(values);
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		//driver.quit();
	}

}
