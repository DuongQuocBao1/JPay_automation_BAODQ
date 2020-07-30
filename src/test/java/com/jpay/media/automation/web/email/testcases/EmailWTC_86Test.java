package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_86Test extends BaseTestObject {

	
	
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
	private String emailMsg;
	private String filenamePng;
	private String maxMailAtachment;
	private String attachmentErrorMsg;
	private String unlimitedMailAtachment;
	
	
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC86 - (Negative testing enable/disable attachment and Max attach limits in staging)
	 * Author :: shasan(Shahriar Hasan) , 
	 * Date :: DataFile :: 
	 * Email.xlsx ,
	 * DataSheet :: WTC86      Status :: Completed
	 * 
	 **************************************************************************************************/

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-86 ::Design Steps"
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
	 * click permloc,select permloc,edit max mail attachments,uncheckvideo and ecrad 
	 * attacments enable checkbox,click on update button and verify the update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-86 ::Design Steps"
			+ "::7,8,9,10,11,12,13,14,15,16,17,18,19(Click on Administration link,click "
			+ "on facility management link,verify header text,click manage inbound mail "
			+ "settings,click choose agency,select facility,click permloc,select permloc,"
			+ "edit max mail attachments,uncheckvideo and ecrad attacments enable checkbox,"
			+ "click on update button and verify the update message.)")
	public void editManageInboundSettingsOfStagingAndVerify1() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageInboundSettingsLink();
		jpayStaging().stagingAdmin().clickMISChooseAgency();
		jpayStaging().stagingAdmin().selectMISFacility(facility,environment);
		jpayStaging().stagingAdmin().clickMISChoosePerm();
		jpayStaging().stagingAdmin().selectMISPermLoc(permLoc);
		jpayStaging().stagingAdmin().enterMISMaxMailAttachments(maxMailAtachment);
		jpayStaging().stagingAdmin().uncheckMISVideoAttachmentsEnabled();
		jpayStaging().stagingAdmin().uncheckMISEcardAttachmentsEnabled();
		jpayStaging().stagingAdmin().clickMISUpdateButton();
		jpayStaging().stagingAdmin().verifyMISUpdateMessage(updateMessage);

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-86::Design Steps"
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

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-86 :: Design "
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

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-86 :: Design "
			+ "Steps::30,31(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click attach image 
	 * button and attach image,click attach image button again and verify max 
	 * attachment error message,verify attach ecard and attach video button is 
	 * not visible,click send button,verify email warning message,click on continue 
	 * button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-86 :: Design "
			+ "Steps::32,33,34,35,36,37,38,39,40,41,42,43,44,45(Enter plain email message "
			+ "in the message body,click attach image button and attach image,click attach "
			+ "image button again and verify max attachment error message,verify attach "
			+ "ecard and attach video button is not visible,click send button,verify "
			+ "email warning message,check the used stamps.)")
	public void writeEmailAndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().verifyMaxAttachmentErrorMsg(attachmentErrorMsg);
		jpayEmail().email().VerifyAttachEcardButtonNotVisible();
		jpayEmail().email().VerifyAttachVideoButtonNotVisible();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_2);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description =  "TestCases::WTC-86 ::DesignSteps"
			+ "::46,47,48(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
	}


	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-86 :: Design "
			+ "Steps::49,50,51(Click on Home link,verify page title and click logout.)")
	public void logoutFromJpay1() {
		
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
		
	}

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-86 ::Design Steps"
			+ "::52,53,54,55,56,57(Navigate to Staging website,verify personal and admin "
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
	 * click permloc,select permloc,edit max mail attachments,uncheckvideo and ecrad 
	 * attacments enable checkbox,click on update button and verify the update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-86 ::Design Steps"
			+ "::58,59,60,61,62,63,64,65,66,67,68,69,70(Click on Administration link,click "
			+ "on facility management link,verify header text,click manage inbound mail "
			+ "settings,click choose agency,select facility,click permloc,select permloc,"
			+ "edit max mail attachments,uncheckvideo and ecrad attacments enable checkbox,"
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
		jpayStaging().stagingAdmin().enterMISMaxMailAttachments(unlimitedMailAtachment);
		jpayStaging().stagingAdmin().checkMISVideoAttachmentsEnabled();
		jpayStaging().stagingAdmin().checkMISEcardAttachmentsEnabled();
		jpayStaging().stagingAdmin().clickMISUpdateButton();
		jpayStaging().stagingAdmin().verifyMISUpdateMessage(updateMessage);

	}



	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-86::Design Steps"
			+ "::71,72,73(Click on Administration link,click on sign out button and "
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
		return new Object[] { new EmailWTC_86Test(data) };
	}

	public EmailWTC_86Test(Map<String, String> data) {
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
		warnMsg = data.get("warnMsg");
		conMsg = data.get("conMsg");
		maxMailAtachment = data.get("maxMailAtachment");
		unlimitedMailAtachment = data.get("unlimitedMailAtachment");
		attachmentErrorMsg = data.get("attachmentErrorMsg");
		emailMsg = data.get("emailMsg");
		filenamePng = data.get("filenamePng");
		
		

	}

	
	
}
