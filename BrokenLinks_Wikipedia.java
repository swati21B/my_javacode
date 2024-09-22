package selenium_prog;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_Wikipedia {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		List<WebElement> e1=driver.findElements(By.tagName("a"));
		int count=e1.size();
		System.out.println(count);
		ListIterator<WebElement> l1= e1.listIterator();
		while(l1.hasNext())
		{
		WebElement e2=  l1.next();
		String url =e2.getAttribute("href");
		System.out.println("All url's->"+url);
		if(url != null && !url.isEmpty()) {
		VerifyEachLink(url);
		}
		else {
            System.out.println("Link with no href found.");
        }
		}	
	}
	static void VerifyEachLink(String url) throws IOException
	{
		URL u1= new URL(url);
		HttpURLConnection h1= (HttpURLConnection) u1.openConnection();
	}

}
