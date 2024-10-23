package seleniumM.ProjectSelenium;
import org.testng.annotations.Test;


public class Amz_TC4_EditProfile extends Amazon_LaunchQuit{
	
	@Test(retryAnalyzer=seleniumM.ProjectSelenium.RetryLogic.class)
public void EditProfileDetails() throws InterruptedException
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
	//call manage profile page
	ManageProfile profile= new ManageProfile(driver);
	profile.AccountsHover(driver);
	profile.ManageProfileLink();
	profile.WhoisShoppingW();
	profile.EditButton();
	profile.ProfileNamewindow();
	profile.VerifywithAssert(driver);
	
}

}
