package selenium_prog;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Valid_Invalid_Links {
	static int countvalidURL =0;
	static int countinvalidURL =0;
	
	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> e1= driver.findElements(By.tagName("a"));
		int count=e1.size();
		System.out.println("Total count of URL's->"+count);
		
		for(int i=0;i<count;i++)
		{
			WebElement a1= e1.get(i);
			String url=a1.getAttribute("href");
			System.out.println("All url's->"+url);
			VerifyEachLink(url);
			
		}
		System.out.println("Count of valid url->"+countvalidURL);
		System.out.println("Count of invalid url->"+countinvalidURL);
		
	}
	static void VerifyEachLink(String url) throws IOException
	{
		URL u1 = new URL(url);
		HttpURLConnection h1= (HttpURLConnection) u1.openConnection();
		
		if(h1.getResponseCode()==200)
		{
			System.out.println("Valid link");
			countvalidURL++;
		}
		else
		{
			System.out.println("Broken link");
			countinvalidURL++;
		}
		
		
	}

}
