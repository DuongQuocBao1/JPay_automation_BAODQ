package com.jpay.media.automation.web.baseobjects;


import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import com.jpay.media.automation.web.constants.ApplicationConstants;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.BaseRobotUtility;
import com.jpay.media.automation.web.utilities.ExtentManager;
import com.jpay.media.automation.web.utilities.Log;

public class BasePageObject extends Assertion {

	protected WebDriver driver;
	public WebDriverWait wait;
	public ExtentManager extent=ExtentManager.getInstance();
	public BaseRobotUtility robot = new BaseRobotUtility();

	public BasePageObject(WebDriver driver) {

		this.driver = driver;
		wait = new WebDriverWait(driver, ApplicationConstants.WEBDRIVER_WAIT_TIMEOUT);
	}

	protected WebDriver getDriver() {

		return this.driver;
	}

	/*--------------------------Webdriver Common Methods-----------------------------
	 * -------------------------Webdriver Common Methods------------------------------
	 * -------------------------Webdriver Common Methods------------------------------*/

	// Clicking an element
	public void click(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		logging("Clicking on : " + element.getText());
		element.click();
	}

	// Clicking an element
	public void clickAndLogByValue(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		logging("Clicking on : " + element.getAttribute("value"));
		element.click();
	}

	// Clicking an element using JavaScript executor
	public void jsScrollElementToView(WebElement element) {
		//wait.until(ExpectedConditions.elementToBeClickable(element));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);

	}


	// Clicking an element using JavaScript executor
	public void jsClick(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	// Clearing an input field
	public void clear(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.clear();
	}

	// Entering text to an input field
	public void setText(WebElement element, String text) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		clear(element);
		logging("Entering Value : ' " + text+" '");
		element.sendKeys(text);
	}

	// Selecting an element from a drop down box by index
	public void selectElementByIndex(WebElement ele, int index) {
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		Select sl = new Select(ele);
		sl.selectByIndex(index);
	}

	// Selecting an element from a drop down box by value
	public void selectElementByValue(WebElement ele, String value) {
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		Select sl = new Select(ele);
		sl.selectByValue(value);
	}

	// Selecting an element from a drop down box by visible text
	public void selectElementByVisibleText(WebElement ele, String text) {
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		Select sl = new Select(ele);
		sl.selectByVisibleText(text);
	}

	// Java Thread Wait
	public void pause(int milliSecond) {
		try {
			Thread.sleep(milliSecond);
		} catch (Exception e) {

		}
	}

	// KeyBoard Tab by referring an element
	public void pressTab(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(Keys.TAB);
	}

	// KeyBoard Tab
	public void pressTab() {
		Actions act = new Actions(getDriver());
		act.sendKeys(Keys.TAB).build().perform();
	}

	// KeyBoard Enter by referring an element
	public void pressEnter(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(Keys.ENTER);
	}

	// KeyBoard Enter
	public void pressEnter() {
		Actions act = new Actions(getDriver());
		act.sendKeys(Keys.ENTER).build().perform();
	}

	// KeyBoard Space by referring an element
	public void pressSpace(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(Keys.SPACE);
	}

	// KeyBoard Space
	public void pressSpace() {
		Actions act = new Actions(getDriver());
		act.sendKeys(Keys.SPACE).build().perform();
	}
	
	public void sendKeys(String text) {
		Actions act = new Actions(getDriver());
		act.sendKeys("");
	}

	// Mouse over on an element
	public void hover(WebElement eleToHover) {
		wait.until(ExpectedConditions.elementToBeClickable(eleToHover));
		Actions act = new Actions(getDriver());
		act.moveToElement(eleToHover).build().perform();
	}

	// Mouse over on an element
	public void hoverAndClick(WebElement eleToHover, WebElement elementToClick) {
		Actions act = new Actions(getDriver());
		wait.until(ExpectedConditions.elementToBeClickable(eleToHover));
		act.moveToElement(eleToHover).build().perform();
		act.moveToElement(elementToClick).click().perform();
	}

	// Boolean return method to display element visibility
	public boolean isElementDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// Boolean return method to verify element enable
	public boolean isElementEnable(WebElement element) {
		return element.isEnabled();
	}

	// Boolean return method to verify element selected
	public boolean isElementSelected(WebElement element) {
		return element.isSelected();
	}

	// Verifying text using testng assertion
	public void assertionText(WebElement element, String text) {
		wait.until(ExpectedConditions.visibilityOf(element));
		logging("<b>Actual :  </b>" + element.getText() + "  || " + "<b>Expected :  </b>" + text);
		Assert.assertEquals(element.getText().trim(), text);
	}
	
	// Verifying text using testng assertion
	public void assertionText(String label,WebElement element, String text) {
		wait.until(ExpectedConditions.visibilityOf(element));
		logging("<b>"+label+" :: "+"</b>"+"<b>Actual :  </b>" + element.getText().trim() + "  || " + "<b>Expected :  </b>" + text);
		Assert.assertEquals(element.getText().trim(), text);
	}

	// Verifying text using testng assertion
	public void assertionText(String text1, String text2) {
		logging("<b>Actual :  </b>" + text1 + "  || " + "<b>Expected :  </b>" + text2);
		Assert.assertEquals(text1, text2);
	}
	
	// Verifying text using testng assertion
	public void assertionText(String label,String text1, String text2) {
		logging("<b>"+label+" :: "+"</b>"+"<b>Actual :  </b>" + text1 + "  || " + "<b>Expected :  </b>" + text2);
		Assert.assertEquals(text1, text2);
	}

	// Verifying Boolean condition testng assertion
	public void assertBooleanTrue(boolean trueStatement) {
		Assert.assertTrue(trueStatement);
	}

	// Verifying Boolean condition testng assertion
	public void assertBooleanFalse(boolean falseStatement) {
		Assert.assertFalse(falseStatement);
	}

	// Get element Text
	public String getText(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}

	// Get element Text by element attribute value
	public String getTextByValue(WebElement element) {
		return element.getAttribute("value");
	}

	// Get element tagname
	public String getTagname(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getTagName();
	}
	
	public boolean isElementaLink(String tagname){
		
		if (tagname.contentEquals("a")) {
			
			return true;
		} else {

			return false;
		}
	}

	// Get Title of the page
	public String getPageTitle() {
		return getDriver().getTitle();
	}

	// Mouse over on an element
	public void loadURL(String url, String variation) {

		//clearBrowsingDataChrome();
		getDriver().manage().deleteAllCookies();
		getDriver().navigate().to(url);
		logging("Navigating to the URL :  '" + url + "'  For RowID : " + variation);
	}
	
	public  WebElement expandRootElement(WebElement element) {
	    WebElement ele = (WebElement) ((JavascriptExecutor) driver)
	            .executeScript("return arguments[0].shadowRoot", element);
	    return ele;
	}
	
	public void clearBrowsingDataChrome(){
		
		getDriver().navigate().to("chrome://settings/clearBrowserData");
		WebElement root1 = driver.findElement(By.cssSelector("settings-ui"));
	    // get 1st shadowroot element
	    WebElement shadowRoot1 = expandRootElement(root1);

	    // get 2nd parent
	    WebElement root2 = shadowRoot1.findElement(By.cssSelector("settings-main"));
	    // get 2nd shadowroot element
	    WebElement shadowRoot2 = expandRootElement(root2);

	    // get 3rd parent
	    WebElement root3 = shadowRoot2.findElement(By.cssSelector("settings-basic-page"));
	    // get 3rd shadowroot element
	    WebElement shadowRoot3 = expandRootElement(root3);

	    // get 4th parent
	    WebElement root4 = shadowRoot3.findElement(By.cssSelector("settings-section > settings-privacy-page"));
	    // get 4th shadowroot element
	    WebElement shadowRoot4 = expandRootElement(root4);

	    // get 5th parent
	    WebElement root5 = shadowRoot4.findElement(By.cssSelector("settings-clear-browsing-data-dialog"));
	    // get 5th shadowroot element
	    WebElement shadowRoot5 = expandRootElement(root5);

	    // get 6th parent
	    WebElement root6 = shadowRoot5.findElement(By.cssSelector("#clearBrowsingDataDialog"));
	    WebElement root7 = root6.findElement(By.cssSelector("cr-tabs[role='tablist']"));
	    root7.click();
	    
	    WebElement clearDataButton = root6.findElement(By.cssSelector("#clearBrowsingDataConfirm"));
	    clearDataButton.click(); 
	}
	
	public void refresh() {

		getDriver().navigate().refresh();
	}

	public void loadURL(String url) {

		getDriver().navigate().to(url);
		logging("Navigating to the URL :  '" + url);
	}

	public void logging(String msg) {

		extent.log(msg);
		Log.info(msg);
	}
	
	public void loggingFromClipboard(String msg) {
		try {
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			StringSelection stringSelection = new StringSelection(msg);
			clipboard.setContents(stringSelection, stringSelection);
			String a =  (String) stringSelection.getTransferData(DataFlavor.stringFlavor);
			//String data = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
			extent.log(a);
			Log.info(a);
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedFlavorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void loggingWithLabel(String msg) {

		extent.labelLog(msg);
		Log.info(msg);
	}

	public void verifyTitle(String title) {
		pause(1000);
		//wait.until(ExpectedConditions.titleContains(title));
		String actTitle = getPageTitle().toString();
		logging("Actual Title :  " + actTitle + "  ||  Expected Title :  " + title);
		Assert.assertEquals(actTitle, title);
	}

	public static String getEnvVariable(String key) {
		return System.getenv(key);
	}
	
	public void enterText(String text){
		
		robot.typeEx(text);
		robot.pressTabKey();
	}
	
	public void navigateBrowserBack(){
		
		pause(1000);
		getDriver().navigate().back();
	}
	
	public void enterFilePathInExplorerUsingRobot(String filePath){
		
		logging("File attaching : "+filePath);
		robot.typeEx(filePath);
		robot.pressTabKey();
		robot.pressTabKey();
		robot.pressEnter();
	}
	
	public  boolean isAlertPresent(){
	      try{
	    	  getDriver().switchTo().alert();
	          return true;
	      }catch(NoAlertPresentException ex){
	          return false;
	      }
	}
	
	public void acceptAlert(){
		
		Alert alert = getDriver().switchTo().alert();
		alert.accept();
		getDriver().switchTo().defaultContent();
		logging("Clicking on Ok from alert.");
	}
	
	
	public String getAlertText(){
		
		Alert alert = getDriver().switchTo().alert();
		return alert.getText();
	}
	
	public void verifyAlertText(String text){
		
		assertionText("Alert Text :: ",getAlertText(), text);
	}
	
	public void declineAlert(){
		
		Alert alert = getDriver().switchTo().alert();
		alert.dismiss();
		getDriver().switchTo().defaultContent();
		logging("Clicking on Cancel from alert.");
	}
	
	public void switchToIframeById(String id){
		
		//getDriver().switchTo().frame(id);
	}
	
	public void switchToParentWindow(){
		
		//getDriver().switchTo().defaultContent();	
	}
	
	public void closeChildWindowUsingRobot(){
		
		logging("Closing the child window.");
		robot.pressControlF4();
	}
	
	public String getPDFContent(String filePath){
		
		String extractedText = null;

		try {
           
            PDDocument pdDocument=PDDocument.load(filePath);
            int totalPages= pdDocument.getNumberOfPages();
            Log.info("Total pages: " +totalPages);
            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setStartPage( 1 );
            stripper.setEndPage( totalPages );
           extractedText= stripper.getText(pdDocument);
            Log.info(extractedText);
    		logging("PDF Document Content Captured : "+extractedText);
        } catch (IOException e) {
           
        	e.printStackTrace();
        	
        }finally {
        	
        	 File file = new File(filePath);
             if(file.delete()) { 
            	 
            	 Log.info(file.getName() + " is deleted!");
             } else {
            	 
            	 Log.info("Delete operation is failed.");
        		}
             
		}
		return extractedText;
	}
	
	public String getUsername(){
		
		return System.getProperty("user.name");
	}
	
	public String getImageName(WebElement element){
		
		String imageSrc= element.getAttribute("src");
		String[]splitImage = imageSrc.split("/");
		int size= splitImage.length;
		return splitImage[size-1];
	}
	
	public void downloadPreviewPDF(String fileName){
		
		pause(10000);
		String completeFilePath=PageConstant.TEST_FILE_PATH+fileName;
		robot.pressTabKey();
		robot.pressTabKey();
		robot.pressTabKey();
		robot.pressEnter();
		logging("Downloading PDF To : "+completeFilePath);
		robot.typeEx(completeFilePath);
		robot.pressEnter();
		pause(5000);
	}
	
	public boolean isPDFContentPresent(String pdfContent,String content){
		
		if (pdfContent.contains(content)) {
			
			return true;
		}
		return false;
	}
	
	public void verifyPdfContentPresent(String pdfContent,String content){
		
		logging("Content Present in PDF Document : "+isPDFContentPresent(pdfContent,content));
		logging("Content Present in PDF Document : "+content);
		assertTrue(isPDFContentPresent(pdfContent,content));
	
	}
	
	public boolean isPDFContentPresentToUpperCase(String pdfContent,String content){
		
		if (pdfContent.contains(content.toUpperCase())) {
			
			return true;
		}
		return false;
	}
	
	public void verifyPdfContentPresentToUpperCase(String pdfContent,String content){
		
		logging("Content Present in PDF Document : "+isPDFContentPresentToUpperCase(pdfContent,content));
		assertTrue(isPDFContentPresentToUpperCase(pdfContent,content));
	
	}

	public void navigateToChildWindow() {

		pause(1000);
		String mainwindow = getDriver().getWindowHandle(); 
		for (String popup : getDriver().getWindowHandles()) 
		{
			getDriver().switchTo().window(popup);
			
		}
		logging("Switching to child window.");

	}

	public void navigateToWindowByTitle(String title) {

		String currentWindow = getDriver().getWindowHandle(); 
		for (String winHandle : getDriver().getWindowHandles()) {
			if (getDriver().switchTo().window(winHandle).getTitle().equals(title)) {

				logging("Switching to window : "+getDriver().getCurrentUrl());
				break;
			} else {
				getDriver().switchTo().window(currentWindow);
			}
		}

	}
	
	public void switchToMainWindow(){
		
		pause(200);
		for (String main : getDriver().getWindowHandles()) 
		{
			getDriver().switchTo().window(main);
			logging("Switching to Main window.");
			
		}
		pause(500);
	}
	
	// Get Url of the page
	public String getPageUrl() {
		return getDriver().getCurrentUrl();
	}


	public void verifyUrl(String url) {
	
		logging("Actual URL :  " + getPageUrl() + "  ||  Expected URL :  " + url);
		Assert.assertEquals(getPageUrl(), url);
	}
	
	public String getBackgroundColor(WebElement element){
		
		String color = element.getCssValue("background-color");
		String hexColor=Color.fromString(color).asHex();
		return hexColor;
	}
	
	public String getTextColor(WebElement element){
		
		String color = element.getCssValue("color");
		String hexColor=Color.fromString(color).asHex();
		return hexColor;
	}
	
	
	
}
