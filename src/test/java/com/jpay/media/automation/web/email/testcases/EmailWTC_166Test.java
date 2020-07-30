package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC166 - (Destination Mail Bucket should be "Censored")
 * Author :: shasan(Shahriar Hasan) , Date ::
 * DataFile :: Email.xlsx , DataSheet :: WTC166
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_166Test extends BaseTestObject{
	

	private String variation;
	private String passwordSuper;
	private String usernameSuper;
	private String pinCode;
	private String inmateId;
	private String inmateName;
	private String ifsHeaderText;
	private String emptyInmateIdErrorMsg;
	private String emptyInmateNameErrorMsg;
	private String mailReason;
	private String moneyReason;
	private String successMessage;
	private String usernameJpay;
	private String passwordJpay;
	private String emailMsg;
	private String warnMsg;
	private String conMsg;
	private String letterStatusFilter;
	private String emptySearchErrorMsg;
	private String searchById;
	private String inmateRecordFoundText;
	private String activeText;
	private String mailStatusReason;
	private String inactiveText;
	private String MoneyStatusReason;
	

	
	public static String Confirmation_Number ="";

	/*********************************************************************************
	 * 
	 * Navigate to facility,enter username,pincode,password and click on login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-166::DesignSteps"
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-166::Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15,16,17,18,19,20(Click on INTEL tab link,click "
			+ "on inmate filter link,verify header text,click add link,click on add inmate "
			+ "button and verify empty inmate id and name error message,enter inmate id,name,"
			+ "check mail watch list checkbox,enter mail watch list reason,check money watch "
			+ "list checkbox,enter money watch list reason,click on add inmate button and "
			+ "verify update success message.)")
	public void addInmateToFilterAndVerify() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickInmateFilterSystemLink();
		jpayFacility().facilityIntel().verifyInmateFilterSystemHeaderText(ifsHeaderText);
		jpayFacility().facilityIntel().clickIFSAddLink();
		jpayFacility().facilityIntel().clickIFSAddInmateButton();
		jpayFacility().facilityIntel().verifyIFSEmptyInmateIdErrorMessage(emptyInmateIdErrorMsg);
		jpayFacility().facilityIntel().verifyIFSEmptyInmateNameErrorMessage(emptyInmateNameErrorMsg);
		jpayFacility().facilityIntel().enterIFSInmateID(inmateId);
		jpayFacility().facilityIntel().enterIFSInmateName(inmateName);
		jpayFacility().facilityIntel().selectIFSDestinationMailBucket(letterStatusFilter);
		jpayFacility().facilityIntel().checkIFSMailWatchListEnable();
		jpayFacility().facilityIntel().enterIFSMailWatchListReason(mailReason);
		jpayFacility().facilityIntel().checkIFSMoneyWatchListEnable();
		jpayFacility().facilityIntel().enterIFSMoneyWatchListReason(moneyReason);
		jpayFacility().facilityIntel().clickIFSAddInmateButton();
		jpayFacility().facilityIntel().verifyIFSAddSuccessMessage(successMessage);//
		
	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-166:: Design "
			+ "Steps::21(Click sign out button .)")
	public void logoutFromFacility1() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}

	/*********************************************************************************
	 * 
	 * Navigate to jpay,click on log in,enter username,password,click login 
	 * button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-166::DesignSteps::"
			+ "22,23,24,25,26,27,28(Navigate to jpay,click on log in,enter username,password,"
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

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-166:: DesignSteps"
			+ "::29,30,31,32,33(Enter plain email message in the message body,click "
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

	@Test(enabled = true, priority = 6, description =  "TestCases::WTC-166::DesignSteps"
			+ "::34,35,36(Click on continue button,verify email confirmation message and number.)")
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

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-166::DesignSteps::"
			+ "37,38,39(Click on Home link,verify page title and click logout.)")
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

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-166::DesignSteps::"
			+ "40,41,42,43,44(Navigate to facility site,enter username,pincode,"
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

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-166:: DesignSteps"
			+ "::45,46,47,48,49,50,51,52(Click on email link,click on search link,select "
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
	 * Click on INTEL tab link,click on inmate filter link,verify header text,click 
	 * search link,click on go button and verify empty search error message,select 
	 * search by id,enter inmate id,click on go button and verify record found 
	 * message,inmate name,id,mail watch list status and money watch list status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-166::DesignSteps::"
			+ "53,54,55,56,57,58,59,60,61,62,63,64,65,66,67(Click on INTEL tab link,click "
			+ "on inmate filter link,verify header text,click search link,click on go button "
			+ "and verify empty search error message,select search by id,enter inmate id,"
			+ "click on go button and verify record found message,inmate name,id,mail watch "
			+ "list status and money watch list status.)")
	public void searchFilteredInmateAndVerify() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickInmateFilterSystemLink();
		jpayFacility().facilityIntel().verifyInmateFilterSystemHeaderText(ifsHeaderText);
		jpayFacility().facilityIntel().clickIFSSearchLink();
		jpayFacility().facilityIntel().clickIFSSearchGoButton();
		jpayFacility().facilityIntel().verifyIFSEmptySearchErrorMsg(emptySearchErrorMsg);
		jpayFacility().facilityIntel().selectIFSSearchBy(searchById);
		jpayFacility().facilityIntel().enterIFSSearchString(inmateId);
		jpayFacility().facilityIntel().clickIFSSearchGoButton();
		jpayFacility().facilityIntel().verifyIFSSearchRecordFoundText(inmateRecordFoundText);
		jpayFacility().facilityIntel().verifyIFSSearchInmateName(inmateName);
		jpayFacility().facilityIntel().verifyIFSSearchInmateId(inmateId);
		jpayFacility().facilityIntel().verifyIFSSearchMailWatchListStatus(activeText);
		jpayFacility().facilityIntel().verifyIFSSearchMoneyWatchListStatus(activeText);
		
	}

	/*********************************************************************************
	 * 
	 * Click on mail watch list status,enter mail watch list status update reason,
	 * click inactive radio button,click on update status button,click search link,
	 * click on go button and verify empty search error message,select search by id,
	 * enter inmate id,click on go button and verify record found message,inmate name,
	 * id,mail watch list status and money watch list status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-166::DesignSteps::"
			+ "68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84(Click on mail watch list "
			+ "status,enter mail watch list status update reason,click inactive radio button,"
			+ "click on update status button,click search link,click on go button and verify "
			+ "empty search error message,select search by id,enter inmate id,click on go "
			+ "button and verify record found message,inmate name,id,mail watch list status "
			+ "and money watch list status.)")
	public void inactiveMailWatchListAndVerify() {

		jpayFacility().facilityIntel().clickIFSSearchMailWatchListStatus();
		jpayFacility().facilityIntel().enterIFSSearchMailWatchListStatusReason(mailStatusReason);
		jpayFacility().facilityIntel().clickIFSSearchMailWatchListInactiveRadioButton();
		jpayFacility().facilityIntel().clickIFSSearchMailWatchListStatusUpdateButton();
		jpayFacility().facilityIntel().clickIFSSearchLink();
		jpayFacility().facilityIntel().clickIFSSearchGoButton();
		jpayFacility().facilityIntel().verifyIFSEmptySearchErrorMsg(emptySearchErrorMsg);
		jpayFacility().facilityIntel().selectIFSSearchBy(searchById);
		jpayFacility().facilityIntel().enterIFSSearchString(inmateId);
		jpayFacility().facilityIntel().clickIFSSearchGoButton();
		jpayFacility().facilityIntel().verifyIFSSearchRecordFoundText(inmateRecordFoundText);
		jpayFacility().facilityIntel().verifyIFSSearchInmateName(inmateName);
		jpayFacility().facilityIntel().verifyIFSSearchInmateId(inmateId);
		jpayFacility().facilityIntel().verifyIFSSearchMailWatchListStatus(inactiveText);
		jpayFacility().facilityIntel().verifyIFSSearchMoneyWatchListStatus(activeText);
		
	}

	/*********************************************************************************
	 * 
	 * Click on mail watch list status,enter mail watch list status update reason,
	 * click inactive radio button,click on update status button,click search link,
	 * click on go button and verify empty search error message,select search by id,
	 * enter inmate id,click on go button and verify record found message,inmate name,
	 * id,mail watch list status and money watch list status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-166::DesignSteps::"
			+ "85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101(Click on money watch list "
			+ "status,enter money watch list status update reason,click inactive radio button,"
			+ "click on update status button,click search link,click on go button and verify "
			+ "empty search error message,select search by id,enter inmate id,click on go "
			+ "button and verify record found message,inmate name,id,mail watch list status "
			+ "and money watch list status.)")
	public void inactiveMoneyWatchListAndVerify() {

		jpayFacility().facilityIntel().clickIFSSearchMoneyWatchListStatus();
		jpayFacility().facilityIntel().enterIFSSearchMoneyWatchListStatusReason(MoneyStatusReason);
		jpayFacility().facilityIntel().clickIFSSearchMoneyWatchListInactiveRadioButton();
		jpayFacility().facilityIntel().clickIFSSearchMoneyWatchListStatusUpdateButton();
		jpayFacility().facilityIntel().clickIFSSearchLink();
		jpayFacility().facilityIntel().clickIFSSearchGoButton();
		jpayFacility().facilityIntel().verifyIFSEmptySearchErrorMsg(emptySearchErrorMsg);
		jpayFacility().facilityIntel().selectIFSSearchBy(searchById);
		jpayFacility().facilityIntel().enterIFSSearchString(inmateId);
		jpayFacility().facilityIntel().clickIFSSearchGoButton();
		jpayFacility().facilityIntel().verifyIFSSearchRecordFoundText(inmateRecordFoundText);
		jpayFacility().facilityIntel().verifyIFSSearchInmateName(inmateName);
		jpayFacility().facilityIntel().verifyIFSSearchInmateId(inmateId);
		jpayFacility().facilityIntel().verifyIFSSearchMailWatchListStatus(inactiveText);
		jpayFacility().facilityIntel().verifyIFSSearchMoneyWatchListStatus(inactiveText);
		
	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-166:: Design "
			+ "Steps::102(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_166Test(data) };
	}
	
	
	public EmailWTC_166Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		passwordSuper = data.get("passwordSuper");
		usernameSuper = data.get("usernameSuper");
		pinCode = data.get("pinCode");
		inmateId = data.get("inmateId");
		inmateName = data.get("inmateName");
		ifsHeaderText = data.get("ifsHeaderText");
		emptyInmateIdErrorMsg = data.get("emptyInmateIdErrorMsg");
		emptyInmateNameErrorMsg = data.get("emptyInmateNameErrorMsg");
		mailReason = data.get("mailReason");
		moneyReason = data.get("moneyReason");
		successMessage = data.get("successMessage");
		usernameJpay = data.get("usernameJpay");
		passwordJpay = data.get("passwordJpay");
		emailMsg = data.get("emailMsg");
		warnMsg = data.get("warnMsg");
		conMsg = data.get("conMsg");
		letterStatusFilter = data.get("letterStatusFilter");
		emptySearchErrorMsg = data.get("emptySearchErrorMsg");
		searchById = data.get("searchById");
		inmateRecordFoundText = data.get("inmateRecordFoundText");
		activeText = data.get("activeText");
		mailStatusReason = data.get("mailStatusReason");
		inactiveText = data.get("inactiveText");
		MoneyStatusReason = data.get("MoneyStatusReason");
		
		
		
	}


}
