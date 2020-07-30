package com.jpay.media.automation.web.staging.pagesobjects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class StagingTransfersPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public StagingTransfersPage(WebDriver driver) {
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

	// NewCustomerLink
	@FindBy(xpath = "(//*[contains(text(),'New Customer')])[1]")
	private WebElement newCustomerLink;

	// Lookup Account Link
	@FindBy(xpath = "(//*[contains(text(),'Lookup Account')])[1]")
	private WebElement lookupAccountLink;

	// New Customer Text
	@FindBy(xpath = "(//*[contains(text(),'NEW CUSTOMER')])[1]")
	private WebElement newCustomerText;

	// Select Facility
	@FindBy(xpath = "//select[@id='F_Location1']")
	private WebElement selectFacility;

	// Inmate id text box
	@FindBy(xpath = "//input[@id='sInmateID']")
	private WebElement enterInmateId;

	// LOOKUP INMATE FIRST... button
	@FindBy(xpath = "//input[contains(@id,'Lookup')]")
	private WebElement lookUpInmateButton;

	// Firstname Input box
	@FindBy(xpath = "//input[@id='sFirstName']")
	private WebElement firstnameInput;

	// Lastname Input box
	@FindBy(xpath = "//input[@id='sLastName']")
	private WebElement lastnameInput;

	// Middlename Input box
	@FindBy(xpath = "//input[@id='sMiddleName']")
	private WebElement middlenameInput;

	// Dob Input box
	@FindBy(xpath = "//input[@id='tbDOB']")
	private WebElement dobInput;

	// Address1 Input box
	@FindBy(xpath = "//input[@id='sAddress1']")
	private WebElement address1Input;

	// sAddress2 Input box
	@FindBy(xpath = "//input[@id='sAddress2']")
	private WebElement address2Input;

	// City Input box
	@FindBy(xpath = "//input[@id='sCity']")
	private WebElement cityInput;

	// Zip Input box
	@FindBy(xpath = "//input[@id='sZip']")
	private WebElement zipInput;

	// PhoneNum Input box
	@FindBy(xpath = "//input[@id='sPhoneNum']")
	private WebElement phoneNumInput;

	// CellPhoneNumber Input box
	@FindBy(xpath = "//input[@id='sCellPhoneNumber']")
	private WebElement cellPhoneNumberInput;

	// State Combo box
	@FindBy(xpath = "//select[@id='State1']")
	private WebElement stateCombo;

	// Relation Combo box
	@FindBy(xpath = "//select[@id='ddlRelation']")
	private WebElement relationCombo;

	// countries Combo box
	@FindBy(xpath = "//select[@id='countries']")
	private WebElement countriesCombo;

	// Email receipt check box
	@FindBy(xpath = "//input[@id='chk_ReceiptMail']")
	private WebElement emailReceiptCheckbox;

	// Email input box
	@FindBy(xpath = "//input[@id='txt_Email']")
	private WebElement emailinputbox;

	// Create account and payment radio button
	@FindBy(xpath = "//input[@id='rbnNewAccountAndMakePayment']")
	private WebElement accountAndPaymentRadio;

	// Create account radio button
	@FindBy(xpath = "//input[@id='rbnNewAccount']")
	private WebElement accountRadio;

	// Account Create Continue Button
	@FindBy(xpath = "//input[@id='btnDisplayPreview']")
	private WebElement AccCreateContinueButton;

	// Account Review Continue Button
	@FindBy(xpath = "//input[@id='btn_Initiate']")
	private WebElement AccReviewContinueButton;

	// Mail Link
	@FindBy(xpath = "//a[@id='mAccountConsole_MyDataList_VA_ctl00_Linkbutton240']")
	private WebElement mailLink;

	// Purchase Stamps Radio Button
	@FindBy(xpath = "//input[@id='mAccountConsole_rblMailAvailableServices_0']")
	private WebElement purStampsRadioButton;

	// Purchase Stamps Continue Button
	@FindBy(xpath = "//input[@id='mAccountConsole_ocbContinueToMail']")
	private WebElement purStampsContinueButton;

	// Buy Postages Continue Button
	@FindBy(xpath = "//input[@id='mAccountConsole_ucMailBuyStamps_btnContinueToStep2']")
	private WebElement buyPostageContinueButton;

	// Use a new card radio Button
	@FindBy(xpath = "//input[@id='NewCardButton']")
	private WebElement useANewCardRadioButton;

	// Use a card from my account radio Button
	@FindBy(xpath = "//input[@id='CardOnFileButton']")
	private WebElement useACardFromMyAccountRadioButton;
	
	// Add card Continue Button
	@FindBy(xpath = "//input[@id='mAccountConsole_ucMailBuyStamps_btnContinueToStep3']")
	private WebElement addCardContinueButton;

	// Copy User Info Button
	@FindBy(xpath = "//input[@id='FillAddressButton']")
	private WebElement copyUserInfoButton;

	// Card Number Input box
	@FindBy(xpath = "//input[@id='CardholderData_CardNumber']")
	private WebElement enterCardNum;

	// Card Code Input box
	@FindBy(xpath = "//input[@id='CardholderData_Cvv']")
	private WebElement enterCardCodeNum;

	// Card Type Combo box
	@FindBy(xpath = "//select[@id='CardholderData_CardTypeForCyberSource']")
	private WebElement cardTypeCombo;

	// Month Combo box
	@FindBy(xpath = "//select[@id='CardholderData_CardExpiryMonth']")
	private WebElement monthCombo;

	// Year Combo box
	@FindBy(xpath = "//select[@id='CardholderData_CardExpiryYear']")
	private WebElement yearCombo;

	// Save Card Check box
	@FindBy(xpath = "//input[@id='CardholderData_SaveCardOnFile']")
	private WebElement saveCardCheckbox;

	// User Agreement Check box
	@FindBy(xpath = "//input[@id='CardholderData_AcceptedCardOnFileTerms']")
	private WebElement userAgrCheckbox;

	// Final buy stamps Continue Button
	@FindBy(xpath = "//input[@id='ContinueButton']")
	private WebElement finalBuyStampContinueButton;

	// Purchase Confirmation Message
	@FindBy(xpath = "//span[@id='mAccountConsole_ucMailBuyStamps_lblSendingDone']")
	private WebElement purchaseConMsg;

	// Select Search Inmate By
	@FindBy(xpath = "//select[@id='searchfilter']")
	private WebElement selectSearchInmateBy;

	// Search Inmate input box
	@FindBy(xpath = "//input[@id='searchstring']")
	private WebElement searchAccountInput;

	// Inmate Account Link
	@FindBy(xpath = "//a[@id='MyDataGrid_ctl03_bAccountID']")
	private WebElement inmateAccountLink;

	// Inmate Search Button
	@FindBy(xpath = "//input[@id='btnSubmit']")
	private WebElement inmateAccSearchButton;

	// Inmate Details Link
	@FindBy(xpath = "//a[@id='mAccountConsole_MyDataList_VA_ctl00_Linkbutton1']")
	private WebElement inmateAccDetailsLink;

	// Inmate remove Check box
	@FindBy(xpath = "//input[@id='mAccountConsole_ViewInmatesMyDataGrid_ctl02_Remove']")
	private WebElement inmateRemoveCheckbox;

	// Delete inmate button
	@FindBy(xpath = "//input[@id='mAccountConsole_img_deleteinmate']")
	private WebElement deleteInmateButton;

	// Add An inmate button
	@FindBy(xpath = "//a[contains(text(),'Add an inmate')]")
	private WebElement addAnInmateButton;

	// Select Add an Inmate state combo
	@FindBy(xpath = "//select[@id='ddl_facilState']")
	private WebElement selectAddAnInmateState;

	// Add an inmate select state continue button
	@FindBy(xpath = "//input[@id='Button1']")
	private WebElement addInmateStateSelContinueButton;

	// Select Add an Inmate prison combo
	@FindBy(xpath = "//select[@id='ddl_FacilityState']")
	private WebElement selectAddAnInmatePrison;

	// Add an inmate select prison continue button
	@FindBy(xpath = "//input[@id='Button1']")
	private WebElement addInmatePrisonSelContinueButton;

	// enter Add an inmate id input box
	@FindBy(xpath = "//input[@id='ed_InmateID']")
	private WebElement addAnInmateIdInput;

	// Select Add an Inmate Relation combo
	@FindBy(xpath = "//select[@id='ddlRelation']")
	private WebElement selectAddAnInmateRelation;

	// Add an inmate Relation continue button
	@FindBy(xpath = "//input[@id='bt_continue']")
	private WebElement addInmateRelationContinueButton;

	// Add an inmate Final add button
	@FindBy(xpath = "//input[@id='Button3']")
	private WebElement addInmateFinalButton;

	// Add an inmate Click here button
	@FindBy(xpath = "//a[contains(text(),'Click here')]")
	private WebElement addInmateClickHereButton;

	// Main Details Link
	@FindBy(xpath = "(//*[contains(text(),'Main Details')])[1]")
	private WebElement mainDetailsLink;

	// Select Lookup account by
	@FindBy(xpath = "//select[@id='searchfilter']")
	private WebElement selectLookupAccountBy;

	// Enter Lookup account Filter by input
	@FindBy(xpath = "//input[@id='searchstring']")
	private WebElement filterBySearchInput;

	// Lookup account Filter by Search Button
	@FindBy(xpath = "//input[@id='btnSubmit']")
	private WebElement lookupSearchButton;

	// Lookup account Account id link
	@FindBy(xpath = "//*[@id='MyDataGrid_ctl03_bAccountID']")
	private WebElement lookupAccountIdLink;

	// Lookup account inmate Information Continue Button
	@FindBy(xpath = "//*[@id='mAccountConsole_ocbContinueToMail2']")
	private WebElement inmateInformationContinueButton;

	//enterCardCodeNumExistingCard
	@FindBy(xpath = "//*[@id='CardTokenData_Cvv']")
	private WebElement enterCardCodeNumExistingCard;
	
	

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/

	public void clickNewCustomersLink() {

		click(newCustomerLink);
	}

	public void clickLookupAccountLink() {

		click(lookupAccountLink);
	}

	public void selectLookupAccountFilterBy(String by) {

		logging("Selecting Lookup Account By :  " + by);
		selectElementByVisibleText(selectLookupAccountBy, by);
	}

	public void enterLookupAccountFilterBySearch(String searchString) {

		setText(filterBySearchInput, searchString);
	}

	public void verifyNewCustomerText(String text) {

		assertionText(newCustomerText, text);
	}

	public void verifyFacilityName(String name) {

		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'" + name + "')]")));
		assertionText(element.getText().trim(), name);
	}

	public void selectNewCustomerFacility(String Facility) {

		logging("Selecting Facility :  " + Facility);
		selectElementByVisibleText(selectFacility, Facility);
	}

	public void enterInmateId(String inmateId) {

		setText(enterInmateId, inmateId);
	}

	public void clickLookupAccountSearchButton() {

		logging("Clicking on : " + lookupSearchButton.getAttribute("value"));
		lookupSearchButton.click();
	}

	public void clickLookupAccountAccountIdLink() {

		click(lookupAccountIdLink);
	}

	public void verifyLookupAccountAccountId(String accountId) {

		assertionText("AccountID :: ",lookupAccountIdLink,accountId);
	}

	public void clickLookupInmateButton() {

		logging("Clicking on : " + lookUpInmateButton.getAttribute("value"));
		lookUpInmateButton.click();
	}

	public String enterRandomPhoneNumber() {

		String firstPortion = "754";
		Random randomGenerator = new Random();
		String middlePortion = Integer.toString(randomGenerator.nextInt(900) + 100);
		String lastPortion = Integer.toString(randomGenerator.nextInt(900) + 1000);
		String ph = firstPortion + "-" + middlePortion + "-" + lastPortion;
		return ph;

	}

	public void filloutCustomerDetails(String fName, String mName, String lName, String dob, String address,
			String city, String zip, String state, String country) {

		setText(firstnameInput, fName);
		setText(middlenameInput, mName);
		setText(lastnameInput, lName);
		setText(dobInput, dob);
		pressEnter();
		setText(address1Input, address);
		setText(cityInput, city);
		setText(zipInput, zip);
		logging("State selected : " + state);
		selectElementByVisibleText(stateCombo, state);
		logging("Country selected : " + country);
		selectElementByVisibleText(countriesCombo, country);
		setText(phoneNumInput, enterRandomPhoneNumber());
		setText(cellPhoneNumberInput, enterRandomPhoneNumber());

	}

	public void selectRelationship() {

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(15) + 1;
		try {
			if (relationCombo.isDisplayed()) {
				selectElementByIndex(relationCombo, randomInt);
				logging("Relationship selected : "
						+ relationCombo.findElement(By.xpath(".//option[@selected='selected']")).getText());
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void checkEmailReceiptCheckbox() {

		logging("Checking on Email Receipt checkbox");
		if (!emailReceiptCheckbox.isSelected()) {
			pressSpace(emailReceiptCheckbox);
		}
	}

	public void clickCreateAccAndPaymentRadioButton() {

		logging("Clicking on : " + accountAndPaymentRadio.getAttribute("value"));
		accountAndPaymentRadio.click();
	}

	public void enterEmail(String email) {

		setText(emailinputbox, email);

	}

	public void clickCreateAccContinueButton() {

		logging("Clicking on : " + AccCreateContinueButton.getAttribute("value"));
		AccCreateContinueButton.click();
	}

	public void clickReviewAccContinueButton() {

		logging("Clicking on : " + AccReviewContinueButton.getAttribute("value"));
		AccReviewContinueButton.click();
	}

	public void clickMailLink() {

		click(mailLink);
	}

	public void clickMainDetailsLink() {

		click(mainDetailsLink);
	}

	public void clickPurchaseStampsRadioButton() {

		logging("Clicking on : " + purStampsRadioButton.getAttribute("value"));
		if (!purStampsRadioButton.getAttribute("checked").contentEquals("checked")) {
			purStampsRadioButton.click();
		}

	}

	public void clickPurchaseStampsContinueButton() {

		logging("Clicking on : " + purStampsContinueButton.getAttribute("value"));
		purStampsContinueButton.click();
	}

	public void clickInmateInformationContinueButton() {

		logging("Clicking on : " + inmateInformationContinueButton.getAttribute("value"));
		inmateInformationContinueButton.click();
	}
	
	public void clickBuyPostageContinueButton() {

			logging("Clicking on : " + buyPostageContinueButton.getAttribute("value"));
			buyPostageContinueButton.click();
	}

	public void clicUseNewCardRadioButton() {

		wait.until(ExpectedConditions.elementToBeClickable(useANewCardRadioButton));
		logging("Clicking on : Use a New card");
		// if
		// (!useANewCardRadioButton.getAttribute("checked").contentEquals("checked"))
		// {
		useANewCardRadioButton.click();
		// }

	}

	public void clicUseCardFromMyAccountRadioButton() {

		pause(3000);
		logging("Clicking on : Use a Card From My Account");
		useACardFromMyAccountRadioButton.click();
	}

	public void clickCopyUserInfoButton() {

		logging("Clicking on : " + copyUserInfoButton.getAttribute("value"));
		copyUserInfoButton.click();
	}

	public void enterCardNumber(String cardNum) {

		setText(enterCardNum, cardNum);
	}

	public void enterValidationCode(String code) {

		setText(enterCardCodeNum, code);
	}

	public void enterValidationCodeExistingCard(String code) {

		setText(enterCardCodeNumExistingCard, code);
	}

	public void selectRandomCardType() {

		Random randomGenerator = new Random();
		int abc = randomGenerator.nextInt(3);
		selectElementByIndex(cardTypeCombo, abc);
	}

	public void selectRandomMonth() {

		Random randomGenerator = new Random();
		int randomMonth = randomGenerator.nextInt(11);
		if (randomMonth==0) {
			randomMonth=1;
		}
		selectElementByIndex(monthCombo, randomMonth);
		logging("Month selected.");
	}

	public void selectRandomExpiryYear() {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
		Date date = new Date();
		int year = Integer.parseInt(formatter.format(date));
		int randomYear = year + 5;
		String expiryYear = Integer.toString(randomYear);
		selectElementByValue(yearCombo, expiryYear);
		logging("Year selected.");
	}

	public void checkSaveCardCheckbox() {

		logging("Checking on save card checkbox");
		if (!saveCardCheckbox.isSelected()) {
			pressSpace(saveCardCheckbox);
		}
	}

	public void checkTermsConCheckbox() {

		logging("Checking on Terms and Condition checkbox");
		if (!userAgrCheckbox.isSelected()) {
			pressSpace(userAgrCheckbox);
		}
	}

	public void clickFinalBuyStampContinueButton() {

		logging("Clicking on : " + finalBuyStampContinueButton.getAttribute("value"));
		finalBuyStampContinueButton.click();
		pause(2000);
	}

	public boolean isConfirmationMsgVisible() {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(purchaseConMsg));
			return purchaseConMsg.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	public void verifyPurchaseConfirmMessagePresent() {

		logging("Purchase confirmation message is present : " + isConfirmationMsgVisible());
		logging("Purchase confirmation message : " + purchaseConMsg.getText());
		assertTrue(isConfirmationMsgVisible());
	}

	public void selectSearchInmateByAccount() {

		logging("Selecting By : Account");
		selectElementByVisibleText(selectSearchInmateBy, "Account #");
	}

	public void enterInmateAccount(String acc) {

		setText(searchAccountInput, acc);
	}

	public void clickInmateAccSearchButton() {

		logging("Clicking on : " + inmateAccSearchButton.getAttribute("value"));
		inmateAccSearchButton.click();
	}

	public void clickInmateAccLink() {

		click(inmateAccountLink);

	}

	public void clickInmateAccountDetailsLink() {

		click(inmateAccDetailsLink);
	}

	public void checkInmateRemovebox() {

		logging("Checking on Inmate Remove checkbox");
		if (!inmateRemoveCheckbox.isSelected()) {
			pressSpace(inmateRemoveCheckbox);
		}
	}

	public void clickInmateDeleteButton() {

		logging("Clicking on : DELETE");
		deleteInmateButton.click();
	}

	public void clickAddAnInmateButton() {

		click(addAnInmateButton);
	}

	public void selectAddAnInmateState(String state) {

		logging("Selecting inmate state : " + state);
		System.out.println(">>>>><<<<<<" + selectAddAnInmateState.getAttribute("id"));
		selectElementByVisibleText(selectAddAnInmateState, state);
	}

	public void clickAddInmateStateSelContinueButton() {

		logging("Clicking on : " + addInmateStateSelContinueButton.getAttribute("value"));
		addInmateStateSelContinueButton.click();
	}

	public void selectAddAnInmatePrison(String prison) {

		logging("Selecting inmate prison : " + prison);
		selectElementByVisibleText(selectAddAnInmatePrison, prison);
	}

	public void clickAddInmatePrisonSelContinueButton() {

		logging("Clicking on : " + addInmatePrisonSelContinueButton.getAttribute("value"));
		addInmatePrisonSelContinueButton.click();
	}

	public void enterAddInmateId(String inmateId) {

		setText(addAnInmateIdInput, inmateId);
	}

	public void selectAddAnInmateRelation(String relation) {

		logging("Selecting inmate prison : " + relation);
		selectElementByVisibleText(selectAddAnInmateRelation, relation);
	}

	public void clickAddInmateRelationContinueButton() {

		logging("Clicking on : " + addInmateRelationContinueButton.getAttribute("value"));
		addInmateRelationContinueButton.click();
	}

	public void clickFinalAddInmateAddButton() {

		logging("Clicking on : " + addInmateFinalButton.getAttribute("value"));
		addInmateFinalButton.click();
	}

	public void closeAddInmateChildWindow() {

		click(addInmateClickHereButton);
	}
	
	public boolean isInmateVisible(){
		
		try {
			getDriver().navigate().refresh();
			pause(1000);
			return getDriver().findElement(By.xpath("//table[@id='mAccountConsole_ViewInmatesMyDataGrid']//tr[2]")).isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void verifyInmateAdded(){
		
		logging("Inmate added : "+isInmateVisible());
		assertTrue(isInmateVisible());
	}
	
	public void verifyInmateDeleted(){
		
		logging("Inmate Deleted : "+!isInmateVisible());
		assertTrue(!isInmateVisible());
	}
	
	
	

}
