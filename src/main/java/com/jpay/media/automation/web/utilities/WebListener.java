package com.jpay.media.automation.web.utilities;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.asserts.Assertion;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;

public class WebListener extends Assertion implements ITestListener, ISuiteListener {

	public static final String pattern = "dd/MM/yyyy HH:mm:ss SS";
	public static final SimpleDateFormat formate = new SimpleDateFormat(pattern);
	private Logger log = Logger.getLogger(this.getClass().getName());
	public String testStartTime;
	public String testEndTime;
	protected String screenPath = "N/A";

	private ExtentManager extentManager;
	Date now = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
	String time = dateFormat.format(now);

	Utilities utilities = Utilities.getInstance();

	public void onStart(ISuite suite) {

	}

	public void onFinish(ISuite suite) {

		long totalTime = 0;

		for (ISuiteResult eachResult : suite.getResults().values()) {

			ITestContext ctx = eachResult.getTestContext();

			Date start = ctx.getStartDate();
			Date end = ctx.getEndDate();

			long ms = end.getTime() - start.getTime();
			totalTime += ms;

		}

		Long currMillSec = System.currentTimeMillis();

	}

	public void onStart(ITestContext context) {

		log.info("***********************Start of the Test Class***************************" + context.getName());

		extentManager = ExtentManager.getInstance().init(dateFormat.format(now) + ".html", context);
		extentManager.createParentTest(context.getName());

		Long currMillSec = System.currentTimeMillis();
		testStartTime = utilities.getDateStringFromMilliSecond(currMillSec);

	}

	public void onFinish(ITestContext context) {

		log.info("***********************End of the Test Class***************************" + context.getName());

		extentManager.flush();
		Iterator<ITestResult> listOfFailedTests = context.getFailedTests().getAllResults().iterator();
		while (listOfFailedTests.hasNext()) {
			ITestResult failedTest = listOfFailedTests.next();
			ITestNGMethod method = failedTest.getMethod();
			if (context.getFailedTests().getResults(method).size() > 0) {
				listOfFailedTests.remove();
			} else {
				if (context.getPassedTests().getResults(method).size() > 0) {
					listOfFailedTests.remove();
				}

			}

		}

		Long currMillSec = System.currentTimeMillis();
		testEndTime = utilities.getDateStringFromMilliSecond(currMillSec);

	}

	public void onTestStart(ITestResult result) {

		String testName = result.getMethod().getMethodName();
		String description = result.getMethod().getDescription();

		if (result.getParameters().length > 0) {

			testName = testName + "[" + result.getMethod().getCurrentInvocationCount() + "]";
			String parameters = Arrays.deepToString(result.getParameters());
			description = description + "With parameters" + parameters;
		}
		extentManager.createChildTest(testName, description);

	}

	public void onTestSuccess(ITestResult result) {

		extentManager.testSuccess(result);
	}

	public void onTestFailure(ITestResult result) {

		try {

			String suiteName = result.getTestContext().getSuite().getName();
			String fullClassName = result.getMethod().getTestClass().getName();
			String actualClassName = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
			String testEndTime = getCurrentTimeInMs();

			BaseTestObject test = (BaseTestObject) result.getMethod().getInstance();

			screenPath = utilities.getScreenShot(test.getDriver(),
					result.getTestClass().getXmlTest().getAllParameters().get("ScreenShotPath"), test.getMethodName(),
					suiteName, actualClassName, testEndTime);
			result.setAttribute("screenPath", screenPath);

			String[] pathSplit = screenPath.split("\\\\");
			String relativeScreenShot = pathSplit[pathSplit.length - 1];

			extentManager.testFailure(result, screenPath);
		} catch (Exception e) {

			e.printStackTrace();
		} catch (Throwable t) {

			t.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {

		extentManager.testSkipped(result);
	}

	public String getCurrentTimeInMs() {
		long miliSec = System.currentTimeMillis();
		String testFinishTime = utilities.getDateStringFromMilliSecond(miliSec);
		return testFinishTime;
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

}