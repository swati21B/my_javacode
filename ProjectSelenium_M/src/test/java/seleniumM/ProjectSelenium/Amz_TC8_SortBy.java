package seleniumM.ProjectSelenium;

import org.testng.annotations.Test;

public class Amz_TC8_SortBy extends Amazon_LaunchQuit{
	@Test(retryAnalyzer=seleniumM.ProjectSelenium.RetryLogic.class)
	public void VerifyProductDetailsPage() throws InterruptedException
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
	Amz_SerachForProduct sort = new Amz_SerachForProduct(driver);
	sort.searchproduct(driver);
	sort.sortByDropdown(driver);
}
}
