package seleniumM.ProjectSelenium;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(seleniumM.ProjectSelenium.ListnerClass.class)
public class Amz_TC15_withoutLogin_AddtoCart extends Amazon_LaunchQuit{
	
	@Test(retryAnalyzer=seleniumM.ProjectSelenium.RetryLogic.class)
	public void WithoutLogin_Cart() throws InterruptedException
	{
		
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
	}

}
