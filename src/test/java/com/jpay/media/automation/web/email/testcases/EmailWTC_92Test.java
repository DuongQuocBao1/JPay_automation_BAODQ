package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC92 - (User shall be able to create a new account and send letter using Discover Card)
 * Author :: shasan(Shahriar Hasan) , Date :: 07/15/2019
 * DataFile :: Email.xlsx , DataSheet :: WTC92
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_92Test extends BaseTestObject{
	


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
	private String cardType;
	private String emailAddress;
	

	


	/*********************************************************************************
	 * 
	 * Insert STATE name in search box,Insert inmate ID in search box and Click
	 * on next image button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-92::Design Steps"
			+ "::1,2,3,4,5(Insert STATE name in search box,Insert inmate ID in search box "
			+ "and Click on next button)")
	public void testStart() {
		
		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().signup().clickSelectStateDropdown();
		jpayEmail().signup().selectInmateState(state);
		jpayEmail().signup().enterInmateId(inmateId);
		jpayEmail().signup().clickNextButton();
	}

	/*********************************************************************************
	 * 
	 * Verify Selected Inmate name and click on selected inmate
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-92::Design Steps"
			+ "::6,7(Verify Selected Inmate name and click on selected inmate)")
	public void verifyAndSelectInmate() {

		jpayEmail().signup().verifyInmateName(inamteName);
		jpayEmail().signup().selectYourInmate();
	}

	/*********************************************************************************
	 * 
	 * Enter email,confirm email,password,confirm password,accept terms
	 * conditions and click on register button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =3, description = "TestCases::WTC-92::Design Steps::"
			+ "8,9,10,11,12,13,14(Enter email,confirm email,password,confirm password,"
			+ "accept terms and conditions and click on register button and verify "
			+ "title of the page.)")
	public void signUpAndVerifyTitle() {

		jpayEmail().signup().selectRelationship();
		jpayEmail().signup().enterEmailAndConEmail(emailAddress);
		jpayEmail().signup().eneterPassword(password);
		jpayEmail().signup().eneterConPassword(password);
		jpayEmail().signup().acceptAgreeButton();
		jpayEmail().signup().clickRegisterButton();
		jpayEmail().signup().verifyTitle(PageConstant.HOME_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Click on my account link and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-92::Design Steps::"
			+ "15,16(Click on my account link and verify title of the page.)")
	public void ClickMyAccountAndVerifyTitle() {

		jpayEmail().headerNavigation().clickMyAccountLink();
		jpayEmail().myAccount().verifyTitle(PageConstant.JPAY_TRUSTED_INMATE_SERVICES);
	}

	/*********************************************************************************
	 * 
	 * Enter first name,middle name,last name,select month,day and year of
	 * birth, enter address,city,select country and state,enter zipcode,phone
	 * no. and cell phone no. and click on save button and verify successful
	 * save message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-92::Design Steps::"
			+ "17,18,19,20,21,22,23,24,25,26,27,28,29,30,31( Enter first name,middle name,"
			+ "last name,select month,day and year of birth,enter address,city,select "
			+ "country and state,enter zipcode,phone no. and cell phone no. and click on "
			+ "save button and verify successful save message.)")
	public void fillOutProfileFormAndVerify() {

		jpayEmail().myAccount().fillOutMyProfileForm(fName, mName, lName, address, 
				city, country, zip, phone, cPhone);
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

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-92::Design Steps::"
			+ "32,33,34,35,36,37,38,39,40,41,42,43,44,45( Click email link,click on buy "
			+ "stamps,select random buy options,click on continue button,enter card no.,"
			+ "select card type,enter expiration month and year,enter validation code,"
			+ "accept terms-condition,click on buy stamps and verify purchase success "
			+ "message,purchase date and confirmation number.)")
	public void clickEmailBuyStampsAndVerify() {

		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().clickBuyStampsLink();
		jpayEmail().buyStamps().selectRandomMoneyRadioButton();
		jpayEmail().buyStamps().clickContinueButton();
		jpayEmail().buyStamps().switchToIframeById(frameId);
		jpayEmail().buyStamps().enterCreditCardNum(cardNum);
		jpayEmail().buyStamps().selectCardType(cardType);
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

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-92::Design Steps::"
			+ "46,47,48,49,50,51( Click email link,enter email message in the message "
			+ "body,click send button,verify email warning message,click on continue "
			+ "button,verify email confirmation message and number.)")
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

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-92::Design Steps"
			+ "::52,53,54( Click on home link,verify title of the page and click "
			+ "logout button)")
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
		return new Object[] { new EmailWTC_92Test(data) };
	}
	
	
	public EmailWTC_92Test(Map<String, String> data) {
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
		cardType = data.get("cardType");
		frameId = data.get("frameId");
		code = data.get("code");
		buySuccMsg = data.get("buySuccessMsg");
		emailMsg = data.get("emailMsg");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		
		
	}

	


}
