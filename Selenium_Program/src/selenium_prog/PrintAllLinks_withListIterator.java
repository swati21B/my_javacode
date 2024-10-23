package selenium_prog;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks_withListIterator {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> l1= driver.findElements(By.tagName("a"));
		int count= l1.size();
		System.out.println(count);
		
		ListIterator<WebElement> LI = l1.listIterator();
		while(LI.hasNext())
		{
			WebElement e1=  LI.next();
			String url=e1.getAttribute("href");
			String linkText=e1.getText();
			System.out.println("Link Text: "+linkText);
			System.out.println("URL: "+url);
			
		}
	}

}
