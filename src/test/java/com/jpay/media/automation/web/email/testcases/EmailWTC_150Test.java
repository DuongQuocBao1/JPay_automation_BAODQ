package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_150Test extends BaseTestObject {

	
	
	private String variation;
	private String personalDetails;
	private String adminSystem;
	private String username;
	private String password;
	private String facility;
	private String facilityManagementMainPagetext;
	private String permLoc;
	private String usernameJpay;
	private String passwordJpay;
	private String warnMsg;
	private String conMsg;
	private String emailMsg;
	private String inboundHousingText;
	private String house;
	
	
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC150 - (Email module should be disappeared from ww (staging & ww))
	 * Author :: shasan(Shahriar Hasan) , 
	 * Date :: DataFile :: 
	 * Email.xlsx ,
	 * DataSheet :: WTC150      Status :: Completed
	 * 
	 **************************************************************************************************/

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-150::Design Steps"
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
	 * text,click manage mail availability settings,select facility,select permloc,
	 * verify the inbound housing availability text,enter house to restrict and 
	 * click restrict housings button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-150::Design Steps"
			+ "::7,8,9,10,11,12,13,14,15(Click on Administration link,click on facility "
			+ "management link,verify header text,click manage mail availability settings,"
			+ "select facility,select permloc,verify the inbound housing availability text,"
			+ "enter house to restrict and click restrict housings button.)")
	public void editManageMailAvailabilitySettingsAndVerify1() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageMailAvailabilityLink();
		jpayStaging().stagingAdmin().selectMMAChooseFacility(facility);
		jpayStaging().stagingAdmin().selectMMAPermLoc(permLoc);
		jpayStaging().stagingAdmin().verifyMMAInboundHousingAvailibilityTextVerify(inboundHousingText);
		jpayStaging().stagingAdmin().enterMMAHousingRestrictFromInboundMail(house);
		jpayStaging().stagingAdmin().clickMMARestrictHousingsButton();

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-150::Design Steps"
			+ "::16,17,18(Click on Administration link,click on sign out button and "
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

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-150:: DesignSteps::"
			+ "19,20,21,22,23,24,25,26(Enter username,password,click login button and verify "
			+ "title of the page.)")
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

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-150:: Design "
			+ "Steps::27,28(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().verifyEmailTabAbsent();
		
	}

	/*********************************************************************************
	 * 
	 * Click on logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-150:: Design "
			+ "Steps::29(Click on logout.)")
	public void logoutFromJpay1() {
		
		jpayEmail().login().clickLogoutButton();
		
	}

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-150::Design Steps"
			+ "::30,31,32,33,34,35(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void loginToStaging() {

		jpayStaging().stagingLogin().loadURL(envUrlStaging);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on facility management link,verify header 
	 * text,click manage mail availability settings,select facility,select permloc,
	 * verify the inbound housing availability text,enter house to restrict and 
	 * click restrict housings button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-150::Design Steps"
			+ "::36,37,38,39,40,41,42,43,44(Click on Administration link,click on facility "
			+ "management link,verify header text,click manage mail availability settings,"
			+ "select facility,select permloc,verify the inbound housing availability text,"
			+ "enter house to restrict and click restrict housings button.)")
	public void editManageMailAvailabilitySettingsAndVerify2() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageMailAvailabilityLink();
		jpayStaging().stagingAdmin().selectMMAChooseFacility(facility);
		jpayStaging().stagingAdmin().selectMMAPermLoc(permLoc);
		jpayStaging().stagingAdmin().verifyMMAInboundHousingAvailibilityTextVerify(inboundHousingText);
		jpayStaging().stagingAdmin().enterMMAHousingRestrictFromInboundMail();
		jpayStaging().stagingAdmin().clickMMARestrictHousingsButton();

	}


	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-150:: DesignSteps::"
			+ "45,46,47,48,49,50,51(Enter username,password,click login button and verify "
			+ "title of the page.)")
	public void loginToJpayAndVerify2() {

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
	 * Select random inmate,verify email tab is present and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-150:: Design Steps::"
			+ "52,53(Select random inmate,verify email tab is present and click on email link.)")
	public void selectInmateAndVerify2() {

		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().verifyEmailTabPresent();
		jpayEmail().headerNavigation().clickEmailLink();
		
	}



	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click send button,verify email 
	 * warning message and check the used stamps.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-150:: Design "
			+ "Steps::54,55,56,57(Enter email message in the message body,click send "
			+ "button,verify email warning message and check the used stamps.)")
	public void writeEmailAndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description =  "TestCases::WTC-150::DesignSteps::"
			+ "58,59,60(Click on continue button,verify email confirmation message and number.)")
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

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-150:: Design "
			+ "Steps::61,62,63(Click on Home link,verify page title and click logout.)")
	public void testEnd() {
		
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
		
	}


	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/

	@Factory(dataProvider = "getData", dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String> data) {
		return new Object[] { new EmailWTC_150Test(data) };
	}

	public EmailWTC_150Test(Map<String, String> data) {
		super(data);

		username = data.get("username");
		password = data.get("password");
		personalDetails = data.get("personalDetails");
		adminSystem = data.get("adminSystem");
		variation = data.get("variation");
		facilityManagementMainPagetext = data.get("facilityManagementMainPagetext");
		facility = data.get("facility");
		permLoc = data.get("permLoc");
		inboundHousingText = data.get("inboundHousingText");
		house = data.get("house");
		usernameJpay = data.get("usernameJpay");
		passwordJpay = data.get("passwordJpay");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("conMsg");
		emailMsg = data.get("emailMsg");
		
		

	}

	
	
}
