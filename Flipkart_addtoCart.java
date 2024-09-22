package selenium_prog;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_addtoCart {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.name("q"));
		e1.sendKeys("shoes"+Keys.ENTER);
		Thread.sleep(2000);
		WebElement firstShoe=driver.findElement(By.xpath("(//a[@class='rPDeLR'])[1]"));
		firstShoe.click();
		Set<String> d1=driver.getWindowHandles();
		System.out.println(d1);	
		Iterator<String> i1=d1.iterator();
		String parentid=i1.next();//parent id
		String childid=i1.next();//child id
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);//moved control to child window and now can perform action on window
		WebElement cart =driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
		cart.click();
		
	}

}
