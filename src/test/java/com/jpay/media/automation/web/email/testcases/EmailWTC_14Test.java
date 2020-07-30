package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_14Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String variation;
	private String emailMsgPlain;
	private String warnMsg;
	private String conMsg;
	private String requiredText1;
	private String emailMsgEmoji;
	private String requiredText2;
	

	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC14 - (User shall not be able to send the letter)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC14
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-14 :: Design "
			+ "Steps::1,2(Click on login link and verify page title.)")
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-14 :: Design "
			+ "Steps::3,4,5,6(Enter username,password,click login button and "
			+ "verify title of the page.)")
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-14 :: Design "
			+ "Steps::7,8(Select random inmate and "
			+ "click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on send button and verify the required text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-14 :: Design "
			+ "Steps::9,10(Click on send button and verify the required text.)")
	public void clickSendButtonAndVerify() {

		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailContentRequiredMsgBottom(requiredText1);
	}
	
	

	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click on cancel button,
	 * click on compose button,enter emoji in the message body without 
	 * text,click on send button and verify the text required message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-14 :: Design "
			+ "Steps::11,12,13,14,15,16(Enter email message in the message body,click "
			+ "on cancel button,click on compose button,enter emoji in the message body "
			+ "without text,click on send button and verify the text required message.)")
	public void sendEmailWithEmojiAndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgPlain);
		jpayEmail().email().clickCancelButton();
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().enterEmailMessageBodyEmoji(emailMsgEmoji);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailContentRequiredMsgTop(requiredText2);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on cancel button,click on compose button,enter email message body,
	 * click on send button,verify warning message and stamps used text,click 
	 * on back button,click on send button,verify warning message and stamps 
	 * used text,click on send continue button and verify confirmation 
	 * message and confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-14 :: Design "
			+ "Steps::17,18,19,20,21,22,23,24,25,26,27,28,29(Click on cancel button,"
			+ "click on compose button,enter email message body,click on send button,"
			+ "verify warning message and stamps used text,click on back button,click "
			+ "on send button,verify warning message and stamps used text,click on send "
			+ "continue button and verify confirmation message and confirmation number.)")
	public void sendEmailWithPlainAndVerify() {

		jpayEmail().email().clickCancelButton();
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgPlain);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		jpayEmail().email().clickBackButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
		
	}


	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-14 :: Design "
			+ "Steps::30,31,32(Click on Home link,verify page title and click logout.)")
	public void testEnd() {
		
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
	}



	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_14Test(data) };
	}
	
	
	public EmailWTC_14Test(Map<String, String> data) {
		super(data);
		
		username = data.get("username");
		password =data.get("password");
		variation = data.get("variation");
		emailMsgPlain = data.get("emailMsgPlain");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		emailMsgEmoji = data.get("emailMsgEmoji");
		requiredText1 = data.get("requiredText1");
		requiredText2 = data.get("requiredText2");
		
		
	}

	


}
