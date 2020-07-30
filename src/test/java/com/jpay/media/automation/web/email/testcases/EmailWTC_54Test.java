package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_54Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String variation;
	private String warnMsg;
	private String conMsg;
	private String emailMsgMultiplePage;
	private String filenamePng; 
	
	
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC54 - (User shall be able to send letter)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC54
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-54 :: Design "
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-54 :: Design "
			+ "Steps::7(Select random inmate and click on email link.)")
	
	public void selectInmate1() {

		jpayEmail().login().selectRandomInmate();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on email and videogram link,click on change,change inmate from 
	 * combobox,click on email link,enter multiple page message,check prepaid 
	 * checkbox,attach ecard,attach image,click on send button,verify warning 
	 * message and stamps used,click on continue button and verify 
	 * confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-53 :: Design "
			+ "Steps::8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28"
			+ "(Click on email and videogram link,click on change,change inmate "
			+ "from combobox,click on email link,enter multiple page message,check "
			+ "prepaid checkbox,attach ecard,attach image,click on send button,verify "
			+ "warning message and stamps used,click on continue button and verify "
			+ "confirmation message and number.)")
	
	public void sendEmailThroughEmailVideogramLink() {

		jpayEmail().home().clickEmailVideogramLink();
		jpayEmail().home().clickChangeLink();
		jpayEmail().home().selectRandomInmateFromEmailVideo();
		jpayEmail().home().clickEmailLinkEmailVideo();
		
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgMultiplePage);
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
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
	}
	
	
	
	/*********************************************************************************
	 * 
	 * Click on home link,select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-54 :: Design "
			+ "Steps::29,30,31(Click on home link,select random inmate and click on email link.)")
	
	public void selectInmate2() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Enter multiple page message,check prepaid* checkbox,attach ecard,
	 * attach image,click on send button,verify warning  message and 
	 * stamps used,click on continue button and verify confirmation 
	 * message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-54 :: Design "
			+ "Steps::32,33,34,35,36,37,38,39,40,41,42,43,45,46,47,48(Enter multiple "
			+ "page message,check prepaid* checkbox,attach ecard,attach image,click "
			+ "on send button,verify warning  message and stamps used,click on continue "
			+ "button and verify confirmation message and number.)")
	
	public void sendEmailThroughEmailTabLink() {


		jpayEmail().email().enterEmailMessageBodyRan(emailMsgMultiplePage);
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
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
		
	}
	
	

	
	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-53 :: Design "
			+ "Steps::49,50,51(Click on Home link,verify page title and click logout.)")
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
		return new Object[] { new EmailWTC_54Test(data) };
	}
	
	
	public EmailWTC_54Test(Map<String, String> data) {
		super(data);
		
		username = data.get("username");
		password =data.get("password");
		variation = data.get("variation");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		emailMsgMultiplePage = data.get("emailMsgMultiplePage");
		filenamePng = data.get("filenamePng");
		
	}

	


}
