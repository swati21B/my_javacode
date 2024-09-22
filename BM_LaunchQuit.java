package amazon_practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BM_LaunchQuit {
	ChromeDriver driver;
@BeforeMethod
public void Launch()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
}
@AfterMethod
public void quit()
{
	driver.quit();
}
}
