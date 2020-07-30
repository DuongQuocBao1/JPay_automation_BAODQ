package com.jpay.media.automation.web.email.pagesobjects;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.jpay.media.automation.web.baseobjects.BasePageObject;

public class SignupPage extends BasePageObject {

	/************************************************************************************************
	 ******************************************* CONSTRUCTOR*****************************************
	 ************************************************************************************************/

	public SignupPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/********************************************** CONSTRUCTOR****************************************
	 **************************************************************************************************
	 **************************************************************************************************/

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	// State Dropdown
	@FindBy(xpath = "//*[@id='StatesDropdown_txtautofromDB']")
	private WebElement selectStateDropDown;

	// Enter InmateId
	@FindBy(xpath = "//*[@id='inmateIDTextBox']")
	private WebElement inmateId;

	// Next Button
	@FindBy(xpath = "//*[@id='nextImageButton']")
	private WebElement buttonNext;
	
	// LogIn Button
	@FindBy(xpath = "//*[@id='newHeader_TopRightNavButton_lnkLogin']/div")
	private WebElement buttonLogin;
	
	// Select Inmate
	@FindBy(xpath = "//*[@id='uclInmateResultPanel_dgResults_ctl03_lnkInmateName']")
	private WebElement selectInmate;
	
	// Registration Back Button
	@FindBy(xpath = "//*[@id='uclFirstTimeUserDetails_lnkChangeInmate']")
	private WebElement registrationBackButton;
	
	// Select Inmate Relationship
	@FindBy(xpath = "//select[@id='uclFirstTimeUserDetails_ddlRelation']")
	private WebElement selectRelationship;
	
	// Enter Email
	@FindBy(xpath = "//*[@id='uclFirstTimeUserDetails_txtdEmail']")
	private WebElement enterEmail;
		
	// Enter Confirm Email
	@FindBy(xpath = "//*[@id='uclFirstTimeUserDetails_txtdConfirmEmail']")
	private WebElement enterConEmail;
	
	// Enter Password
	@FindBy(xpath = "//*[@id='uclFirstTimeUserDetails_txtdPassword']")
	private WebElement enterPass;
			
	// Enter Confirm Password
	@FindBy(xpath = "//*[@id='uclFirstTimeUserDetails_txtdConfirmPassword']")
	private WebElement enterConPass;
	
	// I Agree Button
	@FindBy(xpath = ".//*[@id='uclFirstTimeUserDetails_uclLegalAgreementPresentation_chkTerms']")
	private WebElement iAgreeButton;
	
	// Register Button
	@FindBy(xpath = ".//*[@id='uclFirstTimeUserDetails_btnCreateUser']")
	private WebElement registerButton;
	
	// Empty Relation error message
	@FindBy(xpath = ".//*[@id='uclFirstTimeUserDetails_ddlRelationValidation']")
	private WebElement emptyRelationshipErrorMsg;
	
	// Empty Email error message
	@FindBy(xpath = "//*[@id='uclFirstTimeUserDetails_rfvEmail']")
	private WebElement emptyEmailErrorMsg;
	
	// Mismatch Email error message
	@FindBy(xpath = "//*[@id='uclFirstTimeUserDetails_cvConfirmEmail']")
	private WebElement mismatchEmailErrorMsg;
	
	// Empty Confirm email error message
	@FindBy(xpath = "//*[@id='uclFirstTimeUserDetails_RequiredFieldValidator1']")
	private WebElement emptyConEmailErrorMsg;
	
	// Empty Password error message
	@FindBy(xpath = "//*[@id='uclFirstTimeUserDetails_JPayPasswordValidator_requiredFieldCheck']")
	private WebElement emptyPasswordErrorMsg;
	
	// EUncheck Terms and Condition error message
	@FindBy(xpath = "//*[@id='uclFirstTimeUserDetails_uclLegalAgreementPresentation_ToSValidator']")
	private WebElement uncheckTermsConditionErrorMsg;
	
	// Mismatch Password error message
	@FindBy(xpath = "//*[@id='uclFirstTimeUserDetails_cvConfirmPassword']")
	private WebElement mismatchPasswordErrorMsg;
	
	// Length Password error message
	@FindBy(xpath = "//*[@id='uclFirstTimeUserDetails_JPayPasswordValidator_stringLengthCheck']")
	private WebElement lengthPasswordErrorMsg;
	
	// Uppercase Password error message
	@FindBy(xpath = "//*[@id='uclFirstTimeUserDetails_JPayPasswordValidator_upperCaseCheck']")
	private WebElement uppercasePasswordErrorMsg;
	
	// Lowercase Password error message
	@FindBy(xpath = "//*[@id='uclFirstTimeUserDetails_JPayPasswordValidator_lowerCaseCheck']")
	private WebElement lowercasePasswordErrorMsg;
	
	// Special character Password error message
	@FindBy(xpath = "//*[@id='uclFirstTimeUserDetails_JPayPasswordValidator_specialCharactersCheck']")
	private WebElement specialCharPasswordErrorMsg;
	
	// Invalid Inmate Search Alert Text
	@FindBy(xpath = "//div[@role='alert'][1]/div[1]")
	private WebElement invalidInmateSearchAlertText;
	
	// Invalid Inmate Search No Result Text
	@FindBy(xpath = "(.//*[@id='content']//h1)[1]")
	private WebElement invalidInmateSearchNoResultText;
	
	// No Result Page State select
	@FindBy(xpath = ".//*[@id='uclInmateResultPanel_uclSearchAgain_StatesDropdownB_txtautofromDB']")
	private WebElement selectStateNoResultPage;
	
	// No Result Page Inmate id
	@FindBy(xpath = ".//*[@id='uclInmateResultPanel_uclSearchAgain_tbSearchTextAgain_ResultsPanel']")
	private WebElement inmateIdNoResultPage;
	
	// No Result Page Search again button
	@FindBy(xpath = ".//*[@id='uclInmateResultPanel_uclSearchAgain_btnSearchAgain_ResultsPanel']")
	private WebElement searchAgainNoResultPage;
	
	// Inmate Search Link
	@FindBy(xpath = ".//*[@id='newHeader_inmateSearchHyperLink']")
	private WebElement inmateSearchLink;
	
	// Inmate Search Page State select
	@FindBy(xpath = ".//*[@id='uclLoginFirstTime_uclLookupInmate_StatesDropdownC_txtautofromDB']")
	private WebElement selectStateInmateSearchPage;
	
	// Inmate Search Page Inmate id
	@FindBy(xpath = ".//*[@id='uclLoginFirstTime_uclLookupInmate_tbSearchTextCombined']")
	private WebElement inmateIdInmateSearchPage;
	
	// Inmate Search Page Find button
	@FindBy(xpath = ".//*[@id='uclLoginFirstTime_uclLookupInmate_btnSearchCombined']")
	private WebElement findInmateSearchPage;
	

	/*************************************************************************************************
	 *********** ELEMENT***********************ELEMENT********************ELEMENT*********************
	 *************************************************************************************************/

	/************************************************************************************************
	 *********** METHOD***********************METHOD********************METHOD***********************
	 ************************************************************************************************/

	
	
	public void clickSelectStateDropdown() {
		
		selectStateDropDown.click();
		logging("Clicking on : Select State...");
		
	}

	public void selectInmateState(String state) {
		
		pause(1000);
		setText(selectStateDropDown, state);
		pause(1000);
		//selectStateDropDown.click();
		String xpath="//ul/li/a[contains(text(),'"+state+"')]";
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.xpath(xpath))));
		click(element);
		
		
	}

	public void enterInmateId(String id) {

		setText(inmateId, id);
	}

	public void enterInmateIdByRobot(String id) {

		robot.typeEx(id);
		logging("Entering Value : "+id);
	}

	public void clickNextButton() {

		click(buttonNext);
	}
	
	public void clickSelectStateNoResultPage() {
		
		selectStateNoResultPage.click();
		logging("Clicking on : Select State...");
		
	}

	public void selectInmateStateNoResultPage(String state) {
		
		pause(1000);
		setText(selectStateNoResultPage, state);
		pause(1000);
		selectStateNoResultPage.click();
		String xpath="//ul/li/a[contains(text(),'"+state+"')]";
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.xpath(xpath))));
		click(element);
		
		
	}

	public void enterInmateIdNoResultPage(String id) {

		setText(inmateIdNoResultPage, id);
	}

	public void clickSearchAgainNoResultPage() {

		click(searchAgainNoResultPage);
	}

	public void clickInmateSearchLink() {

		click(inmateSearchLink);
	}
	
	public void clickSelectStateInmateSearchPage() {
		
		selectStateInmateSearchPage.click();
		logging("Clicking on : Select State...");
		
	}

	public void selectInmateStateInmateSearchPage(String state) {
		
		pause(1000);
		setText(selectStateInmateSearchPage, state);
		pause(1000);
		selectStateInmateSearchPage.click();
		String xpath="//ul/li/a[contains(text(),'"+state+"')]";
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.xpath(xpath))));
		click(element);
		
		
	}

	public void enterInmateIdInmateSearchPage(String id) {

		setText(inmateIdInmateSearchPage, id);
	}

	public void clickFindInmateSearchPage() {

		click(findInmateSearchPage);
	}
	
	public void verifyInvalidInmateSearchAlertText(String text){
		
		assertionText("AlertText :: ",invalidInmateSearchAlertText, text);
	}
	
	public void verifyInvalidInmateSearchAlertPresent(){
		
		logging("Alert Text is Present : "+isElementDisplayed(invalidInmateSearchAlertText));
		assertTrue(isElementDisplayed(invalidInmateSearchAlertText));
	}
	
	public void verifyInvalidInmateSearchNoResultText(String text){
		
		assertionText("AlertText :: ",invalidInmateSearchNoResultText, text);
	}
	
	public void clickLoginButton() {

		click(buttonLogin);
	}
	
	public void selectYourInmate() {

		click(selectInmate);
	}
	
	public void clickRegistrationBackButton() {

		click(registrationBackButton);
	}
	
	public void selectRelationship() {
		
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(12) + 1;
		try {
			if (selectRelationship.isDisplayed()) {
				selectElementByIndex(selectRelationship, randomInt);
			} 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void enterRandomEmailAndConEmail(){
		
		String ranName= RandomStringUtils.randomAlphabetic(10).toLowerCase();
		String emailAdd = ranName+"@automation.com";
		System.out.println(emailAdd);
		setText(enterEmail, emailAdd);
		setText(enterConEmail, emailAdd);
		
	}
	
	
	public void enterEmailAndConEmail(String emailAdd){
		
		setText(enterEmail, emailAdd);
		setText(enterConEmail, emailAdd);
		
	}
	
	public void enterEmail(String emailAdd){
		
		setText(enterEmail, emailAdd);
		
	}
	
	public void enterConEmail(String emailAdd){
		
		setText(enterConEmail, emailAdd);
		
	}
	
	public void eneterPassword(String pass){
		
		setText(enterPass, pass);
	}
	
	public void eneterConPassword(String conPass){
		
		setText(enterConPass, conPass);
	}
	
	public void acceptAgreeButton(){
		
		pressSpace(iAgreeButton);
		loggingWithLabel("Checking on : Accept Terms and Conditions");
	}
	
	public void clickRegisterButton() {

	     registerButton.click();
	     loggingWithLabel("Clicking on : Register");
	}
	
	public void verifyInmateName(String name){
		
		wait.until(ExpectedConditions.elementToBeClickable(selectInmate));
		assertionText(selectInmate, name);
	}
	
	public void verifyEmptyRelationShipErrorMsg(String msg){
		
		wait.until(ExpectedConditions.elementToBeClickable(emptyRelationshipErrorMsg));
		assertionText("Unselected Relationship :: ",emptyRelationshipErrorMsg, msg);
	}
	
	
	public void verifyEmptyEmailErrorMsg(String msg){
		
		assertionText("Empty Email :: ",emptyEmailErrorMsg, msg);
	}
	
	
	public void verifyEmptyConEmailErrorMsg(String msg){
		
		assertionText("Empty Confirm Email :: ",emptyConEmailErrorMsg, msg);
	}
	
	public void verifyMismatchEmailErrorMsg(String msg){
		
		assertionText("Mismatch Email :: ",mismatchEmailErrorMsg, msg);
	}
	
	public void verifyEmptyPasswordErrorMsg(String msg){
		
		assertionText("Empty Password :: ",emptyPasswordErrorMsg.getText().trim(), msg);
	}
	
	public void verifyMismatchPasswordErrorMsg(String msg){
		
		assertionText("Mismatch Password :: ",mismatchPasswordErrorMsg.getText().trim(), msg);
	}
	
	public void verifyPasswordLengthErrorMsg(String msg){
		
		assertionText("Password Length :: ",lengthPasswordErrorMsg.getText().trim(), msg);
	}
	
	public void verifyPasswordUppercaseErrorMsg(String msg){
		
		assertionText("Password Uppercase :: ",uppercasePasswordErrorMsg.getText().trim(), msg);
	}
	
	public void verifyPasswordLowercaseErrorMsg(String msg){
		
		assertionText("Password Lowercase :: ",lowercasePasswordErrorMsg.getText().trim(), msg);
	}
	
	public void verifyPasswordSpecialCharErrorMsg(String msg){
		
		assertionText("Password SpecialChar :: ",specialCharPasswordErrorMsg.getText().trim(), msg);
	}
	
	public void verifyTermsConditionErrorMsg(String msg){
		
		assertionText("Terms and Condition :: ",uncheckTermsConditionErrorMsg.getText().trim(), msg);
	}
	
   

}
