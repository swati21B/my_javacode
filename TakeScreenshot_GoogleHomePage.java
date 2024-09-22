package selenium_prog;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot_GoogleHomePage {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		//step1: Upcasting from driver to TakeScreenshot interface
		TakesScreenshot t1=driver;
		//Step2:Take the screenshot with it's methods
		File source =t1.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		//Step3: Create obj of File class & invoke it's constructor
		File f1= new File("C:\\Users\\SwatiBodhale\\eclipse-workspace\\Screenshots\\Ram"+".png");
		//Step4: Copy the file from source to destination
		FileHandler.copy(source, f1);

	}

}
