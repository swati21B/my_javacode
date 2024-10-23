package seleniumM.ProjectSelenium;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(seleniumM.ProjectSelenium.ListnerClass.class)
public class Amz_TC13_ApplyCoupon extends Amazon_LaunchQuit{
	@Test(retryAnalyzer=seleniumM.ProjectSelenium.RetryLogic.class)
	public void CouponCodeApply() throws InterruptedException
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
				pay.PayMethods();
				pay.EnterCard_D(driver);
				pay.cardDetails(driver);
				pay.expiryDateYear();
				pay.SubmitCardDetails();
				pay.CVV();
				pay.PaymentSubmit();
				pay.SaveTheCard(driver);
				pay.UseAddress(driver);
				
				//call checkout page
				Amz_Checkout code = new Amz_Checkout(driver);
				code.Coupon();
				code.PlaceOrderandPay();
				
				
				
	}

}
