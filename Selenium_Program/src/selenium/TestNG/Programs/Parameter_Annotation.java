package selenium.TestNG.Programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Annotation {
	WebDriver driver;
	
//cross browser testing running the browsers one by one
//parallel testing running the test case parallelly in all browsers at the same time
@Test
@Parameters("browser")
	public void testcase1(String nameofbrowser)
	{
	if(nameofbrowser.equals("chrome"))
	{
		driver = new ChromeDriver();
	}
	if(nameofbrowser.equals("firefox"))
	{
		driver = new FirefoxDriver();
	}
	if(nameofbrowser.equals("edge"))
	{
		driver = new EdgeDriver();
	}
	
	//upcasting from chromedriver to WebDriver interface
	//WebDriver interface provide flexibility to launch any browsers
		 
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Shoes"+Keys.ENTER);
		
	}
}
