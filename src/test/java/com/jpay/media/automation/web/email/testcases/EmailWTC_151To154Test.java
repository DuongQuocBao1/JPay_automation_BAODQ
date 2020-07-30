package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_151To154Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String variation;
	private String emailMsgPlain;
	private String warnMsg;
	private String conMsg;
	private String pinCode;
	private String passwordFacility;
	private String letterStatusPlain;
	private String emailMsgFilter;
	private String letterStatusFilter;
	private String emailMsgEcard;
	private String letterStatusEcard;
	private String emailMsgImage;
	private String filenamePng;
	private String letterStatusImage;
	private String usernameFacility;
	

	
	public static String Confirmation_Number_Plain ="";
	public static String Confirmation_Number_Filter ="";
	public static String Confirmation_Number_Ecard ="";
	public static String Confirmation_Number_Image ="";
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC151To154- (151.User should be able to send email and letter status "Ready To Print/Release"
	 *                           152.User should be able to send email and letter status "Requires Approval (flagged words)"
	 *                           153.User should be able to send email and letter status "Released"
	 *                           154.User should be able to send email with IMAGE and letter status "Photo Approval")
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC151To154
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-151,152,153,154::Design"
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-151,152,153,154::Design "
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

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-151::Design "
			+ "Steps::7,8(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTabForTC151() {

		jpayEmail().login().selectRandomInmate();
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

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-151:: Design "
			+ "Steps::9,10,11,12(Enter plain email message in the message body,click "
			+ "send button,verify email warning message,check the used stamps.)")
	public void writeEmailAndVerifyForTC151() {

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

	@Test(enabled = true, priority = 5, description =  "TestCases::WTC-151::DesignSteps"
			+ "::13,14,15(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyForTC151() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Confirmation_Number_Plain = jpayEmail().email().getConfirmationNumber();
	}
	
	
	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-152:: Design "
			+ "Steps::7,8(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTabForTC152() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
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

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-152:: Design "
			+ "Steps::9,10,11,12(Enter filter email message in the message body,"
			+ "click send button,verify email warning message,check the used stamps.)")
	public void writeEmailAndVerifyForTC152() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgFilter);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);//1 stamp(s) to send this letter
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description =  "TestCases::WTC-152::DesignSteps"
			+ "::13,14,15(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyForTC152() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Confirmation_Number_Filter = jpayEmail().email().getConfirmationNumber();
	}
	
	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-153:: Design "
			+ "Steps::7,8(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTabForTC153() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}
	

	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click attach ecard,
	 * select random ecard category,click on continue button,click 
	 * send button,verify email warning message,click on continue 
	 * button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-153:: Design "
			+ "Steps::9,10,11,12,13,14,15,16(Enter filter email message in the message body,"
			+ "click attach ecard,select random ecard category,click on continue button,"
			+ "click send button,verify email warning message,check the used stamps.)")
	public void writeEmailAndVerifyForTC153() {

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

	@Test(enabled = true, priority = 11, description =  "TestCases::WTC-153::DesignSteps"
			+ "::17,18,19(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyForTC153() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Confirmation_Number_Ecard = jpayEmail().email().getConfirmationNumber();
	}
	
	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-154:: Design "
			+ "Steps::7,8(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTabForTC154() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectRandomInmate();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}
	

	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click attach ecard,
	 * select random ecard category,click on continue button,click 
	 * send button,verify email warning message,click on continue 
	 * button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-154:: Design "
			+ "Steps::9,10,11,12,13,14,15,16(Enter filter email message in the message body,"
			+ "click attach image,select random ecard category,click on continue button,"
			+ "click send button,verify email warning message,check the used stamps.)")
	public void writeEmailAndVerifyForTC154() {

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

	@Test(enabled = true, priority = 14, description =  "TestCases::WTC-154::DesignSteps"
			+ "::17,18,19(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyForTC154() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Confirmation_Number_Image = jpayEmail().email().getConfirmationNumber();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-151,152,153,154::Design "
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

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-151,152,153,154::Design "
			+ "Steps::19,20,21,22,23(Navigate to facility site,enter username,pincode,"
			+ "password and click on login button .)")
	public void loginToFacilityAndVerify() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility);
		jpayFacility().facilityLogin().enterUsername(usernameFacility);
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

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-151:: Design Steps"
			+ "::24,25,26,27,28,29,30,31(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void clickMailSearchAndVerifyStatusForTC151() {
		jpayFacility().facilityEmail().pause(120000);
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number_Plain);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusPlain);
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go button,
	 * click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 18, description = "TestCases::WTC-152:: Design Steps"
			+ "::24,25,26,27,28,29,30,31(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void clickMailSearchAndVerifyStatusForTC152() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number_Filter);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusFilter);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go button,
	 * click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 19, description = "TestCases::WTC-153:: Design Steps"
			+ "::28,29,30,31,32,33,34,35(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void clickMailSearchAndVerifyStatusForTC153() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().pause(60000);
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number_Ecard);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusEcard);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go button,
	 * click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 20, description = "TestCases::WTC-154:: Design Steps"
			+ "::28,29,30,31,32,33,34,35(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void clickMailSearchAndVerifyStatusForTC154() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number_Image);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusImage);
		
	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 21, description = "TestCases::WTC-151,152,153,164:: Design "
			+ "Steps::(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	



	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_151To154Test(data) };
	}
	
	
	public EmailWTC_151To154Test(Map<String, String> data) {
		super(data);
		
		username = data.get("username");
		password =data.get("password");
		variation = data.get("variation");
		emailMsgPlain = data.get("emailMsgPlain");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		pinCode = data.get("pinCode");
		usernameFacility = data.get("usernameFacility");
		passwordFacility = data.get("passwordFacility");
		letterStatusPlain = data.get("letterStatusPlain");
		emailMsgFilter = data.get("emailMsgFilter");
		letterStatusFilter = data.get("letterStatusFilter");
		emailMsgEcard = data.get("emailMsgEcard");
		letterStatusEcard = data.get("letterStatusEcard");
		emailMsgImage = data.get("emailMsgImage");
		letterStatusImage = data.get("letterStatusImage");
		filenamePng = data.get("filenamePng");
		
		
	}

	


}
