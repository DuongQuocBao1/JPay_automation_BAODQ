package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_106To108Test extends BaseTestObject{

	private String variation="";
	private String personalDetails="";
	private String username="";
	private String password="";
	private String adminSystem="";
	private String facility="";
	private String blockEmail;
	private String searchBlockedEmail;
	private String emailToBlock;
	private String blockSuccessMessage;
	private String blockExistMessage;
	private String invalidEmail;
	private String unblock;
	private String block;
	private String emailMsg;
	private String warnMsg;
	private String conMsg;
	private String usernameJpay;
	private String passwordJpay;
	
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC106To108 - (106.User shall be able to search outdated stamps in staging
	 *                             107.User shall be able to block and unblock an email ID
	 *                              108.User shall be able to send the letter using block email ID)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC106To108
	 * Status :: Completed
	 * 
	 **************************************************************************************************/
	
	
	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-106,107,108::"
			+ "DesignSteps::1,2,3,4,5,6(Navigate to Staging website,verify personal "
			+ "and admin details,enter username,password and click Login button.)")
	public void testStart() {
		
		jpayStaging().stagingLogin().loadURL(envUrlStaging,variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Administration link,click on expire stamps link,enter date to 
	 * search,select facility,click on preview expired stamps link,wait for 
	 * page load and verify number of accounts,total number and total value 
	 * of outdated stamps.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-106::DesignSteps"
			+ "::7,8,9,10,11,12,13,14,15(Click on Administration link,click on expire "
			+ "stamps link,enter date to search,select facility,click on preview expired "
			+ "stamps link,wait for page load and verify number of accounts,total number "
			+ "and total value of outdated stamps.)")
	public void searchOutdatedStampsForTC106AndVerify() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickExpireStampsLink();
		jpayStaging().stagingAdmin().enterESSearchDateCurrent();
		jpayStaging().stagingAdmin().selectESFacility(facility);
		jpayStaging().stagingAdmin().clickESPreviewExpiredStampsLink();
		jpayStaging().stagingAdmin().pause(30000);
		jpayStaging().stagingAdmin().verifyESOutdatedStampsAccountPresent();
		jpayStaging().stagingAdmin().verifyESOutdatedStampsTotalNumberPresent();
		jpayStaging().stagingAdmin().verifyESOutdatedStampsTotalValuePresent();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on output emails link,verify block and search blocked email header,
	 * enter email to block,click block email button,verify block success message,
	 * click block email button and verify block exist message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-107::DesignSteps"
			+ "::7,8,9,10,11,12,13,14(Click on output emails link,verify block and search "
			+ "blocked email header,enter email to block,click block email button,verify "
			+ "block success message,click block email button and verify block exist message.)")
	public void blockEmailForTC107AndVerify() {
		
		jpayStaging().stagingAdmin().clickOutputEmailsLink();
		jpayStaging().stagingAdmin().verifyOEBlockEmailHeaderVerify(blockEmail);
		jpayStaging().stagingAdmin().verifyOESearchBlockedEmailHeaderVerify(searchBlockedEmail);
		jpayStaging().stagingAdmin().enterOEBlockEmail(emailToBlock);
		jpayStaging().stagingAdmin().clickOEBlockEmailButton();
		jpayStaging().stagingAdmin().verifyOEBlockEmailSuccessMessage(blockSuccessMessage);
		jpayStaging().stagingAdmin().clickOEBlockEmailButton();
		jpayStaging().stagingAdmin().verifyOEBlockEmailExistMessageMessage(blockExistMessage);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on search blocked email,enter invalid email to search,click on go 
	 * button and verify search result is absent,enter email to search,click on 
	 * go button,verify serach result present,verify email and action,click on 
	 * unblock and verify action.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-107::DesignSteps"
			+ "::15,16,17,18,19,20,21,22,23,24,25,26(Click on search blocked email,enter "
			+ "invalid email to search,click on go button and verify search result is "
			+ "absent,enter email to search,click on go button,verify serach result "
			+ "present,verify email and action,click on unblock,click on go button "
			+ "and verify action.)")
	public void unblockEmailForTC107AndVerify() {
		
		jpayStaging().stagingAdmin().clickOESearchBlockedEmailLink();
		jpayStaging().stagingAdmin().enterOESearchBlockedEmail(invalidEmail);
		jpayStaging().stagingAdmin().clickOESearchBlockedEmailGoButton();
		jpayStaging().stagingAdmin().verifyOEBlockSearchResultAbsent();
		jpayStaging().stagingAdmin().enterOESearchBlockedEmail(emailToBlock);
		jpayStaging().stagingAdmin().clickOESearchBlockedEmailGoButton();
		jpayStaging().stagingAdmin().verifyOEBlockSearchResultPresent();
		jpayStaging().stagingAdmin().verifyOEBlockEmail(emailToBlock);
		jpayStaging().stagingAdmin().verifyOEBlockAction(unblock);
		jpayStaging().stagingAdmin().clickOEUnblockAction();
		jpayStaging().stagingAdmin().clickOESearchBlockedEmailGoButton();
		jpayStaging().stagingAdmin().verifyOEBlockAction(block);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on output emails link,verify block and search blocked email header,
	 * enter email to block,click block email button,verify block success message,
	 * click block email button and verify block exist message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-108::DesignSteps"
			+ "::7,8,9,10,11,12,13,14(Click on block emails link,verify block and search "
			+ "blocked email header,enter email to block,click block email button,verify "
			+ "block success message,click block email button and verify block exist message.)")
	public void blockEmailForTC108AndVerify() {
		
		jpayStaging().stagingAdmin().clickOEBlockEmailLink();
		jpayStaging().stagingAdmin().verifyOEBlockEmailHeaderVerify(blockEmail);
		jpayStaging().stagingAdmin().verifyOESearchBlockedEmailHeaderVerify(searchBlockedEmail);
		jpayStaging().stagingAdmin().enterOEBlockEmail(emailToBlock);
		jpayStaging().stagingAdmin().clickOEBlockEmailButton();
		jpayStaging().stagingAdmin().verifyOEBlockEmailSuccessMessage(blockSuccessMessage);
		jpayStaging().stagingAdmin().clickOEBlockEmailButton();
		jpayStaging().stagingAdmin().verifyOEBlockEmailExistMessageMessage(blockExistMessage);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click administration link,click signout button and verify.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-108::DesignSteps"
			+ "::15,16,17(Click administration link,click signout button and verify.)")
	public void logoutFromStagingForTC108() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-108:: Design "
			+ "Steps::18,19,20,21,22,23,24(Click on login link and verify page title.)")
	public void logonToWWWForTC108() {
		
		jpayEmail().login().loadURL(envUrlJpay);
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		jpayEmail().login().enterUsername(usernameJpay);
		jpayEmail().login().enterPassword(passwordJpay);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-108:: Design "
			+ "Steps::25,26(Select random inmate and click on email link.)")
	public void selectInmateForTC108() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}
	


	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click send button,verify email 
	 * warning message and check the used stamps.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-108:: Design "
			+ "Steps::27,28,29,30(Enter email message in the message body,click send "
			+ "button,verify email warning message and check the used stamps.)")
	public void writeEmailForTC108AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);//1 stamp(s) to send this letter
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description =  "TestCases::WTC-108::DesignSteps"
			+ "::31,32,33(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailForTC108AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
	}


	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-108:: Design "
			+ "Steps::34,35,36(Click on Home link,verify page title and click logout.)")
	public void logoutFromWWWForTC108() {
		
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
		
	}
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-108::DesignSteps"
			+ "::37,38,39,40,41,42(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void logonToStagingForTC108() {
		
		jpayStaging().stagingLogin().loadURL(envUrlStaging,variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on administration link,click on output emails link,Click on 
	 * search blocked email,enter invalid email to search,click on go 
	 * button and verify search result is absent,enter email to search,click on 
	 * go button,verify serach result present,verify email and action,click on 
	 * unblock and verify action.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-108::DesignSteps"
			+ "::43,44,45,46,47,48,49,50,51,52,53(Click on administration link,click "
			+ "on output emails link,click on search blocked email,enter invalid email "
			+ "to search,click on go button and verify search result is absent,enter "
			+ "email to search,click on go button,verify serach result present,verify "
			+ "email and action,click on unblock,click on go button and verify action.)")
	public void unblockEmailForTC108AndVerify() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickOutputEmailsLink();
		jpayStaging().stagingAdmin().clickOESearchBlockedEmailLink();
		jpayStaging().stagingAdmin().enterOESearchBlockedEmail(emailToBlock);
		jpayStaging().stagingAdmin().clickOESearchBlockedEmailGoButton();
		jpayStaging().stagingAdmin().verifyOEBlockSearchResultPresent();
		jpayStaging().stagingAdmin().verifyOEBlockEmail(emailToBlock);
		jpayStaging().stagingAdmin().verifyOEBlockAction(unblock);
		jpayStaging().stagingAdmin().clickOEUnblockAction();
		jpayStaging().stagingAdmin().clickOESearchBlockedEmailGoButton();
		jpayStaging().stagingAdmin().verifyOEBlockAction(block);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click administration link,click signout button and verify.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-106,107,108::"
			+ "DesignSteps::(Click administration link,click signout button and verify.)")
	public void endTest() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		
	}
	
	
	
	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_106To108Test(data) };
	}
	
	
	
	public EmailWTC_106To108Test(Map<String, String> data) {
		super(data);
		
		
		
		variation = data.get("variation");
		personalDetails = data.get("personalDetails");
		username = data.get("username");
		password = data.get("password");
		adminSystem = data.get("adminSystem");
		facility = data.get("facility");
		
		blockEmail = data.get("blockEmail");
		searchBlockedEmail = data.get("searchBlockedEmail");
		emailToBlock = data.get("emailToBlock");
		blockSuccessMessage = data.get("blockSuccessMessage");
		blockExistMessage = data.get("blockExistMessage");
		invalidEmail = data.get("invalidEmail");
		unblock = data.get("unblock");
		block = data.get("block");
		
		usernameJpay = data.get("usernameJpay");
		passwordJpay = data.get("passwordJpay");
		emailMsg = data.get("emailMsg");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("conMsg");
		
		
		
		
	}

}
