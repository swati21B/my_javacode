package seleniumM.AirlineProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TC_RegisterUser extends LaunchandQuit{
	@Test(retryAnalyzer=seleniumM.AirlineProject.RetryFailedTC.class)
	public void regiesterwithAmazon() throws EncryptedDocumentException, IOException
	{
		//call the home page
		HomePage HomeP = new HomePage(driver);
		HomeP.hoverover(driver);
		HomeP.registration();
		
		// call the registration page
		Registration AMZRegister= new Registration(driver);
		AMZRegister.AMZ_Registration(driver);
	}
}
