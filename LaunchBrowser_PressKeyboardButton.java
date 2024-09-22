package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_PressKeyboardButton {

	public static void main(String[] args) {
		// Launch google> type India>press keyboard enter button
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://google.com");
		cd.manage().window().maximize();
		cd.findElement(By.name("q")).sendKeys("India");
		cd.findElement(By.name("q")).sendKeys(Keys.ENTER);
		

	}

}
