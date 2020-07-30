package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_184To186Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String variation;
	private String warnMsg;
	private String conMsg;
	private String pinCode;
	private String passwordFacility;
	private String inmate;
	private String emailMsg184;
	private String frameId;
	private String code;
	private String buySuccMsg;
	private String emailMsgLarge;
	private String filenamePng;
	private String letterStatusReleased;
	private String inmateBlocked;
	private String inmateGood;
	

	public static String Facility_Username ="";
	public static String Confirmation_Number ="";
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC184To186-(184.User shall  be able to send email to good inmate using general forbidden user & check letter status in facility
	 *                          185.User shall  be able to buy stamps with good inmate using general forbidden user
	 *                          186.User shall  be able to send email with all attach & prepaid to good inmate using general forbidden user)
	 *             
	 *            
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC184To186
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.135270560,135270561
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-184,185,186 :: Design "
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-184,185,186:: Design "
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
	 * Click on email link,forbidden inmates message box present and click on ok button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-184::Design "
			+ "Steps::7,8,9(Click on email link,forbidden inmates message box present and "
			+ "click on ok button.)")
	public void verifyForbiddenInmatesEmailMessageForTc184() {

		jpayEmail().login().selectInmate(inmateBlocked);
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().verifyForbiddenInmatesMessagePresent();
		jpayEmail().email().clickForbiddenInmatesMessageBoxOkButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on home link,select inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-184:: Design "
			+ "Steps::10,11,12(Click on home link,select inmate and click on email link.)")
	public void selectInmateAndClickEmailTab1() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectInmate(inmateGood);
		Facility_Username = jpayEmail().login().setFacilityUsername();
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click send button,
	 * verify email warning message and stamps used.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-184:: Design "
			+ "Steps::13,14,15,16(Enter plain email message in the message body,click "
			+ "send button,verify email warning message and check the used stamps.)")
	public void writeEmailAndVerifyForTC184() {

		jpayEmail().email().enterEmailMessageBodyRan(emailMsg184);
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_1);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description =  "TestCases::WTC-184::DesignSteps"
			+ "::17,18,19(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyForTC184() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		Confirmation_Number = jpayEmail().email().getConfirmationNumber();
		
	}


	/*********************************************************************************
	 * 
	 * Click on email link,forbidden inmates message box present and click on ok button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-185::Design "
			+ "Steps::7,8,9(Click on email link,forbidden inmates message box present and "
			+ "click on ok button.)")
	public void verifyForbiddenInmatesEmailMessageForTc185() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectInmate(inmateBlocked);
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().verifyForbiddenInmatesMessagePresent();
		jpayEmail().email().clickForbiddenInmatesMessageBoxOkButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on home link,select inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-185:: Design "
			+ "Steps::10,11,12(Click on home link,select inmate and click on email link.)")
	public void selectInmateAndClickEmailTab2() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectInmate(inmateGood);
		Facility_Username = jpayEmail().login().setFacilityUsername();
		jpayEmail().headerNavigation().clickEmailLink();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click email link,click on buy stamps,select random buy options,click on
	 * continue button,enter card no.,select card type,enter expiration month
	 * and year,enter validation code,accept terms-condition,click on buy stamps
	 * and verify purchase success message,purchase date and confirmation
	 * number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-185::Design Steps::"
			+ "13,14,15,16,17,18,19,20,21,22,23( Click email link,click on buy stamps,"
			+ "select random buy options,click on continue button,enter validation code,"
			+ "accept terms-condition,click on buy stamps and verify purchase success "
			+ "message,purchase date and confirmation number.)")
	public void clickEmailBuyStampsAndVerifyForTC185() {

		jpayEmail().email().clickBuyStampsLink();
		jpayEmail().buyStamps().selectRandomMoneyRadioButton();
		jpayEmail().buyStamps().clickContinueButton();
		jpayEmail().buyStamps().switchToIframeById(frameId);
		jpayEmail().buyStamps().enterCreditValCodeForExistingCard(code);
		jpayEmail().buyStamps().checkAcceptedTerms();
		jpayEmail().buyStamps().switchToParentWindow();
		jpayEmail().buyStamps().clickBuyStampsButton();
		jpayEmail().buyStamps().verifyBuyStampsSuccessMessage(buySuccMsg);
		jpayEmail().buyStamps().verifyPurchaseDate();
		jpayEmail().buyStamps().VerifyConfirmationNumberVisible();
	}

	/*********************************************************************************
	 * 
	 * Click on email link,forbidden inmates message box present and click on ok button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-186::Design "
			+ "Steps::7,8,9(Click on email link,forbidden inmates message box present and "
			+ "click on ok button.)")
	public void verifyForbiddenInmatesEmailMessageForTc186() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectInmate(inmateBlocked);
		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().verifyForbiddenInmatesMessagePresent();
		jpayEmail().email().clickForbiddenInmatesMessageBoxOkButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on home link,select inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-186:: Design "
			+ "Steps::10,11,12(Click on home link,select inmate and click on email link.)")
	public void selectInmateAndClickEmailTab3() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().selectInmate(inmateGood);
		Facility_Username = jpayEmail().login().setFacilityUsername();
		jpayEmail().headerNavigation().clickEmailLink();
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter email message in the message body,click attach ecard,
	 * select random ecard category,click on continue button,click 
	 * send button,verify email warning message,click on continue 
	 * button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-186::DesignSteps::"
			+ "13,14,15,16,17,18,19,20,21,22,23,24,25,26(Enter large email message in the "
			+ "message body,check prepaid box,click attach ecard,select random ecard "
			+ "category,click on continue button,click on choose file,enter filepath in "
			+ "the file explorer,click on open,click on attach,click on continue button,"
			+ "click send button,verify email warning message,check the used stamps.)")
	public void writeEmailAndVerifyForTC186() {

		jpayEmail().email().prerequisiteSendEmail();
		jpayEmail().email().enterEmailMessageBodyEmojiRan(emailMsgLarge);
		jpayEmail().email().checkPrepaidBox();
		jpayEmail().email().clickAttachECard();
		jpayEmail().email().selectRandomEcardCatagory();
		jpayEmail().email().attachRandomEcard();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickAttachImage();
		jpayEmail().email().clickChooseFile(PageConstant.TEST_FILE_PATH+filenamePng);
		//jpayEmail().email().enterFilePathInExplorerUsingRobot(PageConstant.TEST_FILE_PATH+filenamePng);
		jpayEmail().email().clickAttachButton();
		jpayEmail().email().clickAttachEcardContinueButton();
		jpayEmail().email().clickSendButton();
		jpayEmail().email().verifyEmailWarningMessage(warnMsg);
		jpayEmail().email().verifyStampsUsed(PageConstant.STAMPS_COUNT_6);//1 stamp(s) to send this letter
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on continue button,verify email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description =  "TestCases::WTC-186:DesignSteps"
			+ "::24,25,26(Click on continue button,verify email confirmation message and number.)")
	public void sendEmailAndVerifyForTC186() {

		jpayEmail().email().clickSendContinueButton();
		jpayEmail().email().verifyEmailSendConfirmMessage(conMsg);
		jpayEmail().email().VerifyEmailConfirmationNumberVisible();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-184,185,186:: Design "
			+ "Steps::(Click on Home link,verify page title and click logout.)")
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

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-184:: Design "
			+ "Steps::22,23,24,25,26(Navigate to facility site,enter username,pincode,"
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

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-184:: Design Steps"
			+ "::27,28,29,30,31,32,33,34(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void clickMailSearchForTC184AndVerifyStatus() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().pause(120000);
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusReleased);
		
	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-184:: Design "
			+ "Steps::35(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	



	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_184To186Test(data) };
	}
	
	
	public EmailWTC_184To186Test(Map<String, String> data) {
		super(data);
		
		
		
		username = data.get("username");
		password =data.get("password");
		variation = data.get("variation");
		inmateBlocked = data.get("inmateBlocked");
		inmateGood = data.get("inmateGood");
		emailMsg184 = data.get("emailMsg184");
		frameId = data.get("frameId");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("confirmationMsg");
		pinCode = data.get("pinCode");
		passwordFacility = data.get("passwordFacility");
		code = data.get("code");
		buySuccMsg = data.get("buySuccMsg");
		emailMsgLarge = data.get("emailMsgLarge");
		filenamePng = data.get("filenamePng");
		letterStatusReleased = data.get("letterStatusReleased");
		
		
		
	}

	


}
