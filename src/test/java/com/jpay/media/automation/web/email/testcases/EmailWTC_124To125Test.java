package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_124To125Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String variation;
	private String warnMsg;
	private String conMsg;
	private String emailMsg;
	private String filenamePng;
	private String emailDraftMsg;
	private String emailUpdatedDraftMsg;
	private String emailMsgSendDraft;

	

	private static String Draft_Email1;
	private static String Draft_Email2;
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC124To125 - (124.User shall be able to send email
	 *                             125.User shall be able to update draft in ww)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC124To125
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-124,125:: Design"
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-124,125:: Design"
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-124:: Design"
			+ "Steps::7,8(Select random inmate and click on email link.)")
	public void selectInmateForTC124() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().home().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}
	

	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click attach ecard,
	 * select random ecard category,click on continue button,click 
	 * send button,verify email warning message,click on continue 
	 * button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-124:: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21,22,23(Enter filter email message in "
			+ "the message body,click attach ecard,select random ecard category,click on "
			+ "continue button,click on choose file,enter filepath in the file "
			+ "explorer,click on open,click on attach,click on continue button"
			+ "click send button,verify email warning message,check the used stamps.)")
	public void writeEmailAndVerifyForTC124() {

		jpayEmail().email().enterEmailMessageBodyEmojiRan(emailMsg);
		jpayEmail().email().checkPrepaidBox();
		jpayEmail().email().clickAttachECard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_6);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description =  "TestCases::WTC-124::DesignSteps"
			+ "::24,25,26(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyForTC124() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on home link,Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-125:: Design"
			+ "Steps::7,8,9(Click on home link,Select random inmate and click on email link.)")
	public void selectInmateForTC125() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}

	/*********************************************************************************
	 * 
	 * Enter email message in the message body,wait for autosave 
	 * message to display and verify the autosave message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-125:: DesignSteps"
			+ "::10,11,12(Enter email message in the message body,wait for autosave "
			+ "message to display and verify the autosave message.)")
	public void writeEmailAndVerifyDraft1ForTC125() {

		jpayEmail().email().enterEmailMessageBodyRan(emailDraftMsg);
		jpayEmail().email().pause(62000);
		jpayEmail().email().verifyAutosaveMessage();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-125:: Design "
			+ "Steps::13,14,15(Click on Home link,verify page title and click logout.)")
	public void logoutFromWWW1ForTC125() {
		
		Draft_Email1=jpayEmail().email().getMessageText();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on login link,Enter username,password,click login 
	 * button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-125:: Design"
			+ "Steps::16,17,18,19,20(Click on login link,enter username,password,click "
			+ "login button and verify title of the page.)")
	public void loginAndVerify1ForTC125() {

		jpayEmail().login().clickLoginLink();
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

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-125:: Design"
			+ "Steps::21,22(Select random inmate and click on email link.)")
	public void selectInmate2ForTC125() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().home().clickEmailLink();
		
	}

	/*********************************************************************************
	 * 
	 * Verify draft message displays in the email message body,update the 
	 * draft message,wait for autosave message to display and verify the 
	 * autosave message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-125:: Design "
			+ "Steps::23,24,25,26(Verify draft message displays in the email message "
			+ "body,update the draft message,wait for autosave message to display and "
			+ "verify the autosave message.)")
	public void updateDraftMsgAndVerifyForTC125() {

		jpayEmail().email().verifyEmailMessageBody(Draft_Email1);
		jpayEmail().email().enterEmailMessageBodyRan(emailUpdatedDraftMsg);
		jpayEmail().email().pause(62000);
		jpayEmail().email().verifyAutosaveMessage();
		
	}

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-125:: Design "
			+ "Steps::27,28,29(Click on Home link,verify page title and click logout.)")
	public void logoutFromWWW2ForTC125() {
		
		Draft_Email2=jpayEmail().email().getMessageText();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click log in link,enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-125:: DesignSteps"
			+ "::30,31,32,33,34(Click log in link,enter username,password,click login "
			+ "button and verify title of the page.)")
	public void loginAndVerify2ForTC125() {

		jpayEmail().login().clickLoginLink();
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

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-125:: Design"
			+ "Steps::35,36(Select random inmate and click on email link.)")
	public void selectInmate3ForTC125() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().home().clickEmailLink();
		
	}

	/*********************************************************************************
	 * 
	 * Verify updated draft message displays in the email message body,
	 * Enter email message in the message body to send,click send button,
	 * verify email warning message and total stamps used.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-124:: DesignSteps::"
			+ "37,38,39,40,41(Verify updated draft message displays in the email message "
			+ "body,Enter email message in the message body to send,click send button,"
			+ "verify email warning message and total stamps used.)")
	public void verifyUpdatedDrsftForTC125() {

		jpayEmail().email().verifyEmailMessageBody(Draft_Email2);
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgSendDraft);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description =  "TestCases::WTC-125::DesignSteps"
			+ ":42,43,44(Click on continue button,verify email confirmation message "
			+ "and number.)")
	public void sendEmailAndVerifyForTC125() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
	}

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-125:: Design "
			+ "Steps::45,46,47(Click on Home link,verify page title and click logout.)")
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
		return new Object[] { new EmailWTC_124To125Test(data) };
	}
	
	
	public EmailWTC_124To125Test(Map<String, String> data) {
		super(data);
		
		username = data.get("username");
		password =data.get("password");
		variation = data.get("variation");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		emailMsg = data.get("emailMsg");
		emailDraftMsg = data.get("emailDraftMsg");
		emailUpdatedDraftMsg = data.get("emailUpdatedDraftMsg");
		emailMsgSendDraft = data.get("emailMsgSendDraft");
		filenamePng = data.get("filenamePng");
		
		
	}

	


}
