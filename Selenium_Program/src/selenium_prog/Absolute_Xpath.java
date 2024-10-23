package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
			driver.get("file:///E:/Automation%20MKT/learningHTML1.html");	
			driver.manage().window().maximize();
			WebElement username= driver.findElement(By.xpath("(/html/body/input)[1]"));
			username.sendKeys("Swati");
			WebElement hint= driver.findElement(By.xpath("(/html/body/input)[2]"));
			hint.sendKeys("Test");
			WebElement password= driver.findElement(By.xpath("(/html/body/input)[3]"));
			password.sendKeys("Swati123");
			WebElement Fname= driver.findElement(By.xpath("(/html/body/form/input)[1]"));
			Fname.sendKeys("Teena");
			WebElement Boy= driver.findElement(By.xpath("(/html/body/form/input)[4]"));
			Boy.click();
			WebElement Gender= driver.findElement(By.xpath("(/html/body/input)[5]"));
			Gender.click();
			WebElement relocate= driver.findElement(By.xpath("(/html/body/input)[6]"));
			relocate.click();
			WebElement link =driver.findElement(By.linkText("Click to know about us"));
			link.click();		
	}

}
