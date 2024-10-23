package selenium_prog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks_LinkTextMsg_withForLoop {
//Launch Amazon, print all it's links. Also, the linktext messages of these links
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		List<WebElement> l1=driver.findElements(By.tagName("a"));
		int countofLinks =l1.size();
		System.out.println("Total links->"+countofLinks);
		for(int i=0;i<countofLinks;i++)
		{
			WebElement e1=l1.get(i);//return the element at specified position
			String url=e1.getAttribute("href");
			String linkText =e1.getText();
			System.out.println("LinkText->"+linkText);
			System.out.println("link->"+url);
		}
		
driver.quit();
	}

}
