package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_ClickOnFirstShoe {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("shoes"+Keys.ENTER);
		WebElement shoes =driver.findElement(By.xpath("(//div[@class='_bGlmZ_img_3idRh _bGlmZ_expandedImgT1_RpAoS'])[1]"));
	shoes.click();
	}

}
