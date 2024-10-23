package selenium_prog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneMG_HandleAutoSuggestion {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.1mg.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("srchBarShwInfo"));
		e1.sendKeys("Cholestrol");
		List<WebElement>e2 =driver.findElements(By.xpath("//div[@class='styles__search-results-container___3OUHy']/ul/li"));
		int count=e2.size();
		System.out.println(count);
		e2.get(count-8).click();
	}

}
