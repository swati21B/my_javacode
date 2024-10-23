package seleniumM.AirlineProject;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import seleniumM.AirlineProject.ListenerLogicforScreenshots;

@Listeners(seleniumM.AirlineProject.ListenerLogicforScreenshots.class)
public class LaunchandQuit extends ListenerLogicforScreenshots{
	@BeforeMethod
	//@Parameters("browser")
	//public void Launch(String nameofbrowser)
	//{
		public void Launch()
		{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*if(nameofbrowser.equals("chrome"));
		{
			driver= new ChromeDriver();
		}
		if(nameofbrowser.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		*/
	}
	@AfterMethod
	public void quit()
	{
		//driver.quit();
	}
}
