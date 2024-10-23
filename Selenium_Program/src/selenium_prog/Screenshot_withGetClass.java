package selenium_prog;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_withGetClass {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
//Upcasting driver to TakesScreenshot interface
TakesScreenshot t1 = driver;
//take screenshot with it's method		
File f1= t1.getScreenshotAs(OutputType.FILE);
//new keyword in Java is used to instantiate a new object. creates a new instance of the getWindow_handle class.
//getClass() method is a final method defined in the Object class, which is the superclass of all Java classes. It returns the name of the class
File SS = new File("C:\\Users\\SwatiBodhale\\eclipse-workspace\\Selenium_Program\\src\\Screenshots\\GetClass\\GET"+ new Screenshot_withGetClass().getClass()+".png");

FileHandler.copy(f1, SS);

	}

}
