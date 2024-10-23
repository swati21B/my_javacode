package seleniumM.ProjectSelenium;
import org.testng.annotations.Test;
public class Amz_TC2_ValidLogin extends Amazon_LaunchQuit{
	@Test(retryAnalyzer=seleniumM.ProjectSelenium.RetryLogic.class)
	public void validLogin() throws InterruptedException
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
		login.verifyassert(driver);
	}
		}
