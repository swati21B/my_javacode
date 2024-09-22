package selenium_prog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_FindElements {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("recipes");
		Thread.sleep(1000);
		List<WebElement> e2= driver.findElements(By.xpath("(//div[@class='OBMEnb']/ul/li)"));	
		int count =e2.size();
		System.out.println(count);
		//clicking on 5th auto suggest
		e2.get(4).click();//to get 5th component
		
		
	}

}
