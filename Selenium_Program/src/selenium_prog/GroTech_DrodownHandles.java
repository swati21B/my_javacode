package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTech_DrodownHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		//Write a code to select demo2 using select by Visible Text.
		WebElement choice1 = driver.findElement(By.id("Choice1"));
		Select s1= new Select(choice1);
		Thread.sleep(2000);
		s1.selectByVisibleText("Demo2");
		//Write a code to select SQL 15 using select By Value.
		WebElement choice9 = driver.findElement(By.id("Choice9"));
		Select s2= new Select(choice9);
		Thread.sleep(2000);
		s2.selectByValue("SQL15");
		//Write codes separately to select QTP 10 and Energy 15 using Select by Visible Text.
		WebElement choice8 = driver.findElement(By.id("Choice8"));
		Select s3= new Select(choice8);
		Thread.sleep(2000);
		s3.selectByVisibleText("QTP10");
		WebElement choice4 = driver.findElement(By.id("Choice4"));
		Select s4= new Select(choice4);
		Thread.sleep(2000);
		s4.selectByVisibleText("Energy15");
		//driver.quit();
	}

}
