package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_42Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String variation;
	private String warnMsg;
	private String conMsg;
	private String pinCode;
	private String passwordFacility;
	private String emailMsgFilter;
	private String letterStatusFilter;
	private String usernameFacility;
	private String flagWord1;
	private String addSuccessMessage;
	private String flagWord2;
	private String flagWord3;
	
	public static String Confirmation_Number ="";
	
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC42 - (Letter status shall be "Requires Approval")
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC42
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Navigate to facility site,enter username,enter pincode,
	 * enter password and click login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-42 :: Navigate "
			+ "to facility site,enter username,enter pincode,enter password and "
			+ "click login button.)")
	public void testStart() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(usernameFacility);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordFacility);
		jpayFacility().facilityLogin().clickLoginButton();
	}

	/*********************************************************************************
	 * 
	 * Click on email tab link,click on word filter system link,click 
	 * on add link,enter filter word,click on add button and verify 
	 * word add success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-42 :: Design "
			+ "Steps::6,7,8,9,10,11(Click on email tab link,click on word filter system "
			+ "link,click on add link,enter filter word,click on add button and verify "
			+ "word add success message.)")
	public void addFilterWordAndVerify1() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickWordFilterSysButton();
		jpayFacility().facilityEmail().clickWordAddLink();
		jpayFacility().facilityEmail().enterFlagWord(flagWord1);
		jpayFacility().facilityEmail().clickWordAddButton();
		jpayFacility().facilityEmail().verifyWordAddSuccessMsg(addSuccessMessage);
	}
	
	/*********************************************************************************
	 * 
	 * Click on email tab link,click on word filter system link,click 
	 * on add link,enter filter word,click on go button and verify 
	 * word add success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-42 :: Design "
			+ "Steps::12,13,14,15,16,17(Click on email tab link,click on word filter system "
			+ "link,click on add link,enter filter word,click on go button and verify "
			+ "word add success message.)")
	public void addFilterWordAndVerify2() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickWordFilterSysButton();
		jpayFacility().facilityEmail().clickWordAddLink();
		jpayFacility().facilityEmail().enterFlagWord(flagWord2);
		jpayFacility().facilityEmail().clickWordAddButton();
		jpayFacility().facilityEmail().verifyWordAddSuccessMsg(addSuccessMessage);
	}
	
	/*********************************************************************************
	 * 
	 * Click on email tab link,click on word filter system link,click 
	 * on add link,enter filter word,click on add button and verify 
	 * word add success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-42 :: Design "
			+ "Steps::18,19,20,21,22,23(Click on email tab link,click on word filter system "
			+ "link,click on add link,enter filter word,click on add button and verify "
			+ "word add success message.)")
	public void addFilterWordAndVerify3() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickWordFilterSysButton();
		jpayFacility().facilityEmail().clickWordAddLink();
		jpayFacility().facilityEmail().enterFlagWord(flagWord3);
		jpayFacility().facilityEmail().clickWordAddButton();
		jpayFacility().facilityEmail().verifyWordAddSuccessMsg(addSuccessMessage);
	}
	
	/*********************************************************************************
	 * 
	 * Click on login link and verify page title,enter username,
	 * password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-42 :: Design "
			+ "Steps::24,25,26,27,28,29,30( Click on login link and verify page title,"
			+ "enter username,password,click login button and verify title of the page.)")
	public void loginToJpayAndVerify1() {
		
		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
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

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-42 :: Design "
			+ "Steps::31,32(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

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

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-42 :: Design "
			+ "Steps::33,34,35,36(Enter plain email message in the message body,click "
			+ "send button,verify email warning message,check the used stamps.)")
	public void writeEmailForTC42AndVerify() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsgFilter);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description =  "TestCases::WTC-37 ::DesignSteps"
			+ "::37,38,39(Click on continue button,verify email confirmation message "
			+ "and number.)")
	public void sendEmailForTC42AndVerify() {

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

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-42 :: Design "
			+ "Steps::40,41,42(Click on Home link,verify page title and click logout.)")
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

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-42 :: Design "
			+ "Steps::43,44,45,46,47(Navigate to facility site,enter username,pincode,"
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

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-42 :: Design Steps"
			+ "::48,49,50,51,52,53,54,55(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void clickMailSearchForTC42AndVerifyStatus() {
		
		jpayFacility().facilityEmail().pause(125000);
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusFilter);
		
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on email tab link,click on word filter system link,click on 
	 * search link,enter flagged word,click on go button,check 
	 * deactivate checkbox and click deactivate button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-42 :: Design "
			+ "Steps::56,57,58,59,60,61,62(Click on email tab link,click on word filter "
			+ "system link,click on search link,enter flagged word,click on go button,"
			+ "check deactivate checkbox and click deactivate button.)")
	public void deactivateFilteredWord1() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickWordFilterSysButton();
		jpayFacility().facilityEmail().clickWordSearchLink();
		jpayFacility().facilityEmail().enterFlagWordToSearch(flagWord1);
		jpayFacility().facilityEmail().clickWordSearchGoButton();
		jpayFacility().facilityEmail().checkDeactivateCheckbox();
		jpayFacility().facilityEmail().clickDeactivateButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter flagged word,click on go button,check 
	 * deactivate checkbox and click deactivate button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-42 :: Design "
			+ "Steps::63,64,65,66(Enter flagged word,click on go button,check deactivate "
			+ "checkbox and click deactivate button.)")
	public void deactivateFilteredWord2() {

		jpayFacility().facilityEmail().enterFlagWordToSearch(flagWord2);
		jpayFacility().facilityEmail().clickWordSearchGoButton();
		jpayFacility().facilityEmail().checkDeactivateCheckbox();
		jpayFacility().facilityEmail().clickDeactivateButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter flagged word,click on go button,check 
	 * deactivate checkbox and click deactivate button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-42 :: Design "
			+ "Steps::67,68,69,70(Enter flagged word,click on go button,"
			+ "check deactivate checkbox and click deactivate button.)")
	public void deactivateFilteredWord3() {

		jpayFacility().facilityEmail().enterFlagWordToSearch(flagWord3);
		jpayFacility().facilityEmail().clickWordSearchGoButton();
		jpayFacility().facilityEmail().checkDeactivateCheckbox();
		jpayFacility().facilityEmail().clickDeactivateButton();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-42 :: Design "
			+ "Steps::71(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	



	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_42Test(data) };
	}
	
	
	public EmailWTC_42Test(Map<String, String> data) {
		super(data);
		
		username = data.get("username");
		password =data.get("password");
		variation = data.get("variation");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		pinCode = data.get("pinCode");
		usernameFacility = data.get("usernameFacility");
		passwordFacility = data.get("passwordFacility");
		emailMsgFilter = data.get("emailMsgFilter");
		letterStatusFilter = data.get("letterStatusFilter");
		flagWord1 = data.get("flagWord1");
		flagWord2 = data.get("flagWord2");
		flagWord3 = data.get("flagWord3");
		addSuccessMessage = data.get("addSuccessMessage");
		
	}

	


}
