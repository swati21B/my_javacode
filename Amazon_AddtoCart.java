package selenium_prog;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_AddtoCart {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Shoes"+Keys.ENTER);
		WebElement FirstShoe = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		FirstShoe.click();
		Set<String> w1 = driver.getWindowHandles();
// displays parent and child id first is parent and second can be any child id's as set does not follows indexing
		System.out.println(w1);
		//driver.close();// closes the window which has the control
//closing the parent window can not move auto control to child
//moving control from parent to child 
		Iterator<String> i1=w1.iterator();
		String parentID= i1.next();//parent window id
		String childID= i1.next();//any child window id
		System.out.println(parentID);
		System.out.println(childID);
		//moving control to child window
		driver.switchTo().window(childID);
		WebElement AddCart =driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		AddCart.click();
		
	}

}
