package selenium_prog;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Handles_Links {
	static int countvalidURL =0;
	static int countinvalidURL =0;
	static int countHandledURL =0;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		List<WebElement> l1=driver.findElements(By.tagName("a"));
		int count=l1.size();
		System.out.println("Totalurl count->"+count);
		for(int i=0;i<count;i++)
		{
			WebElement e1=l1.get(i);
			String url=e1.getAttribute("href");
			//System.out.println(url);
			verify_each_links(url);
		}
		System.out.println("Count of valid url->"+countvalidURL);
		System.out.println("Count of invalid url->"+countinvalidURL);
		System.out.println("Count of handled url->"+countHandledURL);
	}
	static void verify_each_links(String url) throws IOException
	{
try {	
		URL u1=new URL(url);
		HttpURLConnection h1=(HttpURLConnection) u1.openConnection();
		
		if(h1.getResponseCode()==200)
		{
			System.out.println("It is a valid links " + h1.getResponseCode() + "  " +h1.getResponseMessage());
			countvalidURL++;
		}
		else
		{
			System.out.println("It is a broken links "+  h1.getResponseCode()+ " "+h1.getResponseMessage());
			countinvalidURL++;
		}
}
catch(MalformedURLException a1)
{
	System.out.println("It is a broken links-Handled");
	countHandledURL++;
}		
	}

}