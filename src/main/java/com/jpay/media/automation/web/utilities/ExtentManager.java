package com.jpay.media.automation.web.utilities;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import org.testng.ITestContext;
import org.testng.ITestResult;
import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	Utilities util = Utilities.getInstance();
	private static ExtentReports extent;
	private static ThreadLocal<ExtentTest> parentTest = new ThreadLocal<ExtentTest>();
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
	private static ExtentManager instance = null;

	static String testEnvName;
	static String testSuiteName;
	static String extentReportPath;
	static String screenShotPath;
	static String dataFile;
	static String dataSheet;

	public static ExtentManager getInstance() {
		if (instance == null) {
			instance = new ExtentManager();
		}
		return instance;
	}

	public ExtentManager init(String fileName, ITestContext ctx) {

		try {
			Map<String, String> suiteParams = ctx.getSuite().getXmlSuite().getAllParameters();
			testSuiteName = ctx.getSuite().getXmlSuite().getName();
			for (Entry<String, String> entry : suiteParams.entrySet()) {

				if (entry.getKey().equalsIgnoreCase("EnvironmentName")) {
					testEnvName = entry.getValue();
				}

				if (entry.getKey().equalsIgnoreCase("ScreenPath")) {
					screenShotPath = entry.getValue();
					Log.info("Screen shot path : " + screenShotPath);
				}

				if (entry.getKey().equalsIgnoreCase("ExtentReportPath")) {
					extentReportPath = entry.getValue();
					Log.info("Extent Report Path : " + extentReportPath);
				}

				if (entry.getKey().equalsIgnoreCase("dataFileName")) {
					dataFile = entry.getValue();
					Log.info("DataFileName : " + dataFile);
				}

				if (entry.getKey().equalsIgnoreCase("dataSheetName")) {
					dataSheet = entry.getValue();
					Log.info("DataSheetName : " + dataSheet);
				}

			}
		} catch (Exception e) {
			Log.error("Exception in ExtentManager.class - init method" + e);
		}

		String dirName = util.getCurrentDateByFormate("yyyyMMdd");
		String basePath = extentReportPath;
		String fullPath = util.createAnyDir(basePath, dirName);

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fullPath + "\\" + testSuiteName + "_" + fileName);

		htmlReporter.setAppendExisting(true);
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle(fileName);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName("Test Results of suite : " + testSuiteName);

		extent = new ExtentReports();

		extent.setAnalysisStrategy(AnalysisStrategy.CLASS);
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("<b>Test Executed By : </b>", System.getProperty("user.name"));
		extent.setSystemInfo("<b>Test Environment : </b>", testEnvName);
		extent.setSystemInfo("<b>Data File : </b>", dataFile);
		extent.setSystemInfo("<b>Data Sheet : </b>", dataSheet);
		extent.setSystemInfo("<b>Operating System : </b>", System.getProperty("os.name"));
		extent.setSystemInfo("<b>Time Zone : </b><b>", System.getProperty("user.timezone"));
		return this;
	}

	public ExtentTest createParentTest(String name) {
		String nameBold = "<b><font color='#000080'>" + name + "</font></b>";
		ExtentTest parent = extent.createTest(nameBold);
		parentTest.set(parent);
		return parent;
	}

	public ExtentTest createChildTest(String name, String description) {

		String nameBold = "<b><font size ='4' color='#000080'>" + name + "</font></b>";
		String desBold = "<b><font size ='3' color='#000080'>" + description + "</font></b>";
		ExtentTest child = parentTest.get().createNode(nameBold, desBold);
		test.set(child);
		return child;
	}

	public void testSuccess(ITestResult result) {

		test.get().pass("<b><font size ='3' color='#008000'> Test Passed </font></b>");

	}

	public void testSkipped(ITestResult result) {

		test.get().skip("<b><font size ='3' color='#800000'>Test Skipped</font></b>");
		test.get().skip(result.getThrowable());
	}

	public void testFailure(ITestResult result, String screenPath) throws IOException {

		test.get().fail("<b><font size ='3' color='#FF0000'> Test Failed </font></b>");
		test.get().fail("<font size ='2' color='#800080'>Exception</font>");
		test.get().fail(result.getThrowable());

		try {

			test.get().fail("<font size ='2' color='#FF0000'>Screenshot</font>",
					MediaEntityBuilder.createScreenCaptureFromPath(screenPath).build());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void catagories() {

		test.get().assignCategory(testSuiteName);
	}

	public void log(String detail) {

		test.get().log(Status.INFO, detail);
		System.out.println(detail);
	}

	public void labelLog(String detail) {
		Markup mark = MarkupHelper.createLabel(detail, ExtentColor.BLUE);
		test.get().log(Status.INFO, mark);
	}

	public void flush() {
		extent.flush();

	}

}
