package pageObjectModel;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import poM.FBSource.Source_FBLogin;

public class FBTestCase1 {
//in the test case we launch the url and calls the method created in the source package

@Test
public void launchFBandcallEachMethods() {
	WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			Source_FBLogin o1= new Source_FBLogin(driver);
			o1.un();
			o1.pwd();
			o1.buttonlogin();
			WebElement anotherWayButton = driver.findElement(By.xpath("(//span[.='Try Another Way'])[1]"));
			Assert.assertTrue(anotherWayButton.isDisplayed(), "Sorry, wrong page re-directed");
			
}

}
