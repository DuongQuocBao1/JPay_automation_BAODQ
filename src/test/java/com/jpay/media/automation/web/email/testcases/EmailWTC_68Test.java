package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC68 - (User can only create an account with valid informations)
 * Author :: shasan(Shahriar Hasan) , Date :: 07/15/2019
 * DataFile :: Email.xlsx , DataSheet :: WTC68
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_68Test extends BaseTestObject{
	


	private String variation;
	private String state;
	private String inmateId;
	private String inamteName;
	public String password = "";
	private String fName;
	private String mName;
	private String lName;
	private String address;
	private String city;
	private String country;
	private String zip;
	private String phone;
	private String cPhone;
	private String accSuccMsg;
	private String cardNum;
	private String frameId = "";
	private String code = "";
	private String buySuccMsg = "";
	private String emailMsg;
	private String warnMsg;
	private String conMsg;
	
	
	private String emptyRelationshipMsg;
	private String emptyEmailErrorMsg;
	private String emptyPassowdErrorMsg;
	private String emailAddTest1;
	private String emailAddTest2;
	private String termsConditionErrorMsg;
	private String mismatchEmailErrorMsg;
	private String passwordMismatch;
	private String mismatchPasswordErrorMsg;
	private String lengthPassErrorMsg;
	private String upperPassErrorMsg;
	private String lowerPassErrorMsg;
	private String specialPassErrorMsg;
	private String emptyFirstnameErrorMsg;
	private String emptyLastnameErrorMsg;
	private String emptyAddressErrorMsg;
	private String emptyCityErrorMsg;
	private String emptyCountryErrorMsg;
	private String emptyZipErrorMsg;
	private String emptyPhoneErrorMsg;
	private String firstNameError;
	private String specialFirstnameErrorMsg;
	private String numericalFirstnameErrorMsg;
	private String spaceFirstnameErrorMsg;
	private String worngFormatPhoneErrorMsg;
	private String worngFormatPhone;
	private String worngFormatCPhone;
	private String emailAddress;
	

	


	/*********************************************************************************
	 * 
	 * Insert STATE name in search box,Insert inmate ID in search box and Click
	 * on next image button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-68::Design Steps"
			+ "::1,2,3,4(Insert STATE name in search box,Insert inmate ID in search "
			+ "box and Click on next button)")
	public void testStart() {
		
		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().signup().clickSelectStateDropdown();
		jpayEmail().signup().selectInmateState(state);
		jpayEmail().signup().enterInmateId(inmateId);
		jpayEmail().signup().clickNextButton();
	}

	/*********************************************************************************
	 * 
	 * Verify Selected Inmate name,click on selected inmate,click on back button,
	 * verify Selected Inmate name and click on selected inmate.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-68::Design Steps"
			+ "::5,6,7,8(Verify Selected Inmate name,click on selected inmate,click on "
			+ "back button,verify Selected Inmate name and click on selected inmate.)")
	public void verifyAndSelectInmate() {

		jpayEmail().signup().verifyInmateName(inamteName);
		jpayEmail().signup().selectYourInmate();
		jpayEmail().signup().clickRegistrationBackButton();
		jpayEmail().signup().verifyInmateName(inamteName);
		jpayEmail().signup().selectYourInmate();
	}
	

	/*********************************************************************************
	 * 
	 * Click on register button leaving all the required field blank and verify 
	 * Relationship,email,confirm email,password and uncheck terms-condition field required message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-68::Design Steps"
			+ "::9,10,11,12,13,14(Click on register button leaving all the required "
			+ "field blank and verify Relationship,email,confirm email,password and "
			+ "uncheck terms-condition field required message.)")
	public void clickRegisterLeavingAllEmptyAndVerify() {

		jpayEmail().signup().clickRegisterButton();
		jpayEmail().signup().verifyEmptyRelationShipErrorMsg(emptyRelationshipMsg);//
		jpayEmail().signup().verifyEmptyEmailErrorMsg(emptyEmailErrorMsg);//
		jpayEmail().signup().verifyEmptyConEmailErrorMsg(emptyEmailErrorMsg);
		jpayEmail().signup().verifyEmptyPasswordErrorMsg(emptyPassowdErrorMsg);//
		jpayEmail().signup().verifyTermsConditionErrorMsg(termsConditionErrorMsg);//
		
	}

	
	/*********************************************************************************
	 * 
	 * Select a random relationship,Enter email and different confirm email,click on register button and 
	 * mismatch email,password and uncheck terms-condition field required message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =4, description = "TestCases::WTC-68::Design Steps::"
			+ "15,16,17,18,19,20,21(Select a random relationship,Enter email and different "
			+ "confirm email,click on register button and mismatch email,password and "
			+ "uncheck terms-condition field required message.)")
	public void registerWithMismatchEmailAndVerify() {

		jpayEmail().signup().selectRelationship();
		jpayEmail().signup().enterEmail(emailAddTest1);
		jpayEmail().signup().enterConEmail(emailAddTest2);
		jpayEmail().signup().clickRegisterButton();
		jpayEmail().signup().verifyMismatchEmailErrorMsg(mismatchEmailErrorMsg);// 
		jpayEmail().signup().verifyEmptyPasswordErrorMsg(emptyPassowdErrorMsg);//
		jpayEmail().signup().verifyTermsConditionErrorMsg(termsConditionErrorMsg);//
	
	}
	

	/*********************************************************************************
	 * 
	 * Enter email and confirm email address,different password in password and 
	 * confirm password,click on register button and verify mismatch password 
	 * and uncheck terms-condition field required message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =5, description = "TestCases::WTC-68::Design Steps::"
			+ "22,23,24,25,26,27,28,(Enter email and confirm email address,different "
			+ "password in password and confirm password,click on register button "
			+ "and verify mismatch password and uncheck terms-condition field "
			+ "required message.)")
	public void registerWithMismatchPasswordAndVerify() {

		jpayEmail().signup().enterEmailAndConEmail(emailAddress);
		jpayEmail().signup().eneterPassword(password);
		jpayEmail().signup().eneterConPassword(passwordMismatch);//
		jpayEmail().signup().clickRegisterButton();
		jpayEmail().signup().verifyMismatchPasswordErrorMsg(mismatchPasswordErrorMsg);//
		jpayEmail().signup().verifyTermsConditionErrorMsg(termsConditionErrorMsg);//
		
	}
	

	
	/*********************************************************************************
	 * 
	 * Enter same short password in password and confirm password,click on 
	 * register button and verify different password and uncheck 
	 * terms-condition field required message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =6, description = "TestCases::WTC-68::Design Steps::"
			+ "29,30,31,32,33,34,35,36(Enter same short password in password and confirm "
			+ "password,click on register button and verify different password and "
			+ "uncheck terms-condition field required message.)")
	public void registerWithImproperPasswordAndVerify() {

		jpayEmail().signup().eneterPassword(passwordMismatch);
		jpayEmail().signup().eneterConPassword(passwordMismatch);//123
		jpayEmail().signup().clickRegisterButton();
		jpayEmail().signup().verifyPasswordLengthErrorMsg(lengthPassErrorMsg);//  
		jpayEmail().signup().verifyPasswordUppercaseErrorMsg(upperPassErrorMsg);//
		jpayEmail().signup().verifyPasswordLowercaseErrorMsg(lowerPassErrorMsg);//
		jpayEmail().signup().verifyPasswordSpecialCharErrorMsg(specialPassErrorMsg);//
		jpayEmail().signup().verifyTermsConditionErrorMsg(termsConditionErrorMsg);//
	
	}
	
	/*********************************************************************************
	 * 
	 * Enter email,confirm email,password,confirm password,accept terms
	 * conditions and click on register button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =7, description = "TestCases::WTC-68::Design Steps::"
			+ "37,38,39,40,41(Enter password and confirm password,accept terms and conditions "
			+ "and click on register button and verify title of the page.)")
	public void signUpAndVerifyTitle() {

		jpayEmail().signup().eneterPassword(password);
		jpayEmail().signup().eneterConPassword(password);
		jpayEmail().signup().acceptAgreeButton();
		jpayEmail().signup().clickRegisterButton();
		jpayEmail().signup().verifyTitle(PageConstant.HOME_TITLE);
	}

	
	/*********************************************************************************
	 * 
	 * Click on my account link,click on save button and verify firstname,
	 * lastname,address,city,country,zip and phone empty error message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-68::Design Steps::"
			+ "42,43,44,45,46,47,48,49,50(Click on my account link,click on save button "
			+ "and verify firstname,lastname,address,city,country,zip and phone empty "
			+ "error message.)")
	public void saveAccountLeavingAllEmptyAndVerify() {

		jpayEmail().headerNavigation().clickMyAccountLink();
		jpayEmail().myAccount().clickSaveButton();
		jpayEmail().myAccount().verifyFirstnameEmptyErrorMsg(emptyFirstnameErrorMsg);//
		jpayEmail().myAccount().verifyLastnameEmptyErrorMsg(emptyLastnameErrorMsg);//
		jpayEmail().myAccount().verifyAddressEmptyErrorMsg(emptyAddressErrorMsg);////
		jpayEmail().myAccount().verifyCityEmptyErrorMsg(emptyCityErrorMsg);////
		//jpayEmail().myAccount().verifyCountryEmptyErrorMsg(emptyCountryErrorMsg);//
		jpayEmail().myAccount().verifyZipEmptyErrorMsg(emptyZipErrorMsg);//
		jpayEmail().myAccount().verifyPhoneEmptyErrorMsg(emptyPhoneErrorMsg);//
		
	}

	/*********************************************************************************
	 * 
	 * Enter wrong format firstname,click on save button and verify 
	 * different worng format firstname, lastname,address,city,
	 * country,zip and phone empty error message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-68::Design Steps::"
			+ "51,52,53,54,55,56,57,58,59,60,61(Enter wrong format firstname,click on "
			+ "save button and verify different worng format firstname,lastname,address,"
			+ "city,country,zip and phone empty error message.)")
	public void enterWorngFormatFirstnameAndVerify() {

		jpayEmail().myAccount().enterFirstname(firstNameError);//
		jpayEmail().myAccount().clickSaveButton();
		jpayEmail().myAccount().verifyFirstnameSpecialErrorMsg(specialFirstnameErrorMsg);//
		jpayEmail().myAccount().verifyFirstnameNumericalErrorMsg(numericalFirstnameErrorMsg);//
		jpayEmail().myAccount().verifyFirstnameSpaceErrorMsg(spaceFirstnameErrorMsg);//
		jpayEmail().myAccount().verifyLastnameEmptyErrorMsg(emptyLastnameErrorMsg);//
		jpayEmail().myAccount().verifyAddressEmptyErrorMsg(emptyAddressErrorMsg);
		jpayEmail().myAccount().verifyCityEmptyErrorMsg(emptyCityErrorMsg);
		//jpayEmail().myAccount().verifyCountryEmptyErrorMsg(emptyCountryErrorMsg);
		jpayEmail().myAccount().verifyZipEmptyErrorMsg(emptyZipErrorMsg);
		jpayEmail().myAccount().verifyPhoneEmptyErrorMsg(emptyPhoneErrorMsg);
		
	}


	/*********************************************************************************
	 * 
	 * Enter first name,middle name,last name,select month,day and year of
	 * birth, enter address,city,select country and state,enter zipcode,phone
	 * no. and cell phone no. and click on save button and verify successful
	 * save message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-68::Design Steps"
			+ "::62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77( Enter first name,middle "
			+ "name,last name,select month,day and year of birth,enter address,city,select country and "
			+ "state,enter zipcode,phone no. and cell phone no. and click on save "
			+ "button and verify phone and cell phone worng format error message.)")
	public void fillOutProfileForm1AndVerify() {

		jpayEmail().myAccount().fillOutMyProfileForm(fName, mName, lName, address, 
				city, country, zip, worngFormatPhone, worngFormatCPhone);
		jpayEmail().myAccount().verifyPhoneWrongFormatErrorMsg(worngFormatPhoneErrorMsg);//
		jpayEmail().myAccount().verifyCellPhoneWrongFormatErrorMsg(worngFormatPhoneErrorMsg);
	
	}
	

	/*********************************************************************************
	 * 
	 * Enter phone no. and cell phone no. and click on save button and verify successful save message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-68::Design Steps::"
			+ "78,79,80,81(Enter phone no. and cell phone no. and click on save button and "
			+ "verify successful save message.)")
	public void fillOutProfileForm2AndVerify() {

		jpayEmail().myAccount().enterPhone(phone);
		jpayEmail().myAccount().enterCellPhone(cPhone);
		jpayEmail().myAccount().clickSaveButton();
		jpayEmail().myAccount().verifyProfileCreationSuccMsg(accSuccMsg);
	}


	/*********************************************************************************
	 * 
	 * Click email link,click on buy stamps,select random buy options,click on
	 * continue button,enter card no.,select card type,enter expiration month
	 * and year,enter validation code,accept terms-condition,click on buy stamps
	 * and verify purchase success message,purchase date and confirmation
	 * number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-68::Design Steps::"
			+ "82,83,84,85,86,87,88,89,90,91,9293,94,95,96,97,98,99( Click email "
			+ "link,click on buy stamps,select random buy options,click on continue button,"
			+ "enter card no.,select card type,enter expiration month and year,enter "
			+ "validation code,accept terms-condition,click on buy stamps and verify "
			+ "purchase success message,purchase date and confirmation number.)")
	public void clickEmailBuyStampsAndVerify() {

		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().clickBuyStampsLink();
		jpayEmail().buyStamps().selectRandomMoneyRadioButton();
		jpayEmail().buyStamps().clickContinueButton();
		jpayEmail().buyStamps().switchToIframeById(frameId);
		jpayEmail().buyStamps().enterCreditCardNum(cardNum);
		jpayEmail().buyStamps().selectRandomCardType();
		jpayEmail().buyStamps().selectRandomMonth();
		jpayEmail().buyStamps().selectRandomExpiryYear();
		jpayEmail().buyStamps().enterCreditValCodeForNewCard(code);
		jpayEmail().buyStamps().checkAcceptedTerms();
		jpayEmail().buyStamps().switchToParentWindow();
		jpayEmail().buyStamps().clickBuyStampsButton();
		jpayEmail().buyStamps().verifyBuyStampsSuccessMessage(buySuccMsg);
		jpayEmail().buyStamps().verifyPurchaseDate();
		jpayEmail().buyStamps().VerifyConfirmationNumberVisible();
	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send button,
	 * verify email warning message,click on continue button,verify 
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-68::Design Steps::"
			+ "100,101,102,103,104,105,106,107( Click email link,enter email message in "
			+ "the message body,click send button,verify email warning message,click on "
			+ "continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
	}

	/*********************************************************************************
	 * 
	 * Click on home link,verify title of the page and click logout button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-68::Design Steps::"
			+ "108,109,110( Click on home link,verify title of the page and click logout button)")
	public void testEnd() {

		jpayEmail().myAccount().postRequisiteChangeEmailAddress();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().signup().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_68Test(data) };
	}
	
	
	public EmailWTC_68Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		state = data.get("state");
		inmateId = data.get("inmateId");
		inamteName = data.get("inamteName");
		emailAddress = data.get("emailAddress");
		password = data.get("password");
		fName = data.get("firstName");
		mName = data.get("middleName");
		lName = data.get("lastName");
		address = data.get("address");
		city = data.get("city");
		country = data.get("country");
		zip = data.get("zip");
		phone = data.get("phone");
		cPhone = data.get("cellPhone");
		accSuccMsg = data.get("accountSuccessMsg");
		cardNum = data.get("cardNum");
		frameId = data.get("frameId");
		code = data.get("code");
		buySuccMsg = data.get("buySuccessMsg");
		emailMsg = data.get("emailMsg");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		
		
		emptyRelationshipMsg = data.get("emptyRelationshipMsg");
		emptyEmailErrorMsg = data.get("emptyEmailErrorMsg");
		emptyPassowdErrorMsg = data.get("emptyPassowdErrorMsg");
		emailAddTest1 = data.get("emailAddTest1");
		emailAddTest2 = data.get("emailAddTest2");
		termsConditionErrorMsg = data.get("termsConditionErrorMsg");
		mismatchEmailErrorMsg = data.get("mismatchEmailErrorMsg");
		passwordMismatch = data.get("passwordMismatch");
		mismatchPasswordErrorMsg = data.get("mismatchPasswordErrorMsg");
		lengthPassErrorMsg = data.get("lengthPassErrorMsg");
		upperPassErrorMsg = data.get("upperPassErrorMsg");
		lowerPassErrorMsg = data.get("lowerPassErrorMsg");
		specialPassErrorMsg = data.get("specialPassErrorMsg");
		emptyFirstnameErrorMsg = data.get("emptyFirstnameErrorMsg");
		emptyLastnameErrorMsg = data.get("emptyLastnameErrorMsg");
		emptyAddressErrorMsg = data.get("emptyAddressErrorMsg");
		emptyCityErrorMsg = data.get("emptyCityErrorMsg");
		emptyCountryErrorMsg = data.get("emptyCountryErrorMsg");
		emptyZipErrorMsg = data.get("emptyZipErrorMsg");
		emptyPhoneErrorMsg = data.get("emptyPhoneErrorMsg");
		firstNameError = data.get("firstNameError");
		specialFirstnameErrorMsg = data.get("specialFirstnameErrorMsg");
		numericalFirstnameErrorMsg = data.get("numericalFirstnameErrorMsg");
		spaceFirstnameErrorMsg = data.get("spaceFirstnameErrorMsg");
		worngFormatPhoneErrorMsg = data.get("worngFormatPhoneErrorMsg");
		worngFormatPhone = data.get("worngFormatPhone");
		worngFormatCPhone = data.get("worngFormatCPhone");
		
		
	}

	


}
