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

public class StagingAdministrationPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public StagingAdministrationPage(WebDriver driver) {
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

	// AgencySettingsLink1
	@FindBy(xpath = "(//*[contains(text(),'Agency Settings')])[1]")
	private WebElement agencySettingsLink1;

	// AgencySettingsLink2
	@FindBy(xpath = "(//*[contains(text(),'Agency Settings')])[2]")
	private WebElement agencySettingsLink2;

	// Choose Facility
	@FindBy(xpath = "//span[contains(text(),'Choose Facility')]")
	private WebElement chooseFacility;

	// Facility Web Site
	@FindBy(xpath = "//a[contains(text(),'Facility Web Site')]")
	private WebElement linkFacilityWebSite;

	// Facility Tab Edit Button
	@FindBy(xpath = "//table[contains(@id,'uclFacilitySettingsFacilityWebSite_dgFacilitySiteTabs')]//td/a[contains(text(),'Edit')]")
	private WebElement tabEditButton;

	// Facility Tab Grievance
	@FindBy(xpath = "//input[@id='uclFacilitySettingsFacilityWebSite_dgFacilitySiteTabs_ctl03_cbTabGrievanceEnabled']")
	private WebElement tabGrievanceCheckBox;

	// Facility Tab Edit Button
	@FindBy(xpath = "//table[contains(@id,'uclFacilitySettingsFacilityWebSite_dgFacilitySiteTabs')]//td/a[contains(text(),'Update')]")
	private WebElement tabUpdateButton;

	// Facility Tab Edit Button
	@FindBy(xpath = "//table[contains(@id,'uclFacilitySettingsFacilityWebSite_dgFacilitySiteTabs')]//td/a[contains(text(),'Cancel')]")
	private WebElement tabCancelButton;

	// MONEY ORDERS
	@FindBy(xpath = "//*[contains(text(),'MONEY ORDERS')]")
	private WebElement linkMoneyOrders;

	// Sign Out Button
	@FindBy(xpath = "//*[contains(text(),'Sign Out')]")
	private WebElement signoutButton;

	// Inbound mail administration link
	@FindBy(xpath = "(//*[contains(text(),'InBound Mail Administration')])[1]")
	private WebElement inboundMailAdministrationLink;

	// Inbound mail administration Text
	@FindBy(xpath = "(//u[contains(text(),'Mail Administration')])[1]")
	private WebElement mailAdministrationText;

	// Stamps Packages Link
	@FindBy(xpath = ".//a[@id='lnk_StampsPackages']")
	private WebElement stampsPackagesLink;

	// Inbound mail administration Text
	@FindBy(xpath = "(//u[contains(text(),'Manage Stamps Packages')])[1]")
	private WebElement manageStampsPackagesText;

	// Select Stamps manage Facility
	@FindBy(xpath = ".//select[@id='ddlFacility']")
	private WebElement selectStampsManageFacility;

	// Delete selected stamps packages
	@FindBy(xpath = ".//a[@id='lnkDeletePackage']")
	private WebElement deleteSelectedPackages;

	// Add New stamps packages
	@FindBy(xpath = ".//a[@id='lnkAddPackage']")
	private WebElement addNewPackages;

	// Package Name Input box
	@FindBy(xpath = ".//input[@id='tbAddName']")
	private WebElement packageNameInput;

	// Package Type Input box
	@FindBy(xpath = ".//input[@id='tbAddType']")
	private WebElement packageTypeInput;

	// Package NO.Letters Input box
	@FindBy(xpath = ".//input[@id='tbAddNoLetters']")
	private WebElement packageNoLettersInput;

	// Package Description Input box
	@FindBy(xpath = ".//input[@id='tbAddDesc']")
	private WebElement packageDescInput;

	// Package Promotional Stamps Input box
	@FindBy(xpath = ".//input[@id='tbAddPromotionalStamps']")
	private WebElement packagePromotionalInput;

	// Package Date of expiry Input box
	@FindBy(xpath = ".//input[@id='tbAddExpirationDays']")
	private WebElement packageExpiryInput;

	// Package Add button
	@FindBy(xpath = ".//input[@id='btnAdd']")
	private WebElement packageAddButton;

	// Manage Word Filter Link
	@FindBy(xpath = ".//a[@id='lnkWordFilter']")
	private WebElement manageWordFilterLink;

	// Select Manage Word Filter Facility
	@FindBy(xpath = ".//select[@id='uclFacilitiesDropDown_ddlFacilities']")
	private WebElement selectManageWordFilterFacility;

	// Select Manage Word Filter PermLoc
	@FindBy(xpath = ".//select[@id='uclFacilitiesDropDown_ddlPermLocs']")
	private WebElement selectManageWordFilterPermLoc;

	// Manage Word to add as Filter input box
	@FindBy(xpath = ".//*[@id='tbWordsList']")
	private WebElement manageWordToAddAsFilterInput;

	// Manage Word Filter innsert button
	@FindBy(xpath = ".//*[@id='InsertWordsbtn']")
	private WebElement manageWordFilterInsertButton;

	// Manage Word Filter success insert message
	@FindBy(xpath = ".//*[@id='lblInsertMessage']")
	private WebElement manangeWordFilterSuccessInsertMsg;

	// Manage Word Filter success insert message
	@FindBy(xpath = ".//select[@id='lbWordsList']")
	private WebElement selectManageWordFilterWordList;

	// Manage Word Filter success insert message
	@FindBy(xpath = ".//*[@id='DeleteWordsFromAllbtn']")
	private WebElement manageWordFilterDeleteFromAllButton;

	// Manage Word Filter success delete message
	@FindBy(xpath = ".//*[@id='lblDeleteMessage']")
	private WebElement manangeWordFilterSuccessDeleteMsg;

	// Facilities Management Link
	@FindBy(xpath = "(//*[contains(text(),'Facilities Management')])[1]")
	private WebElement facilitiesManagementLink;

	// Facility Management - Main Page Text
	@FindBy(xpath = "//*[contains(text(),'Facility Management - Main Page')]")
	private WebElement facilityManagementMainPagetext;

	// Communications Settings Link
	@FindBy(xpath = "//*[contains(text(),'Communication Settings')]")
	private WebElement communicationSettingsLink;

	// Select Agency
	@FindBy(xpath = "//select[@id='uclFacilitiesDropDown_ddlFacilities']")
	private WebElement selectAgency;

	// Select PermLoc
	@FindBy(xpath = "//select[@id='uclFacilitiesDropDown_ddlPermLocs']")
	private WebElement selectPermLoc;

	// Communication/Grievance Enabled CheckBox
	@FindBy(xpath = "//input[@id='cbIsGrievanceEnabled']")
	private WebElement communicationsEnabledCheckBox;

	// Kiosk print button CheckBox
	@FindBy(xpath = "//input[@id='cbKioskPrintButtonEnabled']")
	private WebElement kioskPrintButtonCheckBox;

	// Save Settings Button
	@FindBy(xpath = "//input[@id='ButtonMaintGrievanceSettings']")
	private WebElement saveSettingsButton;

	// Update Message
	@FindBy(xpath = "//span[@id='lblUpdateSucceed']")
	private WebElement updateMsg;

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

	// Manage outbound settings link
	@FindBy(xpath = "//a[@id='lnkManageOutboundsettings']")
	private WebElement outboundSettingsLink;

	// Support Free PrePaid Letter Checkbox
	@FindBy(xpath = "//input[@id='cbSupportFreePrePaidLetter']")
	private WebElement supportFreePrePaidLetterCheckBox;

	// Outbound Settings update button
	@FindBy(xpath = "//input[@id='btnUpdate']")
	private WebElement outboundSettingsUpdateButton;

	// Choose Agency Outbound Settings
	@FindBy(xpath = "//span[contains(text(),'Choose Agency')]")
	private WebElement chooseAgencyOutboundSettings;

	// Choose Permloc Outbound Settings
	@FindBy(xpath = "//div[@id='uclFacilitiesDropDown_ddlPermLocs_chosen']//span")
	private WebElement choosePermLocOutboundSettings;

	// SupportPrepaidResponseLetterCheckBox Outbound Settings
	@FindBy(xpath = "//input[@id='cbSupportSelfAddressedLetters']")
	private WebElement supportPrepaidResponseLetterCheckBox;

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/

	public void clickAgencySettings() {

		click(agencySettingsLink1);
	}

	public void verifyAgencySettingsText(String text) {

		assertionText(agencySettingsLink2, text);
	}

	public void verifyFacilityName(String name) {

		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'" + name + "')]")));
		assertionText(element.getText().trim(), name);
	}

	public void clickChooseFacility() {

		click(chooseFacility);
	}

	public void selectFacility(String Facility) {

		pause(1000);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(".//div[@class='chosen-search']//input")));
		setText(element, Facility);
		logging("Selecting Facility :  " + Facility);
		pressTab(element);
	}

	public void clickFacilityWebsite() {

		click(linkFacilityWebSite);
	}

	public void clickFacilityTabEditButton() {

		click(tabEditButton);
	}

	public void checkTabGrievance() {

		logging("Checking :  Tab Grievance Checkbox");
		if (!tabGrievanceCheckBox.isSelected()) {
			pressSpace(tabGrievanceCheckBox);
		}
	}

	public void uncheckTabGrievance() {

		logging("Unchecking :  Tab Grievance Checkbox");
		if (tabGrievanceCheckBox.isSelected()) {
			pressSpace(tabGrievanceCheckBox);
		}
	}

	public void verifyTabGrievanceDisabled() {
		pause(1000);
		jsScrollElementToView(getDriver().findElement(By.xpath(".//*[contains(text(),'TabOnSiteVisitationEnabled')]")));
		boolean condition = tabGrievanceCheckBox.isEnabled();
		logging("Tab Grievance Checkbox is Disabled :  " + !condition);
		assertTrue(!condition);
	}

	public void verifyTabGrievanceEnabled() {
		pause(1000);
		boolean condition = tabGrievanceCheckBox.isEnabled();
		logging("Tab Grievance Checkbox is Enabled :  " + condition);
		assertTrue(condition);
	}

	public void clickFacilityTabUpdateButton() {

		click(tabUpdateButton);
	}

	public void clickFacilityTabCancelButton() {

		click(tabCancelButton);
	}

	public void clickInboundMailAdminstartionLink() {

		click(inboundMailAdministrationLink);
	}

	public void verifyMailAdministartionText(String text) {

		assertionText(mailAdministrationText, text);
	}

	public void clickStampsPakagesLink() {

		click(stampsPackagesLink);
	}

	public void verifyMangeStampsPackagesText(String text) {

		assertionText(manageStampsPackagesText, text);
	}

	public void selectStampsMenageFacility(String facility) {

		logging("Facility Selected : " + facility);
		selectElementByVisibleText(selectStampsManageFacility, facility);
	}

	public void checkStampsPackagesDeleteBox(String packageName) {

		logging("Checking Delete Checkbox of - " + packageName);
		WebElement element = getDriver()
				.findElement(By.xpath(".//span[contains(text(),'" + packageName + "')]//following::input[2]"));
		if (!element.isSelected()) {
			pressSpace(element);
		}
	}

	public void clickDeleteSelectedPackages() {

		click(deleteSelectedPackages);
	}

	public boolean isStampsPackagesVisible(String packageName) {

		try {
			pause(1000);
			return getDriver()
					.findElement(By.xpath(".//span[contains(text(),'" + packageName + "')]//following::input[2]"))
					.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	public void verifyDeletedStampsPackageAbsent(String packageName) {

		logging("Deleted Package is Absent : " + !isStampsPackagesVisible(packageName));
		assertTrue(!isStampsPackagesVisible(packageName));
	}

	public void verifyAddedStampsPackagePresent(String packageName) {

		logging("Deleted Package is Present : " + isStampsPackagesVisible(packageName));
		assertTrue(isStampsPackagesVisible(packageName));
	}

	public void clickAddNewPackages() {

		click(addNewPackages);
	}

	public void enterPackageName(String name) {

		setText(packageNameInput, name);
	}

	public void enterPackageType(String type) {

		setText(packageTypeInput, type);
	}

	public void enterPackageDescription(String descriton) {

		setText(packageDescInput, descriton);
	}

	public void enterPackageNoLetters(String number) {

		setText(packageNoLettersInput, number);
	}

	public void enterPackagePromotionalStamps(String promotionalStamps) {

		setText(packagePromotionalInput, promotionalStamps);
	}

	public void enterPackageExpiration(String expiraionDate) {

		setText(packageExpiryInput, expiraionDate);
	}

	public void clickPackagesAddButton() {

		logging("Clicking on : " + packageAddButton.getAttribute("value"));
		packageAddButton.click();
	}

	public void clickManageWordFilterLink() {

		click(manageWordFilterLink);
	}

	public void selectManageWordFilterFacility(String facility) {

		logging("Facility Selected : " + facility);
		selectElementByVisibleText(selectManageWordFilterFacility, facility);
	}

	public void selectManageWordFilterPermLoc(String permLoc) {

		logging("PermLoc Selected : " + permLoc);
		selectElementByVisibleText(selectManageWordFilterPermLoc, permLoc);
	}

	public void enterManageWordToAddAsFilter(String word) {

		setText(manageWordToAddAsFilterInput, word);
	}

	public void clickManageWordFilterInsertButton() {

		logging("Clicking on : " + manageWordFilterInsertButton.getAttribute("value"));
		manageWordFilterInsertButton.click();
	}

	public void verifyMangeWordFilterSuccessInsertMsg(String text) {

		assertionText(manangeWordFilterSuccessInsertMsg, text);
	}

	public boolean isManageWordFilterInsertedWordVisible(String word) {

		try {

			return getDriver()
					.findElement(By.xpath(".//select[@id='lbWordsList']//option[contains(text(),'" + word + "')]"))
					.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	public void verifyManageWordFilterInsertedWordAbsent(String word) {

		logging(word + " - is Absent : " + !isManageWordFilterInsertedWordVisible(word));
		assertTrue(!isManageWordFilterInsertedWordVisible(word));
	}

	public void verifyManageWordFilterInsertedWordPresent(String word) {

		logging(word + " - is Present : " + isManageWordFilterInsertedWordVisible(word));
		assertTrue(isManageWordFilterInsertedWordVisible(word));
	}

	public void selectManageWordFilterWordList(String word) {

		logging("Filter Word Selected : " + word);
		selectElementByVisibleText(selectManageWordFilterWordList, word);
	}

	public void clickManageWordFilterDeleteFromAllButton() {

		logging("Clicking on : " + manageWordFilterDeleteFromAllButton.getAttribute("value"));
		manageWordFilterDeleteFromAllButton.click();
	}

	public void verifyMangeWordFilterSuccessDeleteMsg(String text) {

		assertionText(manangeWordFilterSuccessDeleteMsg, text);
	}

	public void clickfacilitiesManagementLink() {

		click(facilitiesManagementLink);
	}

	public void verifyfacilityManagementMainPagetext(String text) {

		assertionText(facilityManagementMainPagetext, text);
	}

	public void clickCommunicationSettingsLink() {

		click(communicationSettingsLink);
	}

	public void selectFacilityForCommunicationsSettings(String Facility) {

		selectElementByVisibleText(selectAgency, Facility);
		logging("Facility selected : " + Facility);
	}

	public void selectPermLocForCommunicationsSettings(String PermLoc) {

		selectElementByVisibleText(selectPermLoc, PermLoc);
		logging("PermLoc selected : " + PermLoc);
	}

	public void checkCommunicationEnabledCheckBox() {

		pause(1000);
		logging("Checking :   Communication Enabled Checkbox");
		if (communicationsEnabledCheckBox.isSelected()) {
			pressSpace(communicationsEnabledCheckBox);
		}
		if (!communicationsEnabledCheckBox.isSelected()) {
			pressSpace(communicationsEnabledCheckBox);
		}
	}

	public void uncheckCommunicationEnabledCheckBox() {

		pause(1000);
		logging("Unchecking :  Communication Enabled Checkbox");
		if (!communicationsEnabledCheckBox.isSelected()) {
			pressSpace(communicationsEnabledCheckBox);
		}
		if (communicationsEnabledCheckBox.isSelected()) {
			pressSpace(communicationsEnabledCheckBox);
		}

	}

	public void checkKioskPrintButtonCheckBox() {

		pause(1000);
		logging("Checking :   Kiosk Print Button Enabled Checkbox");
		if (kioskPrintButtonCheckBox.isSelected()) {
			pressSpace(kioskPrintButtonCheckBox);
		}
		if (!kioskPrintButtonCheckBox.isSelected()) {
			pressSpace(kioskPrintButtonCheckBox);
		}
	}

	public void uncheckKioskPrintButtonCheckBox() {

		pause(1000);
		logging("Unchecking :  Kiosk Print Button Enabled Checkbox");
		if (!kioskPrintButtonCheckBox.isSelected()) {
			pressSpace(kioskPrintButtonCheckBox);
		}
		if (kioskPrintButtonCheckBox.isSelected()) {
			pressSpace(kioskPrintButtonCheckBox);
		}
	}

	public void clickSaveSettingsButton() {

		jsScrollElementToView(saveSettingsButton);
		saveSettingsButton.click();
		logging("Clicking on : Save Settings");
	}

	public void verifyUpdateMessage(String text) {

		assertionText(updateMsg, text);
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

	/**************************************** MANAGE OUTBOUND SETTINGS ELEMENTS AND METHODS ******************************
	 *************************************************************************************************************************/

	public void clickManageOutboundSettingsLink() {

		click(outboundSettingsLink);
	}

	public void clickChooseAgencyForOutboundSettings() {

		click(chooseAgencyOutboundSettings);
	}

	public void selectFacilityForOutboundSettings(String Facility,String env) {

		pause(1000);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(".//div[@class='chosen-search']//input")));
		setText(element, Facility);
		pause(1000);
		logging("Selecting Facility :  " + Facility);
		if (Facility.equalsIgnoreCase("JPAY")&&env.equalsIgnoreCase("QA")) {

			element.sendKeys(Keys.ARROW_DOWN);
		}
		if (Facility.equalsIgnoreCase("JPAY")&&env.equalsIgnoreCase("DEV2")) {

			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ARROW_DOWN);
		}
		pressEnter(element);
		
	}

	public void clickChoosePermlocForOutboundSettings() {

		logging("Clicking on : Select PermLoc.");
		choosePermLocOutboundSettings.click();
	}

	public void selectPermLocForOutboundSettings(String Facility) {

		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[@class='chosen-search']//input)[2]")));
		setText(element, Facility);
		pause(1000);
		logging("Selecting Facility :  " + Facility);
		pressEnter(element);
	}

	public void checkMOSSupportFreePrepaidLetterCheckBox() {

		logging("Checking :   SupportFreePrepaidLetter Checkbox");
		if (supportFreePrePaidLetterCheckBox.isSelected()) {
			pressSpace(supportFreePrePaidLetterCheckBox);
		}
		if (!supportFreePrePaidLetterCheckBox.isSelected()) {
			pressSpace(supportFreePrePaidLetterCheckBox);
		}
	}

	public void uncheckMOSSupportFreePrepaidLetterCheckBox() {

		logging("Unchecking :  SupportFreePrepaidLetter Checkbox");
		if (!supportFreePrePaidLetterCheckBox.isSelected()) {
			pressSpace(supportFreePrePaidLetterCheckBox);
		}
		if (supportFreePrePaidLetterCheckBox.isSelected()) {
			pressSpace(supportFreePrePaidLetterCheckBox);
		}
	}
	
	public void checkMOSSupportPrepaidResponseLetterCheckBox() {

		logging("Checking :   SupportPrepaidResponseLetter Checkbox");
		if (supportPrepaidResponseLetterCheckBox.isSelected()) {
			pressSpace(supportPrepaidResponseLetterCheckBox);
		}
		if (!supportPrepaidResponseLetterCheckBox.isSelected()) {
			pressSpace(supportPrepaidResponseLetterCheckBox);
		}
	}

	public void uncheckMOSSupportPrepaidResponseLetterCheckBox() {

		logging("Unchecking :  SupportPrepaidResponseLetter Checkbox");
		if (!supportPrepaidResponseLetterCheckBox.isSelected()) {
			pressSpace(supportPrepaidResponseLetterCheckBox);
		}
		if (supportPrepaidResponseLetterCheckBox.isSelected()) {
			pressSpace(supportPrepaidResponseLetterCheckBox);
		}
	}

	public void clickOutboundSettingsUpdateButton() {

		logging("Clicking on : " + outboundSettingsUpdateButton.getAttribute("value"));
		outboundSettingsUpdateButton.click();
	}

	public void verifyOutboundSttingsUpdateMessage(String text) {

		assertionText("Update Succeed Message :: ", updateMsg, text);
	}

	/***************************************** MANAGE OUTBOUND SETTINGS ELEMENTS AND METHODS ******************************
	 *************************************************************************************************************************/

	
	
	/***************************************** Inmate Account Management ELEMENTS AND METHODS ******************************
	 *************************************************************************************************************************/

	// Inmate Account Management Link1
	@FindBy(xpath = "(//*[contains(text(),'Inmate Account Management')])[1]")
	private WebElement inmateAccountManagementLink1;

	// Inmate Account Management Link2
	@FindBy(xpath = "(//*[contains(text(),'Inmate Account Management')])[2]")
	private WebElement inmateAccountManagementLink2;

	// Choose Facility
	@FindBy(xpath = "(//span[contains(text(),'Choose Facility')])[2]")
	private WebElement iamChooseFacility;

	// Insert Inmate Id
	@FindBy(xpath = "//input[contains(@id,'ucSearchInmate_tbInmateID')]")
	private WebElement iamInsertInmateId;

	// Edit Button
	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	private WebElement iamEditButton;

	// Update Button
	@FindBy(xpath = "//a[contains(text(),'Update')]")
	private WebElement iamUpdateButton;

	// Cancel Button
	@FindBy(xpath = "//a[contains(text(),'Cancel')]")
	private WebElement iamCancelButton;

	// View Inmate Account Details Button
	@FindBy(xpath = "//input[contains(@id,'ucSearchInmate_btnView')]")
	private WebElement iamViewAccDetailsButton;

	// gRIEVANCE ALLOWED CHECKBOX
	@FindBy(xpath = "//input[contains(@id,'dgInmateKioskPermissions_ctl03_cbGrievanceAllowedE')]")
	private WebElement iamGrievanceAllowedCheckBox;

	// IAM Actions text
	@FindBy(xpath = "//*[contains(@id,'lblActions')]")
	private WebElement iamActionsText;

	// IAM Details text
	@FindBy(xpath = "//*[contains(@id,'lblDetails')]")
	private WebElement iamDetailsText;

	// IAM Details Account History
	@FindBy(xpath = "//input[contains(@id,'btnInmateHistory')]")
	private WebElement iamDetailsAccountHistory;

	// IAM Details Account History verification Text
	@FindBy(xpath = "//span[contains(@id,'lblInmateAccountHistory')]")
	private WebElement iamDetailsAccountHistoryText;

	// IAM Details Account History Status verify
	@FindBy(xpath = "//*[@id='dgInmateAccountHistory_ctl03_lblStatus']")
	private WebElement iamDetailsAccountHistoryStatus;

	// IAM Details Purchases History
	@FindBy(xpath = "//input[contains(@id,'btnStampsPurchaseHistory')]")
	private WebElement iamDetailsPurchasesHistory;

	// IAM Details Purchases History verification Text
	@FindBy(xpath = "//u[contains(text(),'INMATE PURCHASES HISTORY')]")
	private WebElement iamDetailsPurchasesHistoryText;

	// IAM Details Purchases Text
	@FindBy(xpath = "//*[@id='pPurchases']/span[1]")
	private WebElement iamDetailsPurchasesText;

	// IAM Details Purchases jpay dollars text
	@FindBy(xpath = "//*[@id='pJPayDollars']/span[1]")
	private WebElement iamDetailsPurchasesJpayDollarsText;

	// IAM Details Purchases jpay credit by friends and familty
	@FindBy(xpath = "//*[@id='pJPayCreditsFriendsAndFamily']/span")
	private WebElement iamDetailsPurchasesJpayCreditText;

	// IAM Details Purchases mail usage text
	@FindBy(xpath = "//*[@id='pMailUsage']/span[1]")
	private WebElement iamDetailsPurchasesEmailUsageText;

	// IAM Details Purchases Account balance text
	@FindBy(xpath = "//*[@id='p_AccountBalance']/span")
	private WebElement iamDetailsPurchasesAccountBalanceText;

	// IAM Details Letters Sent/Received history
	@FindBy(xpath = "//input[contains(@id,'btnLettersHistory')]")
	private WebElement iamDetailsSentReceivedHistory;

	// IAM Details Letters Sent/Received history verification text
	@FindBy(xpath = "//u[contains(text(),'Inmate Letters History')]")
	private WebElement iamDetailsSentReceivedHistoryText;

	// IAM Details Printed items history
	@FindBy(xpath = "//input[contains(@id,'btnPrintedItemsHistory')]")
	private WebElement iamDetailsPrintedItemsHistory;

	// IAM Details Printed items history verification text
	@FindBy(xpath = "//u[contains(text(),'Inmate printed items history')]")
	private WebElement iamDetailsPrintedItemsHistoryText;

	// IAM Details Support tickets history
	@FindBy(xpath = "//input[contains(@id,'btnSupportTicketsHistory')]")
	private WebElement iamDetailsSupportTicketsHistory;

	// IAM Details Support tickets history verification text
	@FindBy(xpath = "//u[contains(text(),'Inmate support tickets history')]")
	private WebElement iamDetailsSupportTicketsHistoryText;

	// IAM Details Back button
	@FindBy(xpath = "(//*[contains(text(),'BACK')])[1]")
	private WebElement iamDetailsBackButton;

	// IAM Details SentReceivedShowOlderLettersButton
	@FindBy(xpath = "//*[contains(@id,'lnkShowOlderSentMails')]")
	private WebElement iamDetailsSentReceivedShowOlderLettersButton;

	// IAM Details SentReceivedShowLatestLettersButton
	@FindBy(xpath = "//*[contains(@id,'lnkShowOlderSentMails')]")
	private WebElement iamDetailsSentReceivedShowLatestLettersButton;

	// IAM Details Stamps count
	@FindBy(xpath = "//*[@id='dv_Balance']//tr[1]//td[2]")
	private WebElement iamDetailsStamps;

	// IAM Details Promotional Stamps count
	@FindBy(xpath = "//*[@id='dv_Balance']//tr[2]//td[2]")
	private WebElement iamDetailsPromoStamps;

	// IAM Details Free Stamps count
	@FindBy(xpath = "//*[@id='dv_Balance']//tr[3]//td[2]")
	private WebElement iamDetailsFreeStamps;

	// IAM Details Trust Funds
	@FindBy(xpath = "//*[@id='dv_Balance']//tr[4]//td[2]")
	private WebElement iamDetailsTrustFunds;

	// IAM Details Prepaid Funds
	@FindBy(xpath = "//*[@id='dv_Balance']//tr[5]//td[2]")
	private WebElement iamDetailsPrepaidFunds;

	// IAM Actions Partial Refund Or Add Stamps button
	@FindBy(xpath = "//*[@id='btnPartialRefund']")
	private WebElement iamActionsPartialRefundOrAddStamps;

	// IAM Actions Add Radio button
	@FindBy(xpath = "//*[@id='rdGiveFreeStamps']")
	private WebElement iamActionsAddRadioButton;

	// IAM Actions Refund Radio button
	@FindBy(xpath = "//*[@id='rdPartiallyRefundStamps']")
	private WebElement iamActionsRefundRadioButton;

	// IAM Actions add/remove stamps input
	@FindBy(xpath = "//*[@id='txtStampsToRefund']")
	private WebElement iamActionsAddRefundStampsInput;

	// IAM Actions remove free stamps input
	@FindBy(xpath = "//*[@id='txtFreeStamps']")
	private WebElement iamActionsRemoveFreeStampsInput;

	// IAM Actions remove promo stamps input
	@FindBy(xpath = "//*[@id='txtPromoStamps']")
	private WebElement iamActionsRemovePromoStampsInput;

	// IAM Actions add/refund stamps Reason input
	@FindBy(xpath = "//*[@id='tbReason']")
	private WebElement iamActionsStampsReasonInput;

	// IAM Actions add/refund stamps Confirm button
	@FindBy(xpath = "//*[@id='btnConfirmPartialRefund']")
	private WebElement iamActionsAddRefundConfirmButton;

	// IAM Actions add/refund stamps Confirm button
	@FindBy(xpath = "//*[@id='lblRefunded']")
	private WebElement iamStampsAddRemoveUpdateMsg;

	// IAM Actions add/refund stamps error message
	@FindBy(xpath = "//*[@id='lblConfirmError']")
	private WebElement iamErrorMsg1;

	// IAM Actions add/refund stamps reason error message
	@FindBy(xpath = "//*[@id='vldtbReason']")
	private WebElement iamErrorMsg2;

	// ------------------------------------------------------------------------------------------------------------------------//

	public void clickInmateAccountManagementLink() {

		click(inmateAccountManagementLink1);
	}

	public void verifyInmateAccountManagementText(String text) {

		assertionText(inmateAccountManagementLink2, text);
	}

	public void clickIAMChooseFacility() {

		click(iamChooseFacility);
	}

	public void selectIAMFacility(String Facility,String env) {

		pause(1000);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(".//div[@class='chosen-search']//input")));
		setText(element, Facility);
		pause(1000);
		logging("Selecting Facility :  " + Facility);
		if (Facility.equalsIgnoreCase("JPAY")&&!env.equalsIgnoreCase("DEV2")) {

			element.sendKeys(Keys.ARROW_DOWN);
			
		}
		
		if (Facility.equalsIgnoreCase("JPAY")&&env.equalsIgnoreCase("DEV2")) {

			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ARROW_DOWN);
		}
		pressEnter(element);
	}

	public void clickIAMViewInmateAccDetailsButton() {

		logging("Clicking on : View Inmate Account Details");
		iamViewAccDetailsButton.click();
	}

	public void enterIAMInmateId(String text) {

		setText(iamInsertInmateId, text);
	}

	public void clickIAMEditButton() {

		click(iamEditButton);
	}

	public void clickIAMUpdateButton() {

		click(iamUpdateButton);
	}

	public void clickIAMCancelButton() {

		click(iamCancelButton);
	}

	public void checkIAMGrievanceAllowedCheckBox() {

		logging("Checking :  Tab Grievance Checkbox");
		if (iamGrievanceAllowedCheckBox.isSelected()) {
			pressSpace(iamGrievanceAllowedCheckBox);
		}
		if (!iamGrievanceAllowedCheckBox.isSelected()) {
			pressSpace(iamGrievanceAllowedCheckBox);
		}
	}

	public void verifyIAMActionsPresent() {

		logging("Inmate Account Management Actions Present : " + isElementDisplayed(iamActionsText));
		logging("Actions Header text is : " + iamActionsText.getText());
		assertTrue(isElementDisplayed(iamActionsText));
	}

	public void verifyIAMDetailsPresent() {

		logging("Inmate Account Management Details Present : " + isElementDisplayed(iamDetailsText));
		logging("Details Header text is : " + iamDetailsText.getText());
		assertTrue(isElementDisplayed(iamDetailsText));
	}

	public void clickIAMDetailsAccountHistoryButton() {

		logging("Clicking on : " + iamDetailsAccountHistory.getAttribute("value"));
		iamDetailsAccountHistory.click();
	}

	public void clickIAMDetailsPurchasesHistoryButton() {

		logging("Clicking on : " + iamDetailsPurchasesHistory.getAttribute("value"));
		iamDetailsPurchasesHistory.click();
	}

	public void clickIAMDetailsSentReceivedHistoryButton() {

		logging("Clicking on : " + iamDetailsSentReceivedHistory.getAttribute("value"));
		iamDetailsSentReceivedHistory.click();
	}

	public void clickIAMDetailsPrintedItemsHistoryButton() {

		logging("Clicking on : " + iamDetailsPrintedItemsHistory.getAttribute("value"));
		iamDetailsPrintedItemsHistory.click();
	}

	public void clickIAMDetailsSupportTicketsHistoryButton() {

		logging("Clicking on : " + iamDetailsSupportTicketsHistory.getAttribute("value"));
		iamDetailsSupportTicketsHistory.click();
	}

	public void verifyIAMDetailsAccountHistoryText(String text) {

		assertionText(iamDetailsAccountHistoryText, text);
	}

	public void verifyIAMDetailsAccountHistoryStatus(String status) {

		assertionText("Status :: ", iamDetailsAccountHistoryStatus, status);
	}

	public void verifyIAMDetailsPurchasesHistoryText(String text) {

		assertionText(iamDetailsPurchasesHistoryText, text);
	}

	public void verifyIAMDetailsPurchasesText(String text) {

		assertionText(iamDetailsPurchasesText, text);
	}

	public void verifyIAMDetailsPurchasesJpayDollarsText(String text) {

		assertionText(iamDetailsPurchasesJpayDollarsText, text);
	}

	public void verifyIAMDetailsPurchasesJpayCreditText(String text) {

		assertionText(iamDetailsPurchasesJpayCreditText, text);
	}

	public void verifyIAMDetailsPurchasesEmailUsageText(String text) {

		assertionText(iamDetailsPurchasesEmailUsageText, text);
	}

	public void verifyIAMDetailsPurchasesAccountBalanceText(String text) {

		assertionText(iamDetailsPurchasesAccountBalanceText, text);
	}

	public void verifyIAMDetailsSentReceivedHistoryText(String text) {

		assertionText(iamDetailsSentReceivedHistoryText, text);
	}

	public void verifyIAMDetailsPrintedItemsHistoryText(String text) {

		assertionText(iamDetailsPrintedItemsHistoryText, text);
	}

	public void verifyIAMDetailsSupportTicketsHistoryText(String text) {

		assertionText(iamDetailsSupportTicketsHistoryText, text);
	}

	public void clickIAMDetailsBackButton() {

		jsScrollElementToView(iamDetailsBackButton);
		click(iamDetailsBackButton);
	}

	public void clickIAMDetailsSentReceivedShowOlderLetters() {

		click(iamDetailsSentReceivedShowOlderLettersButton);
	}

	public void clickIAMDetailsSentReceivedShowLatestLetters() {

		click(iamDetailsSentReceivedShowLatestLettersButton);
	}

	public String getIAMDetailsStampsCount() {

		return iamDetailsStamps.getText();
	}

	public String getIAMDetailsPromotionalStampsCount() {

		return iamDetailsPromoStamps.getText();
	}

	public String getIAMDetailsFreeStampsCount() {

		return iamDetailsFreeStamps.getText();
	}
	
	public void verifyIAMDetailsStamps(String stamps){
		
		assertionText("Stamps :: ", iamDetailsStamps, stamps);
	}
	
	public void verifyIAMDetailsStamps(String stamps,String reducedStamps){
		
		String expStamps=Integer.toString(Integer.parseInt(stamps)-Integer.parseInt(reducedStamps));
		assertionText("Stamps :: ", iamDetailsStamps, expStamps);
	}
	
	public void verifyIAMDetailsPromotionStamps(String promoStamps,String reducedPromoStamps){
		
		String expPromoStamps=Integer.toString(Integer.parseInt(promoStamps)-Integer.parseInt(reducedPromoStamps));
		assertionText("Promotional Stamps :: ", iamDetailsPromoStamps, expPromoStamps);
	}
	
	public void verifyIAMDetailsPromotionStamps(String promoStamps){
		
		assertionText("Promotional Stamps :: ", iamDetailsPromoStamps, promoStamps);
	}
	
	public void verifyIAMDetailsFreeStampsAfterAdd(String freeStamps,String addStamps){
		
		String expFreeStamps=Integer.toString(Integer.parseInt(freeStamps)+Integer.parseInt(addStamps));
		assertionText("Free Stamps :: ", iamDetailsFreeStamps, expFreeStamps);
	}
	
	public void verifyIAMDetailsFreeStamps(String freeStamps){
		
		assertionText("Free Stamps :: ", iamDetailsFreeStamps, freeStamps);
	}
	public void verifyIAMDetailsFreeStampsAfterRemove(String freeStamps,String addStamps){
		
		String expFreeStamps=Integer.toString(Integer.parseInt(freeStamps)-Integer.parseInt(addStamps));
		assertionText("Free Stamps :: ", iamDetailsFreeStamps, expFreeStamps);
	}
	
	public void verifyIAMDetailsStampsPresent(){
		logging("Stamps Present : "+isElementDisplayed(iamDetailsStamps));
		assertTrue(isElementDisplayed(iamDetailsStamps));
	}
	
	public void verifyIAMDetailsPromotionalStampsPresent(){
		logging("Promotional Stamps Present : "+isElementDisplayed(iamDetailsPromoStamps));
		assertTrue(isElementDisplayed(iamDetailsPromoStamps));
	} 
	
	public void verifyIAMDetailsFreeStampsPresent(){
		logging("Free Stamps Present : "+isElementDisplayed(iamDetailsFreeStamps));
		assertTrue(isElementDisplayed(iamDetailsFreeStamps));
	} 
	
	public void verifyIAMDetailsTrustFundsPresent(){
		logging("Trust Funds Present : "+isElementDisplayed(iamDetailsTrustFunds));
		assertTrue(isElementDisplayed(iamDetailsTrustFunds));
	} 
	
	public void verifyIAMDetailsPrepaidFundsPresent(){
		logging("Prepaid Funds Present : "+isElementDisplayed(iamDetailsPrepaidFunds));
		assertTrue(isElementDisplayed(iamDetailsPrepaidFunds));
	} 
	
	public void clickIAMActionsPartialRefundOrAddStamps(){
		
		logging("Clicking on : "+iamActionsPartialRefundOrAddStamps.getAttribute("value"));
		iamActionsPartialRefundOrAddStamps.click();
	}
	
	public void clickIAMActionsAddRadioButton(){
		
		logging("Clicking on Add radio button.");
		iamActionsAddRadioButton.click();
	}
	
	public void clickIAMActionsRefundRadioButton(){
		
		logging("Clicking on Refund radio button.");
		iamActionsRefundRadioButton.click();
	}
	
	public void enterIAMActionsAddReMoveStamps(String stamps){
		
		setText(iamActionsAddRefundStampsInput, stamps);
	}
	
	public void enterIAMActionsRemoveFreeStamps(String stamps){
		
		setText(iamActionsRemoveFreeStampsInput, stamps);
	}
	
	public void enterIAMActionsRemovePromoStamps(String stamps){
		
		setText(iamActionsRemovePromoStampsInput, stamps);
	}
	
	public void enterIAMActionsStampsReason(String reason){
		
		setText(iamActionsStampsReasonInput, reason);
	}
	
	public void clickIAMActionsAddRefundConfirmButton(){
		
		logging("Clicking on : "+iamActionsAddRefundConfirmButton.getAttribute("value"));
		iamActionsAddRefundConfirmButton.click();
	}
	
	public void verifyIAMAddStampsUpdateMessage(String stamps,String inmateId){
		
		String expText=stamps+" free stamps were given to an inmate account: InmateID: "+inmateId+" successfully.";
		assertionText("Update Message :: ", iamStampsAddRemoveUpdateMsg, expText);
	}
	
	public void verifyIAMRemoveStampsUpdateMessage(String inmateId){
		
		String expText="Inmate Account stamps partially refunded: InmateID: "+inmateId+" successfully.";
		assertionText("Update Message :: ", iamStampsAddRemoveUpdateMsg, expText);
	}
	
	public void verifyIAMRemoveFreePromoStampsUpdateMessage(String inmateId){
		
		String expText="Inmate Account Free/Promo stamps partially removed: InmateID: "+inmateId+" successfully.";
		assertionText("Update Message :: ", iamStampsAddRemoveUpdateMsg, expText);
	}

	public void verifyIAMPartRefundAddInmateAccStampsErrorMsg(String errorMsg){
		
		assertionText("Error Message :: ", iamErrorMsg1, errorMsg);
	}

	public void verifyIAMPartRefundAddInmateAccReasonErrorMsg(String errorMsg){
		
		assertionText("Error Message :: ", iamErrorMsg2, errorMsg);
	}
	
	
	
	

	/*****************************************  Inmate Account Management ELEMENTS AND METHODS   *****************************
	 *************************************************************************************************************************/

	
	
	
	/*****************************************   MANAGE INBOUND SETTINGS ELEMENTS AND METHODS    ******************************
	 *************************************************************************************************************************/

	// Manage inbound settings link
	@FindBy(xpath = "//a[@id='lnkManageInboundsettings']")
	private WebElement inboundSettingsLink;

	// inbound Settings update button
	@FindBy(xpath = "//input[@id='btnUpdate']")
	private WebElement misUpdateButton;

	// Choose Agency MANAGE LOCATION Settings
	@FindBy(xpath = "//span[contains(text(),'Choose Agency')]")
	private WebElement misChooseAgency;

	// inbound Permloc inbound Settings
	@FindBy(xpath = "//div[@id='uclFacilitiesDropDown_ddlPermLocs_chosen']//span")
	private WebElement misChoosePermLoc;

	// Auto Release Inbound Mail Checkbox
	@FindBy(xpath = "//input[@id='cbAutoReleaseInboundMail']")
	private WebElement misAutoReleaseInboundMail;

	// Auto Release Video Inbound Mail Checkbox
	@FindBy(xpath = "//input[@id='cbAutoReleaseVideoInboundMail']")
	private WebElement misAutoReleaseVideoInboundMail;

	// Auto Release eCard Inbound Mail Checkbox
	@FindBy(xpath = "//input[@id='cbAutoReleaseECardInboundMail']")
	private WebElement misAutoReleaseEcardInboundMail;

	// Manage inbound settings Update Message
	@FindBy(xpath = "//span[@id='lblUpdateSucceed']")
	private WebElement misUpdateMsg;

	// Manage inbound settings Video Attachments Enabled Checkbox
	@FindBy(xpath = "//input[@id='cbVideoAttachmentsEnabled']")
	private WebElement misVideoAttachmentsEnabled;

	// Manage inbound settings Ecard Attachments Enabled Checkbox
	@FindBy(xpath = "//input[@id='cbEcardAttachmentsEnabled']")
	private WebElement misEcardAttachmentsEnabled;

	// Manage inbound settings Stamps Cost per Regular Attachment input
	@FindBy(xpath = "//*[@id='tbRegularAttachmentStampCost']")
	private WebElement misStampsCostPerRegularAttachmentsInput;

	// Manage inbound settings Prepaid Stamps Cost input
	@FindBy(xpath = "//*[@id='tbPrepaidStampCost']")
	private WebElement misPrepaidStampCostInput;

	// Manage inbound settings Select When mail is flag by word then sent to:
	@FindBy(xpath = "//select[@id='ddlOnFlagWordSendTo']")
	private WebElement misMailFlagByWord;

	// Manage inbound settings Select When mail is flag by inmate then sent to:
	@FindBy(xpath = "//select[@id='ddlOnFlagInmateSendTo']")
	private WebElement misMailFlagByInmate;

	// Manage inbound settings Select When mail is flag by sender then sent to:
	@FindBy(xpath = "//select[@id='ddlOnFlagSender']")
	private WebElement misMailFlagBySender;

	// Manage inbound settings Select When mail is flag by attachment then sent
	// to:
	@FindBy(xpath = "//select[@id='ddlOnFlagAttachmentSendTo']")
	private WebElement misMailFlagByAttachment;

	// Manage inbound settings Select When mail is flag by Suspecious Content
	// then sent to:
	@FindBy(xpath = "//select[@id='ddlOnFlagSuspiciousContentSentTo']")
	private WebElement misMailFlagBySuspeciousContent;

	// Manage inbound max mail attachmentst input
	@FindBy(xpath = "//*[@id='tbMaxAttachments']")
	private WebElement misMaxMailAttachmentsInput;

	// Manage inbound Transfer stamps weekly limits
	@FindBy(xpath = "//*[@id='tbMaxAttachments']")
	private WebElement misTransferStampsWeeklyLimitInput;

	// Manage inbound settings Transfer stamps Enabled Checkbox
	@FindBy(xpath = "//input[@id='cbTransferStampsEnabled']")
	private WebElement misTransferStampsEnabled;
	
	
	

	// ----------------------------------------------------------------------------------------------------------------------------//

	public void clickManageInboundSettingsLink() {

		click(inboundSettingsLink);
	}

	public void clickMISChooseAgency() {

		click(misChooseAgency);
	}

	public void selectMISFacility(String Facility,String env) {

		pause(1000);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(".//div[@class='chosen-search']//input")));
		setText(element, Facility);
		pause(1000);
		logging("Selecting Facility :  " + Facility);
		if (Facility.equalsIgnoreCase("JPAY")&&env.equalsIgnoreCase("QA")) {

			element.sendKeys(Keys.ARROW_DOWN);
		}
		if (Facility.equalsIgnoreCase("JPAY")&&env.equalsIgnoreCase("DEV2")) {

			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ARROW_DOWN);
		}
		pressEnter(element);
	}

	public void clickMISChoosePerm() {

		logging("Clicking on : Select PermLoc.");
		misChoosePermLoc.click();
	}

	public void selectMISPermLoc(String Facility) {

		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[@class='chosen-search']//input)[2]")));
		setText(element, Facility);
		pause(1000);
		logging("Selecting Facility :  " + Facility);
		pressEnter(element);
	}

	public void checkMISAutoReleaseInboundMail() {

		logging("Checking :   AutoReleaseInboundMail Checkbox");
		if (misAutoReleaseInboundMail.isSelected()) {
			pressSpace(misAutoReleaseInboundMail);
		}
		pause(1000);
		if (!misAutoReleaseInboundMail.isSelected()) {
			pressSpace(misAutoReleaseInboundMail);
		}
	}

	public void uncheckMISAutoReleaseInboundMail() {

		logging("Unchecking :  AutoReleaseInboundMail Checkbox");
		if (!misAutoReleaseInboundMail.isSelected()) {
			pressSpace(misAutoReleaseInboundMail);
		}
		pause(1000);
		if (misAutoReleaseInboundMail.isSelected()) {
			pressSpace(misAutoReleaseInboundMail);
		}
	}

	public void checkMISAutoReleaseVideoInboundMail() {

		logging("Checking :   AutoReleaseVideoInboundMail Checkbox");
		if (misAutoReleaseVideoInboundMail.isSelected()) {
			pressSpace(misAutoReleaseVideoInboundMail);
		}
		pause(1000);
		if (!misAutoReleaseVideoInboundMail.isSelected()) {
			pressSpace(misAutoReleaseVideoInboundMail);
		}
	}

	public void uncheckMISAutoReleaseVideoInboundMail() {

		logging("Unchecking :  AutoReleaseVideoInboundMail Checkbox");
		if (!misAutoReleaseVideoInboundMail.isSelected()) {
			pressSpace(misAutoReleaseVideoInboundMail);
		}
		pause(1000);
		if (misAutoReleaseVideoInboundMail.isSelected()) {
			pressSpace(misAutoReleaseVideoInboundMail);
		}
	}

	public void checkMISAutoReleaseEcardInboundMail() {

		logging("Checking :   AutoReleaseEcardInboundMail Checkbox");
		if (misAutoReleaseEcardInboundMail.isSelected()) {
			pressSpace(misAutoReleaseEcardInboundMail);
		}
		pause(1000);
		if (!misAutoReleaseEcardInboundMail.isSelected()) {
			pressSpace(misAutoReleaseEcardInboundMail);
		}
	}

	public void uncheckMISAutoReleaseEcardInboundMail() {

		logging("Unchecking :  AutoReleaseEcardInboundMail Checkbox");
		if (!misAutoReleaseEcardInboundMail.isSelected()) {
			pressSpace(misAutoReleaseEcardInboundMail);
		}
		pause(1000);
		if (misAutoReleaseEcardInboundMail.isSelected()) {
			pressSpace(misAutoReleaseEcardInboundMail);
		}
	}

	public void checkMISVideoAttachmentsEnabled() {

		logging("Checking :   VideoAttachmentsEnabled Checkbox");
		if (misVideoAttachmentsEnabled.isSelected()) {
			pressSpace(misVideoAttachmentsEnabled);
		}
		pause(1000);
		if (!misVideoAttachmentsEnabled.isSelected()) {
			pressSpace(misVideoAttachmentsEnabled);
		}
	}

	public void uncheckMISVideoAttachmentsEnabled() {

		logging("Unchecking :  VideoAttachmentsEnabled Checkbox");
		if (!misVideoAttachmentsEnabled.isSelected()) {
			pressSpace(misVideoAttachmentsEnabled);
		}
		pause(1000);
		if (misVideoAttachmentsEnabled.isSelected()) {
			pressSpace(misVideoAttachmentsEnabled);
		}
	}

	public void checkMISEcardAttachmentsEnabled() {

		logging("Checking :   EcardAttachmentsEnabled Checkbox");
		if (misEcardAttachmentsEnabled.isSelected()) {
			pressSpace(misEcardAttachmentsEnabled);
		}
		pause(1000);
		if (!misEcardAttachmentsEnabled.isSelected()) {
			pressSpace(misEcardAttachmentsEnabled);
		}
	}

	public void uncheckMISEcardAttachmentsEnabled() {

		logging("Unchecking :  EcardAttachmentsEnabled Checkbox");
		if (!misEcardAttachmentsEnabled.isSelected()) {
			pressSpace(misEcardAttachmentsEnabled);
		}
		pause(1000);
		if (misEcardAttachmentsEnabled.isSelected()) {
			pressSpace(misEcardAttachmentsEnabled);
		}
	}

	public void checkMISTransferStampsEnabled() {

		logging("Checking :   TransferStampsEnabled Checkbox");
		if (misTransferStampsEnabled.isSelected()) {
			pressSpace(misTransferStampsEnabled);
		}
		pause(1000);
		if (!misTransferStampsEnabled.isSelected()) {
			pressSpace(misTransferStampsEnabled);
		}
	}

	public void uncheckMISTransferStampsEnabled() {

		logging("Unchecking :  TransferStampsEnabled Checkbox");
		if (!misTransferStampsEnabled.isSelected()) {
			pressSpace(misTransferStampsEnabled);
		}
		pause(1000);
		if (misTransferStampsEnabled.isSelected()) {
			pressSpace(misTransferStampsEnabled);
		}
	}
	public void enterMISMaxMailAttachments(String cost) {

		setText(misMaxMailAttachmentsInput, cost);
	}

	public void enterMISStampsCostPerRegularAttachments(String cost) {

		setText(misStampsCostPerRegularAttachmentsInput, cost);
	}

	public void enterMISPrepaidStampCost(String cost) {

		setText(misPrepaidStampCostInput, cost);
	}
	

	public void enterMISTransStampsWeeklyLimit(String number) {

		setText(misTransferStampsWeeklyLimitInput, number);
	}

	public void clickMISUpdateButton() {

		logging("Clicking on : " + misUpdateButton.getAttribute("value"));
		jsClick(misUpdateButton);
	}

	public void verifyMISUpdateMessage(String text) {

		assertionText("Update Succeed Message :: ", misUpdateMsg, text);
	}

	public void selectMISMailIsFlagByWord(String option) {

		logging("Option Selected : " + option);
		WebElement element1 = getDriver().findElement(By.xpath(".//*[@id='ddlOnFlagWordSendTo_chosen']"));
		element1.click();
		WebElement element2 = getDriver().findElement(
				By.xpath("//*[@id='ddlOnFlagWordSendTo_chosen']//following::li[contains(text(),'" + option + "')]"));
		element2.click();

	}

	public void selectMISMailIsFlagByInmate(String option) {

		logging("Option Selected : " + option);
		WebElement element1 = getDriver().findElement(By.xpath(".//*[@id='ddlOnFlagInmateSendTo_chosen']"));
		element1.click();
		WebElement element2 = getDriver().findElement(
				By.xpath("//*[@id='ddlOnFlagInmateSendTo_chosen']//following::li[contains(text(),'" + option + "')]"));
		element2.click();

	}

	public void selectMISMailIsFlagBySender(String option) {

		logging("Option Selected : " + option);
		WebElement element1 = getDriver().findElement(By.xpath(".//*[@id='ddlOnFlagSender_chosen']"));
		element1.click();
		WebElement element2 = getDriver().findElement(
				By.xpath("//*[@id='ddlOnFlagSender_chosen']//following::li[contains(text(),'" + option + "')]"));
		element2.click();

	}

	public void selectMISMailIsFlagByAttachment(String option) {

		logging("Option Selected : " + option);
		WebElement element1 = getDriver().findElement(By.xpath(".//*[@id='ddlOnFlagAttachmentSendTo_chosen']"));
		element1.click();
		WebElement element2 = getDriver().findElement(By.xpath(
				"//*[@id='ddlOnFlagAttachmentSendTo_chosen']//following::li[contains(text(),'" + option + "')]"));
		element2.click();

	}

	public void selectMISMailIsFlagBySuspeciousContent(String option) {

		logging("Option Selected : " + option);
		WebElement element1 = getDriver().findElement(By.xpath(".//*[@id='ddlOnFlagSuspiciousContentSentTo_chosen']"));
		element1.click();
		WebElement element2 = getDriver().findElement(
				By.xpath("//*[@id='ddlOnFlagSuspiciousContentSentTo_chosen']//following::li[contains(text(),'" + option
						+ "')]"));
		element2.click();

	}

	
	
	
	/***************************************** MANAGE INBOUND SETTINGS ELEMENTS AND METHODS ******************************
	 *************************************************************************************************************************/

	
	
	
	
	/***************************************** SPAM GENERATOR ELEMENTS AND METHODS ******************************
	 *************************************************************************************************************************/

	// Spam Generator link
	@FindBy(xpath = "(//*[contains(text(),'Spam Generator')])[1]")
	private WebElement spamGeneratorLink;

	// Spam Generator select Choose facility
	@FindBy(xpath = "//select[@id='ddlFacilityList']")
	private WebElement sgSelectChooseFacility;

	// Spam Generator add facility name button
	@FindBy(xpath = "//*[@id='btnAddFacilitName']")
	private WebElement sgAddFacilityNameButton;

	// Spam Generator add date button
	@FindBy(xpath = "//*[@id='btnAddDate']")
	private WebElement sgAddDateButton;

	// Spam Generator add inmate name button
	@FindBy(xpath = "//*[@id='btnAddInmateName']")
	private WebElement sgAddInmateNameButton;

	// Spam Generator write letter input
	@FindBy(xpath = "//*[@id='txtMessage']")
	private WebElement sgWriteLetterInput;

	// Spam Generator Preview Button
	@FindBy(xpath = "//*[@id='btnPreview']")
	private WebElement sgPreviewButton;

	// Spam Generator Send Button
	@FindBy(xpath = "//*[@id='btnSend']")
	private WebElement sgSendButton;

	// Spam Generator Back Button
	@FindBy(xpath = "//*[@id='btnBack']")
	private WebElement sgBackButton;

	// Spam Generator letter send success message
	@FindBy(xpath = "//*[@id='lblResult']")
	private WebElement sgLetterSentSuccessMessage;

	// ----------------------------------------------------------------------------------------------------------------------------//

	public void clickSpamGeneratorLink() {

		click(spamGeneratorLink);
	}

	public void selectSGChooseFacility(String facility) {

		logging("Selecting Facility : " + facility);
		selectElementByVisibleText(sgSelectChooseFacility, facility);
	}

	public void clickSGAddDateButton() {

		click(sgAddDateButton);
	}

	public void clickSGAddInmateNameButton() {

		click(sgAddInmateNameButton);
	}

	public void clickSGAddFacilityNameButton() {

		click(sgAddFacilityNameButton);
	}

	public void enterSGWriteLetterContent(String emailMsg) {

		setText(sgWriteLetterInput, emailMsg);
	}

	public void clickSGPreviewButton() {

		logging("Clicking on : " + sgPreviewButton.getAttribute("value"));
		sgPreviewButton.click();
	}

	public void clickSGSendButton() {

		logging("Clicking on : " + sgSendButton.getAttribute("value"));
		sgSendButton.click();
	}

	public void clickSGBackButton() {

		logging("Clicking on : " + sgBackButton.getAttribute("value"));
		sgBackButton.click();
	}

	public void verifySGLetterSentSuccessMsg() {

		logging("Spam generator letter is sent : " + isElementDisplayed(sgLetterSentSuccessMessage));
		logging("Spam generator letter sent message : " + sgLetterSentSuccessMessage.getText());
		assertTrue(isElementDisplayed(sgLetterSentSuccessMessage));
	}

	/***************************************** SPAM GENERATOR ELEMENTS AND METHODS ******************************
	 *************************************************************************************************************************/
	
	
	
	
	
	/*****************************************   EXPIRE STAMPS ELEMENTS AND METHODS   ******************************
	 ***************************************************************************************************************/


	// Spam Generator link
	@FindBy(xpath = "(//*[contains(text(),'Expire Stamps')])[1]")
	private WebElement expireStampsLink;

	// Expire Stamps select facility
	@FindBy(xpath = "//select[@id='ddlAgencies']")
	private WebElement esSelectFacility;

	// Expire Stamps enter date input
	@FindBy(xpath = "//*[@id='tbToDate']")
	private WebElement esEnterDate;

	// Expire Stamps Preview Expired Stamps button
	@FindBy(xpath = "//*[@id='btnPreviewExpired']")
	private WebElement esPreviewExpiredStampsButton;

	// Expire Stamps Number of accounts with outdated stamps
	@FindBy(xpath = "//*[@id='lblNumOfAccounts']")
	private WebElement esOutdatedStampsAccountNum;

	// Expire Stamps Total number of outdated stamps
	@FindBy(xpath = "//*[@id='lblNumOfStamps']")
	private WebElement esOutdatedStampsTotalNum;

	// Expire Stamps Total value of outdated stamps
	@FindBy(xpath = "//*[@id='lblTotalValue']")
	private WebElement esOutdatedStampsTotalValue;


	
	
	
	
	// ----------------------------------------------------------------------------------------------------------------------------//

	
	
	
	public void clickExpireStampsLink() {

		click(expireStampsLink);
	}

	public void clickESPreviewExpiredStampsLink() {

		logging("Clicking on : "+esPreviewExpiredStampsButton.getAttribute("value"));
		esPreviewExpiredStampsButton.click();
	}
	
	public void enterESSearchDate(String date){
		
		setText(esEnterDate, date);
	}
	
	public void enterESSearchDateCurrent(){
		
		String toDate="";
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		toDate=dateFormat.format(date);
		setText(esEnterDate, toDate);
	}
	
	public void selectESFacility(String facility){
		
		logging("Selecting Facility : "+facility);
		selectElementByVisibleText(esSelectFacility, facility);
	}
	
	public void verifyESOutdatedStampsAccountPresent(){
		
		logging("Number of accounts with outdated stamps Present : "+isElementDisplayed(esOutdatedStampsAccountNum));
		logging("Number of accounts with outdated stamps : "+esOutdatedStampsAccountNum.getText());
		assertTrue(isElementDisplayed(esOutdatedStampsAccountNum));
	}
	
	public void verifyESOutdatedStampsTotalNumberPresent(){
		
		logging("Total number of outdated stamps Present : "+isElementDisplayed(esOutdatedStampsTotalNum));
		logging("Total number of outdated stamps : "+esOutdatedStampsTotalNum.getText());
		assertTrue(isElementDisplayed(esOutdatedStampsTotalNum));
	}
	
	public void verifyESOutdatedStampsTotalValuePresent(){
		
		logging("Total value of outdated stamps Present : "+isElementDisplayed(esOutdatedStampsTotalValue));
		logging("Total value of outdated stamps : "+esOutdatedStampsTotalValue.getText());
		assertTrue(isElementDisplayed(esOutdatedStampsTotalValue));
	}
	
	

	/***************************************** EXPIRE STAMPS ELEMENTS AND METHODS ******************************
	 *************************************************************************************************************/
	
	
	
	
	
	/*****************************************   OUTPUT EMAILS ELEMENTS AND METHODS   ******************************
	 ***************************************************************************************************************/


	// Output Emails link
	@FindBy(xpath = "(//*[contains(text(),'Optout Emails')])[1]")
	private WebElement outputEmailsLink;

	// Output Emails Block link
	@FindBy(xpath = "//*[@id='lblBlock']")
	private WebElement oeBlockLink;

	// Output Emails search blocked email link
	@FindBy(xpath = "//*[@id='hlSearchBlockedData']")
	private WebElement oeSearchBlockedEmailLink;

	// Output Emails blocked email button
	@FindBy(xpath = "//*[@id='btn_block']")
	private WebElement oeBlockEmailButton;

	// Output Emails block success message
	@FindBy(xpath = "//*[@id='lblSuccess']")
	private WebElement oeBlockSuccessMessage;

	// Output Emails block exist message
	@FindBy(xpath = "//*[@id='lblDataAlreadyExists']")
	private WebElement oeBlockExistMessage;

	// Output Emails block enter email input
	@FindBy(xpath = "//*[@id='tbDataID']")
	private WebElement oeEnterBlockEmailInput;

	//  Output Emails search block enter email input
	@FindBy(xpath = "//*[@id='tbSearch']")
	private WebElement oeEnterSearchBlockEmailInput;

	//  Output Emails search block email go button
	@FindBy(xpath = "//*[@id='btnSubmit']")
	private WebElement oeEnterSearchBlockEmailGoButton;

	//  Output Emails search result
	@FindBy(xpath = "//*[@id='dgOptoutAddress']//tr[2]")
	private WebElement oeSearchResultRow;

	//  Output Emails Email Address Verify
	@FindBy(xpath = "//*[@id='dgOptoutAddress_ctl03_lblAddress']")
	private WebElement oeEmailAddressVerifyLink;

	//  Output Emails Action verify link
	@FindBy(xpath = "//*[@id='dgOptoutAddress_ctl03_lnkActive']")
	private WebElement oeActionVerifyLink;
	
	
	
	
	// ----------------------------------------------------------------------------------------------------------------------------//

	
	
	
	public void clickOutputEmailsLink() {

		click(outputEmailsLink);
	}

	public void clickOEBlockEmailButton() {

		logging("Clicking on : "+oeBlockEmailButton.getAttribute("value"));
		oeBlockEmailButton.click();
	}
	
	public void enterOEBlockEmail(String email){
		
		setText(oeEnterBlockEmailInput, email);
	}
	
	public void enterOESearchBlockedEmail(String email){
		
		setText(oeEnterSearchBlockEmailInput, email);
	}

	public void clickOESearchBlockedEmailGoButton() {

		logging("Clicking on : "+oeEnterSearchBlockEmailGoButton.getAttribute("value"));
		oeEnterSearchBlockEmailGoButton.click();
	}
	
	public void verifyOEBlockEmailHeaderVerify(String header){
		
		assertionText(oeBlockLink, header);
	}

	public void clickOEBlockEmailLink(){
		
		WebElement element = getDriver().findElement(By.xpath(".//*[@id='hlBlockAddress']"));
		click(element);
	}
	
	public void verifyOESearchBlockedEmailHeaderVerify(String header){
		
		assertionText(oeSearchBlockedEmailLink, header);
	}
	
	public void clickOESearchBlockedEmailLink(){
		
		click(oeSearchBlockedEmailLink);
	}
	
	public void verifyOEBlockEmailSuccessMessage(String msg){
		
		assertionText(oeBlockSuccessMessage, msg);
	}
	
	public void verifyOEBlockEmailExistMessageMessage(String msg){
		
		assertionText(oeBlockExistMessage, msg);
	}
	
	public void verifyOEBlockSearchResultPresent(){
		
		logging("Result Present : "+isElementDisplayed(oeSearchResultRow));
		assertTrue(isElementDisplayed(oeSearchResultRow));
	}
	
	public void verifyOEBlockSearchResultAbsent(){
		
		logging("Result Absent : "+!isElementDisplayed(oeSearchResultRow));
		assertTrue(!isElementDisplayed(oeSearchResultRow));
	}
	
	public void verifyOEBlockEmail(String email){
		
		assertionText(oeEmailAddressVerifyLink, email);
	}
	
	public void verifyOEBlockAction(String action){
		
		assertionText(oeActionVerifyLink, action);
	}
	
	public void clickOEUnblockAction(){
		
		click(oeActionVerifyLink);
	}
	

	/***************************************** OUTPUT EMAILS ELEMENTS AND METHODS ******************************
	 *************************************************************************************************************************/

	
	
	
	
	
	/*****************************************   MANAGE MAIL AVAILABILITY ELEMENTS AND METHODS   ******************************
	 ***************************************************************************************************************/


	// Manage Mail Availability Link
	@FindBy(xpath = "//*[@id='lnkMailAvailabilitySettings']")
	private WebElement manageMailAvailabilityLink;

	// Manage Mail Availability select Choose facility
	@FindBy(xpath = "//select[@id='uclFacilitiesDropDown_ddlFacilities']")
	private WebElement mmaSelectChooseFacility;

	// Manage Mail Availability select PermLoc
	@FindBy(xpath = "//select[@id='uclFacilitiesDropDown_ddlPermLocs']")
	private WebElement mmaSelectPermLoc;

	// Manage Mail Availability Inbound house availability verify
	@FindBy(xpath = ".//*[@id='housingLabel']")
	private WebElement mmaInboundHouseAvailabilityVerify;

	// Manage Mail Availability house to restrict from inbound mail input
	@FindBy(xpath = ".//*[@id='housingsRestricted']")
	private WebElement mmaInboundHouseRestrictInput;

	// Manage Mail Availability restrict Housings button
	@FindBy(xpath = ".//*[@id='btSaveRestrictedRange']")
	private WebElement mmaRestrictHousingsButton;
	
	
	
	// ----------------------------------------------------------------------------------------------------------------------------//

	
	
	
	public void clickManageMailAvailabilityLink() {

		click(manageMailAvailabilityLink);
	}

	public void selectMMAChooseFacility(String facility) {

		logging("Selecting Facility : " + facility);
		selectElementByVisibleText(mmaSelectChooseFacility, facility);
	}

	public void selectMMAPermLoc(String permloc) {

		logging("Selecting PermLoc : " + permloc);
		selectElementByVisibleText(mmaSelectPermLoc, permloc);
	}
	
	public void verifyMMAInboundHousingAvailibilityTextVerify(String text){
		
		assertionText(mmaInboundHouseAvailabilityVerify, text);
	}
	
	public void enterMMAHousingRestrictFromInboundMail(String house){
		
		setText(mmaInboundHouseRestrictInput, house);
	}
	
	public void enterMMAHousingRestrictFromInboundMail(){
		
		setText(mmaInboundHouseRestrictInput, "   ");
	}
	
	public void clickMMARestrictHousingsButton() {

		logging("Clicking on : "+mmaRestrictHousingsButton.getAttribute("value"));
		mmaRestrictHousingsButton.click();
	}

	
	

	/*****************************************   MANAGE MAIL AVAILABILITY ELEMENTS AND METHODS   ******************************
	 *************************************************************************************************************************/

	
	
	
	
	
	
	/*************************   FACILITY MANAGEMENT MANAGE LOCATION ELEMENTS AND METHODS    *****************************
	 *************************************************************************************************************************/

	// Manage Location  link
	@FindBy(xpath = "//a[@id='lnkManageLocations']")
	private WebElement fmmlManageLocationLink;

	// Manage location Choose Agency inbound Settings
	@FindBy(xpath = "//span[contains(text(),'Choose Agency')]")
	private WebElement fmmlChooseAgency;
	
	// Manage Location  Locatuion code input
	@FindBy(xpath = "//input[@id='txtLocationCode']")
	private WebElement fmmlLocationCodeInput;
	
	// Manage Location  Locatuion Alias input
	@FindBy(xpath = "//input[@id='txtLocationAlias']")
	private WebElement fmmlLocationAliasInput;
	
	// Manage Location  Locatuion Description input
	@FindBy(xpath = "//input[@id='txtLocationDescription']")
	private WebElement fmmlLocationDescriptionInput;
	
	// Manage Location  Address input
	@FindBy(xpath = "//input[@id='txtLocationAddress']")
	private WebElement fmmlAddressInput;
	
	// Manage Location  City input
	@FindBy(xpath = "//input[@id='txtLocationCity']")
	private WebElement fmmlCityInput;
	
	// Manage Location  City input
	@FindBy(xpath = "//input[@id='txtLocationZip']")
	private WebElement fmmlZipInput;
	
	// Manage Location  Timezone select combo
	@FindBy(xpath = "//div[@id='ddlLocationTimeZone_chosen']")
	private WebElement fmmlTimezoneSelect;
	
	// Manage Location  phone input
	@FindBy(xpath = "//input[@id='txtLocationPhone']")
	private WebElement fmmlPhoneInput;
	
	// Manage Location  cancel button
	@FindBy(xpath = "//input[@id='btnCancel']")
	private WebElement fmmlCancelButton;
	
	// Manage Location  Add Location button
	@FindBy(xpath = "//input[@id='btnAddLocation']")
	private WebElement fmmlAddLocationButton;

	
	

	// ----------------------------------------------------------------------------------------------------------------------------//

	public void clickManageLocationLink() {

		click(fmmlManageLocationLink);
	}

	public void clickFMMLChooseAgency() {

		click(fmmlChooseAgency);
	}

	public void selectFMMLFacility(String Facility,String env) {

		pause(1000);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(".//div[@class='chosen-search']//input")));
		setText(element, Facility);
		pause(1000);
		logging("Selecting Facility :  " + Facility);
		if (Facility.equalsIgnoreCase("JPAY")&&env.equalsIgnoreCase("QA")) {

			element.sendKeys(Keys.ARROW_DOWN);
		}
		if (Facility.equalsIgnoreCase("JPAY")&&env.equalsIgnoreCase("DEV2")) {

			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ARROW_DOWN);
		}
		if (Facility.equalsIgnoreCase("JPAY")&&env.equalsIgnoreCase("DEV1")) {

			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ARROW_DOWN);
		}
		pressEnter(element);
	}
	
	public void enterFMMLLocationCode(String code){
		
		setText(fmmlLocationCodeInput, code);
	}
	
	public void enterFMMLLocationAlias(String code){
		
		setText(fmmlLocationAliasInput, code);
	}
	
	public void enterFMMLLocationDescription(String desc){
		
		setText(fmmlLocationDescriptionInput, desc);
	}

	public void enterFMMLAddress(String address){
		
		setText(fmmlAddressInput, address);
	}
	
	public void enterFMMLCity(String city){
		
		setText(fmmlCityInput, city);
	}
	
	public void enterFMMLZip(String zip){
		
		setText(fmmlZipInput, zip);
	}
	
	public void selectFMMLTimezone(String timeZone){
		
		logging("Time Zone Selected :: "+timeZone);
		click(fmmlTimezoneSelect);
		pause(500);
		WebElement element = getDriver().findElement(By.xpath("//ul[@class='chosen-results']//li[contains(text(),'"+timeZone+"')]"));
		click(element);
	}

	public void enterFMMLPhone(String phone){
		
		setText(fmmlPhoneInput, phone);
	}

	public void clickFMMLCancelButton(){
		
		click(fmmlCancelButton);
	}

	public void clickFMMLAddLocationButton(){

		logging("Clicking on :: "+fmmlAddLocationButton.getAttribute("value"));
		click(fmmlAddLocationButton);
		pause(1000);
	}
	
	public void clickFMMLEditButton(String desc){
		
		WebElement element= getDriver().findElement(By.xpath("//*[contains(text(),'"+desc+"')]//following::td[15]//a"));
		jsScrollElementToView(element);
		click(element);
	}
	
	public void clickFMMLDeleteButton(String desc){
		
		WebElement element= getDriver().findElement(By.xpath("//*[contains(text(),'"+desc+"')]//following::td[16]//a"));
		jsScrollElementToView(element);
		click(element);
	}
	
	
	public boolean isFMMLDescriptionPresent(String desc){
		
		try {
			
			WebElement element= getDriver().findElement(By.xpath("//*[contains(text(),'"+desc+"')]"));
			jsScrollElementToView(element);
			return element.isDisplayed();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void verifyFMMLFacilityDescriptionPresent(String desc){
		
		logging("Facility Desc - "+desc+" is Present :: "+isFMMLDescriptionPresent(desc));
		assertTrue(isFMMLDescriptionPresent(desc));
	}
	
	public void verifyFMMLFacilityDescriptionAbsent(String desc){
		
		logging("Facility Desc - "+desc+" is Absent :: "+!isFMMLDescriptionPresent(desc));
		assertTrue(!isFMMLDescriptionPresent(desc));
	}
	
	
	public boolean isFMMLCodePresent(String desc,String code){
		
		try {
			
			WebElement element= getDriver().findElement(By.xpath("(//*[contains(text(),'"+desc+"')]//following::td[contains(text(),'"+code+"')])[1]"));
			return element.isDisplayed();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void verifyFMMLFacilityCodePresent(String desc,String code){
		
		logging("Code - "+code+" is Present :: "+isFMMLCodePresent(desc,code));
		assertTrue(isFMMLCodePresent(desc,code));
	}
	
	public void verifyFMMLFacilityCodeAbsent(String desc,String code){
		
		logging("Code - "+code+" is Absent :: "+!isFMMLCodePresent(desc,code));
		assertTrue(!isFMMLCodePresent(desc,code));
	}
	
	
	public boolean isFMMLAliasPresent(String desc,String code){
		
		try {
			
			WebElement element= getDriver().findElement(By.xpath("(//*[contains(text(),'"+desc+"')]//following::td[contains(text(),'"+code+"')])[2]"));
			return element.isDisplayed();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void verifyFMMLFacilityAliasPresent(String desc,String code){
		
		logging("Alias - "+code+" is Present :: "+isFMMLAliasPresent(desc,code));
		assertTrue(isFMMLAliasPresent(desc,code));
	}
	
	public void verifyFMMLFacilityAliasAbsent(String desc,String code){
		
		logging("Alias - "+code+" is Absent :: "+!isFMMLAliasPresent(desc,code));
		assertTrue(!isFMMLAliasPresent(desc,code));
	}
	
	
	public boolean isFMMLAddressPresent(String desc,String add){
		
		try {
			
			WebElement element= getDriver().findElement(By.xpath("//*[contains(text(),'"+desc+"')]//following::td[contains(text(),'"+add+"')]"));
			jsScrollElementToView(element);
			return element.isDisplayed();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void verifyFMMLFacilityAddressPresent(String desc,String add){
		
		logging("Address - "+add+" is Present :: "+isFMMLAddressPresent(desc,add));
		assertTrue(isFMMLAddressPresent(desc,add));
	}
	
	public void verifyFMMLFacilityAddressAbsent(String desc,String add){
		
		logging("Address - "+add+" is Absent :: "+!isFMMLAddressPresent(desc,add));
		assertTrue(!isFMMLAddressPresent(desc,add));
	}
	
	
	public boolean isFMMLCityPresent(String desc,String city){
		
		try {
			
			WebElement element= getDriver().findElement(By.xpath("//*[contains(text(),'"+desc+"')]//following::td[contains(text(),'"+city+"')]"));
			return element.isDisplayed();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void verifyFMMLFacilityCityPresent(String desc,String city){
		
		logging("City - "+city+" is Present :: "+isFMMLCityPresent(desc,city));
		assertTrue(isFMMLCityPresent(desc,city));
	}
	
	public void verifyFMMLFacilityCityAbsent(String desc,String city){
		
		logging("City - "+city+" is Absent :: "+!isFMMLCityPresent(desc,city));
		assertTrue(!isFMMLCityPresent(desc,city));
	}
	
	
	public boolean isFMMLZipPresent(String desc,String zip){
		
		try {
			
			WebElement element= getDriver().findElement(By.xpath("//*[contains(text(),'"+desc+"')]//following::td[contains(text(),'"+zip+"')]"));
			return element.isDisplayed();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void verifyFMMLFacilityZipPresent(String desc,String zip){
		
		logging("Zip - "+zip+" is Present :: "+isFMMLZipPresent(desc,zip));
		assertTrue(isFMMLZipPresent(desc,zip));
	}
	
	public void verifyFMMLFacilityZipAbsent(String desc,String zip){
		
		logging("Zip - "+zip+" is Absent :: "+!isFMMLZipPresent(desc,zip));
		assertTrue(!isFMMLZipPresent(desc,zip));
	}
	
	
	public boolean isFMMLPhonePresent(String desc,String phone){
		
		try {
			
			WebElement element= getDriver().findElement(By.xpath("//*[contains(text(),'"+desc+"')]//following::td[contains(text(),'"+phone+"')]"));
			return element.isDisplayed();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void verifyFMMLFacilityPhonePresent(String desc,String phone){
		
		logging("Phone - "+phone+" is Present :: "+isFMMLPhonePresent(desc,phone));
		assertTrue(isFMMLPhonePresent(desc,phone));
	}
	
	public void verifyFMMLFacilityPhoneAbsent(String desc,String phone){
		
		logging("Phone - "+phone+" is Absent :: "+!isFMMLPhonePresent(desc,phone));
		assertTrue(!isFMMLPhonePresent(desc,phone));
	}
	
	
	public boolean isFMMLTimezonePresent(String desc,String timezone){
		
		try {
			
			WebElement element= getDriver().findElement(By.xpath("//*[contains(text(),'"+desc+"')]//following::td[contains(text(),'"+timezone+"')]"));
			return element.isDisplayed();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void verifyFMMLFacilityTimezonePresent(String desc,String timezone){
		
		logging("Time Zone - "+timezone+" is Present :: "+isFMMLTimezonePresent(desc,timezone));
		assertTrue(isFMMLTimezonePresent(desc,timezone));
	}
	
	public void verifyFMMLFacilityTimezoneAbsent(String desc,String timezone){
		
		logging("Time Zone - "+timezone+" is Absent :: "+!isFMMLTimezonePresent(desc,timezone));
		assertTrue(!isFMMLTimezonePresent(desc,timezone));
	}
	
	public void verifyFMMLShowInServiceMapCheckBoxSelected(String desc){
		
		WebElement element = getDriver().findElement(By.xpath("//*[contains(text(),'"+desc+"')]//following::td[11]//input"));
		logging("ShowInServiceMapCheckBox is Selected ::"+element.isSelected());
		assertTrue(element.isSelected());
	}
	
	public void verifyFMMLShowInServiceMapCheckBoxNotSelected(String desc){
		
		WebElement element = getDriver().findElement(By.xpath("//*[contains(text(),'"+desc+"')]//following::td[11]//input"));
		logging("ShowInServiceMapCheckBox is Selected ::"+!element.isSelected());
		assertTrue(!element.isSelected());
	}
	
	public void verifyFMMLEnableJpayDollarsCheckBoxSelected(String desc){
		
		WebElement element = getDriver().findElement(By.xpath("//*[contains(text(),'"+desc+"')]//following::td[12]//input"));
		logging("EnableJpayDollars is Selected ::"+element.isSelected());
		assertTrue(element.isSelected());
	}
	
	public void verifyFMMLEnableJpayDollarsCheckBoxNotSelected(String desc){
		
		WebElement element = getDriver().findElement(By.xpath("//*[contains(text(),'"+desc+"')]//following::td[112]//input"));
		logging("EnableJpayDollars is Selected ::"+!element.isSelected());
		assertTrue(!element.isSelected());
	}
	
	public void clickFMMLEditUpdateButton(String desc){
		
		WebElement element= getDriver().findElement(By.xpath("(//*[contains(@value,'"+desc+"')]//following::td[15]//a)[1]"));
		jsScrollElementToView(element);
		click(element);
		pause(500);
	}
	
	public void clickFMMLEditCancelButton(String desc){
		
		WebElement element= getDriver().findElement(By.xpath("(//*[contains(@value,'"+desc+"')]//following::td[15]//a)[2]"));
		jsScrollElementToView(element);
		click(element);
	}
	
	
	
	
	public void editFMMLLocationCode(String desc,String code){
		
		WebElement element= getDriver().findElement(By.xpath("//*[contains(@value,'"+desc+"')]//following::td[1]//input[1]"));
		jsScrollElementToView(element);
		setText(element, code);
	}
	
	public void editFMMLLocationAlias(String desc,String code){
		
		WebElement element= getDriver().findElement(By.xpath("//*[contains(@value,'"+desc+"')]//following::td[2]//input[1]"));
		jsScrollElementToView(element);
		setText(element, code);
	}
	
	public void editFMMLLocationDescription(String desc,String descUpdated){
		
		WebElement element= getDriver().findElement(By.xpath("(//*[contains(@value,'"+desc+"')])[1]"));
		jsScrollElementToView(element);
		setText(element, descUpdated);
	}

	public void editFMMLAddress(String desc,String address){
		
		WebElement element= getDriver().findElement(By.xpath("//*[contains(@value,'"+desc+"')]//following::td[3]//input[1]"));
		jsScrollElementToView(element);
		setText(element, address);
	}
	
	public void editFMMLCity(String desc,String city){
		
		WebElement element= getDriver().findElement(By.xpath("//*[contains(@value,'"+desc+"')]//following::td[4]//input[1]"));
		jsScrollElementToView(element);
		setText(element, city);
	}
	
	public void editFMMLZip(String desc,String zip){
		
		WebElement element= getDriver().findElement(By.xpath("//*[contains(@value,'"+desc+"')]//following::td[5]//input[1]"));
		jsScrollElementToView(element);
		setText(element, zip);
	}

	public void editFMMLPhone(String desc,String phone){
		
		WebElement element= getDriver().findElement(By.xpath("//*[contains(@value,'"+desc+"')]//following::td[6]//input[1]"));
		jsScrollElementToView(element);
		setText(element, phone);
	}
	
	public void checkFMMLShowInServiceMapCheckBox(String desc){
		
		WebElement element= getDriver().findElement(By.xpath("//*[contains(@value,'"+desc+"')]//following::td[11]//input[1]"));
		jsScrollElementToView(element);
		if (!element.isSelected()) {
			pressSpace(element);
		}
		
	}
	
	public void uncheckFMMLShowInServiceMapCheckBox(String desc){
		
		WebElement element= getDriver().findElement(By.xpath("//*[contains(@value,'"+desc+"')]//following::td[11]//input[1]"));
		jsScrollElementToView(element);
		if (element.isSelected()) {
			pressSpace(element);
		}
		
	}
	
	public String getFMMLLocationDescription(){
		
		WebElement element = getDriver().findElement(By.xpath("(//*[@id='pViewLocation']//table[@id='dgLocations']//td[12]//input[@checked='checked']//preceding::td[11])[1]"));
		return element.getText();
	}
	
	public String getFMMLAddress(){
		
		WebElement element = getDriver().findElement(By.xpath("(//*[@id='pViewLocation']//table[@id='dgLocations']//td[12]//input[@checked='checked']//preceding::td[8])[1]"));
		return element.getText();
	}
	
	public String getFMMLCity(){
		
		WebElement element = getDriver().findElement(By.xpath("(//*[@id='pViewLocation']//table[@id='dgLocations']//td[12]//input[@checked='checked']//preceding::td[7])[1]"));
		return element.getText();
	}
	
	public String getFMMLZip(){
		
		WebElement element = getDriver().findElement(By.xpath("(//*[@id='pViewLocation']//table[@id='dgLocations']//td[12]//input[@checked='checked']//preceding::td[6])[1]"));
		return element.getText();
	}
	
	public String getFMMLPhone(){
		
		WebElement element = getDriver().findElement(By.xpath("(//*[@id='pViewLocation']//table[@id='dgLocations']//td[12]//input[@checked='checked']//preceding::td[5])[1]"));
		return element.getText();
	}
	
	
	//*[@id='pViewLocation']//table[@id='dgLocations']//td[12]//input[@checked='checked']//preceding::td[11] (Collect the descriptions thats are checked show in service map)
	
	
	
	/***********************   FACILITY MANAGEMENT MANAGE LOCATION SETTINGS ELEMENTS AND METHODS    ***************************
	 *************************************************************************************************************************/

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

//
