package seleniumM.ProjectSelenium;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(seleniumM.ProjectSelenium.ListnerClass.class)
public class Amz_TC14_RateTheOrder extends Amazon_LaunchQuit{
	@Test //(retryAnalyzer=seleniumM.ProjectSelenium.RetryLogic.class)
	public void ProductCancel() throws InterruptedException
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
				
				//call orders page
				Amz_OrdersPage order= new Amz_OrdersPage(driver);
				order.hoverover(driver);
				order.OrderFilter();
				order.ReviewTheOrder();
				order.verifyreviewPage();
				
	}

}
