package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyUN_Paste {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement e1 =driver.findElement(By.name("fname"));
		e1.sendKeys("Teena");
		e1.sendKeys(Keys.CONTROL+"a");
		e1.sendKeys(Keys.CONTROL+"c");
		WebElement e2 =driver.findElement(By.name("lname"));
		e2.sendKeys(Keys.CONTROL+"v");
		

	}

}
