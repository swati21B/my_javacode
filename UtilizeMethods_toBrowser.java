package selenium_prog;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilizeMethods_toBrowser {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		WebElement google = driver .findElement(By.xpath("//span[.='Google']"));
		google.click();
		String title= driver.getTitle();
		System.out.println(title);
		//getWindowHandle gives the parent id
		String parent=driver.getWindowHandle();
		System.out.println("getWindowHandle giving parent id->"+parent);
		//getWindowHandles gives the parent and child id's
		Set<String> parentchild =driver.getWindowHandles();
		System.out.println("getWindowHandles gives the parent and child id's->"+parentchild);
		driver.close();
	}

}
