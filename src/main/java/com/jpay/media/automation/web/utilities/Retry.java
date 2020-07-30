package com.jpay.media.automation.web.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.jpay.media.automation.web.constants.ApplicationConstants;


public class Retry implements IRetryAnalyzer{
	private int retryCount = 0;
	private int maxRetryCount = ApplicationConstants.RETRY_COUNT;

	public boolean retry(ITestResult arg0) {
		
		if (retryCount < maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}
	
	
	

}
