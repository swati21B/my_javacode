package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_GroTech {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drage1=driver.findElement(By.id("container-6"));
		WebElement drage2=driver.findElement(By.id("div2"));
		//with Actions class invoked constructor
		Actions DrgDrop = new Actions(driver);
		//Write a code to return postman to original position after drag and drop 
		DrgDrop.dragAndDrop(drage1, drage2).perform();
		Thread.sleep(2000);
		DrgDrop.dragAndDrop(drage2, drage1).perform();
		Thread.sleep(2000);
		//Write a code to return selenium to original position after drag and drop   
		WebElement drage3=driver.findElement(By.id("container-5"));
		DrgDrop.dragAndDrop(drage3, drage2).perform();
		Thread.sleep(2000);
		DrgDrop.dragAndDrop(drage2, drage3).perform();
		//Write a code to return cucumber to original position after drag and drop 
		Thread.sleep(2000);
		WebElement drage4= driver.findElement(By.id("container"));
		DrgDrop.dragAndDrop(drage4, drage2).perform();
		Thread.sleep(2000);
		DrgDrop.dragAndDrop(drage2, drage4).perform();// back to original position
		
	}

}
