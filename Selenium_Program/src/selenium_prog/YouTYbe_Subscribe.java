package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTYbe_Subscribe {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@name='search_query']"));
		search.sendKeys("grotech minds");
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement subscribe =driver.findElement(By.partialLinkText("Subscribe"));
		Thread.sleep(2000);
		subscribe.click();
	}

}
