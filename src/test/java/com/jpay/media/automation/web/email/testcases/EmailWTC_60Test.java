package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_60Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String variation;
	private String warnMsg;
	private String conMsg;
	private String pinCode;
	private String passwordFacility;
	private String emailMsgNonPrepaid;
	private String emailMsgPrepaid;
	private String nonPrepaidStampsStatus;
	private String prepaidStampsStatus;
	private String letterStatus;
	

	
	public static String Facility_Username ="";
	public static String Confirmation_Number_Non_Prepaid ="";
	public static String Confirmation_Number_Prepaid ="";
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC60 - (Non prepaid email status = No &  prepaid email status = Yes under the 
	 *                      released bucket in facility")
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC60
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-60 :: Design "
			+ "Steps::1,2(Click on login link and verify page title.)")
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-60 :: Design "
			+ "Steps::3,4,5,6(Enter username,password,click login button and "
			+ "verify title of the page.)")
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-60 :: Design "
			+ "Steps::7,8(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

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

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-60 :: Design "
			+ "Steps::9,10,11,12(Enter email message in the message body,click on send "
			+ "button,verify email warning message and check used stamps.)")
	public void writeEmailNonPrepaidAndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgNonPrepaid);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description =  "TestCases::WTC-60 ::DesignSteps"
			+ "::13,14,15(Click on continue button,verify email confirmation message "
			+ "and number.)")
	public void sendEmailNonPrepaidAndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Confirmation_Number_Non_Prepaid = jpayEmail().email().getConfirmationNumber();
	}
	

	/*********************************************************************************
	 * 
	 * Click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-60 :: Design "
			+ "Steps::16(Select random inmate and click on email link.)")
	public void clickEmailTab2() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}



	/*********************************************************************************
	 * 
	 * Enter email message in the message body,check prepaid checkbox,click 
	 * on send button,verify email warning message and check used stamps.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-60 :: Design "
			+ "Steps::17,18,19,20,21(Enter email message in the message body,check "
			+ "prepaid checkbox,click on send button,verify email warning message "
			+ "and check used stamps.)")
	public void writeEmailPrepaidAndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgPrepaid);
		jpayEmail().email().checkPrepaidBox();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_2);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description =  "TestCases::WTC-41 ::DesignSteps"
			+ "::22,23,24(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailPrepaidAndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Confirmation_Number_Prepaid = jpayEmail().email().getConfirmationNumber();
	}
	

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-37 :: Design "
			+ "Steps::25,26,27(Click on Home link,verify page title and click logout.)")
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

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-37 :: Design "
			+ "Steps::28,29,30,31,32(Navigate to facility site,enter username,pincode,"
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

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-41 :: Design Steps"
			+ "::33,34,35,36,37,38(Click on email link,wait for the status update,click "
			+ "on released bucket,click on view letter from all location link,verify "
			+ "prepaid stamps status,click on view link and verify letter status.)")
	public void clickMailSearchNonPrepaidAndVerifyStatus() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().pause(125000);
		jpayFacility().facilityEmail().clickInboundReleasedBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().verifyPrepaidStampsStatusByLetterId(Confirmation_Number_Non_Prepaid, nonPrepaidStampsStatus);
		jpayFacility().facilityEmail().clickViewLinkFromReleasedByLetterId(Confirmation_Number_Non_Prepaid);
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatus);
		
	}
	
	

	/*********************************************************************************
	 * 
	 * Click on email link,wait for the status update,click on released bucket,
	 * click on view letter from all location link,verify prepaid stamps status,
	 * click on view link and verify letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-41 :: Design Steps"
			+ "::39,40,41,42,43,44(Click on email link,wait for the status update,click "
			+ "on released bucket,click on view letter from all location link,verify "
			+ "prepaid stamps status,click on view link and verify letter status.)")
	public void clickMailSearchPrepaidAndVerifyStatus() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickInboundReleasedBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().verifyPrepaidStampsStatusByLetterId(Confirmation_Number_Prepaid, prepaidStampsStatus);
		jpayFacility().facilityEmail().clickViewLinkFromReleasedByLetterId(Confirmation_Number_Prepaid);
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatus);
		
	}
	

	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-60 :: Design "
			+ "Steps::45(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	


	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_60Test(data) };
	}
	
	
	public EmailWTC_60Test(Map<String, String> data) {
		super(data);
		
		username = data.get("username");
		password =data.get("password");
		variation = data.get("variation");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		pinCode = data.get("pinCode");
		passwordFacility = data.get("passwordFacility");
		nonPrepaidStampsStatus = data.get("nonPrepaidStampsStatus");
		prepaidStampsStatus = data.get("prepaidStampsStatus");
		emailMsgNonPrepaid = data.get("emailMsgNonPrepaid");
		emailMsgPrepaid = data.get("emailMsgPrepaid");
		letterStatus = data.get("letterStatus");
		
		
	}

	


}
