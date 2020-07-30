package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_127Test extends BaseTestObject {

	
	
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
	private String emailMsgWithAttachment1;
	private String warnMsg;
	private String conMsg;
	private String emailMsgWithAttachment2;
	private String pinCode;
	private String passwordFacility;
	private String letterStatusPhotoApproval;
	private String filenamePng;
	
	public static String Facility_Username;
	public static String Letter_Confirmation_Image;
	public static String Letter_Confirmation_EcardImage;
	
	
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC127 - (Letter must go to "Photo Approval" in facility)
	 * Author :: shasan(Shahriar Hasan) , 
	 * Date :: DataFile :: 
	 * Email.xlsx ,
	 * DataSheet :: WTC127      Status :: Completed
	 * 
	 **************************************************************************************************/

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-127::Design Steps"
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
	 * click permloc,select permloc,uncheck auto release inbound mail,auto release 
	 * video inbound mail and auto release ecard inbound mail checkbox,click on 
	 * update button and verify the update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-127::Design Steps"
			+ "::7,8,9,10,11,12,13,14,15,16,17,18,19(Click on Administration link,click "
			+ "on facility management link,verify header text,click manage inbound mail "
			+ "settings,click choose agency,select facility,click permloc,select permloc,"
			+ "uncheck auto release inbound mail,auto release video inbound mail and auto "
			+ "release ecard inbound mail checkbox,click on update button and verify the "
			+ "update message.)")
	public void editManageInboundSettingsOfStagingAndVerify1() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageInboundSettingsLink();
		jpayStaging().stagingAdmin().clickMISChooseAgency();
		jpayStaging().stagingAdmin().selectMISFacility(facility,environment);
		jpayStaging().stagingAdmin().clickMISChoosePerm();
		jpayStaging().stagingAdmin().selectMISPermLoc(permLoc);
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-127::Design Steps"
			+ "::20,21,22(Click on Administration link,click on sign out button and "
			+ "verify personal details.)")
	public void logoutFromStaging() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);

	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-127:: DesignSteps"
			+ "::23,24,25,26,27,28,29(Enter username,password,click login button and "
			+ "verify title of the page.)")
	public void loginToJpayAndVerify1() {

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

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-127:: DesignSteps"
			+ "::30,31(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		Facility_Username = jpayEmail().login().setFacilityUsername();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,attach image,click send button,
	 * verify email warning message,click on continue button,verify 
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-127:: DesignSteps"
			+ "::32,33,34,35,36,37,38,39,40(Enter plain email message in the message "
			+ "body,attach image,click send button,verify email warning message,"
			+ "check the used stamps.)")
	public void writeEmailWithImageAttachmentAndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgWithAttachment1);
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

	@Test(enabled = true, priority = 7, description =  "TestCases::WTC-127::DesignSteps"
			+ "::41,42,43(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailWithImageAttachmentAndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Letter_Confirmation_Image = jpayEmail().email().getConfirmationNumber();
	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,attach ecrad,
	 * attach image,click send button,verify email warning message and check the used stamps.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-127::DesignSteps::"
			+ "44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59(Click email link,enter "
			+ "email message in the message body,attach ecrad,attach image,click send "
			+ "button,verify email warning message and check the used stamps.)")
	public void writeEmailWithEcardImageAttachmentAndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgWithAttachment2);
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
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_3);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description =  "TestCases::WTC-127::DesignSteps::"
			+ "60,61,62(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailWithEcardImageAttachmentAndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Letter_Confirmation_EcardImage = jpayEmail().email().getConfirmationNumber();
	}
	
	

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-127::DesignSteps"
			+ "::63,64,65(Click on Home link,verify page title and click logout.)")
	public void logoutFromJpay1() {
		
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

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-127:: Design "
			+ "Steps::66,67,68,69,70(Navigate to facility site,enter username,pincode,"
			+ "password and click on login button .)")
	public void loginToFacilityAndVerify1() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility);
		jpayFacility().facilityLogin().enterUsername(Facility_Username);
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

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-127:: Design Steps"
			+ "::71,72,73,74,75,76,77,78(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void verifyLetterStatusOfLetterWithImageAttachment() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().pause(180000);
		jpayFacility().facilityEmail().enterSearchContent(Letter_Confirmation_Image);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusPhotoApproval);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-127:: Design Steps"
			+ "::79,80,81,82,83,84,85,86(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void verifyLetterStatusOfLetterWithEcardImageAttachment() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().pause(60000);
		jpayFacility().facilityEmail().enterSearchContent(Letter_Confirmation_EcardImage);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusPhotoApproval);
		
	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-127:: Design "
			+ "Steps::87(Click sign out button .)")
	public void logoutFromFacility() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-127::Design Steps"
			+ "::88,89,90,91,92,93(Navigate to Staging website,verify personal and admin "
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

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-127::Design Steps"
			+ "::94,95,96,97,98,99,100,101,102,103,104,105,106(Click on Administration link,"
			+ "click on facility management link,verify header text,click manage inbound mail "
			+ "settings,click choose agency,select facility,click permloc,select permloc,"
			+ "uncheck auto release inbound mail,auto release video inbound mail and auto "
			+ "release ecard inbound mail checkbox,click on update button and verify the "
			+ "update message.)")
	public void editManageInboundSettingsOfStagingAndVerify2() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageInboundSettingsLink();
		jpayStaging().stagingAdmin().clickMISChooseAgency();
		jpayStaging().stagingAdmin().selectMISFacility(facility,environment);
		jpayStaging().stagingAdmin().clickMISChoosePerm();
		jpayStaging().stagingAdmin().selectMISPermLoc(permLoc);
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

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-127::Design Steps"
			+ "::107,108,109(Click on Administration link,click on sign out button and "
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
		return new Object[] { new EmailWTC_127Test(data) };
	}

	public EmailWTC_127Test(Map<String, String> data) {
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
		emailMsgWithAttachment1 = data.get("emailMsgWithAttachment1");//
		warnMsg = data.get("warnMsg");
		conMsg = data.get("conMsg");
		emailMsgWithAttachment2 = data.get("emailMsgWithAttachment2");
		pinCode = data.get("pinCode");
		passwordFacility = data.get("passwordFacility");
		filenamePng = data.get("filenamePng");
		letterStatusPhotoApproval = data.get("letterStatusPhotoApproval");
		
		

	}

	
	
}
