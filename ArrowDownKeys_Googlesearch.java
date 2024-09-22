package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrowDownKeys_Googlesearch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement textbox =driver.findElement(By.id("APjFqb"));
		textbox.sendKeys("India");
		Thread.sleep(3000);
		/*textbox.sendKeys(Keys.ARROW_DOWN);
		textbox.sendKeys(Keys.ARROW_DOWN);
		textbox.sendKeys(Keys.ENTER);*/
	
		textbox.sendKeys(Keys.ARROW_DOWN+""+Keys.ARROW_DOWN+ Keys.ENTER);
		

	}

}
