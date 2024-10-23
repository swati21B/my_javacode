package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector_Attribute {
	public static void main (String args[])
	{
	ChromeDriver driver = new ChromeDriver();
    driver.get("https:\\www.facebook.com");
    System.out.println(driver.getWindowHandles());
    System.out.println(driver.getWindowHandle());
    System.out.println(driver.getTitle());
    driver.manage().window().maximize();  
//Attribute syntax--> [AN='AV']
     driver.findElement(By.cssSelector("[id='email']")).sendKeys("username");  
    driver.findElement(By.cssSelector("[id='pass']")).sendKeys("Test@1234");
    driver.findElement(By.cssSelector("[name='login']")).sendKeys(Keys.ENTER);
  
    //driver.quit();
	}
}
