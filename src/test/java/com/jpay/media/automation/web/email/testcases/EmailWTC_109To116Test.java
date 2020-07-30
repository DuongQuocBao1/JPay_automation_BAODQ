package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.ApplicationConstants;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_109To116Test extends BaseTestObject {

	public String username = "";
	public String password = "";
	private String frameId = "";
	private String code = "";
	private String buySuccMsg = "";
	private String variation;
	private String warnMsg;
	private String conMsg;
	private String emailRequiresMsg;
	private String attachmentRequiresMsg;
	private String prepaidCheckboxMsg;
	private String inboxReadDeleteMsg;
	private String sentLetterHistoryMsg;
	private String sentMessageAppearMsg;
	private String emailMsg110;
	private String hrConfirmMsg;
	private String emailMsg109;
	private String thankYouConMsg;
	private String emailMsg112;
	private String stamps;
	private String transferCompletedMsg;
	private String emailMsg115;
	private String emailMsg116;
	private String fileNamePDF;

	private static String Stamps_Count;
	private static String Letter_Con_Num;
	private static String Stamps_Purchase_Con_Num;
	private static String Transfer_Stamps_Con_Num;
	private static String Inmate_Name;
	private static String Inmate_Id;
	private static String PDF_Content;

	/************************************************************************************************
	 * 
	 * TestCase :: WTC102 - (User shall be able to buy stamps with valid CC)
	 * Author :: shasan(Shahriar Hasan) , Date :: DataFile :: Email.xlsx ,
	 * DataSheet :: WTC102 Status :: Completed
	 * 
	 **************************************************************************************************/

	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-109,110,112,113,114,"
			+ "115,116::Design Steps::1,2(Click on login link and verify page title.)")
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-109,110,112,113,114,"
			+ "115,116::::Design Steps::3,4,5,6(Enter username,password,click login button "
			+ "and verify title of the page.)")
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-109::Design Steps::"
			+ "7,8(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailForTC109() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
	}

	/*********************************************************************************
	 * 
	 * Click email link,verify warning message,enter email message in the
	 * message body,click send button, verify email warning message,click on
	 * continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-109::Design Steps::"
			+ "9,10,11,12,13,14,15,16( Click email link,verify warning message,enter email "
			+ "message in the message body,click send button,verify email warning message,"
			+ "click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyWarnMessageForTC109() {

		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().enterEmailMessageBodyRan(emailMsg109);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
	}

	/*********************************************************************************
	 * 
	 * Click on home link,select random inmate,lick on email link and verify
	 * email and attachment requires message and prepaid checkbox message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-110::Design Steps::"
			+ "7,8,9,10,11,12(Click on home link,select random inmate,lick on email link "
			+ "and verify email and attachment requires message and prepaid checkbox message.)")
	public void selectInmateAndClickEmailForTC110() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().verifyEmailRequiresStampMessage(emailRequiresMsg);
		jpayEmail().email().verifyAttachmentRequiresStampMessage(attachmentRequiresMsg);
		jpayEmail().email().verifyPrepaidCheckboxMessage(prepaidCheckboxMsg);
	}

	/*********************************************************************************
	 * 
	 * Click on inbox link and verify inbox read delete message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-110::Design Steps::"
			+ "13,14(Click on inbox link and verify inbox read delete message.)")
	public void clickInboxLinkAndVerifyForTC110() {

		jpayEmail().email().clickInboxLink();
		jpayEmail().email().verifyInboxReadDeleteMessage(inboxReadDeleteMsg);
	}

	/*********************************************************************************
	 * 
	 * Click on sent link and verify sent letter history message and message
	 * appear message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-110::Design Steps::"
			+ "15,16,17(Click on sent link and verify sent letter history message and " + "message appear message.)")
	public void clickSentLinkAndVerifyForTC110() {

		jpayEmail().email().clickSentLink();
		jpayEmail().email().verifySentLetterHistoryMessage(sentLetterHistoryMsg);
		jpayEmail().email().verifySentMessageAppearMessage(sentMessageAppearMsg);
	}

	/*********************************************************************************
	 * 
	 * Click on Buy stamps link and verify stamps remaining message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-110::Design Steps::"
			+ "18,19(Click on Buy stamps link and verify stamps remaining message.)")
	public void clickTransferStampsLinkAndVerifyForTC110() {

		Stamps_Count = jpayEmail().transferStamps().getStamps();
		jpayEmail().email().clickTransferStampsLink();
		jpayEmail().email().verifyBuyStampsStampRemainingMessage(Stamps_Count);
	}

	/*********************************************************************************
	 * 
	 * Click on Transfer stamps link and verify stamps remaining message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-110::Design Steps::"
			+ "20,21(Click on Transfer stamps link and verify stamps remaining message.)")
	public void clickTranferStampsLinkAndVerifyForTC110() {

		jpayEmail().email().clickTransferStampsLink();
		jpayEmail().email().verifyTransferStampsStampRemainingMessage(Stamps_Count);
	}

	/*********************************************************************************
	 * 
	 * Click on Transaction History link and verify stamps remaining message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-110::Design Steps::"
			+ "22,23(Click on Transfer stamps link and verify stamps remaining message.)")
	public void clickTransactionHistoryLinkAndVerifyForTC110() {

		jpayEmail().email().clickTransactionHistoryLink();
		jpayEmail().email().verifyTransactionHistoryStampRemainingMessage(Stamps_Count);
	}

	/*********************************************************************************
	 * 
	 * Click email link,verify warning message,enter email message in the
	 * message body,click send button, verify email warning message,click on
	 * continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-110::Design Steps::"
			+ "24,25,26,27,28,29,30,31( Click email link,verify warning message,enter email "
			+ "message in the message body,click send button,verify email warning message,"
			+ "click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyConfirmMessagesForTC110() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsg110);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().email().verify48HourEmailConfirmMessage(hrConfirmMsg);
		jpayEmail().email().verifyThankYouEmailConfirmMessage(thankYouConMsg);

	}

	/*********************************************************************************
	 * 
	 * Click on home link,select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-112::Design Steps::"
			+ "7,8,9(Click on home link,select random inmate and click on email link.)")
	public void selectInmateAndClickEmailForTC112() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();

	}

	/*********************************************************************************
	 * 
	 * Click email link,verify warning message,enter email message in the
	 * message body,click send button, verify email warning message,click on
	 * continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-112::Design Steps::"
			+ "10,11,12,13,14,15(Enter email message in the message body,click send button,"
			+ "verify stamps used,click on continue button,verify email confirmation " + "message and number.)")
	public void sendEmailAndVerifyForTC112() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg112);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Letter_Con_Num = jpayEmail().email().getConfirmationNumber();

	}

	/*********************************************************************************
	 * 
	 * Click on sent link and verify letter confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-112::Design Steps::"
			+ "16,17,18(Click on sent link and verify letter confirmation number.)")
	public void clickSentLinkAndVerifyForTC112() {

		jpayEmail().email().pause(5000);
		jpayEmail().email().clickSentLink();
		jpayEmail().email().letterConNumSentBoxPresent(Letter_Con_Num);
		jpayEmail().email().verifySentLetterConNum(Letter_Con_Num);
	}

	/*********************************************************************************
	 * 
	 * Click on home link,select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-113::Design Steps::"
			+ "7,8,9(Click on home link,select random inmate and click on email link.)")
	public void selectInmateAndClickEmailForTC113() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();

	}

	/*********************************************************************************
	 * 
	 * Click buy stamps link,select random money radio button and click on
	 * continue button .Select random credit card from existing card list,enter
	 * validation code, accept terms and condition,click on buy stamps
	 * button,and verify purchase success message,purchase date and confirmation
	 * number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-113 :: Design "
			+ "Steps::10,11,12,13,14,15,16,17,18,19,20(Click buy stamps link,select random "
			+ "money radio button and click on continue button .Select random credit card "
			+ "from existing card list,enter validation code, accept terms and condition,"
			+ "click on buy stamps button,and verify purchase success message,purchase "
			+ "date and confirmation number.)")
	public void buyStampsAndVerifyForTC113() {

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
		Stamps_Purchase_Con_Num = jpayEmail().buyStamps().getStampPurchaseConNum();

	}

	/*********************************************************************************
	 * 
	 * Click on Transaction History link and verify letter confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-113::Design Steps::"
			+ "21,22,23(Click on Transaction History link and verify purchase confirmation number.)")
	public void clickTransactionHistoryAndVerifyForTC113() {

		jpayEmail().email().clickTransactionHistoryLink();
		jpayEmail().buyStamps().verifyStampPurchaseConNum(Stamps_Purchase_Con_Num);
		jpayEmail().buyStamps().verifyStampPurchaseConNumPresent(Stamps_Purchase_Con_Num);
	}

	/*********************************************************************************
	 * 
	 * Click on home link,select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 18, description = "TestCases::WTC-114::Design Steps::"
			+ "7,8,9(Click on home link,select random inmate and click on email link.)")
	public void selectInmateAndClickEmailForTC114() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();

	}

	/*********************************************************************************
	 * 
	 * Click buy stamps link,select random money radio button and click on
	 * continue button .Select random credit card from existing card list,enter
	 * validation code, accept terms and condition,click on buy stamps
	 * button,and verify purchase success message,purchase date and confirmation
	 * number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 19, description = "TestCases::WTC-114 :: Design "
			+ "Steps::10,11,12,13,14,15,16,17,18,19(Click buy stamps link,select random "
			+ "money radio button and click on continue button .Select random credit card "
			+ "from existing card list,enter validation code, accept terms and condition,"
			+ "click on buy stamps button,and verify purchase success message,purchase "
			+ "date and confirmation number.)")
	public void buyStampsAndVerifyForTC114() {

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
	 * Click on Transaction History link and verify letter confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 20, description = "TestCases::WTC-114::Design Steps::"
			+ "20,21,22(Click on Transaction History link and verify purchase confirmation number.)")
	public void transferStampsAndVerifyForTC114() {

		jpayEmail().email().clickTransferStampsLink();
		jpayEmail().transferStamps().enterStampsToTransfer(stamps);
		jpayEmail().transferStamps().clickTransferStampsContinueButton();
		jpayEmail().transferStamps().clickTransferNoButton();
		jpayEmail().transferStamps().clickTransferStampsContinueButton();
		jpayEmail().transferStamps().clickTransferYesButton();
		Transfer_Stamps_Con_Num = jpayEmail().transferStamps().getStampTransferConNum();
		//jpayEmail().transferStamps().verifyTransferCompletionStatus(transferCompletedMsg);
		
	}

	/*********************************************************************************
	 * 
	 * Click on Transaction History link and verify letter confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 21, description = "TestCases::WTC-114::Design Steps::"
			+ "23,24,25(Click on Transaction History link and verify purchase confirmation number.)")
	public void clickTransactionHistoryAndVerifyForTC114() {

		jpayEmail().email().clickTransactionHistoryLink();
		jpayEmail().transferStamps().verifyStampTransferConNum(Transfer_Stamps_Con_Num);
		jpayEmail().transferStamps().verifyStampTransferConNumPresent(Transfer_Stamps_Con_Num);
	}

	/*********************************************************************************
	 * 
	 * Click on home link,select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 22, description = "TestCases::WTC-115::Design Steps::"
			+ "7,8,9(Click on home link,select random inmate and click on email link.)")
	public void selectInmateAndClickEmailForTC115() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();

	}

	/*********************************************************************************
	 * 
	 * Click email link,verify warning message,enter email message in the
	 * message body,click send button, verify email warning message,click on
	 * continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 23, description = "TestCases::WTC-115::Design Steps::"
			+ "10,11,12,13,14,15(Enter email message in the message body,click send button,"
			+ "verify stamps used,click on continue button,verify email confirmation " + "message and number.)")
	public void sendEmailAndVerifyForTC115() {

		Inmate_Name = jpayEmail().email().getInmateName();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsg115);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();

	}

	/*********************************************************************************
	 * 
	 * Click on sent link and verify inmate name.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 24, description = "TestCases::WTC-115::Design Steps::"
			+ "16,17,18(Click on sent link and verify inmate name.)")
	public void clickSentLinkAndVerifyForTC115() {

		jpayEmail().email().pause(5000);
		jpayEmail().email().refresh();
		jpayEmail().email().clickSentLink();
		jpayEmail().email().inmateNameSentBoxPresent(Inmate_Name);
		jpayEmail().email().verifySentLetterInmateName(Inmate_Name);
	}

	/*********************************************************************************
	 * 
	 * Click on home link,select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 25, description = "TestCases::WTC-116::Design Steps::"
			+ "7,8,9(Click on home link,select random inmate and click on email link.)")
	public void selectInmateAndClickEmailForTC116() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();

	}

	/*********************************************************************************
	 * 
	 * Click email link,verify warning message,enter email message in the
	 * message body,click send button, verify email warning message,click on
	 * continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 26, description = "TestCases::WTC-116::Design Steps::"
			+ "10,11,12,13,14,15,16,17,18,19,20,21,22(Enter email message in the message body,"
			+ "click send button,click on preview button,download pdf,read pdf,verify pdf "
			+ "content,delete pdf,verify stamps used,click on continue button,verify email "
			+ "confirmation message and number.)")
	public void sendEmailAndVerifyForTC116() {

		Inmate_Name = jpayEmail().email().getInmateName();
		Inmate_Id = jpayEmail().email().getInmateId();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsg116);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().clickPreviewButton();
		jpayEmail().email().downloadPreviewPDF(fileNamePDF);
		jpayEmail().email().closeChildWindowUsingRobot();
		PDF_Content = jpayEmail().email().getPDFContent(PageConstant.TEST_FILE_PATH + fileNamePDF);
		jpayEmail().email().verifyPdfContentPresentToUpperCase(PDF_Content, Inmate_Name);
		jpayEmail().email().verifyPdfContentPresentToUpperCase(PDF_Content, Inmate_Id);
		jpayEmail().email().verifyPdfContentPresent(PDF_Content, emailMsg116);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();

	}

	/*********************************************************************************
	 * 
	 * Click on home link,verify title of the page and click logout button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 27, description = "TestCases::WTC-109,110,112,113,114,"
			+ "115,116::::DesignSteps::( Click on home link,verify title of the page and "
			+ "click logout button)")
	public void testEnd() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().signup().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
	}

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/

	@Factory(dataProvider = "getData", dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String> data) {
		return new Object[] { new EmailWTC_109To116Test(data) };
	}

	public EmailWTC_109To116Test(Map<String, String> data) {
		super(data);

		username = data.get("username");
		password = data.get("password");
		variation = data.get("variation");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("conMsg");
		emailMsg109 = data.get("emailMsg109");

		emailRequiresMsg = data.get("emailRequiresMsg");
		attachmentRequiresMsg = data.get("attachmentRequiresMsg");
		prepaidCheckboxMsg = data.get("prepaidCheckboxMsg");
		inboxReadDeleteMsg = data.get("inboxReadDeleteMsg");
		sentLetterHistoryMsg = data.get("sentLetterHistoryMsg");
		sentMessageAppearMsg = data.get("sentMessageAppearMsg");
		emailMsg110 = data.get("emailMsg110");
		hrConfirmMsg = data.get("hrConfirmMsg");
		thankYouConMsg = data.get("thankYouConMsg");

		emailMsg112 = data.get("emailMsg112");

		frameId = data.get("frameId");
		code = data.get("code");
		buySuccMsg = data.get("buySuccMsg");

		stamps = data.get("stamps");
		transferCompletedMsg = data.get("transferCompletedMsg");

		emailMsg115 = data.get("emailMsg115");
		emailMsg116 = data.get("emailMsg116");
		fileNamePDF = data.get("fileNamePDF");

	}

}
