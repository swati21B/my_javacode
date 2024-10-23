package selenium_prog;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver c1 = new ChromeDriver();
	c1.get("https://www.google.co.in/");
	Thread.sleep(5000);
	c1.manage().window().maximize();
	//c1.manage().window().minimize();

	}

}
