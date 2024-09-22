package poM.AmazonTestCases;

import org.testng.annotations.Test;

import poM.AmazonSource.AddtoCart_ProceedPayment;
import poM.AmazonSource.Amz_DescrptionPage;
import poM.AmazonSource.Amz_WishList;
import poM.AmazonSource.HomePage;
import poM.AmazonSource.LoginPage;
import poM.AmazonSource.SearchResultPage;

public class TC3_Amz_till_Payment extends LaunchQuit{

	@Test
	public void cartandPay() throws InterruptedException
	{
		//called home page methods
		HomePage homeP = new HomePage(driver);
		homeP.hovertoAccountsList(driver);
		homeP.signinClick();
//called login page methods
		LoginPage login = new LoginPage(driver);
		login.un();
		login.contiButton();
		login.PWD();
		login.signin();
//called the search result page methods
		SearchResultPage search = new SearchResultPage(driver);
		search.searchproduct();
//called product description page
		Amz_DescrptionPage product= new Amz_DescrptionPage(driver);
		product.clickonproduct();
//called wishlist page
		Amz_WishList wishList = new Amz_WishList(driver);
		wishList.addingtoWishList(driver);
		wishList.continueShopping();
		
//called add to cart page
		AddtoCart_ProceedPayment cartandPay = new AddtoCart_ProceedPayment(driver);
		cartandPay.AddtoCart(driver);
		cartandPay.Checkout();
		cartandPay.address();
		cartandPay.PayMethods();
		
		
	}

}
