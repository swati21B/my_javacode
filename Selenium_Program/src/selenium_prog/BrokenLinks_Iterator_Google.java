package selenium_prog;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_Iterator_Google {
	WebDriver driver;
	
	public void brokenLinks()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println("all url's->"+count);
		
		Iterator<WebElement> i1=links.iterator();
		while(i1.hasNext())
		{
			WebElement eachLink=i1.next();
			String url=eachLink.getAttribute("href");
			//all the links will have one thing in common that is their attribute name href
			verify_links(url);
			//calling  a method called verify_links
			System.out.println(url);
		}
		public static void verify_links(String url) throws IOException
		{
			URL ul = new URL(url);
	//Creating an Object of URL class
			HttpURLConnection c = (HttpURLConnection) ul.openConnection();
	//upcasting to HttpURLConnection Interface
			c.connect();
			if(c.getResponseCode() == 200)
			{
				System.out.println(c.getResponseCode()+" -> "+c.getResponseMessage()+" -> "+"Link is valid");
			}
			else
			{
				System.out.println(c.getResponseCode()+" -> "+c.getResponseMessage()+" -> "+"Link is Invalid");
			}
		}
	
	}
	

}
