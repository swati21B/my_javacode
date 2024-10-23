package selenium_prog;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_ParentChild_W_Handles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMI_rfz_tmIiAMV46hmAh1dXDrTEAAYASAAEgKlj_D_BwE&gclsrc=aw.ds)");
		driver.manage().window().maximize();
		WebElement google =driver.findElement(By.name("google-register"));
		google.click();
		Set<String> e1= driver.getWindowHandles();
		System.out.println("Parent and Child id's->"+e1);
		Iterator<String> i1= e1.iterator();
		String parent =i1.next();
		System.out.println(parent);
		String child =i1.next();
		System.out.println(child);
		driver.switchTo().window(child);//moved control to child window
		//driver.close();// closing the child window which confirms child has the control
		driver.switchTo().window(parent);//moved control from child to parent window
		Thread.sleep(2000);
		driver.close();//closing the parent window which confirms parent has the control
		
	}

}
