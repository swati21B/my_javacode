package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_AutoSugg_thenSearch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(e1);
		s1.selectByVisibleText("Books");
		Thread.sleep(2000);
		WebElement e2= driver.findElement(By.id("twotabsearchtextbox"));
		e2.sendKeys("minds"+Keys.ENTER);
		Thread.sleep(2000);

	}

}
