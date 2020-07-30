package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC164 - (User shall not be able to add inmate in filter system because its already exist & letter status "Requires Approval (flagged inmate)")
 * Author :: shasan(Shahriar Hasan) , Date ::
 * DataFile :: Email.xlsx , DataSheet :: WTC164
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_164Test extends BaseTestObject{
	

	private String variation;
	private String passwordSuper;
	private String usernameSuper;
	private String pinCode;
	private String inmateId1;
	private String inmateName1;
	private String ifsHeaderText;
	private String emptyInmateIdErrorMsg;
	private String emptyInmateNameErrorMsg;
	private String mailReason;
	private String moneyReason;
	private String existMessage;
	private String usernameJpay;
	private String passwordJpay;
	private String emailMsg;
	private String warnMsg;
	private String conMsg;
	private String letterStatusFilter;
	private String inmateId2;
	private String inmateName2;
	

	
	public static String Confirmation_Number ="";

	/*********************************************************************************
	 * 
	 * Navigate to facility,enter username,pincode,password and click on login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-164::DesignSteps"
			+ "::1,2,3,4,5(Navigate to facility,enter username,pincode,password and "
			+ "click on login button.)")
	public void testStart() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(usernameSuper);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordSuper);
		jpayFacility().facilityLogin().clickLoginButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on INTEL tab link,click on inmate filter link,verify header text,click 
	 * add link,click on add inmate button and verify empty inmate id and name error 
	 * message,enter inmate id,name,check mail watch list checkbox,enter mail watch 
	 * list reason,check money watch list checkbox,enter money watch list reason,
	 * click on add inmate button and verify update success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-164::Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15,16,17,18,19,20(Click on INTEL tab link,click "
			+ "on inmate filter link,verify header text,click add link,click on add inmate "
			+ "button and verify empty inmate id and name error message,enter inmate id,name,"
			+ "check mail watch list checkbox,enter mail watch list reason,check money watch "
			+ "list checkbox,enter money watch list reason,click on add inmate button and "
			+ "verify update success message.)")
	public void addExistingInmateToFilterAndVerify1() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickInmateFilterSystemLink();
		jpayFacility().facilityIntel().verifyInmateFilterSystemHeaderText(ifsHeaderText);
		jpayFacility().facilityIntel().clickIFSAddLink();
		jpayFacility().facilityIntel().clickIFSAddInmateButton();
		jpayFacility().facilityIntel().verifyIFSEmptyInmateIdErrorMessage(emptyInmateIdErrorMsg);
		jpayFacility().facilityIntel().verifyIFSEmptyInmateNameErrorMessage(emptyInmateNameErrorMsg);
		jpayFacility().facilityIntel().enterIFSInmateID(inmateId1);
		jpayFacility().facilityIntel().enterIFSInmateName(inmateName1);
		jpayFacility().facilityIntel().checkIFSMailWatchListEnable();
		jpayFacility().facilityIntel().enterIFSMailWatchListReason(mailReason);
		jpayFacility().facilityIntel().checkIFSMoneyWatchListEnable();
		jpayFacility().facilityIntel().enterIFSMoneyWatchListReason(moneyReason);
		jpayFacility().facilityIntel().clickIFSAddInmateButton();
		jpayFacility().facilityIntel().verifyIFSAddSuccessMessage(existMessage);//
		
	}

	/*********************************************************************************
	 * 
	 * Click on INTEL tab link,click on inmate filter link,verify header text,click 
	 * add link,click on add inmate button and verify empty inmate id and name error 
	 * message,enter inmate id,name,check mail watch list checkbox,enter mail watch 
	 * list reason,check money watch list checkbox,enter money watch list reason,
	 * click on add inmate button and verify update success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-164::Design Steps"
			+ "::21,22,23,24(Enter inmate id,name,check mail watch list checkbox,enter "
			+ "mail watch list reason,check money watch list checkbox,enter money watch "
			+ "list reason,click on add inmate button and verify update success message.)")
	public void addExistingInmateToFilterAndVerify2() {

		jpayFacility().facilityIntel().enterIFSInmateID(inmateId2);
		jpayFacility().facilityIntel().enterIFSInmateName(inmateName2);
		jpayFacility().facilityIntel().clickIFSAddInmateButton();
		jpayFacility().facilityIntel().verifyIFSAddSuccessMessage(existMessage);//
		
	}

	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-164:: Design "
			+ "Steps::25(Click sign out button .)")
	public void logoutFromFacility1() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}

	/*********************************************************************************
	 * 
	 * Navigate to jpay,click on log in,enter username,password,click login 
	 * button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-164::DesignSteps::"
			+ "26,27,28,29,30,31,32(Navigate to jpay,click on log in,enter username,password,"
			+ "click login button and verify title of the page.)")
	public void loginToJpay() {

		jpayEmail().login().loadURL(envUrlJpay);
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		jpayEmail().login().enterUsername(usernameJpay);
		jpayEmail().login().enterPassword(passwordJpay);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Click email link,enter email message in the message body,click send button,
	 * verify email warning message,click on continue button,verify 
	 * email confirmation message and number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-164:: DesignSteps"
			+ "::33,34,35,36,37(Enter plain email message in the message body,click "
			+ "send button,verify email warning message,check the used stamps.)")
	public void writeEmailAndVerify() {

		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().prerequisiteSendEmail();
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

	@Test(enabled = true, priority = 7, description =  "TestCases::WTC-164::DesignSteps::"
			+ "38,39,40(Click on continue button,verify email confirmation message and number.)")
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

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-164::DesignSteps::"
			+ "41,42,43(Click on Home link,verify page title and click logout.)")
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

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-164::DesignSteps::"
			+ "44,45,46,47,48(Navigate to facility site,enter username,pincode,"
			+ "password and click on login button .)")
	public void loginToFacilityAndVerify() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility);
		jpayFacility().facilityLogin().enterUsername(usernameSuper);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordSuper);
		jpayFacility().facilityLogin().clickLoginButton();
		
		
	}

	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,select search by letter id,
	 * wait for the status update,enter confirmation number,click on go button,
	 * click on view link and verify the letter status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-164:: DesignSteps"
			+ "::49,50,51,52,53,54,55,56(Click on email link,click on search link,select "
			+ "search by letter id,wait for the status update,enter confirmation number,"
			+ "click on go button,click on view link and verify the letter status.)")
	public void clickMailSearchAndVerifyStatus() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().pause(125000);
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(Confirmation_Number);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(letterStatusFilter);
		
	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-164:: Design "
			+ "Steps::57(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_164Test(data) };
	}
	
	
	public EmailWTC_164Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		passwordSuper = data.get("passwordSuper");
		usernameSuper = data.get("usernameSuper");
		pinCode = data.get("pinCode");
		inmateId1 = data.get("inmateId1");
		inmateName1 = data.get("inmateName1");
		inmateId2 = data.get("inmateId2");
		inmateName2 = data.get("inmateName2");
		ifsHeaderText = data.get("ifsHeaderText");
		emptyInmateIdErrorMsg = data.get("emptyInmateIdErrorMsg");
		emptyInmateNameErrorMsg = data.get("emptyInmateNameErrorMsg");
		mailReason = data.get("mailReason");
		moneyReason = data.get("moneyReason");
		existMessage = data.get("existMessage");
		usernameJpay = data.get("usernameJpay");
		passwordJpay = data.get("passwordJpay");
		emailMsg = data.get("emailMsg");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("conMsg");
		letterStatusFilter = data.get("letterStatusFilter");
		
		
		
	}


}
