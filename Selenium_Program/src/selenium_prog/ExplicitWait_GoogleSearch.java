package selenium_prog;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_GoogleSearch {

	public static void main(String[] args) {
//explicit wait ensures that the webpages or websites loads properly and certain conditions are satisfied before actions are performed on them through test scripts.

		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleContains("Goo"));
	     wait.until(ExpectedConditions.titleIs("Google"));
//WebDriverWait is a class , Duration is a final class and wait is reference variable of WebDriverWait class
	     WebElement search= driver.findElement(By.name("q"));
	     search.sendKeys("India");
	     search.sendKeys(Keys.ENTER);
//Visibility Of Element Located - It is used to check whether the element which is present in the webpage through locator is visible or not
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[.='India']"))).click();


	}

}
