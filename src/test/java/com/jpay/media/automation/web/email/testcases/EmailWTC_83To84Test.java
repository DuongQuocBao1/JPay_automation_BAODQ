package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_83To84Test extends BaseTestObject {

	
	
	private String variation;
	private String personalDetails;
	private String adminSystem;
	private String username;
	private String password;
	private String facility;
	private String facilityManagementMainPagetext;
	private String permLoc;
	private String updateMessage;
	private String usernameJpay;
	private String passwordJpay;
	private String warnMsg;
	private String conMsg;
	private String pinCode;
	private String passwordFacility;
	private String letterStatusReadyToPrint;
	private String sentToSecurity;
	private String emailMsgPlain;
	private String emailMsgEcard;
	private String emailMsgFlag;
	private String emailMsgImage;
	private String censored;
	private String letterStatusSentToSecurity;
	private String letterStatusFlag;
	private String RequiresApproval;
	private String filenamePng;
	private String letterStatusCensored;
	
	public static String Facility_Username_83;
	public static String Letter_Confirmation_Plain_83;
	public static String Letter_Confirmation_Ecard_83;
	public static String Letter_Confirmation_Flag_83;
	public static String Letter_Confirmation_Image_83;
	
	public static String Facility_Username_84;
	public static String Letter_Confirmation_Plain_84;
	public static String Letter_Confirmation_Ecard_84;
	public static String Letter_Confirmation_Flag_84;
	public static String Letter_Confirmation_Image_84;
	
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC83tTo84 - (83.Testing all status with Auto OFF and Sent to Security  for Louisiana
	 *                        84.Testing all status with Auto OFF and Sent to Censored  for Louisiana
	 *                        85.Stamps cost setting should work fine  in staging and www (Checking for image)
	 *                        86.Negative testing enable/disable attachment and Max attach limits in staging)
	 * Author :: shasan(Shahriar Hasan) , 
	 * Date :: DataFile :: 
	 * Email.xlsx ,
	 * DataSheet :: WTC83tTo84      Status :: Completed
	 * 
	 **************************************************************************************************/

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-83,84 ::Design Steps"
			+ "::1,2,3,4,5,6(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void testStart() {

		jpayStaging().stagingLogin().loadURL(envUrlStaging, variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on facility management link,verify header 
	 * text,click manage inbound mail settings,click choose agency,select facility,
	 * click permloc,select permloc,select mail is flag by word,inmate,sender,
	 * attachment and suspecious content to sent to security,uncheck auto release 
	 * inbound mail,auto release video inbound mail and auto release ecard inbound 
	 * mail checkbox,click on update button and verify the update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-83 ::Design Steps"
			+ "::7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24(Click on Administration "
			+ "link,click on facility management link,verify header text,click manage inbound "
			+ "mail settings,click choose agency,select facility,click permloc,select permloc,"
			+ "select mail is flag by word,inmate,sender,attachment and suspecious content "
			+ "to sent to security,uncheck auto release inbound mail,auto release video inbound "
			+ "mail and auto release ecard inbound mail checkbox,click on update button and "
			+ "verify the update message.)")
	public void editManageInboundSettingsForTC83AndVerify1() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageInboundSettingsLink();
		jpayStaging().stagingAdmin().clickMISChooseAgency();
		jpayStaging().stagingAdmin().selectMISFacility(facility,environment);
		jpayStaging().stagingAdmin().clickMISChoosePerm();
		jpayStaging().stagingAdmin().selectMISPermLoc(permLoc);
		jpayStaging().stagingAdmin().selectMISMailIsFlagByWord(sentToSecurity);
		jpayStaging().stagingAdmin().selectMISMailIsFlagByInmate(sentToSecurity);
		jpayStaging().stagingAdmin().selectMISMailIsFlagBySender(sentToSecurity);
		jpayStaging().stagingAdmin().selectMISMailIsFlagByAttachment(sentToSecurity);
		jpayStaging().stagingAdmin().selectMISMailIsFlagBySuspeciousContent(sentToSecurity);
		jpayStaging().stagingAdmin().uncheckMISAutoReleaseInboundMail();
		jpayStaging().stagingAdmin().uncheckMISAutoReleaseVideoInboundMail();
		jpayStaging().stagingAdmin().uncheckMISAutoReleaseEcardInboundMail();
		jpayStaging().stagingAdmin().clickMISUpdateButton();
		jpayStaging().stagingAdmin().verifyMISUpdateMessage(updateMessage);

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-83::Design Steps"
			+ "::25,26,27(Click on Administration link,click on sign out button and "
			+ "verify personal details.)")
	public void logoutFromStagingForTC83() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);

	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-83 :: Design "
			+ "Steps::28,29,30,31,32,33,34(Enter username,password,click login button and "
			+ "verify title of the page.)")
	public void loginToJpayForTC83AndVerify() {

		jpayEmail().login().loadURL(envUrlJpay,variation);
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

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-83 :: Design "
			+ "Steps::35,36(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTabForTC83() {

		jpayEmail().login().selectRandomInmate();
		Facility_Username_83 = jpayEmail().login().setFacilityUsername();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send button,
	 * verify email warning message,click on continue button,verify 
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-83 :: Design "
			+ "Steps::37,38,39,40(Enter plain email message in the message body,click "
			+ "send button,verify email warning message,check the used stamps.)")
	public void writePlainEmailForTC83AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgPlain);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);//1 stamp(s) to send this letter
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description =  "TestCases::WTC-83 ::DesignSteps"
			+ "::41,42,43(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailPlainForTC83AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Letter_Confirmation_Plain_83 = jpayEmail().email().getConfirmationNumber();
	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click attach ecrad button,select random ecard category,select random ecard,click ecard continue button,click send button,verify email warning message,click on continue button,verify  email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-83 :: Design "
			+ "Steps::44,45,46,47,48,49,50,51,52,53(Click email link,enter email message "
			+ "in the message body,click attach ecrad button,select random ecard category,"
			+ "select random ecard,click ecard continue button,click send button,verify "
			+ "email warning message,click on continue button,verify  email confirmation "
			+ "message and number.)")
	public void writeEmailEcardForTC83AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgEcard);
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
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description =  "TestCases::WTC-82 ::DesignSteps"
			+ "::54,55,56(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailEcardForTC83AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Letter_Confirmation_Ecard_83 = jpayEmail().email().getConfirmationNumber();
	}
	
	

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send button,
	 * verify email warning message,click on continue button,verify 
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-83 :: Design "
			+ "Steps::57,58,59,60,61,62(Enter plain email message in the message body,click "
			+ "send button,verify email warning message,check the used stamps.)")
	public void writeEmailFlagForTC83AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgFlag);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);//1 stamp(s) to send this letter
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description =  "TestCases::WTC-83 ::DesignSteps"
			+ "::63,64,65(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailFlagForTC83AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Letter_Confirmation_Flag_83 = jpayEmail().email().getConfirmationNumber();
	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click attach ecrad 
	 * button,select random ecard category,select random ecard,click ecard continue 
	 * button,click send button,verify email warning message,click on continue 
	 * button,verify  email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-83 :: Design "
			+ "Steps::66,67,68,69,70,71,72,73,74,75(Click email link,enter email message "
			+ "in the message body,click attach ecrad button,select random ecard category,"
			+ "select random ecard,click ecard continue button,click send button,verify "
			+ "email warning message,click on continue button,verify  email confirmation "
			+ "message and number.)")
	public void writeEmailImageForTC83AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgImage);
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
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description =  "TestCases::WTC-83 ::DesignSteps"
			+ "::76,77,78(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailImageForTC83AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Letter_Confirmation_Image_83 = jpayEmail().email().getConfirmationNumber();
	}
	
	

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-83 :: Design "
			+ "Steps::79,80,81(Click on Home link,verify page title and click logout.)")
	public void logoutFromJpayForTC83() {
		
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter username,pincode,password,click login button and verify Facility 
	 * system and Communications tab is absent.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-83 :: Design "
			+ "Steps::82,83,84,85,86(Navigate to facility site,enter username,pincode,"
			+ "password and click on login button .)")
	public void loginToFacilityForTC83AndVerify() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility);
		jpayFacility().facilityLogin().enterUsername(Facility_Username_83);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordFacility);
		jpayFacility().facilityLogin().clickLoginButton();
		
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-83 :: Design Steps"
			+ ":87,88,89,90,91,92,93,94(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void verifyStatusOfPlainEmailForTC83() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().pause(120000);
		jpayFacility().facilityEmail().enterSearchContent(Letter_Confirmation_Plain_83);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusReadyToPrint);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-83 :: Design Steps"
			+ "::95,96,97,98,99,100,102,103(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void verifyStatusOfEcardEmailForTC83() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().pause(60000);
		jpayFacility().facilityEmail().enterSearchContent(Letter_Confirmation_Ecard_83);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusSentToSecurity);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 18, description = "TestCases::WTC-83 :: Design Steps"
			+ ":103,104,105,106,107,108,109,110(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void verifyStatusOfFlagEmailForTC83() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Letter_Confirmation_Flag_83);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusFlag);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 19, description = "TestCases::WTC-83 :: Design Steps"
			+ "::111,112,113,114,115,116,117,118(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void verifyStatusOfImageEmailForTC83() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Letter_Confirmation_Image_83);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusSentToSecurity);
		
	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 20, description = "TestCases::WTC-83 :: Design "
			+ "Steps::119(Click sign out button .)")
	public void logoutFromFacilityForTC83() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 21, description = "TestCases::WTC-84 ::Design Steps"
			+ "::1,2,3,4,5,6(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void loginToStagingForTC84() {

		jpayStaging().stagingLogin().loadURL(envUrlStaging, variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on facility management link,verify header 
	 * text,click manage inbound mail settings,click choose agency,select facility,
	 * click permloc,select permloc,select mail is flag by word,inmate,sender,
	 * attachment and suspecious content to sent to security,uncheck auto release 
	 * inbound mail,auto release video inbound mail and auto release ecard inbound 
	 * mail checkbox,click on update button and verify the update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 22, description = "TestCases::WTC-84 ::Design Steps"
			+ "::7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24(Click on Administration "
			+ "link,click on facility management link,verify header text,click manage inbound "
			+ "mail settings,click choose agency,select facility,click permloc,select permloc,"
			+ "select mail is flag by word,inmate,sender,attachment and suspecious content "
			+ "to sent to security,uncheck auto release inbound mail,auto release video inbound "
			+ "mail and auto release ecard inbound mail checkbox,click on update button and "
			+ "verify the update message.)")
	public void editManageInboundSettingsForTC84AndVerify1() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageInboundSettingsLink();
		jpayStaging().stagingAdmin().clickMISChooseAgency();
		jpayStaging().stagingAdmin().selectMISFacility(facility,environment);
		jpayStaging().stagingAdmin().clickMISChoosePerm();
		jpayStaging().stagingAdmin().selectMISPermLoc(permLoc);
		jpayStaging().stagingAdmin().selectMISMailIsFlagByWord(censored);
		jpayStaging().stagingAdmin().selectMISMailIsFlagByInmate(censored);
		jpayStaging().stagingAdmin().selectMISMailIsFlagBySender(censored);
		jpayStaging().stagingAdmin().selectMISMailIsFlagByAttachment(censored);
		jpayStaging().stagingAdmin().selectMISMailIsFlagBySuspeciousContent(censored);
		jpayStaging().stagingAdmin().uncheckMISAutoReleaseInboundMail();
		jpayStaging().stagingAdmin().uncheckMISAutoReleaseVideoInboundMail();
		jpayStaging().stagingAdmin().uncheckMISAutoReleaseEcardInboundMail();
		jpayStaging().stagingAdmin().clickMISUpdateButton();
		jpayStaging().stagingAdmin().verifyMISUpdateMessage(updateMessage);

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 23, description = "TestCases::WTC-84::Design Steps"
			+ "::25,26,27(Click on Administration link,click on sign out button and "
			+ "verify personal details.)")
	public void logoutFromStagingForTC84() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);

	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 24, description = "TestCases::WTC-84 :: Design "
			+ "Steps::28,29,30,31,32,33,34(Enter username,password,click login button and "
			+ "verify title of the page.)")
	public void loginToJpayForTC84AndVerify() {

		jpayEmail().login().loadURL(envUrlJpay,variation);
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

	@Test(enabled = true, priority = 25, description = "TestCases::WTC-84 :: Design "
			+ "Steps::35,36(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTabForTC84() {

		jpayEmail().login().selectRandomInmate();
		Facility_Username_84 = jpayEmail().login().setFacilityUsername();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send button,
	 * verify email warning message,click on continue button,verify 
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 26, description = "TestCases::WTC-84 :: Design "
			+ "Steps::37,38,39,40(Enter plain email message in the message body,click "
			+ "send button,verify email warning message,check the used stamps.)")
	public void writePlainEmailForTC84AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgPlain);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);//1 stamp(s) to send this letter
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 27, description =  "TestCases::WTC-84 ::DesignSteps"
			+ "::41,42,43(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailPlainForTC84AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Letter_Confirmation_Plain_84 = jpayEmail().email().getConfirmationNumber();
	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click attach ecrad button,select random ecard category,select random ecard,click ecard continue button,click send button,verify email warning message,click on continue button,verify  email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 28, description = "TestCases::WTC-84 :: Design "
			+ "Steps::44,45,46,47,48,49,50,51,52,53(Click email link,enter email message "
			+ "in the message body,click attach ecrad button,select random ecard category,"
			+ "select random ecard,click ecard continue button,click send button,verify "
			+ "email warning message,click on continue button,verify  email confirmation "
			+ "message and number.)")
	public void writeEmailEcardForTC84AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgEcard);
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
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 29, description =  "TestCases::WTC-84 ::DesignSteps"
			+ "::54,55,56(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailEcardForTC84AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Letter_Confirmation_Ecard_84 = jpayEmail().email().getConfirmationNumber();
	}
	
	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send button,
	 * verify email warning message,click on continue button,verify 
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 30, description = "TestCases::WTC-84 :: Design "
			+ "Steps::57,58,59,60,61,62(Enter plain email message in the message body,click "
			+ "send button,verify email warning message,check the used stamps.)")
	public void writeEmailFlagForTC84AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgFlag);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);//1 stamp(s) to send this letter
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 31, description =  "TestCases::WTC-84 ::DesignSteps"
			+ "::63,64,65(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailFlagForTC84AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Letter_Confirmation_Flag_84 = jpayEmail().email().getConfirmationNumber();
	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click attach ecrad 
	 * button,select random ecard category,select random ecard,click ecard continue 
	 * button,click send button,verify email warning message,click on continue 
	 * button,verify  email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 32, description = "TestCases::WTC-84 :: Design "
			+ "Steps::66,67,68,69,70,71,72,73,74,75(Click email link,enter email message "
			+ "in the message body,click attach ecrad button,select random ecard category,"
			+ "select random ecard,click ecard continue button,click send button,verify "
			+ "email warning message,click on continue button,verify  email confirmation "
			+ "message and number.)")
	public void writeEmailImageForTC84AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgImage);
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
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 33, description =  "TestCases::WTC-84 ::DesignSteps"
			+ "::76,77,78(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailImageForTC84AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Letter_Confirmation_Image_84 = jpayEmail().email().getConfirmationNumber();
	}
	
	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 34, description = "TestCases::WTC-84 :: Design "
			+ "Steps::79,80,81(Click on Home link,verify page title and click logout.)")
	public void logoutFromJpayForTC84() {
		
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
		
	}

	
	/*********************************************************************************
	 * 
	 * Enter username,pincode,password,click login button and verify Facility 
	 * system and Communications tab is absent.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 35, description = "TestCases::WTC-84 :: Design "
			+ "Steps::82,83,84,85,86(Navigate to facility site,enter username,pincode,"
			+ "password and click on login button .)")
	public void loginToFacilityForTC84AndVerify() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility);
		jpayFacility().facilityLogin().enterUsername(Facility_Username_84);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordFacility);
		jpayFacility().facilityLogin().clickLoginButton();
		
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 36, description = "TestCases::WTC-84 :: Design Steps"
			+ ":87,88,89,90,91,92,93,94(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void verifyStatusOfPlainEmailForTC84() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().pause(120000);
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Letter_Confirmation_Plain_84);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusReadyToPrint);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 37, description = "TestCases::WTC-84 :: Design Steps"
			+ "::95,96,97,98,99,100,102,103(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void verifyStatusOfEcardEmailForTC84() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().pause(60000);
		jpayFacility().facilityEmail().enterSearchContent(Letter_Confirmation_Ecard_84);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusCensored);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 38, description = "TestCases::WTC-84 :: Design Steps"
			+ ":103,104,105,106,107,108,109,110(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void verifyStatusOfFlagEmailForTC84() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Letter_Confirmation_Flag_84);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusFlag);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 39, description = "TestCases::WTC-84 :: Design Steps"
			+ "::111,112,113,114,115,116,117,118(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void verifyStatusOfImageEmailForTC84() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Letter_Confirmation_Image_84);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusCensored);
		
	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 40, description = "TestCases::WTC-83 :: Design "
			+ "Steps::119(Click sign out button .)")
	public void logoutFromFacilityForTC84() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 41, description = "TestCases::WTC-83,84 ::Design Steps"
			+ "::120,121,122,123,124,125(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void loginToStaging() {

		jpayStaging().stagingLogin().loadURL(envUrlStaging, variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();

	}
	
	/*********************************************************************************
	 * 
	 * Click on Administration link,click on facility management link,verify header 
	 * text,click manage inbound mail settings,click choose agency,select facility,
	 * click permloc,select permloc,uncheck auto release inbound mail,auto release 
	 * video inbound mail and auto release ecard inbound mail checkbox,click on 
	 * update button and verify the update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 42, description = "TestCases::WTC-83,84 ::Design Steps"
			+ "::126,127,128,129,130,131,132,133,134,134,135,136,137,138,139,140,141,142,"
			+ "143,144(Click on Administration link,click on facility management link,verify "
			+ "header text,click manage inbound mail settings,click choose agency,select "
			+ "facility,click permloc,select permloc,uncheck auto release inbound mail,"
			+ "auto release video inbound mail and auto release ecard inbound mail checkbox,"
			+ "click on update button and verify the update message.)")
	public void editManageInboundSettingsOfStagingAndVerify2() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageInboundSettingsLink();
		jpayStaging().stagingAdmin().clickMISChooseAgency();
		jpayStaging().stagingAdmin().selectMISFacility(facility,environment);
		jpayStaging().stagingAdmin().clickMISChoosePerm();
		jpayStaging().stagingAdmin().selectMISPermLoc(permLoc);
		jpayStaging().stagingAdmin().selectMISMailIsFlagByWord(RequiresApproval);
		jpayStaging().stagingAdmin().selectMISMailIsFlagByInmate(RequiresApproval);
		jpayStaging().stagingAdmin().selectMISMailIsFlagBySender(RequiresApproval);
		jpayStaging().stagingAdmin().selectMISMailIsFlagByAttachment(RequiresApproval);
		jpayStaging().stagingAdmin().selectMISMailIsFlagBySuspeciousContent(RequiresApproval);
		jpayStaging().stagingAdmin().checkMISAutoReleaseInboundMail();
		jpayStaging().stagingAdmin().checkMISAutoReleaseVideoInboundMail();
		jpayStaging().stagingAdmin().checkMISAutoReleaseEcardInboundMail();
		jpayStaging().stagingAdmin().clickMISUpdateButton();
		jpayStaging().stagingAdmin().verifyMISUpdateMessage(updateMessage);

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 43, description = "TestCases::WTC-83,84::Design Steps"
			+ "::145,146,147(Click on Administration link,click on sign out button and "
			+ "verify personal details.)")
	public void testEnd() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);

	}

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/

	@Factory(dataProvider = "getData", dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String> data) {
		return new Object[] { new EmailWTC_83To84Test(data) };
	}

	public EmailWTC_83To84Test(Map<String, String> data) {
		super(data);

		username = data.get("username");
		password = data.get("password");
		personalDetails = data.get("personalDetails");
		adminSystem = data.get("adminSystem");
		variation = data.get("variation");
		facilityManagementMainPagetext = data.get("facilityManagementMainPagetext");
		facility = data.get("facility");
		permLoc = data.get("permLoc");
		updateMessage = data.get("updateMessage");
		usernameJpay = data.get("usernameJpay");
		passwordJpay = data.get("passwordJpay");
		emailMsgEcard = data.get("emailMsgEcard");
		emailMsgPlain = data.get("emailMsgPlain");
		emailMsgFlag = data.get("emailMsgFlag");
		emailMsgImage = data.get("emailMsgImage");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("conMsg");
		pinCode = data.get("pinCode");
		passwordFacility = data.get("passwordFacility");
		letterStatusReadyToPrint = data.get("letterStatusReadyToPrint");
		letterStatusSentToSecurity = data.get("letterStatusSentToSecurity");
		letterStatusFlag = data.get("letterStatusFlag");
		sentToSecurity = data.get("sentToSecurity");
		censored = data.get("censored");
		RequiresApproval = data.get("RequiresApproval");
		letterStatusCensored = data.get("letterStatusCensored");
		filenamePng = data.get("filenamePng");
		

	}

	
	
}
