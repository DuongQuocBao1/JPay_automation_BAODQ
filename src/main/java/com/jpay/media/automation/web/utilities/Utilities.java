package com.jpay.media.automation.web.utilities;

import java.util.Properties;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.jpay.media.automation.web.constants.ApplicationConstants;
import com.jpay.media.automation.web.constants.Constant;

public class Utilities {

	private static WebDriver driver;
	private String screenShotPath;

	private String logFilePath;
	private String completePropFilePath;
	private static boolean isPortable = true;

	private static Utilities util = new Utilities();
	private static final Properties PROP_FILE = new Properties();
	private static String edgeDriver = "MicrosoftWebDriver.exe";
	private static String ieDriver = "IEDriverServer.exe";
	private static String chromeDriver = "chromedriver.exe";
	private static String geckoDriver = "geckodriver.exe";
	private static String ghostDriver = "phantomjs.exe";
	public static String driverPath = getCompleteFilePath(ApplicationConstants.PROJECT_NAME,
			ApplicationConstants.ROOT_DRIVER_FOLDER);

	private Logger log = Logger.getLogger(this.getClass().getName());

	private Utilities() {

	}

	public static Utilities getInstance() {

		return util;
	}

	public String getScreenShotPath() {
		return screenShotPath;
	}

	public void setScreenShotPath(String screenShotPath) {
		this.screenShotPath = screenShotPath;
	}

	public String getLogFilePath() {
		return logFilePath;
	}

	public void setLogFilePath(String logFilePath) {
		this.logFilePath = logFilePath;
	}

	public String getCompletePropFilePath() {
		return completePropFilePath;
	}

	public void setCompletePropFilePath(String completePropFilePath) {
		this.completePropFilePath = completePropFilePath;
	}

	public String getScreenShot(WebDriver driver, String path, String fileName, String suiteName, String className,
			String testEndTime) {

		String screenPath = "";
		try {

			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			String time = dateFormat.format(now);

			SimpleDateFormat firstFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat secondFormat = new SimpleDateFormat("yyyyMMddHHmmss");

			String reformatEndTime = "";
			String reformatedNowTime = "";

			reformatEndTime = dateFormat.format(firstFormat.parse(testEndTime));
			reformatedNowTime = secondFormat.format(now);

			/* String dirPath = path + time; */
			String dirPath = path;
			String suitePath = dirPath + "\\" + suiteName + "_" + reformatEndTime;
			String classPath = suitePath + "\\" + className;

			File dailyDir = new File(dirPath);
			File suiteDir = new File(suitePath);
			File classDir = new File(classPath);

			if (!dailyDir.exists())

				dailyDir.mkdir();

			if (!suiteDir.exists())

				suiteDir.mkdir();

			if (!classDir.exists())

				classDir.mkdir();

			String newFileName = classPath + "\\" + fileName.concat("_").concat("_" + reformatedNowTime).concat(".png");
			screenPath = newFileName;
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(screenshot, new File(newFileName));

		} catch (IOException e) {
			log.error(e.getMessage(), e);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}

		return screenPath;

	}

	public String getEvidenceDirPathScreenShot(String rootPath, String suiteName) {

		Date now = new Date();
		String evidencePath = "";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		String time = dateFormat.format(now);
		String dirPath = rootPath.concat(time).concat("\\");
		File dailyDir = new File(dirPath);
		log.info("Evidence Directory Path .." + dirPath);

		if (!dailyDir.exists()) {

			dailyDir.mkdir();
		}

		if (dailyDir.exists()) {

			log.info("Evidence Directory Exists ..");
			Date date1 = new Date(System.currentTimeMillis());
			DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
			String dateString = (formatter.format(date1));

			evidencePath = dirPath.concat(suiteName).concat("_").concat(dateString);
			File suiteDir = new File(evidencePath);
			suiteDir.mkdir();

		} else {
			log.info("Unable to create Evidence Directory ....");
		}

		return evidencePath;

	}

	public Properties getPropertyFile(String appName, String fileName) throws IOException {

		String propFilePath = "";
		Map<String, String> enVar = System.getenv();
		for (String key : enVar.keySet()) {

			if (key.equalsIgnoreCase(com.jpay.media.automation.web.constants.Constant.PROP_FILE_PATH)) {

				propFilePath = enVar.get(key);

			}

		}

		completePropFilePath = propFilePath + appName + "\\";
		FileInputStream propFile = new FileInputStream(completePropFilePath.concat(fileName));
		PROP_FILE.load(propFile);
		log.info("Complete Property File Path....." + completePropFilePath);
		return PROP_FILE;
	}

	public String getProperty(Enumeration<?> propNames, String propKey) {
		String key = "";
		String value = "";

		while (propNames.hasMoreElements()) {
			key = (String) propNames.nextElement();
			if (key.equalsIgnoreCase(propKey)) {
				value = PROP_FILE.getProperty(key);
				break;
			}

		}

		if (key == null || key.trim().length() == 0) {
			throw new CommonException(Constant.PROPERTIES_MISSING_FROM_PROPERTY_FILE + key + " ' "
					+ " is missing in propertyies file '" + Constant.PROPERTIES_MISSING_FROM_PROPERTY_FILE + " '.");
		}

		return value;
	}

	public String getTimeStamp() {

		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return ((dateFormat.format(now)).replace(":", "").replace(" ", ""));

	}

	public void createDir() {

		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		String time = dateFormat.format(now);
		File dir = new File(time);
		dir.mkdir();

	}

	public String createAnyDir(String basePath, String dirName) {

		String dirPath = basePath + "\\" + dirName;
		File directory = new File(dirPath);
		File rootPath = new File(basePath);

		if (!rootPath.exists()) {
			rootPath.mkdir();
		}

		if (!directory.exists()) {
			directory.mkdir();
		}

		return dirPath;

	}

	public String getCurrentDateByFormate(String format) {

		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		String curDate = dateFormat.format(now);
		return curDate;
	}

	public static boolean isPortable() {
		return isPortable;
	}

	public static void setPortable(boolean isPortable) {
		Utilities.isPortable = isPortable;
	}

	public String getDateFromCustomeTimeZone(String dateString) {

		String newDate = "";
		try {
			SimpleDateFormat originalFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
			SimpleDateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = originalFormat.parse(dateString);
			newDate = targetFormat.format(date);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return newDate;

	}

	public String getNanoSecDateStringFromMilliSecond(long millliSeconds) {

		String dateString = "";
		try {

			Date date = new Date(millliSeconds);
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			dateString = formatter.format(date);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return dateString;

	}

	public String getDateStringFromMilliSecond(long millliSeconds) {

		String dateString = "";
		try {

			Date date = new Date(millliSeconds);
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			dateString = formatter.format(date);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return dateString;

	}

	public void setBrowserPath() throws IOException {

		ResourceBundle resourceBundle = ResourceBundle.getBundle("config");
		String env = System.getenv(Constant.RUN_PLATFROM);

		if (env.equalsIgnoreCase("DEV")) {

			driverPath = resourceBundle.getString("DEV");

		} else if (env.equalsIgnoreCase("TEST")) {

			driverPath = resourceBundle.getString("TEST");

		} else if (env.equalsIgnoreCase("PROD")) {

			driverPath = resourceBundle.getString("PROD");

		}

		log.info("Current Environment ...." + env);
		log.info("Browser Driver Path ...." + driverPath);
	}

	private DesiredCapabilities getIECapabilities() {

		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("EnableNativeEvents", false);
		caps.setCapability("IgnoreZoomSetting", true);
		// caps.setCapability("requireWindowFocus", true);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		caps.setCapability(InternetExplorerDriver.SILENT, true);
		caps.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "http://www.google.com/");
		return caps;

	}

	private DesiredCapabilities phantomCapabilities() {

		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setJavascriptEnabled(true);
		caps.setCapability("takeScreenshot", true);
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, driverPath + ghostDriver);
		return caps;

	}

	private ChromeOptions getChromeOptions() {

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--start-maximized");
		ops.addArguments("--disable-plugins");
		ops.addArguments("--disable-extensions");
		ops.addArguments("--disable-infobars");
		ops.setExperimentalOption("useAutomationExtension", false);
		ops.addArguments("--disable-extensions");
		ops.addArguments("--dns-prefetch-disable");
		ops.addArguments("--disable-gpu");
		ops.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		// ops.addArguments("--incognito");
		return ops;
	}

	private ChromeOptions getHeadlessChromeOptions() {

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--start-maximized");
		ops.addArguments("--disable-plugins");
		ops.addArguments("--disable-extensions");
		ops.addArguments("--disable-infobars");
		ops.setExperimentalOption("useAutomationExtension", false);
		ops.addArguments("headless");
		return ops;
	}

	public WebDriver selectBrowserDriver(String browser, String url, String driverPath) throws IOException {

		if (browser.equalsIgnoreCase("IE") || browser.equalsIgnoreCase("IETERNET EXPLORER")) {
			System.setProperty("webdriver.ie.driver", driverPath + ieDriver);
			DesiredCapabilities capabilities = getIECapabilities();
			driver = new InternetExplorerDriver(capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));

		} else if (browser.equalsIgnoreCase("FIREFOX") || browser.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver", driverPath + geckoDriver);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			driver = new FirefoxDriver(capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("CHROME") || browser.equalsIgnoreCase("GOOGLE")) {
			System.setProperty("webdriver.chrome.driver", driverPath + chromeDriver);
			ChromeOptions options = getChromeOptions();
			driver = new ChromeDriver(options);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("EDGE") || browser.equalsIgnoreCase("MicrosoftWebDriver")) {
			System.setProperty("webdriver.edge.driver", driverPath + edgeDriver);
			EdgeOptions options1 = new EdgeOptions();
			driver = new EdgeDriver(options1);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("GHOST") || browser.equalsIgnoreCase("PHANTOM")) {
			// System.setProperty("phantomjs.binary.path", driverPath +
			// ghostDriver);
			DesiredCapabilities capabilities = phantomCapabilities();
			driver = new PhantomJSDriver(capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("GHOST") || browser.equalsIgnoreCase("PHANTOM")) {

			DesiredCapabilities capabilities = phantomCapabilities();
			driver = new PhantomJSDriver(capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("HeadLess") || browser.equalsIgnoreCase("HeadLessChrome")) {
			System.setProperty("webdriver.chrome.driver", driverPath + chromeDriver);
			ChromeOptions options = getHeadlessChromeOptions();
			driver = new ChromeDriver(options);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		}
		return driver;

	}

	public WebDriver selectBrowserDriver(String browser, String url) throws IOException {

		if (browser.equalsIgnoreCase("IE") || browser.equalsIgnoreCase("IETERNET EXPLORER")) {
			System.setProperty("webdriver.ie.driver", driverPath + ieDriver);
			DesiredCapabilities capabilities = getIECapabilities();
			capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, url);
			driver = new InternetExplorerDriver(capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));

		} else if (browser.equalsIgnoreCase("FIREFOX") || browser.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver", driverPath + geckoDriver);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			driver = new FirefoxDriver(capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.navigate().to(url);

		} else if (browser.equalsIgnoreCase("CHROME") || browser.equalsIgnoreCase("GOOGLE")) {
			System.setProperty("webdriver.chrome.driver", driverPath + chromeDriver);
			ChromeOptions options = getChromeOptions();
			driver = new ChromeDriver(options);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.navigate().to(url);

		} else if (browser.equalsIgnoreCase("EDGE") || browser.equalsIgnoreCase("MicrosoftWebDriver")) {
			System.setProperty("webdriver.edge.driver", driverPath + edgeDriver);
			EdgeOptions options1 = new EdgeOptions();
			driver = new EdgeDriver(options1);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.navigate().to(url);

		} else if (browser.equalsIgnoreCase("GHOST") || browser.equalsIgnoreCase("PHANTOM")) {

			DesiredCapabilities capabilities = phantomCapabilities();
			driver = new PhantomJSDriver(capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("HeadLess") || browser.equalsIgnoreCase("HeadLessChrome")) {
			System.setProperty("webdriver.chrome.driver", driverPath + chromeDriver);
			ChromeOptions options = getHeadlessChromeOptions();
			driver = new ChromeDriver(options);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		}
		return driver;

	}

	public WebDriver selectBrowserDriver(String browser) throws IOException {

		if (browser.equalsIgnoreCase("IE") || browser.equalsIgnoreCase("IETERNET EXPLORER")) {
			System.setProperty("webdriver.ie.driver", driverPath + ieDriver);
			DesiredCapabilities capabilities = getIECapabilities();
			driver = new InternetExplorerDriver(capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));

		} else if (browser.equalsIgnoreCase("FIREFOX") || browser.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver", driverPath + geckoDriver);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			driver = new FirefoxDriver(capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("CHROME") || browser.equalsIgnoreCase("GOOGLE")) {
			System.setProperty("webdriver.chrome.driver", driverPath + chromeDriver);
			ChromeOptions options = getChromeOptions();
			driver = new ChromeDriver(options);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("EDGE") || browser.equalsIgnoreCase("MicrosoftWebDriver")) {
			System.setProperty("webdriver.edge.driver", driverPath + edgeDriver);
			EdgeOptions options1 = new EdgeOptions();
			driver = new EdgeDriver(options1);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("GHOST") || browser.equalsIgnoreCase("PHANTOM")) {

			DesiredCapabilities capabilities = phantomCapabilities();
			capabilities.setCapability("phantomjs.binary.path", driverPath + ghostDriver);
			driver = new PhantomJSDriver(capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("HeadLess") || browser.equalsIgnoreCase("HeadLessChrome")) {
			System.setProperty("webdriver.chrome.driver", driverPath + chromeDriver);
			ChromeOptions options = getHeadlessChromeOptions();
			driver = new ChromeDriver(options);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		}

		return driver;

	}

	public static String getCompleteFilePath(String projectName, String rootFolder) {

		String completeFilePath = System.getenv(ApplicationConstants.ROOT_PATH) + projectName + rootFolder;
		return completeFilePath;
	}

}
