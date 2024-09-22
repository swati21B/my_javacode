package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_radio_isSelected {
//In the Learning HTML page, select the gender and confirm that if it is selected
	public static void main(String[] args) {
	
			ChromeDriver driver = new ChromeDriver();
			driver.get("file:///E:/Automation%20MKT/learningHTML1.html");
			driver.manage().window().maximize();
			WebElement radio=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
			radio.click();
			if(radio.isSelected())
			{
				System.out.println("Radio button is selected");
			}
			else
			{
				System.out.println("Radio button is not selected");
			}

	}

}
