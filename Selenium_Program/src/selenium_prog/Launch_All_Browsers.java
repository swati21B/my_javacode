package selenium_prog;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Launch_All_Browsers {

	public static void main(String[] args) {
		
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.google.co.in/");
		FirefoxDriver f1=new FirefoxDriver();
		f1.get("https://www.google.co.in/");
		//SafariDriver s1=new SafariDriver();
		//s1.get("https://www.google.co.in/");
		EdgeDriver e1=new EdgeDriver();
		e1.get("https://www.google.co.in/");
		InternetExplorerDriver ie1=new InternetExplorerDriver();
		ie1.get("https://www.google.co.in/");

	}

}
