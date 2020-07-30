package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_53Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String variation;
	private String emailMsgPlain1;
	private String warnMsg;
	private String conMsg;
	private String emailMsgPlain2;
	
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC53 - (User shall be able to Verify Inbox & Sent archive letter & replay from inbox)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC53
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-53 :: Design "
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-53 :: Design "
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-53 :: Design "
			+ "Steps::7,8(Select random inmate and "
			+ "click on email link.)")
	
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on sent link,click on next,click on first,click on last,verify 
	 * archive letter present,click on previous,click on next,click on last,
	 * click on previous,click on first,click on name to read letter,click 
	 * on delete and click on ok from the popup.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-53 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21(Click on sent link,click "
			+ "on next,click on first,click on last,verify archive letter present,click "
			+ "on previous,click on next,click on last,click on previous,click on first,"
			+ "click on name to read letter,click on delete and click on ok from the popup.)")
	
	public void clickSentLinkAndVerify1() {

		jpayEmail().email().clickSentLink();
		jpayEmail().email().clickNextLink();
		jpayEmail().email().clickFirstLink();
		jpayEmail().email().clickLastLink();
		//jpayEmail().email().verifyArchiveDateLetterPresent();
		jpayEmail().email().clickPrevLink();
		jpayEmail().email().clickNextLink();
		jpayEmail().email().clickPrevLink();
		jpayEmail().email().clickLastLink();
		jpayEmail().email().clickFirstLink();
		jpayEmail().email().clickFirstDiplayedNameLinkFromSent();
		jpayEmail().email().clickDeleteReadPageButton();
		jpayEmail().email().acceptAlert();
		
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on inbox,click on next,click on first,click on last,click on prev,
	 * select an inbox letter,click on delete,click on name to read a letter,
	 * click on delete,click on last,select an inbox letter,click on delete,
	 * click on name to read a letter,click on delete,click on name to read 
	 * archive letter,click on replay,compose a letter,click on send button,
	 * verify warning message,check used stamps,click on continue button,verify 
	 * confirmation and confirmation number,click home,select random inmate,click 
	 * on inbox,click on last,click on compose,compose a letter,click on send 
	 * button,verify warning message,check used stamps,click on continue button 
	 * and verify confirmation and confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = false, priority = 5, description = "TestCases::WTC-53 :: Design "
			+ "Steps::22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,"
			+ "44,45,46,47,48,49,50,51,52,53,54,55,56,57(Click on inbox,click on next,"
			+ "click on first,click on last,click on prev,select an inbox letter,click "
			+ "on delete,click on name to read a letter,click on delete,click on last,"
			+ "select an inbox letter,click on delete,click on name to read a letter,"
			+ "click on delete,click on name to read archive letter,click on replay,"
			+ "compose a letter,click on send button,verify warning message,check used "
			+ "stamps,click on continue button,verify confirmation and confirmation "
			+ "number,click home,select random inmate,click on inbox,click on last,"
			+ "click on compose,compose a letter,click on send button,verify warning "
			+ "message,check used stamps,click on continue button and verify "
			+ "confirmation and confirmation number.)")
	
	public void clickInboxLinkAndVerify1() {

		jpayEmail().email().clickInboxLink();
		jpayEmail().email().clickNextLink();
		jpayEmail().email().clickFirstLink();
		jpayEmail().email().clickLastLink();
		jpayEmail().email().clickPrevLink();
		jpayEmail().email().checkFirstEmailCheckBox();
		jpayEmail().email().clickDeleteInboxPageButton();
		jpayEmail().email().clickFirstDiplayedNameLinkFromInbox();
		jpayEmail().email().clickDeleteReadPageButton();
		
		jpayEmail().email().clickLastLink();
		jpayEmail().email().checkFirstEmailCheckBox();
		jpayEmail().email().clickDeleteInboxPageButton();
		jpayEmail().email().clickFirstDiplayedNameLinkFromInbox();
		jpayEmail().email().clickDeleteReadPageButton();
		
		jpayEmail().email().clickFirstDiplayedNameLinkFromInbox();
		jpayEmail().email().clickReplayReadPageButton();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgPlain1);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);//1 stamp(s) to send this letter
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
		
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().clickInboxLink();
		jpayEmail().email().clickLastLink();
		jpayEmail().email().clickComposeButton();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgPlain2);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);//1 stamp(s) to send this letter
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
		
	}
	

	
	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-53 :: Design "
			+ "Steps::58,59,60(Click on Home link,verify page title and click logout.)")
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
		return new Object[] { new EmailWTC_53Test(data) };
	}
	
	
	public EmailWTC_53Test(Map<String, String> data) {
		super(data);
		
		username = data.get("username");
		password =data.get("password");
		variation = data.get("variation");
		emailMsgPlain1 = data.get("emailMsgPlain1");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		emailMsgPlain2 = data.get("emailMsgPlain2");
		
		
	}

	


}
