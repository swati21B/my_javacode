package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HoverOver {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//locate the element
		WebElement Accounts =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions hover = new Actions(driver);//with the actions class invokes the constructor driver
		hover.moveToElement(Accounts).perform();
		Thread.sleep(2000);
		WebElement signin =driver.findElement(By.linkText("Sign in"));
		signin.click();
		WebElement UN =driver.findElement(By.xpath("//input[@name='email']"));
		UN.sendKeys("swatibodhale215@gmail.com");
		WebElement conti =driver.findElement(By.id("continue"));
		conti.click();
		WebElement PW =driver.findElement(By.name("password"));
		PW.sendKeys("12345678");
		WebElement button =driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		button.click();
		
	}

}
