package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_88Test extends BaseTestObject {

	
	
	private String variation;
	private String pinCode;
	private String username;
	private String password;
	private String inmateId;
	private String registeredStatus;
	private String suspendReason;
	private String usernameJpay;
	private String passwordJpay;
	private String emailMsg;
	private String warnMsg;
	private String conMsg;
	private String suspendStatus;
	private String activateReason;
	private String activateUpdateMsg;
	
	
	
	public static String date;

	/************************************************************************************************
	 * 
	 * TestCase :: WTC88 - (Email tab will not show for suspend inmate)
	 * Author :: shasan(Shahriar Hasan) , 
	 * Date :: DataFile :: 
	 * Email.xlsx ,
	 * DataSheet :: WTC88      Status :: Completed
	 * 
	 **************************************************************************************************/

	
	/*********************************************************************************
	 * 
	 * Enter username,pincode,password,click login button and verify Facility 
	 * system and Communications tab is absent.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-88:: Design "
			+ "Steps::1,2,3,4,5(Navigate to facility site,enter username,pincode,"
			+ "password and click on login button .)")
	public void testStart() {

		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(username);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(password);
		jpayFacility().facilityLogin().clickLoginButton();

	}

	/*********************************************************************************
	 * 
	 * Click on handle inmate account link,enter inmate id,click on view inmate 
	 * button,verify inmate id,verify account status,click on suspend account,
	 * enter reason to suspend,enter current date,click on confirm and verify 
	 * suspend confirm message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-88:: Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15(Click on handle inmate account link,enter "
			+ "inmate id,click on view inmate button,verify inmate id,verify account "
			+ "status,click on suspend account,enter reason to suspend,enter current "
			+ "date,click on confirm and verify suspend confirm message.)")
	public void suspendInmateAndVerify() {
		
		jpayFacility().facilityAdmin().clickHandleInmateAccountLink();
		jpayFacility().facilityAdmin().enterHIAInsertInmateId(inmateId);
		jpayFacility().facilityAdmin().clickHIAViewInmateAccountDetailsButton();
		jpayFacility().facilityAdmin().verifyHIAInameId(inmateId);
		jpayFacility().facilityAdmin().verifyHIAInameAccountStatus(registeredStatus);
		jpayFacility().facilityAdmin().clickHIAActionsSuspendAccountButton();
		jpayFacility().facilityAdmin().enterHIAActionsSusActiReason(suspendReason);
		jpayFacility().facilityAdmin().enterHIAActionsSuspendEndDate();
		jpayFacility().facilityAdmin().clickHIAActionsSuspActiConfirmButton();
		/*date=jpayFacility().facilityAdmin().getCurrDate();
		jpayFacility().facilityAdmin().verifyHISActionsSuspendConfirmMessage(date);*/
		
	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-88 :: Design "
			+ "Steps::16(Click sign out button .)")
	public void logoutFromFacility1() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}


	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-88 :: Design "
			+ "Steps::17,18,19,20,21,22,23(Enter username,password,click login button and "
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

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-88 :: Design "
			+ "Steps::24,25(Select random inmate and click on email link.)")
	public void verifyEmailTab1() {

		jpayEmail().headerNavigation().verifyEmailTabAbsent();
		
	}

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-88 :: Design "
			+ "Steps::26,27,28(Click on Home link,verify page title and click logout.)")
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

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-88 :: Design "
			+ "Steps::29,30,31,32,33(Navigate to facility site,enter username,pincode,"
			+ "password and click on login button .)")
	public void loginToFacility2() {

		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(username);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(password);
		jpayFacility().facilityLogin().clickLoginButton();

	}


	/*********************************************************************************
	 * 
	 * Click on handle inmate account link,enter inmate id,click on view inmate 
	 * button,verify inmate id,verify account status,click on activate account,
	 * enter reason to suspend,enter current date,click on confirm and verify 
	 * suspend confirm message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-88:: Design Steps"
			+ "::34,35,36,37,38,39,40,41,42(Click on handle inmate account link,enter "
			+ "inmate id,click on view inmate button,verify inmate id,verify account "
			+ "status,click on activate account,enter reason to activate,click on "
			+ "confirm and verify activate confirm message.)")
	public void activateInmateAccountAndVerify() {
		
		jpayFacility().facilityAdmin().clickHandleInmateAccountLink();
		jpayFacility().facilityAdmin().enterHIAInsertInmateId(inmateId);
		jpayFacility().facilityAdmin().clickHIAViewInmateAccountDetailsButton();
		jpayFacility().facilityAdmin().verifyHIAInameId(inmateId);
		//jpayFacility().facilityAdmin().verifyHIAInameAccountStatus(suspendStatus+" "+date);
		jpayFacility().facilityAdmin().clickHIAActionsActivateAccountButton();
		jpayFacility().facilityAdmin().enterHIAActionsSusActiReason(activateReason);
		jpayFacility().facilityAdmin().clickHIAActionsSuspActiConfirmButton();
		jpayFacility().facilityAdmin().verifyHISActionsActivateConfirmMessage(activateUpdateMsg);
		
	}


	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-88 :: Design "
			+ "Steps::43(Click sign out button .)")
	public void logoutFromFacility2() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-88 :: Design "
			+ "Steps::44,45,46,47,48,49,50(Enter username,password,click login button and "
			+ "verify title of the page.)")
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
	 * Verify email tab is present and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-88 :: Design "
			+ "Steps::51,52(Verify email tab is present and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().headerNavigation().verifyEmailTabPresent();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}
	

	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click send button,
	 * verify email warning message and stamps count.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-88 :: Design "
			+ "Steps::53,54,56,57(Enter email message in the message body,click send "
			+ "button,verify email warning message and stamps count.)")
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

	@Test(enabled = true, priority = 13, description =  "TestCases::WTC-88 ::DesignSteps"
			+ "::58,59,60(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
	}


	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-88 :: Design "
			+ "Steps::60(Click sign out button .)")
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
		return new Object[] { new EmailWTC_88Test(data) };
	}

	public EmailWTC_88Test(Map<String, String> data) {
		super(data);

		username = data.get("username");
		password = data.get("password");
		variation = data.get("variation");
		inmateId = data.get("inmateId");
		pinCode = data.get("pinCode");
		registeredStatus = data.get("registeredStatus");
		suspendReason = data.get("suspendReason");
		usernameJpay = data.get("usernameJpay");
		passwordJpay = data.get("passwordJpay");
		emailMsg = data.get("emailMsg");
		warnMsg = data.get("warnMsg");
		conMsg= data.get("conMsg");
		suspendStatus = data.get("suspendStatus");
		activateReason = data.get("activateReason");
		activateUpdateMsg = data.get("activateUpdateMsg");

	}

	
	
}
