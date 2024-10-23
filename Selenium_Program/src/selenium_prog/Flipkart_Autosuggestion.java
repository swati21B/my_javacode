package selenium_prog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.name("q"));
		e1.sendKeys("shoes");
		Thread.sleep(4000);
		List<WebElement> e2= driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		int count =e2.size();
		System.out.println(count);
		Thread.sleep(3000);
		e2.get(count-5).click();
		

	}

}
