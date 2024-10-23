package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector_ID {
	public static void main (String args[])
	{
	ChromeDriver driver = new ChromeDriver();
    driver.get("https:\\www.facebook.com");
    System.out.println(driver.getWindowHandles());
    System.out.println(driver.getWindowHandle());
    System.out.println(driver.getTitle());
    driver.manage().window().maximize();  
//ID syntax-->	#idvalue
     driver.findElement(By.cssSelector("#email")).sendKeys("username");  //If ID does not work, so take name
    driver.findElement(By.cssSelector("#pass")).sendKeys("******");
    driver.findElement(By.xpath("//button[@name='login']")).sendKeys(Keys.ENTER);
  
    driver.quit();
	}
}
