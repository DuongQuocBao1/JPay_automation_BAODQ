package com.jpay.media.automation.web.staging.pagesobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class StagingAdminInmateAccountManagementPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public StagingAdminInmateAccountManagementPage(WebDriver driver) {
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

	// Inmate Account Management Link1
	@FindBy(xpath = "(//*[contains(text(),'Inmate Account Management')])[1]")
	private WebElement inmateAccountManagementLink1;

	// Inmate Account Management Link2
	@FindBy(xpath = "(//*[contains(text(),'Inmate Account Management')])[2]")
	private WebElement inmateAccountManagementLink2;

	// Choose Facility
	@FindBy(xpath = "(//span[contains(text(),'Choose Facility')])[2]")
	private WebElement chooseFacility;

	// Insert Inmate Id
	@FindBy(xpath = "//input[contains(@id,'ucSearchInmate_tbInmateID')]")
	private WebElement insertInmateId;

	// Edit Button
	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	private WebElement editButton;

	// Update Button
	@FindBy(xpath = "//a[contains(text(),'Update')]")
	private WebElement updateButton;

	// Cancel Button
	@FindBy(xpath = "//a[contains(text(),'Cancel')]")
	private WebElement cancelButton;

	// View Inmate Account Details Button
	@FindBy(xpath = "//input[contains(@id,'ucSearchInmate_btnView')]")
	private WebElement viewAccDetailsButton;

	// View Inmate Account Details Button
	@FindBy(xpath = "//input[contains(@id,'dgInmateKioskPermissions_ctl03_cbGrievanceAllowedE')]")
	private WebElement grievanceAllowedCheckBox;
	// Communication message size limit
	@FindBy(xpath = "//input[@id='tbGrievanceMessageSizeLimit']")
	private WebElement communicationMessageSizeLimit;

	// Number of free communication prints
	@FindBy(xpath = "//input[@id='tbGrievanceFreePrintQty']")
	private WebElement numberFreeCommPrints;

	// Communication cost per print
	@FindBy(xpath = "//input[@id='tbGrievancePrintCost']")
	private WebElement commCostPerPrint;

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/

	public void clickInmateAccountManagement() {

		click(inmateAccountManagementLink1);
	}

	public void verifyInmateAccountManagementText(String text) {

		assertionText(inmateAccountManagementLink2, text);
	}

	public void clickChooseFacility() {

		click(chooseFacility);
	}

	public void selectFacility(String Facility) {

		pause(1000);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(".//div[@class='chosen-search']//input")));
		setText(element, Facility);
		pause(1000);
		logging("Selecting Facility :  " + Facility);
		if (Facility.equalsIgnoreCase("JPAY")) {

			element.sendKeys(Keys.ARROW_DOWN);
		}
		pressEnter(element);
	}

	public void clickViewInmateAccDetailsButton() {

		logging("Clicking on : View Inmate Account Details");
		click(viewAccDetailsButton);
	}

	public void enterInmateId(String text) {

		setText(insertInmateId, text);
	}

	public void clickEditButton() {

		click(editButton);
	}

	public void clickUpdateButton() {

		click(updateButton);
	}

	public void clickCancelButton() {

		click(cancelButton);
	}

	public void checkGrievanceAllowedCheckBox() {

		logging("Checking :  Tab Grievance Checkbox");
		if (grievanceAllowedCheckBox.isSelected()) {
			pressSpace(grievanceAllowedCheckBox);
		}
		if (!grievanceAllowedCheckBox.isSelected()) {
			pressSpace(grievanceAllowedCheckBox);
		}
	}

	public void uncheckGrievanceAllowedCheckBox() {

		logging("Unchecking :  Tab Grievance Checkbox");
		if (!grievanceAllowedCheckBox.isSelected()) {
			pressSpace(grievanceAllowedCheckBox);
		}
		if (grievanceAllowedCheckBox.isSelected()) {
			pressSpace(grievanceAllowedCheckBox);
		}
	}

	public void enterCommMsgSizeLimit(String num) {

		setText(communicationMessageSizeLimit, num);
	}

	public void enterNumFreeCommPrints(String num) {

		setText(numberFreeCommPrints, num);
	}

	public void enterCommCostPerPrint(String num) {

		setText(commCostPerPrint, num);
	}

}
//
