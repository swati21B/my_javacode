package fb_parallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC1_FacebookLaunch {
WebDriver driver;
@Test
@Parameters("browser")
public void fblaunch(String nameofbrowser)
{
	if(nameofbrowser.equals("chrome"))
	{
		driver = new ChromeDriver();
	}
	if(nameofbrowser.equals("firefox"))
	{
		driver = new FirefoxDriver();
	}
	if(nameofbrowser.equals("edge"))
	{
		driver = new EdgeDriver();
	}
	driver.get("https://www.facebook.com/");
}
}
