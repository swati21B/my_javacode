package selenium_prog;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Methods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
