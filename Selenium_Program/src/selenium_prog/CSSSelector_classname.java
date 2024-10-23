package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector_classname {
	static WebDriver driver;
	public static void main (String args[])
	{
		driver = new ChromeDriver();
	    driver.get("https:\\www.google.com");
	    System.out.println(driver.getWindowHandles());
	    System.out.println(driver.getWindowHandle());
	    System.out.println(driver.getTitle());
	    driver.manage().window().maximize();
//	    driver.findElement(By.name("q")).sendKeys("India"); 
	    // ClassName syntax-->	.classnamevalue
	    driver.findElement(By.cssSelector(".gLFyf")).sendKeys("India"); 

	  
	} 

}
