package seleniumM.ProjectSelenium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer{
	int count=0;
	int retryCount=1;

	@Override
	public boolean retry(ITestResult result) {
		if(count<retryCount)
		{
			count++;
			System.out.println("Retrying the failed TC->"+count);
			return true;
		}
		return false;//false means you do not want to retry
	}


}
