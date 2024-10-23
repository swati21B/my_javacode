package seleniumM.ProjectSelenium;
import org.testng.annotations.Test;

public class Amz_TC5_SearchProduct extends Amazon_LaunchQuit{
	@Test(retryAnalyzer=seleniumM.ProjectSelenium.RetryLogic.class)
	public void searchProduct() throws InterruptedException
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
		
		//called the search product page methods
		Amz_SerachForProduct search = new Amz_SerachForProduct(driver);
		search.searchproduct(driver);
		
			
	}

}
