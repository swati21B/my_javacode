package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoFacebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("9852635522");
		driver.findElement(By.name("pass")).sendKeys("Test@2222");
		driver.findElement(By.name("login")).click();

	}

}
