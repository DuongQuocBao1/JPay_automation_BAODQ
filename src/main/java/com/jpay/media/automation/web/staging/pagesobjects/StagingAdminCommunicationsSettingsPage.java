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

public class StagingAdminCommunicationsSettingsPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public StagingAdminCommunicationsSettingsPage(WebDriver driver) {
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


	// CommunicationSettings Link
	@FindBy(xpath = "//a[@id='lnkManageGrievanceSettings']")
	private WebElement communicationSettingsLink;

	// Select Agency Combo box
	@FindBy(xpath = "//select[@id='uclFacilitiesDropDown_ddlFacilities']")
	private WebElement selectAgencyComboBox;

	// Select Facility Combo box
	@FindBy(xpath = "//select[@id='uclFacilitiesDropDown_ddlPermLocs']")
	private WebElement selectFacilityComboBox;

	// Grievance check box 
	@FindBy(xpath = "//input[@id='cbIsGrievanceEnabled']")
	private WebElement grievanceCheckBox;

	// Kiosk Print check box 
	@FindBy(xpath = "//input[@id='cbKioskPrintButtonEnabled']")
	private WebElement kioskPrintButtonCheckBox;

	// CSave Settings Link
	@FindBy(xpath = "//input[@id='ButtonMaintGrievanceSettings']")
	private WebElement saveSettingsButton;

	// Communication Settings update success message
	@FindBy(xpath = "//span[@id='lblUpdateSucceed']")
	private WebElement UpadateSuccessMessage;
	// Number of active communications allowed
    @FindBy(xpath = "//input[@id='tbMaxnumberOfGrievances']")
    private WebElement numActiveCommunicationsAllowed;

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
	
	
	

	/*************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD*********************
	 *************************************************************************************************/

	public void clickCommunicationSettingsLink() {

		click(communicationSettingsLink);
	}
	
	public void selectAgency(String agency){
		
		logging("Facility Selected : "+ agency);
		selectElementByVisibleText(selectAgencyComboBox, agency);
	}
	
	public void selectFacility(String facility){
		
		logging("Permloc Selected : "+ facility);
		selectElementByVisibleText(selectFacilityComboBox, facility);
	}
	
	public void checkGrievanceEnabledCheckbox() {

		logging("Checking :  Grievance Checkbox");
		
		if (grievanceCheckBox.isSelected()) {
			pressSpace(grievanceCheckBox);
		}
		
		if (!grievanceCheckBox.isSelected()) {
			pressSpace(grievanceCheckBox);
		}
	}

	public void uncheckGrievanceEnabledCheckbox() {

		logging("Unchecking : Grievance Checkbox");
		
		if (!grievanceCheckBox.isSelected()) {
			pressSpace(grievanceCheckBox);
		}
		
		if (grievanceCheckBox.isSelected()) {
			pressSpace(grievanceCheckBox);
		}
	}
	
	public void checkKioskPrintButtonEnabledCheckbox() {

		logging("Checking :  KioskPrintButtonEnabled Checkbox");
		
		if (kioskPrintButtonCheckBox.isSelected()) {
			pressSpace(kioskPrintButtonCheckBox);
		}
		
		if (!kioskPrintButtonCheckBox.isSelected()) {
			pressSpace(kioskPrintButtonCheckBox);
		}
	}

	public void uncheckKioskPrintButtonEnabledCheckbox() {

		logging("Unchecking : KioskPrintButtonEnabled Checkbox");
		
		if (!kioskPrintButtonCheckBox.isSelected()) {
			pressSpace(kioskPrintButtonCheckBox);
		}
		
		if (kioskPrintButtonCheckBox.isSelected()) {
			pressSpace(kioskPrintButtonCheckBox);
		}
	}

	public void clickCommunicationSaveSettingsButton() {

		logging("Clicking on : "+saveSettingsButton.getAttribute("value"));
		saveSettingsButton.click();;
	}
	
	public void verifyCommunicationSettingsUpdateMessage(String text){
	
		assertionText("Upadate Success Message", UpadateSuccessMessage, text);
	}
	public void enterNumActiveCommunicationsAllowed(String num) {

        setText(numActiveCommunicationsAllowed, num);
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



	

	/*************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD*********************
	 *************************************************************************************************/
	

	
	
	
	
	
	
	
	
	
}

//
