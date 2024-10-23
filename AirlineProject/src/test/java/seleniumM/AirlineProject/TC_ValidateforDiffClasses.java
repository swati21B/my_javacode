package seleniumM.AirlineProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TC_ValidateforDiffClasses extends LaunchandQuit{
	@Test(retryAnalyzer=seleniumM.AirlineProject.RetryFailedTC.class)
	public void searchForDiffClasses() throws InterruptedException, EncryptedDocumentException, IOException
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
		driver.navigate().back();
		search.searchSource(driver);
		search.searchDestination(driver);
		search.travelDate2();
		search.NumofTraveller();
		search.PremEconomyBusiness(driver);
		search.searchButton();
		driver.navigate().back();
		search.searchSource(driver);
		search.searchDestination(driver);
		search.travelDate3();
		search.NumofTraveller();
		search.Businessclass();
		search.searchButton();
		search.VerifyBusinessClasspage();
		
		
	}
}
