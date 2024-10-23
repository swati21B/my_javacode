package selenium_prog;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_withCurrentTime {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Date d1 = new Date();
		d1.getTime();//epoch time machine understandable
		Date d2 = new Date(d1.getTime());
		System.out.println("Human undestandable time->"+d2);
		String Time= d2.toString().replace(":","").replace(" ","");
		System.out.println(Time);
		//upcasting from drive to TakesScreenShot
		TakesScreenshot s1= driver;
		//capture screenshot with it's method
		File f1=s1.getScreenshotAs(OutputType.FILE);
		//instance of file class
		File SS1= new File("C:\\Users\\SwatiBodhale\\eclipse-workspace\\Selenium_Program\\src\\Screenshots\\Current Time\\teena"+Time+".png");
		FileHandler.copy(f1,SS1);
		

	}

}
