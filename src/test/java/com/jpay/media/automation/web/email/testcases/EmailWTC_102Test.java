package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_102Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String frameId = "";
	private String code = "";
	private String buySuccMsg = "";
	private String variation;
	private String warnMsg;
	private String conMsg;
	private String cardNum;
	private String emailMsg;
	

	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC102 - (User shall be able to buy stamps with valid CC)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC102
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-102:: Design Steps"
			+ "::1,2(Click on login link and verify page title.)")
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-102::Design Steps::"
			+ "3,4,5,6(Enter username,password,click login button and verify title of the page.)")
	public void loginAndVerify1() {

		jpayEmail().login().enterUsername(username);
		jpayEmail().login().enterPassword(password);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}
	
	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-102::Design Steps::"
			+ "7,8(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
	}
	
	

	/*********************************************************************************
	 * 
	 * Click buy stamps link,select random money radio 
	 * button and click on continue button .
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =4, description = "TestCases::WTC-102:: Design "
			+ "Steps::9,10,11(Click buy stamps link,select random money radio "
			+ "button and click on continue button.)")
	public void clickBuyStamps() {

		
		jpayEmail().email().clickBuyStampsLink();
		jpayEmail().buyStamps().selectRandomMoneyRadioButton();
		jpayEmail().buyStamps().clickContinueButton();
	}

	/*********************************************************************************
	 * 
	 * Click on new credit card,enter card number,select card type,select 
	 * expiration date,enter validation code,accept terms and condition,
	 * click on buy stamps button,and verify,purchase success message,
	 * purchase date and confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-102:: Design "
			+ "Steps::12,13,14,15,16,17,18,19,20,21,22,23(Click on new credit card,enter "
			+ "card number,select card type,select expiration date,enter validation code,"
			+ "accept terms and condition,click on buy stamps button,and verify,purchase "
			+ "success message,purchase date and confirmation number.)")
	public void buyStampsAndVerify() {


		jpayEmail().buyStamps().clickUseNewCreditCardRadioButton();
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

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-102::Design Steps::"
			+ "24,25,26,27,28,29,30( Click email link,enter email message in the message body,"
			+ "click send button,verify email warning message,click on continue button,"
			+ "verify email confirmation message and number.)")
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

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-102::DesignSteps::"
			+ "31,32,33( Click on home link,verify title of the page and click logout button)")
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
		return new Object[] { new EmailWTC_102Test(data) };
	}
	
	
	public EmailWTC_102Test(Map<String, String> data) {
		super(data);
		
		username = data.get("username");
		password =data.get("password");
		frameId = data.get("frameId");
		code = data.get("code");
		buySuccMsg = data.get("buySuccMsg");
		variation = data.get("variation");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		emailMsg = data.get("emailMsg");
		cardNum = data.get("cardNum");
		
		
		
	}

	


}
