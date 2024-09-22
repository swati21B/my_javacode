package poM.AmazonTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import poM.AmazonSource.Amz_DescrptionPage;
import poM.AmazonSource.Amz_WishList;
import poM.AmazonSource.HomePage;
import poM.AmazonSource.LoginPage;
import poM.AmazonSource.SearchResultPage;

public class TC2_Amz_SearchResult_WL extends LaunchQuit{
@Test
	public void searchDescription() throws InterruptedException
	{
//Scenario: Login to amazon->search a product->add this to wishlist

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
		//called description page
				Amz_DescrptionPage product= new Amz_DescrptionPage(driver);
				product.clickonproduct();
		//called to wishlist page
				Amz_WishList wishL = new Amz_WishList(driver);
				wishL.addingtoWishList(driver);
				wishL.checkViewListButton();
			
	}
	
		
}
