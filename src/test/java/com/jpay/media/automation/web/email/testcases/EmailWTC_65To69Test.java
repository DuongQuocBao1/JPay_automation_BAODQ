package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_65To69Test extends BaseTestObject{
	
	
	public String username1 = "";
	public String password1 = "";
	public String username2 = "";
	public String password2 = "";
	private String variation;
	private String warnMsg;
	private String conMsg;
	private String emailMsgMultiplePage;
	private String filenamePng;
	private String emailMsgUnicode;
	private String frameId;
	private String code;
	private String buySuccMsg;
	private String lessStampsErrorMessage;
	

	
	public static String Stamps_Count_Before_Email_Send;
	public static String Stamps_Count_Used_For_Send;
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC65 - (Stamps amount must decrease  by number of used stamps )
	 *             WTC67 - (User shall be able to send letter with Unicode)
	 *             WTC66 - (Attemp to send letter with less stamps/Buy Stamps/Send Letter)
	 *             WTC69 - (User shall be able to add attachment and send letter )
	 *            
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC65To69
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-65,66,67,69 :: Design "
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-65,67 :: Design "
			+ "Steps::3,4,5,6(Enter username,password,click login button and verify "
			+ "title of the page.)")
	public void loginAndVerify1() {

		jpayEmail().login().enterUsername(username1);
		jpayEmail().login().enterPassword(password1);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}
	
	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-65,67 :: Design "
			+ "Steps::7,8(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		
		Stamps_Count_Before_Email_Send = jpayEmail().transferStamps().getStamps();
		
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

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-65 :: Design "
			+ "Steps::9,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26(Enter email message body,"
			+ "check prepaid checkbox,click on attach image,click on choose file,enter "
			+ "filepath in the file explorer,click on open,click on attach,click on continue "
			+ "button,click on send button,verify warning message and stamps used text.)")
	public void attachAndWriteEmailForTC65AndVerify() {

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
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_8);
		
		Stamps_Count_Used_For_Send = jpayEmail().email().getUsedStamps();
		
	}

	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number and verify stamp count.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-65 :: Design Steps"
			+ "::27,28,29(Click on send continue button and verify confirmation message "
			+ "and confirmation number and verify stamp count.)")
	public void sendEmailForTC65AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().email().verifyStampsCountAfterEmailSent(Stamps_Count_Before_Email_Send, Stamps_Count_Used_For_Send);
		
		
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

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-67 :: Design Steps"
			+ "::9,11,12,13,14(Click on enmail tab,enter email message body,click on "
			+ "send button,verify warning message and stamps used text.)")
	public void enterUnicodeEmailForTC67AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgUnicode);
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

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-67 :: Design Steps"
			+ "::15,16,17(Click on send continue button and verify confirmation message "
			+ "and confirmation number)")
	public void sendUnicodeEmailForTC67AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-65,67:: Design "
			+ "Steps::(Click on Home link,verify page title and click logout.)")
	public void logoutFromWWWForTC65And67() {
		
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-66,69 :: Design "
			+ "Steps::1,2,3,4,5,6(Enter username,password,click login button and verify "
			+ "title of the page.)")
	public void loginToWWWForTC66And69() {

		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		jpayEmail().login().enterUsername(username2);
		jpayEmail().login().enterPassword(password2);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}
	
	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-66,69 :: Design "
			+ "Steps::7,8(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab2() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		
	}
	

	/*********************************************************************************
	 * 
	 *  Click buy stamps link,click on continue button,enter validation code,
	 * accept terms and condition,click on buy stamps button,and verify 
	 * purchase success message,purchase date and confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-66 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18(Click buy stamps link,click on continue "
			+ "button,enter validation code,accept terms and condition,click on "
			+ "buy stamps button,and verify purchase success message,purchase "
			+ "date and confirmation number.)")
	public void buyStampsForTC66AndVerify1() {

		jpayEmail().email().clickBuyStampsLink();
		jpayEmail().buyStamps().clickContinueButton();
		jpayEmail().buyStamps().switchToIframeById(frameId);
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
	 * Enter email message body,click on attach image,click on choose file,
	 * enter filepath in the file explorer,click on open,click on attach,
	 * click on continue button,click on  send button,verify 
	 * warning message and stamps used text,click on send continue 
	 * button and verify confirmation message and  confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-66 :: Design "
			+ "Steps::19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38"
			+ "(Click on email tab link,Enter email message body,check prepaid "
			+ "checkbox,attach two ecard and two image,click on send button,"
			+ "verify send email error message.)")
	public void attachAndWriteEmailForTC66AndVerify1() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgMultiplePage);
		jpayEmail().email().checkPrepaidBox();
		jpayEmail().email().clickAttachECard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyLessStampsSendEmailErrorMsg(lessStampsErrorMessage);
		
		
		
	}


	/*********************************************************************************
	 * 
	 *  Click buy stamps link,click on continue button,enter validation code,
	 * accept terms and condition,click on buy stamps button,and verify 
	 * purchase success message,purchase date and confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-66 :: Design "
			+ "Steps::39,40,41,42,43,44,45,46,47,48(Click buy stamps link,click on continue "
			+ "button,enter validation code,accept terms and condition,click on "
			+ "buy stamps button,and verify purchase success message,purchase "
			+ "date and confirmation number.)")
	public void buyStampsForTC66AndVerify2() {

		jpayEmail().email().clickBuyStampsLink();
		jpayEmail().buyStamps().clickContinueButton();
		jpayEmail().buyStamps().switchToIframeById(frameId);
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
	 * Enter email message body,click on attach image,click on choose file,
	 * enter filepath in the file explorer,click on open,click on attach,
	 * click on continue button,click on  send button,verify 
	 * warning message and stamps used text,click on send continue 
	 * button and verify confirmation message and  confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-66 :: Design "
			+ "Steps::49,50,51,52(Click on email tab,click on send button,verify "
			+ "warning message and stamps used text.)")
	public void attachAndWriteEmailForTC66AndVerify2() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_10);
		
	}


	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number and verify stamp count.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-66 :: Design Steps"
			+ "::53,54,55(Click on send continue button and verify confirmation message "
			+ "and confirmation number and verify stamp count.)")
	public void sendEmailForTC66AndVerify() {

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

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-69 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25"
			+ "(Click on email tab link,Enter email message body,check prepaid "
			+ "checkbox,attach two ecard and two image.)")
	public void attachAndWriteEmailForTC69AndVerify1() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgMultiplePage);
		jpayEmail().email().checkPrepaidBox();
		jpayEmail().email().clickAttachECard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		
		
	}


	/*********************************************************************************
	 * 
	 *  Click buy stamps link,click on continue button,enter validation code,
	 * accept terms and condition,click on buy stamps button,and verify 
	 * purchase success message,purchase date and confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-69 :: Design "
			+ "Steps::26,27,28,29,30,31,32,33,34,35(Click buy stamps link,click on continue "
			+ "button,enter validation code,accept terms and condition,click on "
			+ "buy stamps button,and verify purchase success message,purchase "
			+ "date and confirmation number.)")
	public void buyStampsForTC69AndVerify1() {

		jpayEmail().email().clickBuyStampsLink();
		jpayEmail().buyStamps().clickContinueButton();
		jpayEmail().buyStamps().switchToIframeById(frameId);
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
	 * Enter email message body,click on attach image,click on choose file,
	 * enter filepath in the file explorer,click on open,click on attach,
	 * click on continue button,click on  send button,verify 
	 * warning message and stamps used text,click on send continue 
	 * button and verify confirmation message and  confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 18, description = "TestCases::WTC-69 :: Design "
			+ "Steps::36,37,38,39(Click on email tab,click on send button,verify "
			+ "warning message and less stamps error message.)")
	public void sendEmailForTC69AndVerify1() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyLessStampsSendEmailErrorMsg(lessStampsErrorMessage);
		
	}
	

	/*********************************************************************************
	 * 
	 *  Click buy stamps link,click on continue button,enter validation code,
	 * accept terms and condition,click on buy stamps button,and verify 
	 * purchase success message,purchase date and confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 19, description = "TestCases::WTC-69 :: Design "
			+ "Steps::40,41,42,43,44,45,46,47,48,49(Click buy stamps link,click on continue "
			+ "button,enter validation code,accept terms and condition,click on "
			+ "buy stamps button,and verify purchase success message,purchase "
			+ "date and confirmation number.)")
	public void buyStampsForTC69AndVerify2() {

		jpayEmail().email().clickBuyStampsLink();
		jpayEmail().buyStamps().clickContinueButton();
		jpayEmail().buyStamps().switchToIframeById(frameId);
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
	 * Enter email message body,click on attach image,click on choose file,
	 * enter filepath in the file explorer,click on open,click on attach,
	 * click on continue button,click on  send button,verify 
	 * warning message and stamps used text,click on send continue 
	 * button and verify confirmation message and  confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 20, description = "TestCases::WTC-69 :: Design "
			+ "Steps::50,51,52,53(Click on email tab,click on send button,verify "
			+ "warning message and stamps used text.)")
	public void attachAndWriteEmailForTC69AndVerify2() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_10);
		
		
		
	}


	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number and verify stamp count.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 21, description = "TestCases::WTC-69 :: Design Steps"
			+ "::54,55,56(Click on send continue button and verify confirmation message "
			+ "and confirmation number and verify stamp count.)")
	public void sendEmailForTC69AndVerify2() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 22, description = "TestCases::WTC-66,69:: Design "
			+ "Steps::(Click on Home link,verify page title and click logout.)")
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
		return new Object[] { new EmailWTC_65To69Test(data) };
	}
	
	
	public EmailWTC_65To69Test(Map<String, String> data) {
		super(data);
		
		
		username1 = data.get("username1");
		password1 =data.get("password1");
		username2 = data.get("username2");
		password2 =data.get("password2");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		emailMsgMultiplePage = data.get("emailMsgMultiplePage");
		emailMsgUnicode = data.get("emailMsgUnicode");
		filenamePng = data.get("filenamePng");
		lessStampsErrorMessage = data.get("lessStampsErrorMessage");
		frameId = data.get("frameId");
		code = data.get("code");
		buySuccMsg = data.get("buySuccMsg");
		
		
		
	}

	


}
