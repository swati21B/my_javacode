package seleniumM.ProjectSelenium;

import org.testng.annotations.Test;

public class Amz_TC3_invalidLogin extends Amazon_LaunchQuit{
	@Test(retryAnalyzer=seleniumM.ProjectSelenium.RetryLogic.class)
	public void InvalidLogin() throws InterruptedException
	{
		AmazonHomePage homePa = new AmazonHomePage(driver);
		homePa.hoverover(driver);
		homePa.signinClick();
		
		//called invalid login page methods
		Amz_invalidLogin login = new Amz_invalidLogin(driver);
		login.uname();
		login.continueB();
		login.PW();
		login.sign_in();
	}

}
