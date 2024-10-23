package selenium_prog;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {
	@Test
	public void test()
	{
		ChromeDriver driver = new ChromeDriver();
		Wait<ChromeDriver> w1 = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class, TimeoutException.class);
		
		
	}

}
