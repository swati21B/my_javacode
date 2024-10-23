package selenium.TestNG.Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TimeOutProgram {
	@Test(timeOut=5000)
	//TestNG gives if test could not finish within mentioned time-->ThreadTimeOutException
	public void register()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement FirstName= driver.findElement(By.id("fname"));
		FirstName.sendKeys("Swati");
		WebElement LastName= driver.findElement(By.id("lname"));
		LastName.sendKeys("Wandhare");
		WebElement Email= driver.findElement(By.id("email"));
		Email.sendKeys("swati215@gmail.com");
		WebElement pass= driver.findElement(By.id("password"));
		pass.sendKeys("swati1230");
		WebElement radioButton= driver.findElement(By.id("Female"));
		radioButton.click();
		WebElement skills=driver.findElement(By.id("Skills"));
		Select s1 = new Select(skills);
		s1.selectByIndex(1);
		//s1.selectByValue("select2");
		//s1.selectByVisibleText("Technical Skills");
		WebElement techskill=driver.findElement(By.id("technicalskills"));
		Select s4 = new Select(techskill);
		s4.selectByValue("API Testing");
		WebElement country =driver.findElement(By.id("Country"));
		Select s2= new Select(country);
		s2.selectByVisibleText("Malaysia");
		WebElement Presadd =driver.findElement(By.id("Present-Address"));
		Presadd.sendKeys("test test 440044");
		WebElement Permadd =driver.findElement(By.id("Permanent-Address"));
		Permadd.sendKeys("test 123 test area 440044");
		WebElement pincode =driver.findElement(By.id("Pincode"));
		pincode.sendKeys("440044");
		WebElement religion = driver.findElement(By.id("Relegion"));
		Select s3= new Select(religion);
		s3.selectByVisibleText("Hindu");
		WebElement relocateCheck =driver.findElement(By.id("relocate"));
		relocateCheck.click();	
		WebElement upload=driver.findElement(By.name("file"));
		upload.sendKeys("E:\\Automation MKT\\Test.png");
		WebElement button=driver.findElement(By.name("Submit"));
		button.click();
	}
}
