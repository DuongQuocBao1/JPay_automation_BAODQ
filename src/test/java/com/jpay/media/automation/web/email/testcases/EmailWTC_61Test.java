package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_61Test extends BaseTestObject{
	
	
	private String variation;
	private String warnMsg;
	private String conMsg;
	private String pinCode;
	private String passwordFacility;
	private String personalDetails;
	private String adminSystem;
	private String usernameStaging;
	private String passwordStaging;
	private String mailAdminText;
	private String facility;
	private String permLoc;
	private String filterWord;
	private String addFilterWordSuccessMessage;
	private String usernameWWW;
	private String passwordWWW;
	private String letterStatusFlagged;
	private String deleteFilterWordSuccessMessage;
	

	
	public static String Facility_Username ="";
	public static String Confirmation_Number ="";
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC61 - (Non prepaid email status = No &  prepaid email status = 
	 *                      Yes under the released bucket in facility")
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC61
	 * Status :: Completed
	 * 
	 **************************************************************************************************/

	

	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-61 ::Design Steps"
			+ "::1,2,3,4,5,6(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void testStart() {
		
		jpayStaging().stagingLogin().loadURL(envUrlStaging,variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(usernameStaging);
		jpayStaging().stagingLogin().enterPassword(passwordStaging);
		jpayStaging().stagingLogin().clickLoginButton();
		
	}
	

	
	/*********************************************************************************
	 * 
	 * Click on Administration link,click on inbound mail administration 
	 * and verify mail administration text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-61 ::Design Steps"
			+ "::7,8,9(Click on Administration link,click on inbound mail "
			+ "administration and verify mail administration text.)")
	public void navigateToInboundMailAdministration1() {
	
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickInboundMailAdminstartionLink();
		jpayStaging().stagingAdmin().verifyMailAdministartionText(mailAdminText);
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on manage word filter link,select facility and permloc.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-61 ::Design Steps"
			+ "::10,11,12(Click on manage word filter link,select facility and permloc.)")
	public void selectManageWordFilterFacilityAndPermLoc1() {
	
		jpayStaging().stagingAdmin().clickManageWordFilterLink();
		jpayStaging().stagingAdmin().selectManageWordFilterFacility(facility);
		jpayStaging().stagingAdmin().selectManageWordFilterPermLoc(permLoc);
	}
	

	/*********************************************************************************
	 * 
	 * Enter flagged word to insert,click insert button,verify insertion success 
	 * message and inserted word present in the flagged word list.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-61 ::Design Steps"
			+ "::13,14,15,16(Enter flagged word to insert,click insert button,verify "
			+ "insertion success message and inserted word present in the flagged word list.)")
	public void addFilterWordAndVerify() {
	
		jpayStaging().stagingAdmin().enterManageWordToAddAsFilter(filterWord);
		jpayStaging().stagingAdmin().clickManageWordFilterInsertButton();
		jpayStaging().stagingAdmin().verifyMangeWordFilterSuccessInsertMsg(addFilterWordSuccessMessage);
		jpayStaging().stagingAdmin().verifyManageWordFilterInsertedWordPresent(filterWord);
	}
	
	
	
	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-61::Design Steps::"
			+ "17,18,19(Click on Administration link,click on sign out button and "
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

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-61 :: Design "
			+ "Steps::20,21,22(Click on login link and verify page title.)")
	public void navigateToWWW() {
		
		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-61 :: Design "
			+ "Steps::23,24,25,26(Enter username,password,click login button and "
			+ "verify title of the page.)")
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

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-61 :: Design "
			+ "Steps::27,28(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab() {

		jpayEmail().login().selectRandomInmate();
		Facility_Username = jpayEmail().login().setFacilityUsername();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}
	


	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click on send button,
	 * verify email warning message and check used stamps.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-61 :: Design "
			+ "Steps::29,30,31,32(Enter email message in the message body,click on send "
			+ "button,verify email warning message and check used stamps.)")
	public void writeEmailAndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(filterWord);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description =  "TestCases::WTC-61 ::DesignSteps"
			+ "::33,34,35(Click on continue button,verify email confirmation message "
			+ "and number.)")
	public void sendEmailAndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Confirmation_Number = jpayEmail().email().getConfirmationNumber();
	}
	

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-61 :: Design "
			+ "Steps::35,36,37(Click on Home link,verify page title and click logout.)")
	public void logoutFromWWW() {
		
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

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-61 :: Design "
			+ "Steps::38,39,40,41,42(Navigate to facility site,enter username,pincode,"
			+ "password and click on login button .)")
	public void loginToFacilityAndVerify() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility);
		jpayFacility().facilityLogin().enterUsername(Facility_Username);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordFacility);
		jpayFacility().facilityLogin().clickLoginButton();
		
		
	}

	/*********************************************************************************
	 * 
	 * Click on email link,wait for the status update,click on released bucket,
	 * click on view letter from all location link,verify prepaid stamps status,
	 * click on view link and verify letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-61 :: Design Steps"
			+ "::43,44,45,46,47,48,49,50(Click on email link,wait for the status update,click "
			+ "on released bucket,click on view letter from all location link,verify "
			+ "prepaid stamps status,click on view link and verify letter status.)")
	public void clickMailSearchFlaggedAndVerifyStatus() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().pause(125000);
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusFlagged);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-61 :: Design "
			+ "Steps::51(Click sign out button .)")
	public void logoutFromFacility() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-61 ::Design Steps"
			+ "::52,53,54,55,56,57(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void loginToStaging() {
		
		jpayStaging().stagingLogin().loadURL(envUrlStaging,variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(usernameStaging);
		jpayStaging().stagingLogin().enterPassword(passwordStaging);
		jpayStaging().stagingLogin().clickLoginButton();
		
	}
	

	
	/*********************************************************************************
	 * 
	 * Click on Administration link,click on inbound mail administration 
	 * and verify mail administration text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-61 ::Design Steps"
			+ "::58,59,60(Click on Administration link,click on inbound mail "
			+ "administration and verify mail administration text.)")
	public void navigateToInboundMailAdministration2() {
	
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickInboundMailAdminstartionLink();
		jpayStaging().stagingAdmin().verifyMailAdministartionText(mailAdminText);
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on manage word filter link,select facility and permloc.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-61 ::Design Steps"
			+ "::61,62,63(Click on manage word filter link,select facility and permloc.)")
	public void selectManageWordFilterFacilityAndPermLoc2() {
	
		jpayStaging().stagingAdmin().clickManageWordFilterLink();
		jpayStaging().stagingAdmin().selectManageWordFilterFacility(facility);
		jpayStaging().stagingAdmin().selectManageWordFilterPermLoc(permLoc);
	}
	

	/*********************************************************************************
	 * 
	 * Select previously added flagged word from wordlist,click delete from 
	 * all button,verify delete success message and deleted word absent 
	 * in the word list.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 18, description = "TestCases::WTC-61 ::Design Steps"
			+ "::64,65,66(Select previously added flagged word from wordlist,click delete "
			+ "from all button,verify delete success message and deleted word absent in "
			+ "the word list.)")
	public void deleteAddedFilterWordAndVerify() {
	
		jpayStaging().stagingAdmin().selectManageWordFilterWordList(filterWord);
		jpayStaging().stagingAdmin().clickManageWordFilterDeleteFromAllButton();
		jpayStaging().stagingAdmin().verifyMangeWordFilterSuccessDeleteMsg(deleteFilterWordSuccessMessage);
		jpayStaging().stagingAdmin().verifyManageWordFilterInsertedWordAbsent(filterWord);
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 19, description = "TestCases::WTC-61::Design Steps"
			+ "::67,68,69(Click on Administration link,click on sign out button "
			+ "and verify personal details.)")
	public void testEnd() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		
	}
	
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_61Test(data) };
	}
	
	
	public EmailWTC_61Test(Map<String, String> data) {
		super(data);
		
		
		
		usernameStaging = data.get("usernameStaging");
		passwordStaging =data.get("passwordStaging");
		personalDetails =data.get("personalDetails");
		adminSystem =data.get("adminSystem");
		variation = data.get("variation");
		mailAdminText = data.get("mailAdminText");
		facility = data.get("facility");
		permLoc = data.get("permLoc");
		filterWord = data.get("filterWord");
		addFilterWordSuccessMessage = data.get("addFilterWordSuccessMessage");
		deleteFilterWordSuccessMessage = data.get("deleteFilterWordSuccessMessage");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("conMsg");
		usernameWWW = data.get("usernameWWW");
		passwordWWW = data.get("passwordWWW");
		pinCode = data.get("pinCode");
		passwordFacility = data.get("passwordFacility");
		letterStatusFlagged = data.get("letterStatusFlagged");
		
		
		
	}

	

	

}
