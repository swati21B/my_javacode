package selenium_prog;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Amazon_AddToWishList {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dmsndeskstdin-21%26ref%3Dnav_custrec_signin%26adgrpid%3D1328211703591630%26hvadid%3D83013495293827%26hvnetw%3Do%26hvqmt%3De%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D156946%26hvtargid%3Dkwd-83014163717471%3Aloc-90%26hydadcr%3D5621_2377279%26msclkid%3D85b423777ab71646028045ccf7fdfcbb&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		//WebElement is return type of findElement
		//WebElement is an interface
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("9881469855");
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		WebElement Password = driver.findElement(By.id("ap_password"));
		Password.sendKeys("Test@12345");
		WebElement SignIn = driver.findElement(By.id("signInSubmit"));
		SignIn.click();
		
		WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("soap"+Keys.ENTER);
		WebElement FirstSoap = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		FirstSoap.click();
		Set<String> d1= driver.getWindowHandles();
		System.out.println(d1);
		Iterator<String> i1= d1.iterator();
		String parent= i1.next();//parent id
		String child =i1.next();//any child id
		System.out.println("parent id->"+parent);
		System.out.println("child id->"+child);
		driver.switchTo().window(child);
		Thread.sleep(2000);
		WebElement wishlist=driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']"));
		wishlist.click();
	}

}
