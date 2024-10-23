package poM.AmazonTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import poM.AmazonSource.HomePage;
import poM.AmazonSource.LoginPage;

public class TC1_login extends LaunchQuit{
@Test
public void logintoAmazon() throws InterruptedException
{
	//scenario: login to amazon
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
	String Expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	String ActualTitle = driver.getTitle();
	
	Assert.assertEquals(ActualTitle, Expectedtitle, "Sorry, you are on wrong page");
}
}
