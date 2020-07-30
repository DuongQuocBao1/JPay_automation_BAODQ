package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_02To13Test extends BaseTestObject {

	public String username = "";
	public String password = "";
	private String frameId = "";
	private String code = "";
	private String buySuccMsg = "";
	private String variation;
	private String emailMsgPlain1;
	private String warnMsg;
	private String conMsg;
	private String emailMsgPlain2;
	private String emailMsgFlag;
	private String emailMsgSQL;
	private String emailMsgHTML;
	private String emailMsgLong;
	private String emailMsgEmoji;
	private String emailMsgSpecial;
	private String emailMsgSpanish;
	private String emailMsgArabic;
	private String emailMsgPrepaid;
	private String emailMsgPrepaidLong;

	/************************************************************************************************
	 * 
	 * TestCase :: WTC02 - (User shall be able to buy stamps with valid CC)
	 * WTC03 - (User shall be able to send clean letter) WTC04 - (Letter shall
	 * be flag facility) WTC05 - (User shall be able to send SQL injections)
	 * WTC06 - (User shall be able to send HTML/XML injections) WTC07 - (User
	 * shall be able to send long letter) WTC08 - (User shall be able to send
	 * emoji) WTC09 - (User shall be able to send special characters) WTC10 -
	 * (User shall be able to send spanish text) WTC11 - (User shall be able to
	 * send Arabic text) WTC12 - (User shall be able to send prepaid letter)
	 * WTC13 - (User shall be able to send long prepaid letter) Author ::
	 * shasan(Shahriar Hasan) , Date :: DataFile :: Email.xlsx , DataSheet ::
	 * WTC02To13 Status :: Completed
	 * 
	 **************************************************************************************************/

	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-01,02,03,04,05,06,"
			+ "07,08,09,10,11,12,13 :: Design Steps::1,2(Click on login link and " + "verify page title.)")
	public void testStart() {

		jpayEmail().login().loadURL(envUrlJpay, variation);
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-01,02,03,04,05,06,"
			+ "07,08,09,10,11,12,13 :: Design Steps::3,4,5,6(Enter username,password,"
			+ "click login button and verify title of the page.)")
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-02,03,04,05,06,"
			+ "07,08,09,10,11,12,13 :: Design Steps::7,8(Select random inmate and " + "click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		//jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
	}

	/*********************************************************************************
	 * 
	 * Click buy stamps link,select random money radio button and click on
	 * continue button .
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-02 :: Design "
			+ "Steps::9,10,11(Click buy stamps link,select random money radio "
			+ "button and click on continue button.)")
	public void clickBuyStamps() {

		jpayEmail().email().clickBuyStampsLink();
		jpayEmail().buyStamps().selectRandomMoneyRadioButton();
		jpayEmail().buyStamps().clickContinueButton();
	}

	/*********************************************************************************
	 * 
	 * Select random credit card from existing card list,enter validation code,
	 * accept terms and condition,click on buy stamps button,and verify purchase
	 * success message,purchase date and confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-02 :: Design "
			+ "Steps::12,13,14,15,16,17,18,19(Select random credit card from existing "
			+ "card list,enter validation code,accept terms and condition,click on "
			+ "buy stamps button,and verify purchase success message,purchase " + "date and confirmation number.)")
	public void buyStampsAndVerify() {

		jpayEmail().buyStamps().switchToIframeById(frameId);
		//jpayEmail().buyStamps().selectRandomCreditCardFromList();
		jpayEmail().buyStamps().enterCreditValCodeForExistingCard(code);
		jpayEmail().buyStamps().checkAcceptedTerms();
		jpayEmail().buyStamps().switchToParentWindow();
		jpayEmail().buyStamps().clickBuyStampsButton();
		jpayEmail().buyStamps().verifyBuyStampsSuccessMessage(buySuccMsg);
		jpayEmail().buyStamps().verifyPurchaseDate();
		jpayEmail().buyStamps().VerifyConfirmationNumberVisible();
	}

	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "Click on email link.)")
	public void clickEmailLink1() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send
	 * button, verify email warning message,click on continue button,verify
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-03 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21,22,23(Enter email message"
			+ "(Plain letter) in the message body,click send button,verify email "
			+ "warning message,check the used stamps,click on continue button,verify "
			+ "email confirmation message and number,Click email link,enter email "
			+ "message(Plain letter) in the message body,click send button,verify email warning "
			+ "message,check the used stamps,click on continue button,verify "
			+ "email confirmation message and number..)")
	public void sendEmailForTC03AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgPlain1);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgPlain2);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
	}

	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "Click on email link.)")
	public void clickEmailLink2() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send
	 * button, verify email warning message,click on continue button,verify
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-04 :: Design "
			+ "Steps::9,10,11,12(Enter email message(Flag letter)in the message body,"
			+ "click send button,verify email warning message,check the used stamps)")
	public void writeEmailForTC04AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgFlag);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);

	}

	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-04 :: DesignSteps::"
			+ "13,14,15(click on continue button,verify email confirmation message and number.)")
	public void sendEmailForTC04AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();

	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send
	 * button, verify email warning message,click on continue button,verify
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-05 :: Design "
			+ "Steps::9,10,11,12(Enter email message(SQL injection) in the message body,"
			+ "click send button,verify email warning message,check the used stamps,"
			+ "click on continue button,verify email confirmation message and number.)")
	public void writeEmailForTC05AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgSQL);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);

	}

	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-05:: DesignSteps::"
			+ "13,14,15(click on continue button,verify email confirmation message and number.)")
	public void sendEmailForTC05AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();

	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send
	 * button, verify email warning message,click on continue button,verify
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-06 :: Design "
			+ "Steps::9,10,11,12(Enter email message(HTML content) in the message body,"
			+ "click send button,verify email warning message,check the used stamps,"
			+ "click on continue button,verify email confirmation message and number.)")
	public void writeEmailForTC06AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgHTML);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);

	}

	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-06:: DesignSteps::"
			+ "13,14,15(click on continue button,verify email confirmation message and number.)")
	public void sendEmailForTC06AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();

	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send
	 * button, verify email warning message,click on continue button,verify
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-07 :: Design "
			+ "Steps::9,10,11,12(Enter email message(Long letter) in the message body,"
			+ "click send button,verify email warning message,check the used stamps,"
			+ "click on continue button,verify email confirmation message and number.)")
	public void writeEmailForTC07AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().enterEmailMessageBodyEmojiRan(emailMsgLong);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_3);

	}

	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-07:: DesignSteps::"
			+ "13,14,15(click on continue button,verify email confirmation message and number.)")
	public void sendEmailForTC07AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();

	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send
	 * button, verify email warning message,click on continue button,verify
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-08 :: Design "
			+ "Steps::9,10,11,12(Enter email message(Emoji and letter) in the message body,"
			+ "click send button,verify email warning message,check the used stamps,"
			+ "click on continue button,verify email confirmation message and number.)")
	public void writeEmailForTC08AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().enterEmailMessageBodyEmojiRan(emailMsgEmoji);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);

	}

	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 18, description = "TestCases::WTC-08:: DesignSteps::"
			+ "13,14,15(click on continue button,verify email confirmation message and number.)")
	public void sendEmailForTC08AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();

	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send
	 * button, verify email warning message,click on continue button,verify
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 19, description = "TestCases::WTC-09 :: Design "
			+ "Steps::9,10,11,12(Enter email message(Special Character) in the message body,"
			+ "click send button,verify email warning message,check the used stamps,"
			+ "click on continue button,verify email confirmation message and number.)")
	public void writeEmailForTC09AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().enterEmailMessageBodyEmojiRan(emailMsgSpecial);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);

	}

	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 20, description = "TestCases::WTC-09:: DesignSteps::"
			+ "13,14,15(click on continue button,verify email confirmation message and number.)")
	public void sendEmailForTC09AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();

	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send
	 * button, verify email warning message,click on continue button,verify
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 21, description = "TestCases::WTC-10 :: Design "
			+ "Steps::9,10,11,12(Enter email message(Spanish letter) in the message body,"
			+ "click send button,verify email warning message,check the used stamps,"
			+ "click on continue button,verify email confirmation message and number.)")
	public void writeEmailForTC10AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().enterEmailMessageBodyEmojiRan(emailMsgSpanish);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);

	}

	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 22, description = "TestCases::WTC-10:: DesignSteps::"
			+ "13,14,15(click on continue button,verify email confirmation message and number.)")
	public void sendEmailForTC10AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();

	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send
	 * button, verify email warning message,click on continue button,verify
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 23, description = "TestCases::WTC-11 :: Design "
			+ "Steps::9,10,11,12(Enter email message(Arabic letter) in the message body,"
			+ "click send button,verify email warning message,check the used stamps,"
			+ "click on continue button,verify email confirmation message and number.)")
	public void writeEmailForTC11AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().enterEmailMessageBodyEmojiRan(emailMsgArabic);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);

	}

	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 24, description = "TestCases::WTC-11:: DesignSteps::"
			+ "13,14,15(click on continue button,verify email confirmation message and number.)")
	public void sendEmailForTC11AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();

	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send
	 * button, verify email warning message,click on continue button,verify
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 25, description = "TestCases::WTC-12 :: Design "
			+ "Steps::9,10,11,12,13(Enter email message(Prepaid plain letter) "
			+ "in the message body,check prepaid checkbox,click send button,verify "
			+ "email warning message,check the used stamps,click on continue button,"
			+ "verify email confirmation message and number.)")
	public void writeEmailForTC12AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgPrepaid);
		jpayEmail().email().checkPrepaidBox();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_2);

	}

	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 26, description = "TestCases::WTC-12:: DesignSteps::"
			+ "14,15,17(click on continue button,verify email confirmation message and number.)")
	public void sendEmailForTC12AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();

	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send
	 * button, verify email warning message,click on continue button,verify
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 27, description = "TestCases::WTC-13 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16(Enter email message(Prepaid Long letter) "
			+ "in the message body,check prepaid checkbox,click send button,verify "
			+ "email warning message,check the used stamps,click on continue button,"
			+ "verify email confirmation message and number.)")
	public void writeEmailForTC13AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().enterEmailMessageBodyEmojiRan(emailMsgPrepaidLong);
		jpayEmail().email().checkPrepaidBox();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_4);

	}

	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 28, description = "TestCases::WTC-13:: DesignSteps::"
			+ "14,15,17(click on continue button,verify email confirmation message and number.)")
	public void sendEmailForTC13AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();

	}

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 29, description = "TestCases::WTC-01,02,03,04,05,06,"
			+ "07,08,09,10,11,12,13 :: Design Steps::17,18,19(Click on Home link,"
			+ "verify page title and click logout.)")
	public void testEnd() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
	}

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/

	@Factory(dataProvider = "getData", dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String> data) {
		return new Object[] { new EmailWTC_02To13Test(data) };
	}

	public EmailWTC_02To13Test(Map<String, String> data) {
		super(data);

		username = data.get("username");
		password = data.get("password");
		frameId = data.get("frameId");
		code = data.get("code");
		buySuccMsg = data.get("buySuccMsg");
		variation = data.get("variation");
		emailMsgPlain1 = data.get("emailMsgPlain1");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		emailMsgPlain2 = data.get("emailMsgPlain2");
		emailMsgFlag = data.get("emailMsgFlag");
		emailMsgSQL = data.get("emailMsgSQL");
		emailMsgHTML = data.get("emailMsgHTML");
		emailMsgLong = data.get("emailMsgLong");
		emailMsgEmoji = data.get("emailMsgEmoji");
		emailMsgSpecial = data.get("emailMsgSpecial");
		emailMsgSpanish = data.get("emailMsgSpanish");
		emailMsgArabic = data.get("emailMsgArabic");
		emailMsgPrepaid = data.get("emailMsgPrepaid");
		emailMsgPrepaidLong = data.get("emailMsgPrepaidLong");
		

	}

}
