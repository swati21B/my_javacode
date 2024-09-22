package selenium_prog;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_BrokenLinks {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> e1=driver.findElements(By.tagName("a"));
		int count =e1.size();
		System.out.println("Total count of URL's->"+count);
		
		for(int i=0;i<count;i++)
				{
				WebElement a1=e1.get(i);//to get url at specified index
				String url= a1.getAttribute("href");//Get the URL that a link (<a> tag) is pointing to using the href attribute.

				System.out.println("All url's->"+url);
				if(url != null && !url.isEmpty()) {
				VerifyEachLink(url);
				}
				else {
	                System.out.println("Broken Link found.");
	            }

				}
        driver.quit();

	}
// Method to check the validity of each link
	static void VerifyEachLink(String url) throws IOException
	{
/*URL class has several constructors which creates a URL object from a string that specifies the URL. 
The url string should be a well-formed URL. 
If the string is not a valid URL constructor will throw a MalformedURLException*/
		
		// Create a URL object from the string
		URL u1= new URL(url);
//now method can be called with URL object u1
//This u1 object can then be used to open a connection, retrieve data, or perform other network-related tasks. 
//openConnection() method returns a URLConnection object, which is a generic class that can handle different types of connections.
		//URLConnection c1=u1.openConnection();
/*To use HTTP-specific features (like setting request methods or handling HTTP response codes), we need to cast the generic URLConnection object to HttpURLConnection.
This casting tells the compiler that you expect the URLConnection to be an HttpURLConnection, which allows you to call methods specific to HTTP connections.*/
		// Open a connection to the URL
	
		HttpURLConnection h1=(HttpURLConnection) u1.openConnection();
	}

}
