package seleniumM.AirlineProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TC_DomesticRoundTrip extends LaunchandQuit{
	@Test(retryAnalyzer=seleniumM.AirlineProject.RetryFailedTC.class)
	public void roundTrip() throws InterruptedException, EncryptedDocumentException, IOException
	{
		//call home page
				HomePage home = new HomePage(driver);
				home.hoverover(driver);
				home.signinClick();
				
				//call login page 
				ValidLogin VL = new ValidLogin(driver);
				VL.login(driver);
				
				//call search flight page
				SearchFlight Rtrip= new SearchFlight(driver);
				Rtrip.searchforticketBooking();
				Rtrip.radioRoundTrip();	
				Rtrip.searchSource(driver);
				Rtrip.searchDestination(driver);
				Rtrip.travelDate();
				Rtrip.ReturnDate();
				Rtrip.SinglePasseneger();
				Rtrip.searchButton();
	}
}
