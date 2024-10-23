package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement Fashion =driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		Actions hoverover = new Actions(driver);
		hoverover.moveToElement(Fashion).perform();
		Thread.sleep(2000);
		WebElement link= driver.findElement(By.linkText("Men's T-Shirts"));
		link.click();
	}

}
