package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apollo_Search_EnterButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwiTyM7D1PmHAxVchEsFHS33BzIYABAAGgJzZg&co=1&ase=2&gclid=CjwKCAjw8fu1BhBsEiwAwDrsjAShS9kGod8wgdA4Ya1kYUY7OB0noxjAkeuWwkIJ-XWyGzPJGUtNSBoCK-sQAvD_BwE&ohost=www.google.com&cid=CAESVeD2HLau2uZqYpeVAx3r__0P6SeBiriF7pvZsZxp2mLEgQD8dv2xTb5q9QYqFcEYC7VDjYxZDjP8LEVdUSSyviukNpM7c7t06uGcNfEibqyf9gJcJ34&sig=AOD64_0B3adic-ZcVC041zMUVq3-IeG8Yg&q&nis=4&adurl&ved=2ahUKEwiXqcXD1PmHAxWG2TgGHQD4BWcQ0Qx6BAgJEAE");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//input[@id='searchProduct']"));
		e1.sendKeys("PCM");
		Thread.sleep(2000);
		

	}

}
