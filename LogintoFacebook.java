package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoFacebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("8149472499");
		driver.findElement(By.name("pass")).sendKeys("Swati@215");
		driver.findElement(By.name("login")).click();

	}

}
