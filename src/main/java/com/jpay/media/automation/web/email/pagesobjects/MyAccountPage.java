package com.jpay.media.automation.web.email.pagesobjects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class MyAccountPage extends HeaderNavigation {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public MyAccountPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/**********************************************
	 * CONSTRUCTOR****************************************
	 **************************************************************************************************
	 **************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	// First Name
	@FindBy(xpath = "//*[@id='add_sFirstName']")
	private WebElement enterFirstName;

	// Middle Name
	@FindBy(xpath = "//*[@id='add_sMiddleName']")
	private WebElement enterMiddleName;

	// Last Name
	@FindBy(xpath = "//*[@id='add_sLastName']")
	private WebElement enterLastName;

	// Month
	@FindBy(xpath = "//*[@id='ucDateDropDowns_ddlMonth']")
	private WebElement selectMonth;

	// Day
	@FindBy(xpath = "//*[@id='ucDateDropDowns_ddlDay']")
	private WebElement selectDay;

	// Year
	@FindBy(xpath = "//*[@id='ucDateDropDowns_ddlYear']")
	private WebElement selectYear;

	// Address
	@FindBy(xpath = "//*[@id='add_sAddress1']")
	private WebElement enterAddress;

	// Address2
	@FindBy(xpath = "//*[@id='add_sAddress2']")
	private WebElement enterAddress2;

	// City
	@FindBy(xpath = "//*[@id='add_sCity']")
	private WebElement enterCity;

	// Country
	@FindBy(xpath = "//*[@id='add_sCountry']")
	private WebElement selectCountry;

	// State/Province
	@FindBy(xpath = "//*[@id='add_sStateProvince']")
	private WebElement selectState;

	// Zip/Postal Code
	@FindBy(xpath = "//*[@id='add_sZip']")
	private WebElement enterZip;

	// Home Phone
	@FindBy(xpath = "//*[@id='add_sHomePhone']")
	private WebElement enterPhone;

	// Cell Phone
	@FindBy(xpath = "//*[@id='add_CellPhone']")
	private WebElement enterCellPhone;

	// Save Button
	@FindBy(xpath = "//*[@id='btnAction']")
	private WebElement saveButton;

	// Profile Creation Success Message
	@FindBy(xpath = "//*[@id='lblMessage']")
	private WebElement profileSuccMsg;

	// Firstname empty error Message
	@FindBy(xpath = "//*[@id='Requiredfieldvalidator8']")
	private WebElement emptyFirstnameErrorMsg;

	// Firstname Special error Message
	@FindBy(xpath = "//*[@id='RegExValidator1']")
	private WebElement specialFirstnameErrorMsg;

	// Firstname Numerical error Message
	@FindBy(xpath = "//*[@id='RegularExpressionValidator1']")
	private WebElement numericalFirstnameErrorMsg;

	// Firstname Space error Message
	@FindBy(xpath = "//*[@id='RegularExpressionValidator21']")
	private WebElement spaceFirstnameErrorMsg;

	// Lastname empty error Message
	@FindBy(xpath = "//*[@id='Requiredfieldvalidator1']")
	private WebElement emptyLastnameErrorMsg;

	// Address empty error Message
	@FindBy(xpath = "//*[@id='Requiredfieldvalidator10']")
	private WebElement emptyAddressErrorMsg;

	// City empty error Message
	@FindBy(xpath = "//*[@id='Requiredfieldvalidator2']")
	private WebElement emptyCityErrorMsg;

	// Counrty empty error Message
	@FindBy(xpath = "//*[@id='Requiredfieldvalidator5']")
	private WebElement emptyCountryErrorMsg;

	// Zip empty error Message
	@FindBy(xpath = "//*[@id='Requiredfieldvalidator3']")
	private WebElement emptyZipErrorMsg;

	// Phone empty error Message
	@FindBy(xpath = "//*[@id='vldHomePhoneReq']")
	private WebElement emptyPhoneErrorMsg;

	// Phone Worng Format error Message
	@FindBy(xpath = "//*[@id='vldPhoneRegularExpression']")
	private WebElement worngFormatPhoneErrorMsg;

	// Cell Phone Worng Format error Message
	@FindBy(xpath = "//*[@id='vldCellPhone']")
	private WebElement worngFormatCellPhoneErrorMsg;

	// Payment Methods Link
	@FindBy(xpath = "//*[@id='myheader_SidebarMenuTable']//a[contains(text(),'Payment Methods')]")
	private WebElement paymentMethodsLink;

	// Payment Methods Delete Button
	@FindBy(xpath = "//*[@id='dg_Cards_ctl02_linkbutton_delete']")
	private WebElement paymentMethodsDeleteButton;

	// Payment Methods Card Delete message
	@FindBy(xpath = "//*[@id='lbl_msgstatus']//span")
	private WebElement paymentMethodsCardDeleteMsg;

	// Email Preferences Link
	@FindBy(xpath = "//*[@id='myheader_SidebarMenuTable']//a[contains(text(),'Email Preferences')]")
	private WebElement mailPreferencesLink;

	// Email Preferences enter new email input
	@FindBy(xpath = "//*[@id='txtNewEmail']")
	private WebElement enterNewEmail;

	// Email Preferences enter new confirm email input
	@FindBy(xpath = "//*[@id='txtConfirmNewEmail']")
	private WebElement enterNewConEmail;

	// Email Preferences update button
	@FindBy(xpath = "//*[@id='btnSaveEmail']")
	private WebElement emailPreferencesUpdateButton;

	// Email Preferences update message
	@FindBy(xpath = ".//*[@id='lblEmailSavedSuccessfully']")
	private WebElement emailPreferencesUpdateMsg;

	// Change Password Link
	@FindBy(xpath = "//*[@id='myheader_SidebarMenuTable']//a[contains(text(),'Change Password')]")
	private WebElement changePasswordLink;

	// Change Password Enter Current Password Input
	@FindBy(xpath = "//*[@id='oldpassword']")
	private WebElement enterCurrentPasswordInput;

	// Change Password Enter New Password Input
	@FindBy(xpath = "//*[@id='newpassword']")
	private WebElement enterNewPasswordInput;

	// Change Password Enter New Password Again Input
	@FindBy(xpath = "//*[@id='confirmnewpassword']")
	private WebElement enterNewPasswordAgainInput;

	// Change Password Button
	@FindBy(xpath = "//*[@id='btnChange']")
	private WebElement changePasswordButton;

	// Change Password Button
	@FindBy(xpath = "//*[@id='lblPasswordSuccess']")
	private WebElement changePasswordMsg1;

	// Change Password Button
	@FindBy(xpath = "//*[@id='lblPasswordSuccessCont']")
	private WebElement changePasswordMsg2;

	// Empty Change Password Error message
	@FindBy(xpath = ".//*[@id='ctl06']/ul/li")
	private WebElement emptyChangePasswordErrorMsg;

	// Change Password Do not match error message
	@FindBy(xpath = ".//*[@id='cvConfirmPassword']")
	private WebElement changePasswordDoNotMatchMsg;

	// Change Password Required error message 1
	@FindBy(xpath = "(.//*[@id='ctl06']/ul/li)[1]")
	private WebElement changePasswordRequiredMsg1;

	// Change Password Required error message 2
	@FindBy(xpath = "(.//*[@id='ctl06']/ul/li)[2]")
	private WebElement changePasswordRequiredMsg2;

	// Change Password Required error message 3
	@FindBy(xpath = "(.//*[@id='ctl06']/ul/li)[3]")
	private WebElement changePasswordRequiredMsg3;

	// Add Phone Number Link
	@FindBy(xpath = "//*[@id='myheader_SidebarMenuTable']//a[contains(text(),'Add Phone Number')]")
	private WebElement addPhoneNumberLink;

	// Add Phone Number enter phone number input
	@FindBy(xpath = ".//*[@id='tbNewPhoneNumber']")
	private WebElement enterPhoneNumberInput;

	// Add Phone Number add button
	@FindBy(xpath = ".//*[@id='btnADD']")
	private WebElement addPhoneNumberAddButton;

	// Add Phone Number Success Message
	@FindBy(xpath = ".//*[@id='lblSucces']")
	private WebElement addPhoneNumberSuccessMsg;

	// Add Phone Number Error Message
	@FindBy(xpath = ".//*[@id='lblErroneousField']")
	private WebElement addPhoneNumberErrorMsg;

	// Change Password Unrecognized Error Message
	@FindBy(xpath = ".//*[@id='lblErrors']")
	private WebElement changePasswordUnrecognizedErrorMsg;

	// Add Phone Number Delete Button
	@FindBy(xpath = ".//*[@id='dgPhoneNumbers_ctl02_btnDeletePhoneNumber']")
	private WebElement addPhoneNumberDeleteButton;
	
	
	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/

	public void enterFirstname(String firstName) {
		
		setText(enterFirstName, firstName);
	}

	public void enterFirstname() {
		
		String ranName= RandomStringUtils.randomAlphabetic(6).toUpperCase();
		setText(enterFirstName, ranName);
	}

	public void enterLastname() {
		
		String lastName= RandomStringUtils.randomAlphabetic(4).toUpperCase();
		setText(enterLastName, lastName);
	}

	public void enterLastname(String lastName) {

		setText(enterLastName, lastName);
	}

	public void enterMiddlename(String middleName) {

		setText(enterMiddleName, middleName);
	}

	public void enterMiddlename() {

		String middleName= RandomStringUtils.randomAlphabetic(4).toUpperCase();
		setText(enterMiddleName, middleName);
	}

	public void selectRandomMonth() {

		Random randomGenerator = new Random();
		int randomMonth = randomGenerator.nextInt(12) + 1;
		selectElementByIndex(selectMonth, randomMonth);
	}

	public void selectRandomDay() {

		Random randomGenerator = new Random();
		int randomDay = randomGenerator.nextInt(28) + 1;
		selectElementByIndex(selectDay, randomDay);
	}

	public void selectRandomYear() {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
		Date date = new Date();
		int year = Integer.parseInt(formatter.format(date));
		int intYear = year - 30;
		String randomYear = Integer.toString(intYear);
		selectElementByVisibleText(selectYear, randomYear);
	}

	public void enterAddress(String address) {

		setText(enterAddress, address);
	}

	public void enterAddress2(String address2) {

		setText(enterAddress2, address2);
	}

	public void enterCity(String city) {

		setText(enterCity, city);
	}

	public void selectCountry(String country) {

		selectElementByValue(selectCountry, country);
	}

	public void enterZip(String zip) {

		pause(3000);
		setText(enterZip, zip);
		pressTab(enterZip);
		clear(enterZip);
		setText(enterZip, zip);
		pause(4000);
		pressTab(enterZip);
	}

	public void enterPhone(String phone) {

		setText(enterPhone, phone);
	}

	public void enterPhone() {

		String staticPart="786-935-";
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(8000)+1000;
		String phone=staticPart.concat(Integer.toString(randomInt));
		setText(enterPhone, phone);
	}

	public void enterCellPhone(String cPhone) {

		setText(enterCellPhone, cPhone);
	}

	public void enterCellPhone() {

		String staticPart="786-935-";
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(8000)+1000;
		String cPhone=staticPart.concat(Integer.toString(randomInt));
		setText(enterCellPhone, cPhone);
	}
	
	public void clickSaveButton() {

		logging("Clicking on : " + getTextByValue(saveButton));
		saveButton.click();
	}

	public void fillOutMyProfileForm(String fName, String mName, String lName, String address, String city,
			String country, String zip, String phone, String cPhone) {

		enterFirstname(fName);
		enterMiddlename(mName);
		enterLastname(lName);
		selectRandomMonth();
		selectRandomDay();
		selectRandomYear();
		enterAddress(address);
		enterCity(city);
		selectCountry(country);
		enterZip(zip);
		enterPhone(phone);
		enterCellPhone(cPhone);
		clickSaveButton();
	}

	public void fillOutMyProfileForm(String address, String city,String country, String zip) {

		enterFirstname();
		enterMiddlename();
		enterLastname();
		selectRandomMonth();
		selectRandomDay();
		selectRandomYear();
		enterAddress(address);
		enterCity(city);
		selectCountry(country);
		enterZip(zip);
		enterPhone();
		enterCellPhone();
		clickSaveButton();
	}
	
	public void verifyProfileCreationSuccMsg(String msg) {

		wait.until(ExpectedConditions.textToBePresentInElement(profileSuccMsg, msg));
		assertionText(profileSuccMsg, msg);
	}

	public void verifyFirstnameEmptyErrorMsg(String msg) {

		assertionText("Firstname :: ", emptyFirstnameErrorMsg, msg);
	}

	public void verifyFirstnameSpecialErrorMsg(String msg) {

		assertionText("Firstname :: ", specialFirstnameErrorMsg, msg);
	}

	public void verifyFirstnameNumericalErrorMsg(String msg) {

		assertionText("Firstname :: ", numericalFirstnameErrorMsg, msg);
	}

	public void verifyFirstnameSpaceErrorMsg(String msg) {

		assertionText("Firstname :: ", spaceFirstnameErrorMsg, msg);
	}

	public void verifyLastnameEmptyErrorMsg(String msg) {

		assertionText("Lastname :: ", emptyLastnameErrorMsg, msg);
	}

	public void verifyAddressEmptyErrorMsg(String msg) {

		assertionText("Address :: ", emptyAddressErrorMsg, msg);
	}

	public void verifyCityEmptyErrorMsg(String msg) {

		assertionText("City :: ", emptyCityErrorMsg, msg);
	}

	public void verifyCountryEmptyErrorMsg(String msg) {

		assertionText("Country :: ", emptyCountryErrorMsg, msg);
	}

	public void verifyZipEmptyErrorMsg(String msg) {

		assertionText("Zip :: ", emptyZipErrorMsg, msg);
	}
	
	public void verifyPhoneEmptyErrorMsg(String msg) {

		assertionText("Phone :: ", emptyPhoneErrorMsg, msg);
	}
	
	public void verifyPhoneWrongFormatErrorMsg(String msg) {

		assertionText("Phone :: ", worngFormatPhoneErrorMsg, msg);
	}
	
	public void verifyCellPhoneWrongFormatErrorMsg(String msg) {

		assertionText("Phone :: ", worngFormatCellPhoneErrorMsg, msg);
	}
	
	public void clickPaymentMethodsLink(){
		
		click(paymentMethodsLink);
	}
	
	public void clickPaymentMethodsDeleteButton(){
		
		click(paymentMethodsDeleteButton);
	}
	
	public void verifyPaymentMethodsCardDeleteMsg(String msg) {

		assertionText("Message :: ", paymentMethodsCardDeleteMsg, msg);
	}
	
	public void clickeMailPreferencesLink(){
		
		click(mailPreferencesLink);
	}
	
	public void enterRandomNewEmailAndConNewEmail(){
		
		String ranName= RandomStringUtils.randomAlphabetic(10).toLowerCase();
		String emailAdd = ranName+"@automation.com";
		System.out.println(emailAdd);
		setText(enterNewEmail, emailAdd);
		setText(enterNewConEmail, emailAdd);
		
	}
	
	
	
	public void postRequisiteChangeEmailAddress(){
		
		clickMyAccountLink();
		clickeMailPreferencesLink();
		enterRandomNewEmailAndConNewEmail();
		clickEmailPreferencesUpdateButton();
		
	}
	
	
	public void enterNewEmailAndConNewEmail(String email){
		
		setText(enterNewEmail, email);
		setText(enterNewConEmail, email);
		
	}
	
	public void clickEmailPreferencesUpdateButton() {

		logging("Clicking on : " + getTextByValue(emailPreferencesUpdateButton));
		emailPreferencesUpdateButton.click();
	}
	
	public void verifyEmailPreferencesUpdateMsg(String msg) {

		assertionText("Message :: ", emailPreferencesUpdateMsg, msg);
	}
	
	public void clickeChangePasswordLink(){
		
		click(changePasswordLink);
	}
	
	public void enterCurrentPassword(String pass){
		
		setText(enterCurrentPasswordInput, pass);
		
	}
	
	public void enterNewPassword(String pass){
		
		setText(enterNewPasswordInput, pass);
		
	}
	
	public void enterNewPasswordAgain(String pass){
		
		setText(enterNewPasswordAgainInput, pass);
		
	}

	public void clickChangePasswordButton() {

		logging("Clicking on : " + getTextByValue(changePasswordButton));
		changePasswordButton.click();
	}
	
	public void verifyChangePasswordUpdateMsg(String msg) {

		String text =changePasswordMsg1.getText()+" "+ changePasswordMsg2.getText();
		assertionText("Message :: ", text, msg);
	}
	
	public void verifyEmptyChangePasswordErrorMsg(String msg) {

		assertionText("ErrorMessage :: ", emptyChangePasswordErrorMsg, msg);
	}
	
	public void verifyChangePasswordDoNotMatchMsg(String msg) {

		assertionText("ErrorMessage :: ", changePasswordDoNotMatchMsg.getText().trim(), msg);
	}
	
	public void verifyChangePasswordRequiredMsg1(String msg) {

		assertionText("ErrorMessage :: ", changePasswordRequiredMsg1.getText().trim(), msg);
	}
	
	public void verifyChangePasswordRequiredMsg2(String msg) {

		assertionText("ErrorMessage :: ", changePasswordRequiredMsg2.getText().trim(), msg);
	}
	
	public void verifyChangePasswordRequiredMsg3(String msg) {

		assertionText("ErrorMessage :: ", changePasswordRequiredMsg3.getText().trim(), msg);
	}
	
	public void verifyChangePasswordUnrecognizedErrorMsg(String msg) {

		assertionText("ErrorMessage :: ", changePasswordUnrecognizedErrorMsg.getText().trim(), msg);
	}
	
	public void clickAddPhoneNumberLink(){
		
		click(addPhoneNumberLink);
	}
	
	public void clickAddPhoneNumberDeleteButton(){
		
		click(addPhoneNumberDeleteButton);
	}
	
	public void enterPhoneNumber(String phoneNumber){
		
		setText(enterPhoneNumberInput, phoneNumber);
		
	}

	public void clickAddPhoneNumberAddButton() {

		logging("Clicking on : " + getTextByValue(addPhoneNumberAddButton));
		addPhoneNumberAddButton.click();
	}
	
	public void verifyAddPhoneNumberSuccessMsg(String msg) {

		assertionText("SuccessMessage :: ", addPhoneNumberSuccessMsg, msg);
	}
	
	public void verifyDeletePhoneNumberSuccessMsg(String msg) {

		assertionText("SuccessMessage :: ", addPhoneNumberSuccessMsg, msg);
	}
	
	public void verifyAddPhoneNumberErrorMsg(String msg) {

		assertionText("ErrorMessage :: ", addPhoneNumberErrorMsg, msg);
	}

	public void enterRandomPhoneNumber() {

		String staticPart="768-935-";
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(8000)+1000;
		String newPhoneNum=staticPart.concat(Integer.toString(randomInt));
		setText(enterPhoneNumberInput, newPhoneNum);
	}

	public String getMainPhoneNumber(){
		
		return getDriver().findElement(By.xpath(".//*[@id='tbMainPhoneNumber']")).getAttribute("value");
	}
	
	
	
	
	
}
