package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_93To95Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String variation;
	private String warnMsg;
	private String conMsg;
	private String filenamePng;
	private String emailMsgMultiplePage;
	private String emailMsgPreview;
	private String emailMsgTextSize;
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC93 - (User shall be able to send eCard)
	 *             WTC94 - (User shall be able to send multiple eCard)
	 *             WTC95 - (User shall be able to send prepaid eCard)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC93To95
	 * Status :: Completed
	 * 
	 **************************************************************************************************/



	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-93,94,95::Design "
			+ "Steps::1,2,3(Click on login link and verify page title.)")
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-93,94,95::DesignSteps"
			+ "::4,5,6,7(Enter username,password,click login button and erify title of the page.)")
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-93,94,95::DesignSteps"
			+ "::8,9(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
	}
	

	/*********************************************************************************
	 * 
	 * Enter email message body,click on attach image,click on choose file,
	 * enter filepath in the file explorer,click on open,click on attach,
	 * click on continue button,click on  send button,verify 
	 * warning message and stamps used text,click on send continue 
	 * button and verify confirmation message and  confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-93 :: DesignSteps"
			+ "::10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31(Enter "
			+ "email message body,check prepaid checkbox,click on attach image,click on "
			+ "choose file,enter filepath in the file explorer,click on open,click on attach,"
			+ "click on continue button,click on send button,verify warning message and stamps "
			+ "used text.)")
	public void writeEmailClickPreviewForTC93AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgPreview);
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
		jpayEmail().email().clickPreviewButton();
		jpayEmail().email().closeChildWindowUsingRobot();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().clickPreviewButton();
		jpayEmail().email().closeChildWindowUsingRobot();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_4);
		
	}

	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-93:: DesignSteps::"
			+ "32,33,34(Click on send continue button and verify confirmation message "
			+ "and confirmation number.)")
	public void sendEmailForTC93AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
	}

	/*********************************************************************************
	 * 
	 * Enter email message body,click on attach image,click on choose file,
	 * enter filepath in the file explorer,click on open,click on attach,
	 * click on continue button,click on  send button,verify 
	 * warning message and stamps used text,click on send continue 
	 * button and verify confirmation message and  confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-94::DesignSteps::"
			+ "10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31(Enter email message body,"
			+ "check prepaid checkbox,click on attach image,click on choose file,enter "
			+ "filepath in the file explorer,click on open,click on attach,click on continue "
			+ "button,click on send button,verify warning message and stamps used text.)")
	public void writeEmailClickPreviewForTC94AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyEmojiRan(emailMsgMultiplePage);
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
		jpayEmail().email().clickPreviewButton();
		jpayEmail().email().closeChildWindowUsingRobot();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().clickPreviewButton();
		jpayEmail().email().closeChildWindowUsingRobot();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_6);
		
	}

	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-94:: Design Steps"
			+ "::32,33,34(Click on send continue button and verify confirmation message "
			+ "and confirmation number.)")
	public void sendEmailForTC94AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
	}
	
	/*********************************************************************************
	 * 
	 * Click on email tab link,Enter email message body,click on small font size,
	 * verify message displayed in small font,click on medium font size,verify 
	 * message displayed in medium font,click on big font size,verify message 
	 * displayed in big font,click on  send button,verify warning message and 
	 * stamps used text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-95::DesignSteps::"
			+ "10,11,12,13,14,15,16,17,18,19,20,21(Click on email tab link,Enter email "
			+ "message body,click on small font size,verify message displayed in small "
			+ "font,click on medium font size,verify message displayed in medium font,"
			+ "click on big font size,verify message displayed in big font,click on  "
			+ "send button,verify warning message and stamps used text.)")
	public void writeEmailClickTextSizeForTC95AndVerify1() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgTextSize);
		jpayEmail().email().clickTextSizeSmallFont();
		jpayEmail().email().verifyEmailFontSizeIsSmall();
		jpayEmail().email().clickTextSizeMediumFont();
		jpayEmail().email().verifyEmailFontSizeIsMedium();
		jpayEmail().email().clickTextSizeBigFont();
		jpayEmail().email().verifyEmailFontSizeIsBig();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		
	}

	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-95:: Design Steps"
			+ "::22,23,24(Click on send continue button and verify confirmation message "
			+ "and confirmation number.)")
	public void sendEmailForTC95AndVerify1() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on email tab link,Enter email message body,click on small font size,
	 * verify message displayed in small font,click on medium font size,verify 
	 * message displayed in medium font,click on big font size,verify message 
	 * displayed in big font,click on  send button,verify warning message and 
	 * stamps used text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-95::DesignSteps::"
			+ "25,26,27,28,29,30,31,32,33,34,35,36(Click on email tab link,Enter email "
			+ "message body,click on small font size,verify message displayed in small "
			+ "font,click on medium font size,verify message displayed in medium font,"
			+ "click on big font size,verify message displayed in big font,click on  "
			+ "send button,verify warning message and stamps used text.)")
	public void writeEmailClickTextSizeForTC95AndVerify2() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgTextSize);
		jpayEmail().email().clickTextSizeSmallFont();
		jpayEmail().email().verifyEmailFontSizeIsSmall();
		jpayEmail().email().clickTextSizeMediumFont();
		jpayEmail().email().verifyEmailFontSizeIsMedium();
		jpayEmail().email().clickTextSizeBigFont();
		jpayEmail().email().verifyEmailFontSizeIsBig();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		
	}

	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-95:: Design Steps"
			+ "::37,38,39,40(Click on send continue button and verify confirmation message "
			+ "and confirmation number.)")
	public void sendEmailForTC95AndVerify2() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
	}


	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-93,94,95 :: Design "
			+ "Steps::--(Click on Home link,verify page title and click logout.)")
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
		return new Object[] { new EmailWTC_93To95Test(data) };
	}
	
	
	public EmailWTC_93To95Test(Map<String, String> data) {
		super(data);
		
		
		
		username = data.get("username");
		password =data.get("password");
		variation = data.get("variation");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		emailMsgPreview = data.get("emailMsgPreview");
		filenamePng = data.get("filenamePng");
		emailMsgMultiplePage = data.get("emailMsgMultiplePage");
		emailMsgTextSize = data.get("emailMsgTextSize");
		
	}

	


}
