package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_62Test extends BaseTestObject {

	private String variation;
	private String personalDetails;
	private String adminSystem;
	private String usernameStaging;
	private String passwordStaging;
	private String facilityMagementMainPageText;
	private String facility;
	private String permLoc;
	private String updateMessage;
	private String usernameWWW;
	private String passwordWWW;
	private String warnMsg;
	private String conMsg;
	private String emailMessage;
	private String freeResponseText;

	/************************************************************************************************
	 * 
	 * TestCase :: WTC62 - (User shall be able to send free prepaid letter)
	 * Author :: shasan(Shahriar Hasan) , Date :: DataFile :: Email.xlsx ,
	 * DataSheet :: WTC62 Status :: Completed
	 * 
	 **************************************************************************************************/

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-62 ::Design Steps"
			+ "::1,2,3,4,5,6(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void testStart() {

		jpayStaging().stagingLogin().loadURL(envUrlStaging, variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(usernameStaging);
		jpayStaging().stagingLogin().enterPassword(passwordStaging);
		jpayStaging().stagingLogin().clickLoginButton();

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on facility management link and
	 * verify text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-62 ::Design Steps"
			+ "::7,8,9(Click on Administration link,click facility management link "
			+ "and verify text.)")
	public void navigateToFacilityManagement1() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityMagementMainPageText);

	}

	/*********************************************************************************
	 * 
	 * Click on manage outbound settings link,click on choose agency,select 
	 * agency,click choose permloc,select permloc,check support free prepaid 
	 * letter checkbox,click on update button and verify update succeed message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-62 ::Design Steps"
			+ "::10,11,12,13,14,15,16,17(Click on manage outbound settings link,click "
			+ "on choose agency,select agency,click choose permloc,select permloc,"
			+ "check support free prepaid letter checkbox,click on update button "
			+ "and verify update succeed message.)")
	public void navigateToOutboundMailSettings1() {

		jpayStaging().stagingAdmin().clickManageOutboundSettingsLink();
		jpayStaging().stagingAdmin().clickChooseAgencyForOutboundSettings();
		jpayStaging().stagingAdmin().selectFacilityForOutboundSettings(facility,environment);
		jpayStaging().stagingAdmin().clickChoosePermlocForOutboundSettings();
		jpayStaging().stagingAdmin().selectPermLocForOutboundSettings(permLoc);
		jpayStaging().stagingAdmin().checkMOSSupportFreePrepaidLetterCheckBox();
		jpayStaging().stagingAdmin().clickOutboundSettingsUpdateButton();
		jpayStaging().stagingAdmin().verifyOutboundSttingsUpdateMessage(updateMessage);

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-62::Design Steps::"
			+ "18,19,20(Click on Administration link,click on sign out button and "
			+ "verify personal details.)")
	public void logoutFromStaging() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);

	}

	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-61 :: Design "
			+ "Steps::21,22,23(Click on login link and verify page title.)")
	public void navigateToWWW() {

		jpayEmail().login().loadURL(envUrlJpay, variation);
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-61 :: Design "
			+ "Steps::24,25,26,27(Enter username,password,click login button and " + "verify title of the page.)")
	public void loginToWWWAndVerify() {

		jpayEmail().login().enterUsername(usernameWWW);
		jpayEmail().login().enterPassword(passwordWWW);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-61 :: Design "
			+ "Steps::28,29(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();

	}

	/*********************************************************************************
	 * 
	 * Enter email message in the message body,verify prepaid free response text,
	 * click on send button, verify email warning message and check used stamps.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-61 :: Design Steps"
			+ "::30,31,32,33,34(Enter email message in the message body,verify prepaid "
			+ "free response text,click on send button,verify email warning message "
			+ "and check used stamps.)")
	public void writeEmailAndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMessage);
		jpayEmail().email().verifyPrepaidFreeResponseText(freeResponseText);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);

	}

	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-62 ::Design Steps"
			+ "::35,36,37(Click on continue button,verify email confirmation message and number.)")
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

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-62 :: Design "
			+ "Steps::40,41,42(Click on Home link,verify page title and click logout.)")
	public void logoutFromWWW() {

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

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-62 ::Design Steps"
			+ "::43,44,45,46,47,48(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void loginToStaging() {

		jpayStaging().stagingLogin().loadURL(envUrlStaging, variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(usernameStaging);
		jpayStaging().stagingLogin().enterPassword(passwordStaging);
		jpayStaging().stagingLogin().clickLoginButton();

	}


	/*********************************************************************************
	 * 
	 * Click on Administration link,click on facility management link and
	 * verify text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-62 ::Design Steps"
			+ "::49,50,51(Click on Administration link,click facility management link "
			+ "and verify text.)")
	public void navigateToFacilityManagement2() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityMagementMainPageText);

	}

	/*********************************************************************************
	 * 
	 * Click on manage outbound settings link,click on choose agency,select 
	 * agency,click choose permloc,select permloc,uncheck support free prepaid 
	 * letter checkbox,click on update button and verify update succeed message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-62 ::Design Steps"
			+ "::52,53,54,55,56,57,58,59(Click on manage outbound settings link,click "
			+ "on choose agency,select agency,click choose permloc,select permloc,"
			+ "uncheck support free prepaid letter checkbox,click on update button "
			+ "and verify update succeed message.)")
	public void navigateToOutboundMailSettings2() {

		jpayStaging().stagingAdmin().clickManageOutboundSettingsLink();
		jpayStaging().stagingAdmin().clickChooseAgencyForOutboundSettings();
		jpayStaging().stagingAdmin().selectFacilityForOutboundSettings(facility,environment);
		jpayStaging().stagingAdmin().clickChoosePermlocForOutboundSettings();
		jpayStaging().stagingAdmin().selectPermLocForOutboundSettings(permLoc);
		jpayStaging().stagingAdmin().uncheckMOSSupportFreePrepaidLetterCheckBox();
		jpayStaging().stagingAdmin().clickOutboundSettingsUpdateButton();
		jpayStaging().stagingAdmin().verifyOutboundSttingsUpdateMessage(updateMessage);//

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-62::Design Steps"
			+ "::60,61,62(Click on Administration link,click on sign out button and "
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
		return new Object[] { new EmailWTC_62Test(data) };
	}

	public EmailWTC_62Test(Map<String, String> data) {
		super(data);

		usernameStaging = data.get("usernameStaging");
		passwordStaging = data.get("passwordStaging");
		personalDetails = data.get("personalDetails");
		adminSystem = data.get("adminSystem");
		variation = data.get("variation");
		facilityMagementMainPageText = data.get("facilityMagementMainPageText");
		facility = data.get("facility");
		permLoc = data.get("permLoc");
		updateMessage = data.get("updateMessage");
		usernameWWW = data.get("usernameWWW");
		passwordWWW = data.get("passwordWWW");
		emailMessage = data.get("emailMessage");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("conMsg");
		freeResponseText = data.get("freeResponseText");

	}

}
