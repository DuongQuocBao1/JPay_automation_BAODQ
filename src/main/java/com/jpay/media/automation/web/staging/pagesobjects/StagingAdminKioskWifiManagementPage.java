package com.jpay.media.automation.web.staging.pagesobjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class StagingAdminKioskWifiManagementPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public StagingAdminKioskWifiManagementPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/***********************************************
	 * CONSTRUCTOR****************************************
	 **************************************************************************************************
	 **************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/


	// Inmate Account Management Link
	@FindBy(xpath = "(//*[contains(text(),'Kiosk/Wifi Tablet Management')])[1]")
	private WebElement kioskWifiTabletManagementLink;

	// Inmate Kiosk Details Management Link
	@FindBy(xpath = "//a[@id='lnkOutMail']")
	private WebElement inmateKioskDetailsManagementLink;

	// Inmate Kiosk Details Management Link
	@FindBy(xpath = "//*[@id='ddlFacilities_chosen']")
	private WebElement chooseAgency;

	// Inmate Kiosk Details Management Link
	@FindBy(xpath = "//*[@id='ddlPermlocs_chosen']")
	private WebElement chooseFacility;

	// Kiosk Id  search input box
	@FindBy(xpath = "//*[@id='tbKioskIDtoSearch']")
	private WebElement enterKioskIdInputBox;

	// Search button
	@FindBy(xpath = "//*[@id='btnSearchKiosk']")
	private WebElement searchButton;

	// Grievance check box 
	@FindBy(xpath = "//input[@id='cbGrievanceEnabled']")
	private WebElement grievanceCheckBox;

	// Save button
	@FindBy(xpath = "//*[@id='btnEditKiosk']")
	private WebElement saveButton;

	// Save Success Message
	@FindBy(xpath = "//*[@id='lblUpdateKioskSuccess']")
	private WebElement saveSuccessText;


	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/
	
	
	

	/*************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD*********************
	 *************************************************************************************************/

	public void clickKioskWifiTabletMangementLink() {

		click(kioskWifiTabletManagementLink);
	}
	
	public void clickInmateKioskDetailsMangementLink() {

		click(inmateKioskDetailsManagementLink);
	}

	public void clickInmateKioskMangementChooseAgency() {

		click(chooseAgency);
	}

	public void clickInmateKioskMangementChooseFacility() {

		click(chooseFacility);
	}

	public void selectInmateKioskMangementAgency(String agency,String env) {

		pause(500);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[@class='chosen-search']//input)[1]")));
		setText(element, agency);
		pause(500);
		logging("Selecting Agency :  " + agency);
		if (agency.equalsIgnoreCase("JPAY")&&!env.equalsIgnoreCase("DEV2")) {

			element.sendKeys(Keys.ARROW_DOWN);
			
		}
		
		if (agency.equalsIgnoreCase("JPAY")&&env.equalsIgnoreCase("DEV2")) {

			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ARROW_DOWN);
		}
		pressEnter(element);
	}

	public void selectInmateKioskMangementFacility(String facility) {

		pause(500);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[@class='chosen-search']//input)[2]")));
		setText(element, facility);
		element.sendKeys(Keys.ARROW_DOWN);
		pause(500);
		pressEnter(element);
		logging("Selecting Facility :  " + facility);
		
	}

	public void enterKioskId(String kioskId){
		
		setText(enterKioskIdInputBox, kioskId);
	}
	
	public void clickSearchButton(){
		
		click(searchButton);
	}
	
	public void clickInmateKioskManagementEditButton(String kioskId){
		
		WebElement element = getDriver().findElement(By.xpath("(.//span[text()='"+kioskId+"']//preceding::a//following::a[text()='Edit'])[1]"));
		click(element);
	}
	
	public void checkInmateKioskManagementGrievanceCheckbox() {

		logging("Checking :  Grievance Checkbox");
		if (!grievanceCheckBox.isSelected()) {
			pressSpace(grievanceCheckBox);
		}
	}

	public void uncheckInmateKioskManagementGrievanceCheckbox() {

		logging("Unchecking : Grievance Checkbox");
		if (grievanceCheckBox.isSelected()) {
			pressSpace(grievanceCheckBox);
		}
	}

	public void clickInmateKioskMangementSaveButton() {

		click(saveButton);
	}
	
	public void verifyInmateKioskManagementSaveSuccessText(String text){
		
		assertionText("Success Message", saveSuccessText, text);
	}

	
	
	

	/*************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD*********************
	 *************************************************************************************************/
	

	
	
	
	
	
	
	
	
	
}

//
