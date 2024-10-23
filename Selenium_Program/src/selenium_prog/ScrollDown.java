package selenium_prog;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ScrollDown {
		
			   WebDriver driver;
			   @Test
			   public void Launch_Browser() throws InterruptedException
			   {
				   driver = new ChromeDriver();
				   driver.get("https://www.amazon.in");
				//   driver.manage().window().maximize();
				   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement e1=	   driver.findElement(By.linkText("About Amazon"));
				Point p1=   e1.getLocation();
				int x=   	p1.getX();
				  int y= 	p1.getY();
				   System.out.println(x);
				   System.out.println(y);
				   Thread.sleep(2000);
//upcasting from driver to JavascriptExecutor Interface
				 JavascriptExecutor js=  		(JavascriptExecutor) driver;
//Utilising JavascriptExecutor method executeScript
				   js.executeScript("window.scrollBy(0,"+y+")");
				   
}

}
	