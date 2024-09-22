package seleniumM.ProjectSelenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Amz_TC1Registration extends Amazon_LaunchQuit{
	@Test
	public void regiesterwithAmazon() throws EncryptedDocumentException, IOException
	{
		//call the home page
		AmazonHomePage HomeP = new AmazonHomePage(driver);
		HomeP.hoverover(driver);
		HomeP.registration();
		
		// call the registration page
		AmazonRegistration AMZRegister= new AmazonRegistration(driver);
		AMZRegister.AMZ_Registration(driver);
	}
	

}
