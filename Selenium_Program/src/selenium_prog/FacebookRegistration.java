package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistration {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		WebElement firstName =driver.findElement(By.name("firstname"));
		firstName.sendKeys("Trisha");
		WebElement SurName =driver.findElement(By.name("lastname"));
		SurName.sendKeys("Shahu");
		WebElement MobNum =driver.findElement(By.name("reg_email__"));
		MobNum.sendKeys("9881466366");
		WebElement Password =driver.findElement(By.id("password_step_input"));
		Password.sendKeys("Trynum@2024");
		
		
	}

}
