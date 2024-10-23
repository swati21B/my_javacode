package retryFailedTestcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTC_Logic implements IRetryAnalyzer{
	int count=0;
	int retryCount=2;

	@Override
	public boolean retry(ITestResult result) {
		if(count<retryCount)
		{
			count++;
			System.out.println(count);
			return true;
		}
		return false;//false means you do not want to retry
	}

}
