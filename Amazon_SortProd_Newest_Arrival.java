package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_SortProd_Newest_Arrival {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dmsndeskstdin-21%26ref%3Dnav_custrec_signin%26adgrpid%3D1328211703591630%26hvadid%3D83013495293827%26hvnetw%3Do%26hvqmt%3De%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D156946%26hvtargid%3Dkwd-83014163717471%3Aloc-90%26hydadcr%3D5621_2377279%26msclkid%3D85b423777ab71646028045ccf7fdfcbb&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		//WebElement is return type of findElement
		//WebElement is an interface
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("7391021594");
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		WebElement Password = driver.findElement(By.id("ap_password"));
		Password.sendKeys("Prisha@07");
		WebElement SignIn = driver.findElement(By.id("signInSubmit"));
		SignIn.click();
		
		WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("colgate"+Keys.ENTER);
		WebElement sort =driver.findElement(By.id("s-result-sort-select"));
		Select s1 = new Select(sort);
		s1.selectByVisibleText("Newest Arrivals");
		driver.quit();
	}

}
