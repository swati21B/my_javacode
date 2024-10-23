package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFacebook_RelativeXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		// relative xpath--> //tagname[@AN ='AV']
		WebElement username =driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("9881545633");
		WebElement password =driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("Test@123");
		WebElement login =driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
	}

}
