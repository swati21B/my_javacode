package dataProviderAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Google {
	@DataProvider(name ="data1")
	public Object[][] searchvalues()
	{
		return new Object[][] {{"Math"},{"Java"},{"Jack"}};
	}
	@Test(dataProvider="data1")
	public void googlesearch(String values) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys(values+Keys.ENTER);
		
		
	}

}
