package seleniumM.AirlineProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TC_ValidateflightInformation extends LaunchandQuit{
	
	@Test//(retryAnalyzer=seleniumM.AirlineProject.RetryFailedTC.class)
	public void VerifyFareBaggageDetails() throws InterruptedException, EncryptedDocumentException, IOException
	{
		//call home page
		HomePage home = new HomePage(driver);
		home.hoverover(driver);
		home.signinClick();
		
		//call login page 
		ValidLogin VL = new ValidLogin(driver);
		VL.login(driver);
		
		//call search flight page
		SearchFlight search= new SearchFlight(driver);
		search.searchforticketBooking();
		search.searchSource(driver);
		search.searchDestination(driver);
		search.travelDate();
		search.NumofTraveller();
		search.EconomyClass();
		search.searchButton();
		
		//call search result page
		SearchResultPage res= new SearchResultPage(driver);
		res.ClickoNBook();
		res.ViewBaggageCancellation();
		res.fareDetails();
		res.TaxesandFees();
	}
}
