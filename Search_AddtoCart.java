package amazon_practical;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Search_AddtoCart extends BM_LaunchQuit{
	//ChromeDriver driver;
	@Test
	public void searchandcart() throws InterruptedException
	{
		WebElement signinlink = driver.findElement(By.id("nav-link-accountList"));
		signinlink.click();
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("7391021594");
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		WebElement Password = driver.findElement(By.id("ap_password"));
		Password.sendKeys("Prisha@07");
		WebElement SignIn = driver.findElement(By.id("signInSubmit"));
		SignIn.click();
		Thread.sleep(3000);
		WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Shoes"+Keys.ENTER);
		WebElement FirstShoe = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		FirstShoe.click();
	Set<String> w1 = driver.getWindowHandles();
//displays parent and child id first is parent and second can be any child id's as set does not follows indexing
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
