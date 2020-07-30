package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_128To129Test extends BaseTestObject {

	
	
	private String variation;
	private String username;
	private String password;
	private String emailMsg128;
	private String warnMsg;
	private String conMsg;
	private String emailMsg129;
	private String pinCode;
	private String passwordFacility;
	private String letterStatusPhotoApproval;
	private String filenamePng;
	private String monNum;
	private String newToOld;
	private String discardMessage;
	private String sentToMessage;
	
	public static String Facility_Username;
	public static String Letter_Confirmation_128;
	public static String Letter_Confirmation_129;
	
	
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC128To129 -(128.Letter status shall be "Photo Approval" & user shall be able to discard (Inbound)
	 *                           129.Letter status shall be "Photo Approval" & user shall be able to Send to security (Inbound))
	 * Author :: shasan(Shahriar Hasan) , 
	 * Date :: DataFile :: 
	 * Email.xlsx ,
	 * DataSheet :: WTC128To129      Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-128,129::DesignSteps"
			+ "::1,2,3,4,5,6,7(Enter username,password,click login button and verify title"
			+ " of the page.)")
	public void testStart() {

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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-128,129::DesignSteps"
			+ "::8,9(Select random inmate and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().login().selectRandomInmate();
		Facility_Username = jpayEmail().login().setFacilityUsername();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter plain email message in the message body,attach image,click send 
	 * button,verify email warning message and check the used stamps.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-128:: DesignSteps"
			+ "::10,11,12,13,14,15,16,17,18,19,20(Enter plain email message in the message "
			+ "body,attach image,click send button,verify email warning message and "
			+ "check the used stamps.)")
	public void writeEmailAndVerifyForTC128() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg128);
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

	@Test(enabled = true, priority = 4, description =  "TestCases::WTC-128::DesignSteps::"
			+ "21,22,23(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyForTC128() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Letter_Confirmation_128 = jpayEmail().email().getConfirmationNumber();
	}

	/*********************************************************************************
	 * 
	 * Enter plain email message in the message body,attach image,click send 
	 * button,verify email warning message and check the used stamps.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-129:: DesignSteps"
			+ "::10,11,12,13,14,15,16,17,18,19,20(Enter plain email message in the message "
			+ "body,attach image,click send button,verify email warning message and "
			+ "check the used stamps.)")
	public void writeEmailAndVerifyForTC129() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyRan(emailMsg129);
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

	@Test(enabled = true, priority = 6, description =  "TestCases::WTC-1289::DesignSteps::"
			+ "21,22,23(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyForTC129() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Letter_Confirmation_129 = jpayEmail().email().getConfirmationNumber();
	}
	
	

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-128,129::DesignSteps"
			+ "::24,25,26(Click on Home link,verify page title and click logout.)")
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

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-128,129::DesignSteps"
			+ "::24,25,26,27,28(Navigate to facility site,enter username,pincode,"
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

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-128:: Design Steps"
			+ "::29,30,31,32,33,34,35,36(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void verifyLetterStatusForTC128() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().pause(182000);
		jpayFacility().facilityEmail().enterSearchContent(Letter_Confirmation_128);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusPhotoApproval);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on inbound photo approval bucket,click on 
	 * view letters from all location link,select letter delivery months,
	 * select sort by newest to oldest,click on photo attachment,click on 
	 * discard selected button,verify the popup message,click on cancel 
	 * button,click on discard selected button,verify the poopup message 
	 * and click on yes button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-128:: Design Steps"
			+ "::37,38,39,40,41,42,43,45,46,47,48(Click on email link,click on inbound photo "
			+ "approval bucket,click on view letters from all location link,select letter "
			+ "delivery months,select sort by newest to oldest,click on photo attachment,click "
			+ "on discard selected button,verify the popup message,click on cancel button,click "
			+ "on discard selected button,verify the poopup message and click on yes button.)")
	public void discardAttachmentAndVerifyForTC128() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickInboundPhotoApprovalBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monNum);
		jpayFacility().facilityEmail().selectSortBy(newToOld);
		jpayFacility().facilityEmail().click2ndImageAttachmentLink();
		jpayFacility().facilityEmail().clickDiscardSelectedButton();
		jpayFacility().facilityEmail().verifyImageApproveDiscardSecurityPopupMsg(discardMessage);
		jpayFacility().facilityEmail().clickImageApproveDiscardSecurityPopupCancelButton();
		jpayFacility().facilityEmail().clickDiscardSelectedButton();
		jpayFacility().facilityEmail().verifyImageApproveDiscardSecurityPopupMsg(discardMessage);
		jpayFacility().facilityEmail().clickImageApproveDiscardSecurityPopupYesButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go 
	 * button,click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-129:: Design Steps"
			+ "::29,30,31,32,33,34,35,36(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void verifyLetterStatusForTC129() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Letter_Confirmation_129);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusPhotoApproval);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on inbound photo approval bucket,click on view 
	 * letters from all location link,select letter delivery months,select sort 
	 * by newest to oldest,click on photo attachment,select reason for sent to 
	 * security,verify the popup message,click on cancel button,select reason 
	 * for sent to security,verify the poopup message and click on yes button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-129:: Design Steps"
			+ "::37,38,39,40,41,42,43,45,46,47,48(Click on email link,click on inbound photo "
			+ "approval bucket,click on view letters from all location link,select letter "
			+ "delivery months,select sort by newest to oldest,click on photo attachment,"
			+ "select reason for sent to security,verify the popup message,click on cancel "
			+ "button,select reason for sent to security,verify the poopup message and "
			+ "click on yes button.)")
	public void sentAttachmentToSecurityAndVerifyForTC129() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickInboundPhotoApprovalBucket();
		jpayFacility().facilityEmail().clickViewLetterFromAllLocationLink();
		jpayFacility().facilityEmail().selectLetterDeliveryMonths(monNum);
		jpayFacility().facilityEmail().selectSortBy(newToOld);
		jpayFacility().facilityEmail().click1StImageAttachmentLink();
		jpayFacility().facilityEmail().selectRandomSentToSecurityReason();
		jpayFacility().facilityEmail().verifyImageApproveDiscardSecurityPopupMsg(sentToMessage);
		jpayFacility().facilityEmail().clickImageApproveDiscardSecurityPopupCancelButton();
		jpayFacility().facilityEmail().selectRandomSentToSecurityReason();
		jpayFacility().facilityEmail().verifyImageApproveDiscardSecurityPopupMsg(sentToMessage);
		jpayFacility().facilityEmail().clickImageApproveDiscardSecurityPopupYesButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-128,129:: Design "
			+ "Steps::49(Click sign out button .)")
	public void logoutFromFacility() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/

	@Factory(dataProvider = "getData", dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String> data) {
		return new Object[] { new EmailWTC_128To129Test(data) };
	}

	public EmailWTC_128To129Test(Map<String, String> data) {
		super(data);

		username = data.get("username");
		password = data.get("password");
		variation = data.get("variation");
		emailMsg128 = data.get("emailMsg128");//
		warnMsg = data.get("warnMsg");
		conMsg = data.get("conMsg");
		emailMsg129 = data.get("emailMsg129");
		pinCode = data.get("pinCode");
		passwordFacility = data.get("passwordFacility");
		filenamePng = data.get("filenamePng");
		letterStatusPhotoApproval = data.get("letterStatusPhotoApproval");
		monNum = data.get("monNum");//6
		newToOld = data.get("newToOld");//
		discardMessage = data.get("discardMessage");//
		sentToMessage = data.get("sentToMessage");//
		

	}

	
	
}
