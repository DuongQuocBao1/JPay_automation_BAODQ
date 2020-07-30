package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_47To49Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String variation;
	private String warnMsg;
	private String conMsg;
	private String pinCode;
	private String passwordFacility;
	private String emailMsgFlaggedSecurity;
	private String emailMsgFlaggedCensored;
	private String emailMsgFlaggedReturned;
	private String letterStatusFlagged;
	private String letterStatusSecurity;
	private String letterStatusCensored;
	private String letterStatusReturned;
	private String commentSecurity;
	private String commentCensored;
	private String commentReturned;
	

	public static String Facility_Username ="";
	public static String Confirmation_Number_Security ="";
	public static String Confirmation_Number_Censored ="";
	public static String Confirmation_Number_Returned ="";
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC47 - (User shall be able to sent to security)
	 *             WTC48 - (User shall be able to sent to censored)
	 *             WTC49 - (User shall be able to return to customer)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC47To49
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.135270560,135270561
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-47,48,49 :: Design "
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-47,48,49 :: Design "
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-47,48,49 :: Design "
			+ "Steps::7,8(Select random inmate and click on email link.)")
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

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-47 :: Design "
			+ "Steps::9,10,11,12(Enter plain email message in the message body,click "
			+ "send button,verify email warning message,check the used stamps.)")
	public void writeEmailForTC47AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgFlaggedSecurity);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);//1 stamp(s) to send this letter
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description =  "TestCases::WTC-47 ::DesignSteps"
			+ "::13,14,15(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailForTC47AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Confirmation_Number_Security = jpayEmail().email().getConfirmationNumber();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send button,
	 * verify email warning message,click on continue button,verify 
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-48 :: Design "
			+ "Steps::9,10,11,12(Enter plain email message in the message body,click "
			+ "send button,verify email warning message,check the used stamps.)")
	public void writeEmailForTC48AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgFlaggedCensored);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);//1 stamp(s) to send this letter
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description =  "TestCases::WTC-48 ::DesignSteps"
			+ "::13,14,15(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailForTC48AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Confirmation_Number_Censored = jpayEmail().email().getConfirmationNumber();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send button,
	 * verify email warning message,click on continue button,verify 
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-49 :: Design "
			+ "Steps::9,10,11,12(Enter plain email message in the message body,click "
			+ "send button,verify email warning message,check the used stamps.)")
	public void writeEmailForTC49AndVerify() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsgFlaggedReturned);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);//1 stamp(s) to send this letter
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description =  "TestCases::WTC-49 ::DesignSteps"
			+ "::13,14,15(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailForTC49AndVerify() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Confirmation_Number_Returned = jpayEmail().email().getConfirmationNumber();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-47,48,49 :: Design "
			+ "Steps::16,17,18(Click on Home link,verify page title and click logout.)")
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

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-47,48,49 :: Design "
			+ "Steps::19,20,21,22,23(Navigate to facility site,enter username,pincode,"
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
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-47 :: Design Steps"
			+ "::24,25,26,27,28,29,30,31(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void clickMailSearchForTC47AndVerifyStatus() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().pause(120000);
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number_Security);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusFlagged);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on letter send to security,choose reason,enter comment and click send to security.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-47 :: Design "
			+ "Steps::32,33,34,35(Click on letter send to security,choose reason,"
			+ "enter comment and click send to security.)")
	public void sendLetterToSecurity() {
		
		jpayFacility().facilityEmail().clickLetterSendToSecurityButton();
		jpayFacility().facilityEmail().selectReason();
		jpayFacility().facilityEmail().enterComment(commentSecurity);
		jpayFacility().facilityEmail().clickSendToSecurityButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-47 :: Design Steps"
			+ "::36,37,38,39,40,41,42(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void clickMailSearchForTC47AndVerifyStatus2() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number_Security);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusSecurity);
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-48 :: Design Steps"
			+ "::24,25,26,27,28,29,30,31(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void clickMailSearchForTC48AndVerifyStatus() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number_Censored);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusFlagged);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on letter send to censored,choose reason,enter comment and click send to censored.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-48 :: Design "
			+ "Steps::32,33,34,35(Click on letter send to censored,choose reason,"
			+ "enter comment and click send to censored.)")
	public void sendLetterToCensored() {
		
		jpayFacility().facilityEmail().clickLetterSendToCensoredButton();
		jpayFacility().facilityEmail().selectReason();
		jpayFacility().facilityEmail().enterComment(commentCensored);
		jpayFacility().facilityEmail().clickSendToCensoredButton();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-48 :: Design Steps"
			+ "::36,37,38,39,40,41,42(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void clickMailSearchForTC48AndVerifyStatus2() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number_Censored);
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

	@Test(enabled = true, priority = 18, description = "TestCases::WTC-49 :: Design Steps"
			+ "::24,25,26,27,28,29,30,31(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void clickMailSearchForTC49AndVerifyStatus() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number_Returned);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusFlagged);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on letter return to customer,choose reason,enter comment and click return to customer.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 19, description = "TestCases::WTC-49 :: Design "
			+ "Steps::32,33,34,35(Click on letter return to customer,choose reason,"
			+ "enter comment and click return to customer.)")
	public void returnLetterToCustomer() {
		
		jpayFacility().facilityEmail().clickLetterReturnToCustomerButton();
		jpayFacility().facilityEmail().selectReason();
		jpayFacility().facilityEmail().enterComment(commentReturned);
		jpayFacility().facilityEmail().clickReturnedToCustomerButton();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 20, description = "TestCases::WTC-49 :: Design Steps"
			+ "::36,37,38,39,40,41,42(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void clickMailSearchForTC49AndVerifyStatus2() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number_Returned);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusReturned);
		
	}
	

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 21, description = "TestCases::WTC-47,48,49 :: Design "
			+ "Steps::43(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	



	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_47To49Test(data) };
	}
	
	
	public EmailWTC_47To49Test(Map<String, String> data) {
		super(data);
		
		
		
		username = data.get("username");
		password =data.get("password");
		variation = data.get("variation");
		emailMsgFlaggedSecurity = data.get("emailMsgFlaggedSecurity");
		emailMsgFlaggedCensored = data.get("emailMsgFlaggedCensored");
		emailMsgFlaggedReturned = data.get("emailMsgFlaggedReturned");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		pinCode = data.get("pinCode");
		passwordFacility = data.get("passwordFacility");
		letterStatusFlagged = data.get("letterStatusFlagged");
		letterStatusSecurity = data.get("letterStatusSecurity");
		letterStatusCensored = data.get("letterStatusCensored");
		letterStatusReturned = data.get("letterStatusReturned");
		commentSecurity = data.get("commentSecurity");
		commentCensored = data.get("commentCensored");
		commentReturned = data.get("commentReturned");
		
		
	}

	


}
