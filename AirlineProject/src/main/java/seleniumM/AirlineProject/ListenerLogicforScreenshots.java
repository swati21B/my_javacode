package seleniumM.AirlineProject;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerLogicforScreenshots implements ITestListener{
	static WebDriver driver;
	//static means driver instance shared across all instances of class where it's declared and useful when WebDriver instance to be shared across multiple methods or classes.
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test case is passed");
		Date d1 = new Date();
		d1.getTime();//epoch time machine understandable
		Date d2 = new Date(d1.getTime());
		//System.out.println("Human undestandable time->"+d2);
		String Time= d2.toString().replace(":","").replace(" ","");
		TakesScreenshot t1= (TakesScreenshot) driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\SwatiBodhale\\eclipse-workspace\\AirlineProject\\src\\ScreenshotsForFaileandPassedTC\\Passed\\TestCaseisPassed"+Time+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Testcase is failed");
		Date d1 = new Date();
		d1.getTime();//epoch time machine understandable
		Date d2 = new Date(d1.getTime());
		//System.out.println("Human undestandable time->"+d2);
		String Time= d2.toString().replace(":","").replace(" ","");
		TakesScreenshot t2= (TakesScreenshot) driver;
		File source2=t2.getScreenshotAs(OutputType.FILE);
		File destination2= new File("C:\\Users\\SwatiBodhale\\eclipse-workspace\\AirlineProject\\src\\ScreenshotsForFaileandPassedTC\\Failed\\TestCaseisFailed"+Time+".png");
	try {
		FileHandler.copy(source2, destination2);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
