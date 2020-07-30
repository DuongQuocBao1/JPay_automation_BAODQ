package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC183 - (User shall be able to update, buy stamps and send email using existing ww account)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: WTC183
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_183Test extends BaseTestObject{
	


	private String variation;
	public String password = "";
	private String username;
	private String address;
	private String city;
	private String country;
	private String zip;
	private String accSuccMsg;
	private String emailMsg;
	private String warnMsg;
	private String conMsg;
	private String frameId;
	private String cardNum;
	private String code;
	private String buySuccMsg;
	
	

	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-183::DesignSteps::"
			+ "1,2(Click on login link and verify page title.)")
	public void testStart() {
		
		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-183::DesignSteps::"
			+ "3,4,5,6,7(Enter username,password,click login button and verify title of "
			+ "the page and select random inmate.)")
	public void loginAndVerify() {

		jpayEmail().login().enterUsername(username);
		jpayEmail().login().enterPassword(password);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().selectRandomInmate();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on my account link and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-183::Design Steps::"
			+ "8,9(Click on my account link and verify title of the page.)")
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

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-183::Design Steps::"
			+ "10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25( Enter first name,middle "
			+ "name,last name,select month,day and year of birth,enter address,city,"
			+ "select country and state,enter zipcode,phone no. and cell phone no. and "
			+ "click on save button and verify successful save message.)")
	public void fillOutProfileFormAndVerify() {

		jpayEmail().myAccount().fillOutMyProfileForm(address, city, country, zip);
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

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-183::Design Steps::"
			+ "26,27,28,29,30,31,32,33,34,35,36,37,38,39( Click email link,click on buy "
			+ "stamps,select random buy options,click on continue button,enter card no.,"
			+ "select card type,enter expiration month and year,enter validation code,"
			+ "accept terms-condition,click on buy stamps and verify purchase success "
			+ "message,purchase date and confirmation number.)")
	public void clickEmailBuyStampsAndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
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

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-183::Design Steps::"
			+ "40,41,42,43,44,45,46( Click email link,enter email message in the message "
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

	@Test(enabled = true, priority =7, description = "TestCases::WTC-183::Design Steps::"
			+ "47,48,49( Click on home link,verify title of the page and click logout button)")
	public void testEnd() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().signup().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_183Test(data) };
	}
	
	
	public EmailWTC_183Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		username = data.get("username");
		password = data.get("password");
		address = data.get("address");
		city = data.get("city");
		country = data.get("country");
		zip = data.get("zip");
		accSuccMsg = data.get("accountSuccessMsg");
		cardNum = data.get("cardNum");
		frameId = data.get("frameId");
		code = data.get("code");
		buySuccMsg = data.get("buySuccessMsg");
		emailMsg = data.get("emailMsg");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		
		
	}

	


}
