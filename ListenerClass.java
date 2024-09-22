package iTestListener;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerClass implements ITestListener{
	static ChromeDriver driver;
//if no error seen to override unimplemented methods right click on program source-override/implementemethods->select all and import
/*1)Create a class and implements ITestListener. 
2)Do override it's unimplemented methods.
3)Write own logic in it.
(till steps 3 listerns are ready)
4)Create a new class, which utilise the Listener concept.*/	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Testcase is pass");
		TakesScreenshot t1= driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\SwatiBodhale\\eclipse-workspace\\Selenium_Program\\src\\Screenshots\\Pass\\PassesTestCases"+".png");
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
		TakesScreenshot t1= driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\SwatiBodhale\\eclipse-workspace\\Selenium_Program\\src\\Screenshots\\Fail\\FailedTestCases"+".png");
	try {
		FileHandler.copy(source, destination);
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
