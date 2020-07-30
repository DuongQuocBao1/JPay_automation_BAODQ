package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_15To30Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String variation;
	private String emailMsg;
	private String warnMsg;
	private String conMsg;
	private String stampsUsedTwo;
	private String stampsUsedThree;
	private String stampsUsedFour;
	private String emailMsgFilter;
	private String filenamePng;
	private String filenameGif;
	private String filenameJpeg;
	private String stampsUsedFive;
	private String stampsUsedEight;
	private String emailMsgMultiplePage;
	private String filenameNegativeTesting;
	private String fileAttachErrorMessage;
	private String stampsUsedOne;
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC15 - (User shall be able to send eCard)
	 *             WTC16 - (User shall be able to send multiple eCard)
	 *             WTC17 - (User shall be able to send prepaid eCard)
	 *             WTC18 - (User shall be able to send multiple eCard with prepaid)
	 *             WTC19 - (User shall be able to add/remove/add eCard)
	 *             WTC20 - (Letter shall be auto save)
	 *             WTC21 - (Letter shall be flag in facility)
	 *             WTC22 - (User shall be able to send attach image)
	 *             WTC23 - (User shall be able to send multiple attach image)
	 *             WTC24 - (User shall be able to send prepaid attach image)
	 *             WTC25 - (User shall be able to send multiple attach image prepaid)
	 *             WTC26 - (Letter shall be auto save with image attach)
	 *             WTC27 - (User shall be able to send Prepaid Email with multiple page, E-Card & attach image)
	 *             WTC28 - (User shall not be able to add image with negative format)
	 *             WTC29 - (User shall be able to Add, Remove, add image then send letter)
	 *             WTC30 - (User shall be able to send Pre-paid, multiple page, E-Card, attach image)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC15To30
	 * Status :: Completed
	 * 
	 **************************************************************************************************/



	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::1,2(Click on login link "
			+ "and verify page title.)")
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::3,4,5,6(Enter username,"
			+ "password,click login button and erify title of the page.)")
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::7,8(Select random inmate "
			+ "and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
	}
	

	
	/*********************************************************************************
	 * 
	 * Enter email message body,click on attach ecard,select random ecard 
	 * catagory,attach one random ecard,click on continue button,click on 
	 * send button,verify warning message and stamps used text,
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-15 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19(Enter email message body,click on "
			+ "attach ecard,select random ecard catagory,attach one random ecard,click "
			+ "on continue button,click on send button,verify warning message and stamps "
			+ "used text.)")
	public void attachSingleEcardForTC15AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().clickAttachECard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_2);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::(Click on send continue "
			+ "button and verify confirmation message and confirmation number,"
			+ "Click on email link.)")
	public void sendEmailVerifyAndClickEmailTab1() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
	}

	
	/*********************************************************************************
	 * 
	 * Enter email message body,click on attach ecard,select random ecard 
	 * catagory,attach two random ecard,click on continue button,click on 
	 * send button,verify warning message and stamps used text,click on 
	 * send continue button and verify confirmation message and 
	 * confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-16 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20(Enter email message body,click on "
			+ "attach ecard,select random ecard catagory,attach two random ecard,click "
			+ "on continue button,click on send button,verify warning message and stamps "
			+ "used text.)")
	public void attachMultipleEcardForTC16AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().clickAttachECard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_3);
		
	}
	
	
	
	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::(Click on send continue "
			+ "button and verify confirmation message and confirmation number,"
			+ "Click on email link.)")
	public void sendEmailVerifyAndClickEmailTab2() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
	}

	
	
	/*********************************************************************************
	 * 
	 * Enter email message body,check prepaid checkbox,click on attach ecard,select random ecard 
	 * catagory,attach one random ecard,click on continue button,click on 
	 * send button,verify warning message and stamps used text,click on 
	 * send continue button and verify confirmation message and 
	 * confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-17 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20(Enter email message body,"
			+ "check prepaid checkbox,click on attach ecard,select random ecard catagory,"
			+ "attach one random ecard,click on continue button,click on send button,"
			+ "verify warning message and stamps used text.)")
	public void attachSinglPrepaideEcardForTC17AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().checkPrepaidBox();
		jpayEmail().email().clickAttachECard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_3);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::(Click on send continue "
			+ "button and verify confirmation message and confirmation number,"
			+ "Click on email link.)")
	public void sendEmailVerifyAndClickEmailTab3() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
	}

	
	/*********************************************************************************
	 * 
	 * Enter email message body,check prepaid checkbox,click on attach ecard,select random ecard 
	 * catagory,attach two random ecard,click on continue button,click on 
	 * send button,verify warning message and stamps used text,click on 
	 * send continue button and verify confirmation message and 
	 * confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-18 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21,22(Enter email message body,check "
			+ "prepaid checkbox,click on attach ecard,select random ecard catagory,attach "
			+ "two random ecard,click on continue button,click on send button,verify "
			+ "warning message and stamps used text.)")
	public void attachMultiplePrepaidEcardForTC18AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().checkPrepaidBox();
		jpayEmail().email().clickAttachECard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_4);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::(Click on send continue "
			+ "button and verify confirmation message and confirmation number,"
			+ "Click on email link.)")
	public void sendEmailVerifyAndClickEmailTab4() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
	}

	
	/*********************************************************************************
	 * 
	 * Enter email message body,click on attach ecard,select random ecard 
	 * catagory,attach one random ecard,click on remove link from attach 
	 * page,verify remove link is not present,attach one random ecard,
	 * click on  continue button,click on remove link from main page,
	 * verify remove  link is not present,click on attach ecard,select 
	 * random ecard,click on  send button,verify warning message and 
	 * stamps used text,click on send continue button and verify 
	 * confirmation message and  confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-19 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28(Enter "
			+ "email message body,click on attach ecard,select random ecard catagory,"
			+ "attach one random ecard,click on remove link from attach page,verify "
			+ "remove link is not present,attach one random ecard,click on  continue "
			+ "button,click on remove link from main page,verify remove  link is not "
			+ "present,click on attach ecard,select random ecard,click on  send button,"
			+ "verify warning message and stamps used text.)")
	public void attachRemoveAttachEcardForTC19AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().clickAttachECard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().clickRemoveLinkFromAttachPage();
		jpayEmail().email().VerifyRemoveLinkIsNotVisibleAttachPage();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickRemoveLinkFromMainPage();
		jpayEmail().email().VerifyRemoveLinkIsNotVisibleMainPage();
		jpayEmail().email().clickAttachECard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_2);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::(Click on send continue "
			+ "button and verify confirmation message and confirmation number,"
			+ "Click on email link.)")
	public void sendEmailVerifyAndClickEmailTab5() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
	}
	
	/*********************************************************************************
	 * 
	 * Enter email message body,click on attach ecard,select random ecard 
	 * catagory,attach one random ecard,click on continue button,wait for 
	 * autosave,verify autosave message,click on  send button,verify 
	 * warning message and stamps used text,click on send continue 
	 * button and verify confirmation message and  confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-20 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21(Enter email message body,click on "
			+ "attach ecard,select random ecard catagory,attach one random ecard,click "
			+ "on continue button,wait for autosave,verify autosave message,click on send "
			+ "button,verify warning message and stamps used text.)")
	public void attachSingleEcardForTC20AndVerifyAutosave() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().clickAttachECard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().pause(61000);
		jpayEmail().email().verifyAutosaveMessage();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_2);
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::(Click on send continue "
			+ "button and verify confirmation message and confirmation number,"
			+ "Click on email link.)")
	public void sendEmailVerifyAndClickEmailTab6() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
	}
	
	
	/*********************************************************************************
	 * 
	 * Enter filter(flag) email message body,click on attach ecard,select random ecard 
	 * catagory,attach one random ecard,click on continue button,wait for 
	 * autosave,verify autosave message,click on  send button,verify 
	 * warning message and stamps used text,click on send continue 
	 * button and verify confirmation message and  confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-21 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20(Enter filter(flag) email message "
			+ "body,click on attach ecard,select random ecard catagory,attach one random "
			+ "ecard,click on continue button,wait for autosave,verify autosave message,"
			+ "click on send button,verify warning message and stamps used text.)")
	public void attachEcardWithFilterForTC21AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgFilter);
		jpayEmail().email().clickAttachECard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_2);
		
	}

	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::(Click on send continue "
			+ "button and verify confirmation message and confirmation number,"
			+ "Click on email link.)")
	public void sendEmailVerifyAndClickEmailTab7() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
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

	@Test(enabled = true, priority = 18, description = "TestCases::WTC-22 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21(Enter email message body,"
			+ "click on attach image,click on choose file,enter filepath in the file "
			+ "explorer,click on open,click on attach,click on continue button,click "
			+ "on send button,verify warning message and stamps used text.)")
	public void attachSingleImageForTC22AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_2);
		
	}

	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 19, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::(Click on send continue "
			+ "button and verify confirmation message and confirmation number,"
			+ "Click on email link.)")
	public void sendEmailVerifyAndClickEmailTab8() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
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

	@Test(enabled = true, priority = 20, description = "TestCases::WTC-23 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27(Enter email message body,"
			+ "click on attach image,click on choose file,enter filepath in the file "
			+ "explorer,click on open,click on attach,click on choose file,enter filepath "
			+ "in the file explorer,click on open,click on attach,click on continue button,"
			+ "click on send button,verify warning message and stamps used text.)")
	public void attachMultipleImageForTC23AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenameGif);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenameGif);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenameJpeg);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenameJpeg);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_4);
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 21, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::(Click on send continue "
			+ "button and verify confirmation message and confirmation number,"
			+ "Click on email link.)")
	public void sendEmailVerifyAndClickEmailTab9() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
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

	@Test(enabled = true, priority = 22, description = "TestCases::WTC-24 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21,22(Enter email message body,"
			+ "check prepaid checkbox,click on attach image,click on choose file,enter "
			+ "filepath in the file explorer,click on open,click on attach,click on continue "
			+ "button,click on send button,verify warning message and stamps used text.)")
	public void attachSinglePrepaidImageForTC24AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().checkPrepaidBox();
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_3);
		
	}

	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 23, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::(Click on send continue "
			+ "button and verify confirmation message and confirmation number,"
			+ "Click on email link.)")
	public void sendEmailVerifyAndClickEmailTab10() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
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

	@Test(enabled = true, priority = 24, description = "TestCases::WTC-25 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28(Enter email message body,"
			+ "check prepaid checkbox,click on attach image,click on choose file,enter filepath "
			+ "in the file explorer,click on open,click on attach,click on choose file,enter filepath "
			+ "in the file explorer,click on open,click on attach,click on continue button,"
			+ "click on send button,verify warning message and stamps used text.)")
	public void attachMultiplePrepaidImageForTC25AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().checkPrepaidBox();
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenameGif);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenameGif);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenameJpeg);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenameJpeg);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_5);
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 25, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::(Click on send continue "
			+ "button and verify confirmation message and confirmation number,"
			+ "Click on email link.)")
	public void sendEmailVerifyAndClickEmailTab11() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
	}
	
	/*********************************************************************************
	 * 
	 * Enter email message body,click on attach ecard,select random ecard 
	 * catagory,attach one random ecard,click on continue button,wait for 
	 * autosave,verify autosave message,click on  send button,verify 
	 * warning message and stamps used text,click on send continue 
	 * button and verify confirmation message and  confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 26, description = "TestCases::WTC-20 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21(Enter email message body,"
			+ "check prepaid checkbox,click on attach image,click on choose file,enter "
			+ "filepath in the file explorer,click on open,click on attach,,click "
			+ "on continue button,wait for autosave,verify autosave message,click on send "
			+ "button,verify warning message and stamps used text.)")
	public void attachSingleImageForTC26AndVerifyAutosave() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenameJpeg);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenameJpeg);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().pause(62000);
		jpayEmail().email().verifyAutosaveMessage();
		
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 27, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::(Click on send continue "
			+ "button and verify confirmation message and confirmation number,"
			+ "Click on email link.)")
	public void sendEmailVerifyAndClickEmailTab12() {

		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_2);
		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
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

	@Test(enabled = true, priority = 28, description = "TestCases::WTC-27 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26(Enter email message body,"
			+ "check prepaid checkbox,click on attach image,click on choose file,enter "
			+ "filepath in the file explorer,click on open,click on attach,click on continue "
			+ "button,click on send button,verify warning message and stamps used text.)")
	public void attachSinglePrepaidEcardImageForTC27AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgMultiplePage);
		jpayEmail().email().checkPrepaidBox();
		jpayEmail().email().clickAttachECard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenameJpeg);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_6);
		
	}

	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 29, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::(Click on send continue "
			+ "button and verify confirmation message and confirmation number,"
			+ "Click on email link.)")
	public void sendEmailVerifyAndClickEmailTab13() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
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

	@Test(enabled = true, priority = 30, description = "TestCases::WTC-28 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21,22(Enter email message body,"
			+ "click on attach image,click on choose file,enter filepath in the file "
			+ "explorer,click on open,click on attach,verify wrong type file attachment "
			+ "error message,click on continue button,click "
			+ "on send button,verify warning message and stamps used text.)")
	public void attachSingleWrongFormatImageForTC28AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenameNegativeTesting);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenameNegativeTesting);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().verifyWrongFormatFileAttachErrorMsg(fileAttachErrorMessage);
		jpayEmail().email().clickAttachEcardContinueButton();
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

	@Test(enabled = true, priority = 31, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::(Click on send continue "
			+ "button and verify confirmation message and confirmation number,"
			+ "Click on email link.)")
	public void sendEmailVerifyAndClickEmailTab14() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
	}
	
	
	/*********************************************************************************
	 * 
	 * Enter email message body,click on attach ecard,select random ecard 
	 * catagory,attach one random ecard,click on remove link from attach 
	 * page,verify remove link is not present,attach one random ecard,
	 * click on  continue button,click on remove link from main page,
	 * verify remove  link is not present,click on attach ecard,select 
	 * random ecard,click on  send button,verify warning message and 
	 * stamps used text,click on send continue button and verify 
	 * confirmation message and  confirmation number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 32, description = "TestCases::WTC-29 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28(Enter "
			+ "email message body,click on attach ecard,select random ecard catagory,"
			+ "attach one random ecard,click on remove link from attach page,verify "
			+ "remove link is not present,attach one random ecard,click on  continue "
			+ "button,click on remove link from main page,verify remove  link is not "
			+ "present,click on attach ecard,select random ecard,click on  send button,"
			+ "verify warning message and stamps used text.)")
	public void attachRemoveAttachImageForTC29AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickRemoveLinkFromAttachPage();
		jpayEmail().email().VerifyRemoveLinkIsNotVisibleAttachPage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickRemoveLinkFromMainPage();
		jpayEmail().email().VerifyRemoveLinkIsNotVisibleMainPage();
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_2);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 33, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::(Click on send continue "
			+ "button and verify confirmation message and confirmation number,"
			+ "Click on email link.)")
	public void sendEmailVerifyAndClickEmailTab15() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
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

	@Test(enabled = true, priority = 34, description = "TestCases::WTC-27 :: Design "
			+ "Steps::9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26(Enter email message body,"
			+ "check prepaid checkbox,click on attach image,click on choose file,enter "
			+ "filepath in the file explorer,click on open,click on attach,click on continue "
			+ "button,click on send button,verify warning message and stamps used text.)")
	public void attachSinglePrepaidEcardImageForTC30AndVerify() {

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
		
	}

	/*********************************************************************************
	 * 
	 * Click on send continue button and verify confirmation message 
	 * and confirmation number.Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 35, description = "TestCases::WTC-15,16,17,18,19,20,"
			+ "21,22,23,24,25,26,27,28,29,30 :: Design Steps::(Click on send continue "
			+ "button and verify confirmation message and confirmation number,"
			+ "Click on email link.)")
	public void sendEmailVerifyAndClickEmailTab16() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 36, description = "TestCases::WTC-14 :: Design "
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
		return new Object[] { new EmailWTC_15To30Test(data) };
	}
	
	
	public EmailWTC_15To30Test(Map<String, String> data) {
		super(data);
		
		
		
		username = data.get("username");
		password =data.get("password");
		variation = data.get("variation");
		emailMsg = data.get("emailMsg");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		stampsUsedOne = data.get("stampsUsedOne");
		stampsUsedTwo = data.get("stampsUsedTwo");
		stampsUsedThree = data.get("stampsUsedThree");
		stampsUsedFour = data.get("stampsUsedFour");
		stampsUsedFive = data.get("stampsUsedFive");
		emailMsgFilter = data.get("emailMsgFilter");
		filenamePng = data.get("filenamePng");
		filenameGif = data.get("filenameGif");
		filenameJpeg = data.get("filenameJpeg");
		emailMsgMultiplePage = data.get("emailMsgMultiplePage");
		stampsUsedEight = data.get("stampsUsedEight");
		filenameNegativeTesting = data.get("filenameNegativeTesting");
		fileAttachErrorMessage = data.get("fileAttachErrorMessage");
		
		
	}

	


}
