package com.jpay.media.automation.web.baseobjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.Assertion;

import com.jpay.media.automation.web.baseobjects.ApplicationControllerEmail;
import com.jpay.media.automation.web.constants.ApplicationConstants;
import com.jpay.media.automation.web.utilities.Log;
import com.jpay.media.automation.web.utilities.Utilities;


public class BaseTestObject extends Assertion {

	private WebDriver driver;
	private ApplicationControllerEmail appEmailController;
	private ApplicationControllerFacility appFacilityController;
	private ApplicationControllerStaging appStagingController;
	private ApplicationControllerEmailPrelogin appEmailPreloginController;

	private static List<String> expectedValueList;
	private static List<String> actualValueList;
	private String inputValue = "N/A";

	public String environment = "";
	public String envUrlJpay = "";
	public String envUrlFacility = "";
	public String envUrlStaging = "";
	public String suiteBrowser = "";
	public String screenShotPath = "";
	public String execVariant = "";
	public String dfName = "";
	public String dsName = "";
	private int rowId = 0;
	private Map<String, String> data;

	
	
	protected static Utilities util = Utilities.getInstance();
	protected static BaseTestObject base = BaseTestObject.getInstance();
	
	

	public BaseTestObject(Map<String, String> data) {
		this.data = data;
		this.execVariant = data.get(ApplicationConstants.INFO_DATAEXCEL_EXEC_VARIANT);
		this.rowId = Integer.parseInt(data.get(ApplicationConstants.INFO_DATAEXCEL_ROW_ID));
	}

	
	public void init(ITestContext ctx) throws InterruptedException {

		Map<String, String> suiteParams = ctx.getSuite().getXmlSuite().getAllParameters();

		for (Entry<String, String> entry : suiteParams.entrySet()) {

			if (entry.getKey().equalsIgnoreCase("EnvironmentName")) {
				environment = entry.getValue();

			}

			if (entry.getKey().equalsIgnoreCase("EnvironmentURLFacility")) {
				envUrlFacility = entry.getValue();

			}

			if (entry.getKey().equalsIgnoreCase("EnvironmentURLStaging")) {
				envUrlStaging = entry.getValue();

			}

			if (entry.getKey().equalsIgnoreCase("EnvironmentURLJpay")) {
				envUrlJpay = entry.getValue();

			}

			if (entry.getKey().equalsIgnoreCase("browser")) {
				suiteBrowser = entry.getValue();

			}

			if (entry.getKey().equalsIgnoreCase("ScreenShotPath")) {
				screenShotPath = entry.getValue();

			}

			if (entry.getKey().equalsIgnoreCase("dataFileName")) {
				dfName = entry.getValue();

			}

			if (entry.getKey().equalsIgnoreCase("dataSheetName")) {
				dsName = entry.getValue();

			}

		}

		try {

			driver = util.selectBrowserDriver(suiteBrowser);
			if (suiteBrowser.equalsIgnoreCase("CHROME")) {
				driver.get("data:,");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Log.info("Environment : " + environment);
		Log.info("Browser : " + suiteBrowser);
		Log.info("Screen shot path : " + screenShotPath);
		Log.info("Execution variant : " + execVariant);
		Log.info("Row Id : " + rowId);
		Log.info("Data File Name : " + dsName);
		Log.info("Data Sheet Name : " + dfName);

	}


	
	public Utilities getUtil() {
		return util;
	}

	public void setInputValue(String inputValue) {
		this.inputValue = inputValue;
	}

	public void addActualValue(String actualValue) {
		getActualValueList().add(actualValue);
	}

	public void addExpectedValue(String expectedValue) {
		getExpectedValueList().add(expectedValue);
	}

	private List<String> getActualValueList() {
		if (BaseTestObject.actualValueList == null) {
			BaseTestObject.actualValueList = new ArrayList<String>();
		}
		return actualValueList;
	}

	private List<String> getExpectedValueList() {
		if (BaseTestObject.expectedValueList == null) {
			BaseTestObject.expectedValueList = new ArrayList<String>();
		}
		return expectedValueList;
	}

	public int getRowId() {
		
		return rowId;
	}

	private static BaseTestObject getInstance() {
		
		return base;
	}

	public String getExecVariant() {
		
		return execVariant;
	}

	public String getActualValue() {
		if (getActualValueList().isEmpty()) {
			return "N/A";
		}
		return StringUtils.join(getActualValueList().toArray(), ",");
	}

	public String getExpectedValue() {
		if (getExpectedValueList().isEmpty()) {
			return "N/A";
		}
		return StringUtils.join(getExpectedValueList().toArray(), ",");
	}

	public String getInputValue() {
		
		return null;
	}

	public WebDriver getDriver() {
		
		return driver;
	}

	public String getMethodName() {
		String methodName = Reporter.getCurrentTestResult().getMethod().getMethodName();
		return methodName;
	}

	
	
	
	@BeforeClass
	public void beforeClass(ITestContext ctx) {

		
		WindowsUtils.killByName("chromedriver.exe");
		WindowsUtils.killByName("IEDriverServer.exe");
		WindowsUtils.killByName("MicrosoftWebDriver.exe");

		try {
			init(ctx);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		appEmailController = new ApplicationControllerEmail(getDriver());
		appFacilityController = new ApplicationControllerFacility(getDriver());
		appStagingController = new ApplicationControllerStaging(getDriver());
		appEmailPreloginController = new ApplicationControllerEmailPrelogin(getDriver());
	}
	

	
	
	@AfterClass
	public void tearDown() {

		getDriver().close();
		getDriver().quit();
	}

	
	

	// --------------------------------------------------------------------------------------//

	public ApplicationControllerEmail jpayEmail() {
		return appEmailController;
	}

	public ApplicationControllerFacility jpayFacility() {
		return appFacilityController;
	}

	public ApplicationControllerStaging jpayStaging() {
		return appStagingController;
	}
	
	public ApplicationControllerEmailPrelogin jpayPrelogin() {
		return appEmailPreloginController;
	}


	// --------------------------------------------------------------------------------------//

}