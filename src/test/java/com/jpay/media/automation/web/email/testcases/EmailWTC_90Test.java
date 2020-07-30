package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_90Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String variation;
	private String warnMsg;
	private String conMsg;
	private String emailMsgDuplicate;
	private String emailMsgDifferent;
	private String alertText;
	

	public static String Duplicate_Message_Body;
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC90 - (User shall not be able to send Same type of letter content in same day)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC90
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-90:: Design Steps"
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-90:: Design Steps"
			+ "::3,4,5,6(Enter username,password,click login button and verify title of the page.)")
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-90:: Design Steps"
			+ "::7,8(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
	}
	
	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click send button,
	 * verify email warning message,click on continue button,verify 
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-90 :: Design "
			+ "Steps::9,10,11,12(Enter email message in the message body,"
			+ "click send button,verify email warning message,check the used stamps)")
	public void writeFirstEmailAndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgDuplicate);
		Duplicate_Message_Body=jpayEmail().email().getMessageText();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);//1 stamp(s) to send this letter
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-90 :: DesignSteps"
			+ "::13,14,15(Click on continue button,verify email confirmation message "
			+ "and number.)")
	public void sendFirstEmailAndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send button,
	 * verify email warning message,click on continue button,verify 
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-90 :: Design "
			+ "Steps::16,17,18,19,20(Enter duplicate email message in the message body,"
			+ "click send button,verify email warning message,check the used stamps.)")
	public void writeSecondEmailAndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().enterEmailMessageBody(Duplicate_Message_Body);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);//1 stamp(s) to send this letter
		
	}


	/*********************************************************************************
	 * 
	 * Click on continue button,verify alert text,accept alert,click on continue 
	 * button,enter different message,click send button,verify email warning 
	 * message,check the used stamps,click on continue button,verify email 
	 * confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-90 :: DesignSteps"
			+ "::21,22,23,24,25,26,27,28,29,30,31,32(Click on continue button,verify alert "
			+ "text,accept alert,click on continue button,enter different message,click "
			+ "send button,verify email warning message,check the used stamps,click on "
			+ "continue button,verify email confirmation message and number.)")
	public void sendSecondEmailAndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyAlertText(alertText);
		jpayEmail().email().acceptAlert();
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgDifferent);
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

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-90:: Design Steps"
			+ "::33,34,35(Click on Home link,verify page title and click logout.)")
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
		return new Object[] { new EmailWTC_90Test(data) };
	}
	
	
	public EmailWTC_90Test(Map<String, String> data) {
		super(data);
		
		username = data.get("username");
		password =data.get("password");
		emailMsgDuplicate = data.get("emailMsgDuplicate");
		emailMsgDifferent = data.get("emailMsgDifferent");
		variation = data.get("variation");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("conMsg");
		alertText= data.get("alertText");
		
		
	}

	


}
