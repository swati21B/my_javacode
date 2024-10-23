package seleniumM.ProjectSelenium;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(seleniumM.ProjectSelenium.ListnerClass.class)
public class Amz_TC6_SearchByCategory extends Amazon_LaunchQuit{
	@Test(retryAnalyzer=seleniumM.ProjectSelenium.RetryLogic.class)
	public void searchByCategory() throws InterruptedException
	{
		//call home page
		AmazonHomePage home= new AmazonHomePage(driver);
		home.hoverover(driver);
		home.signinClick();
		
		//call login page
		AmazonLogin loginp = new AmazonLogin(driver);
		loginp.un();
		loginp.contiButton();
		loginp.PWD();
		loginp.signin();
		
		//call Search For product page
		Amz_SerachForProduct cateogory = new Amz_SerachForProduct(driver);
		cateogory.SelectCategory(driver);
	}		
}
