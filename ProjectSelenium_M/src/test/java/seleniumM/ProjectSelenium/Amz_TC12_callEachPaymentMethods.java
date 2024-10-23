package seleniumM.ProjectSelenium;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(seleniumM.ProjectSelenium.ListnerClass.class)
public class Amz_TC12_callEachPaymentMethods extends Amazon_LaunchQuit{
	@Test(retryAnalyzer=seleniumM.ProjectSelenium.RetryLogic.class)
	public void CallAllPayMethods() throws InterruptedException
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
				Amz_SerachForProduct search = new Amz_SerachForProduct(driver);
				search.searchproduct(driver);
				
				//call details page
				Amz_ProductDescription Product = new Amz_ProductDescription(driver);
				Product.clickonproduct(driver);
				
				//call add to cart page
				Amz_AddtoCart cartP = new Amz_AddtoCart(driver);
				cartP.addtoCartmethod(driver);
				cartP.GotoCartpage();
				
				//call the payment page
				Amz_Payment pay = new Amz_Payment(driver);
				pay.Checkout();
				pay.address();
				pay.callEachPayment();
	}

}
