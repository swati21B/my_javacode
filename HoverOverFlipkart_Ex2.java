package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOverFlipkart_Ex2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement HomeFurni =driver.findElement(By.xpath("(//span[.='Home & Furniture'])[2]"));
		Actions hoverOver= new Actions(driver);
		hoverOver.moveToElement(HomeFurni).perform();
		Thread.sleep(2000);
		WebElement HomeDecor= driver.findElement(By.linkText("Home Decor"));
		Actions hover = new Actions(driver);
		hover.moveToElement(HomeDecor).perform();
		Thread.sleep(2000);
		WebElement clock =driver.findElement(By.linkText("Clocks"));
		clock.click();
	}

}
