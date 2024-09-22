package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type_if_field_isEnabled {

	public static void main(String[] args) {
//Launch the google page, type "India" in the search field only if the search bar is visible and enabled
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement search =driver.findElement(By.xpath("//textarea[@name='q']"));
		if(search.isDisplayed()&&search.isEnabled())
		{
			search.sendKeys("India");
		}
		else
		{
			System.out.println("Field is not enabled");
		}
		driver.quit();
	}

}
