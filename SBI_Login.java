package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_Login {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		login.click();
		WebElement Username = driver.findElement(By.name("userName"));
		Username.sendKeys("TestABCD");
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("123456789");
		WebElement button = driver.findElement(By.id("Button2"));
		button.click();

	}

}
