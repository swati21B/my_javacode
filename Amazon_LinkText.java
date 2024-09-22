package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_LinkText {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=7405602416725364811&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062237&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		driver.manage().window().maximize();
		WebElement MajorTab =driver.findElement(By.linkText("Customer Service"));
		MajorTab.click();

	}

}
