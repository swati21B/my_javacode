package testcasesPro1;

import org.testng.annotations.Test;

import seleniumM.ProjectSelenium.AmazonHomePage;
import seleniumM.ProjectSelenium.AmazonLogin;
import seleniumM.ProjectSelenium.Amazon_LaunchQuit;

public class Amz_TC3_invalidLogin extends Amazon_LaunchQuit{
	@Test
	public void InvalidLogin() throws InterruptedException
	{
		AmazonHomePage homePa = new AmazonHomePage(driver);
		homePa.hoverover(driver);
		homePa.signinClick();
		
		//called login page methods
		AmazonLogin login = new AmazonLogin(driver);
		login.un();
		login.contiButton();
		login.PWD();
		login.signin();
	}

}
