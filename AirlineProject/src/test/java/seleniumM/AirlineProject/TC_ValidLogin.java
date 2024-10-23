package seleniumM.AirlineProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TC_ValidLogin extends LaunchandQuit{
	
	@Test(retryAnalyzer=seleniumM.AirlineProject.RetryFailedTC.class)
	public void loginasValid() throws InterruptedException, EncryptedDocumentException, IOException
	{
		//call home page
		HomePage Hm= new HomePage(driver);
		Hm.hoverover(driver);
		Hm.signinClick();
		
		//call valid login page
		ValidLogin VL = new ValidLogin(driver);
		VL.login(driver);
		VL.verifyassert(driver);
		
	}

}
