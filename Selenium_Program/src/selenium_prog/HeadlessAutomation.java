package selenium_prog;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessAutomation {
	
	public static void main(String[] args) 
	{
//Headless browser automation refers to the testing of software applications in browsers that have no user interface(UI).
//headless browser performs all the operations similar to the normal browser like navigation to web pages, clicking on links, uploading and downloading of files, etc in the absence of UI. Since we are unable to see the UI in Headless automation so all the testing activities happen at the back end.

//create instance of ChromeOptions class
ChromeOptions options = new ChromeOptions();
// with it's method addArguments pass the parameter as "--headless"
options.addArguments("--headless");
//create instance of ChromeDriver by passing parameter as options to run the browser in headless mode
ChromeDriver driver = new ChromeDriver(options);
	
	}

}
