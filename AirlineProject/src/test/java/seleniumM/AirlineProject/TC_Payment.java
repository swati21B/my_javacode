package seleniumM.AirlineProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TC_Payment extends LaunchandQuit{

	@Test(retryAnalyzer=seleniumM.AirlineProject.RetryFailedTC.class)
	public void VerifyPayment() throws InterruptedException, EncryptedDocumentException, IOException
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
		search.SinglePasseneger();
		search.EconomyClass();
		search.searchButton();
		
		//call search result page
		SearchResultPage res= new SearchResultPage(driver);
		res.ClickoNBook();
		res.ProceedtoTravellerD();
		
		//call Flight Details page
				FlightDetails FDet = new FlightDetails(driver);
				FDet.addNewAdult();
				FDet.SelectClickGender();
				FDet.AddGender();
				FDet.P1FirstName();
				FDet.P1LastName();
				FDet.AddAdultButton();
				FDet.ProceedwithSeatSelection();
				FDet.SelectSeat();
				FDet.ProceedwithSeat();
				FDet.SelectSeatBOM();
				FDet.ProceedwithSeat();
		//call payment page
				Payment_page pay=new Payment_page(driver);
				pay.termsCheckbox();
				pay.ProceedtoPayment();
				pay.PayMethods();
				pay.CardDetails();
				pay.CardNumber();
				pay.SelectMonthClick();
				pay.SelectYearClick();
				pay.SubmitCardDetails();
				pay.CVV();
				pay.FinalPay();
}
}