package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformanAction_if_fields_isDisplayed {
//In the HTML page, perform an action on the last name only if it is displayed and enabled 
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///E:/Automation%20MKT/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement LastName=driver.findElement(By.xpath("//input[@name='lname']"));
		if(LastName.isDisplayed())
		{
			System.out.println("Field is visible");
		
		if(LastName.isEnabled())
		{
			System.out.println("field is enable and type last name");
			LastName.sendKeys("Bodhale");
		}
		else
		{
			System.out.println("field is disabled");
		}
		
		}
	}

}
