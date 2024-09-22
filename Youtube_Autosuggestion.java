package selenium_prog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.name("search_query"));
		e1.sendKeys("modi");
		Thread.sleep(8000);
		List<WebElement> e2= driver.findElements(By.xpath("(//div[@class='sbsb_a']/ul/li)"));
		int count=e2.size();
		System.out.println(count);
		//Thread.sleep(3000);
		e2.get(count-3).click();
		
		

	}

}
