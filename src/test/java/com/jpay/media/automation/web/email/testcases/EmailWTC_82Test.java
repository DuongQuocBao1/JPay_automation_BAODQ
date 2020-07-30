package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_82Test extends BaseTestObject {

	
	
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
	private String emailMsgWithoutAttachment;
	private String warnMsg;
	private String conMsg;
	private String emailMsgWithAttachment;
	private String pinCode;
	private String passwordFacility;
	private String letterStatusReadyToPrint;
	private String letterStatusPhotoApproval;
	
	public static String Facility_Username;
	public static String Letter_Confirmation;
	public static String Letter_WithEcard_Confirmation;
	
	
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC82 - (82.Testing all status with Auto OFF and Sent to Require approval  for Louisiana)
	 * Author :: shasan(Shahriar Hasan) , 
	 * Date :: DataFile :: 
	 * Email.xlsx ,
	 * DataSheet :: WTC82      Status :: Completed
	 * 
	 **************************************************************************************************/

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-82 ::Design Steps"
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-82 ::Design Steps"
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-82::Design Steps"
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

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-82 :: Design "
			+ "Steps::23,24,25,26,27,28,29(Enter username,password,click login button and "
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

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-82 :: Design "
			+ "Steps::30,31(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		Facility_Username = jpayEmail().login().setFacilityUsername();
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

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-82 :: Design "
			+ "Steps::32,33,34,35(Enter plain email message in the message body,click "
			+ "send button,verify email warning message,check the used stamps.)")
	public void writeEmailWithoutAttachmentAndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgWithoutAttachment);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description =  "TestCases::WTC-82 ::DesignSteps"
			+ "::36,37,38(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailWithoutAttachmentAndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Letter_Confirmation = jpayEmail().email().getConfirmationNumber();
	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click attach ecrad button,select random ecard category,select random ecard,click ecard continue button,click send button,verify email warning message,click on continue button,verify  email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-82 :: Design "
			+ "Steps::39,40,41,42,43,44,45,46,47,48(Click email link,enter email message "
			+ "in the message body,click attach ecrad button,select random ecard category,"
			+ "select random ecard,click ecard continue button,click send button,verify "
			+ "email warning message,click on continue button,verify  email confirmation "
			+ "message and number.)")
	public void writeEmailWithAttachmentAndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgWithAttachment);
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
			+ "::49,50,51(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailWithAttachmentAndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Letter_WithEcard_Confirmation = jpayEmail().email().getConfirmationNumber();
	}
	
	

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-82 :: Design "
			+ "Steps::52,53,54(Click on Home link,verify page title and click logout.)")
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

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-82 :: Design "
			+ "Steps::55,56,57,58,59(Navigate to facility site,enter username,pincode,"
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

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-82 :: Design Steps"
			+ "::60,61,62,63,64,65,66,67(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void verifyLetterStatusOfLetterWithoutAttachment() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().pause(120000);
		jpayFacility().facilityEmail().enterSearchContent(Letter_Confirmation);
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

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-82 :: Design Steps"
			+ "::68,69,70,71,72,73,74,75(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void verifyLetterStatusOfLetterWithAttachment() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().pause(60000);
		jpayFacility().facilityEmail().enterSearchContent(Letter_WithEcard_Confirmation);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusPhotoApproval);
		
	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-82 :: Design "
			+ "Steps::76(Click sign out button .)")
	public void logoutFromFacility() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-82 ::Design Steps"
			+ "::77,78,79,80,81,82(Navigate to Staging website,verify personal and admin "
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

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-82 ::Design Steps"
			+ "::82,83,84,85,86,87,88,89,90,91,92,93,94,95(Click on Administration link,click "
			+ "on facility management link,verify header text,click manage inbound mail "
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

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-82::Design Steps"
			+ "::96,97,98(Click on Administration link,click on sign out button and "
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
		return new Object[] { new EmailWTC_82Test(data) };
	}

	public EmailWTC_82Test(Map<String, String> data) {
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
		emailMsgWithoutAttachment = data.get("emailMsgWithoutAttachment");//
		warnMsg = data.get("warnMsg");
		conMsg = data.get("conMsg");
		emailMsgWithAttachment = data.get("emailMsgWithAttachment");
		pinCode = data.get("pinCode");
		passwordFacility = data.get("passwordFacility");
		letterStatusReadyToPrint = data.get("letterStatusReadyToPrint");
		letterStatusPhotoApproval = data.get("letterStatusPhotoApproval");
		
		

	}

	
	
}
