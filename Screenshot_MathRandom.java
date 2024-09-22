package selenium_prog;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_MathRandom {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//upcasting
		TakesScreenshot s1= driver;
		//take SS with it's method
		File mySS=s1.getScreenshotAs(OutputType.FILE);
		//Create obj of File class to invoke constructor
		File f1= new File("C:\\Users\\SwatiBodhale\\eclipse-workspace\\Selenium_Program\\src\\Screenshots\\SWA"+Math.random()+".png");
		//copy SS to destination
		FileHandler.copy(mySS, f1);
	}

}
