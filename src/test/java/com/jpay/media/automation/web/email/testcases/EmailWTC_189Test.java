package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC189 - (User shall not be able to send email to inmate using Inmate forbidden user.)
 * Author :: shasan(Shahriar Hasan) , Date :: 07/15/2019
 * DataFile :: Email.xlsx , DataSheet :: WTC189
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_189Test extends BaseTestObject{
	


	private String pinCode;
	private String variation;
	private String inmateId;
	private String comment;
	private String facilityUsername;
	private String facilityPassword;
	private String accountName1;
	private String accountName2;
	private String wwwUsername1;
	private String wwwPassword;
	private String wwwUsername2;
	
	
	/*********************************************************************************
	 * 
	 * Navigate to facility,enter username,password,pincode and click on login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-189::DesignSteps::"
			+ "1,2,3,4,5(Navigate to facility,enter username,password,pincode and click "
			+ "on login button.)")
	public void testStart() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(facilityUsername);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(facilityPassword);
		jpayFacility().facilityLogin().clickLoginButton();
		
		
	}

	/*********************************************************************************
	 * 
	 * Click on show inmate ACL link,enter inmate id,click on show inmate acl list 
	 * button,click on add inmate forbidden list button,enter comment,click add 
	 * button,click on add inmate forbidden list button,enter comment,click add 
	 * button,verify accounts are present in opt-in list.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-189::DesignSteps"
			+ "::6,7,8,9,10,11,12,13,14,15,16(Click on show inmate ACL link,enter inmateid,"
			+ "click on show inmate acl list button,click on add inmate forbidden list "
			+ "button,enter comment,click add button,click on add inmate forbidden list "
			+ "button,enter comment,click add button,verify accounts are present in "
			+ "opt-in list.)")
	public void addInmatesToForbiddenListAndVerify() {

		jpayFacility().facilityAdmin().clickShowInmateACLLink();
		jpayFacility().facilityAdmin().enterSIAInmateId(inmateId);
		jpayFacility().facilityAdmin().clickSIAShowInmateACLListButton();
		jpayFacility().facilityAdmin().clickSIAAddInmateForbiddenListButton(accountName1);
		jpayFacility().facilityAdmin().enterSIAComment(comment);
		jpayFacility().facilityAdmin().clickSIAAddButton();
		jpayFacility().facilityAdmin().clickSIAAddInmateForbiddenListButton(accountName2);
		jpayFacility().facilityAdmin().enterSIAComment(comment);
		jpayFacility().facilityAdmin().clickSIAAddButton();
		jpayFacility().facilityAdmin().verifySIAInmatePresentInInmateForbiddenList(accountName1);
		jpayFacility().facilityAdmin().verifySIAInmatePresentInInmateForbiddenList(accountName2);
		
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-79,80:: Design "
			+ "Steps::17(Click sign out button .)")
	public void logoutFromFacility() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}

	/*********************************************************************************
	 * 
	 * Navigate to www,click on login link,verify page title,enter username,password 
	 * and click on login button and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-189:: DesignSteps::"
			+ "18,19,20,21,22,23,24(Navigate to www,click on login link,verify page title,"
			+ "enter username,password and click on login button and verify page title.)")
	public void loginToWWW1() {
		
		jpayEmail().login().loadURL(envUrlJpay);
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		jpayEmail().login().enterUsername(wwwUsername1);
		jpayEmail().login().enterPassword(wwwPassword);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}


	/*********************************************************************************
	 * 
	 * Click on email link,forbidden inmates message box present and click on ok button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-189::DesignSteps::"
			+ "25,26,27(Click on email link,forbidden inmates message box present and "
			+ "click on ok button.)")
	public void verifyForbiddenInmateEmailMessage1() {

		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().verifyForbiddenInmatesMessagePresent();
		jpayEmail().email().clickForbiddenInmatesMessageBoxOkButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-189:: DesignSteps::"
			+ "28(Click logout.)")
	public void logoutFromWWW1() {
		
		jpayEmail().login().clickLogoutButton();
		
	}


	/*********************************************************************************
	 * 
	 * Navigate to www,click on login link,verify page title,enter username,password 
	 * and click on login button and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-189:: DesignSteps::"
			+ "29,30,31,32,33,34(Click on login link,verify page title,"
			+ "enter username,password and click on login button and verify page title.)")
	public void loginToWWW2() {
		
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		jpayEmail().login().enterUsername(wwwUsername2);
		jpayEmail().login().enterPassword(wwwPassword);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}


	/*********************************************************************************
	 * 
	 * Click on email link,forbidden inmates message box present and click on ok button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-189::DesignSteps::"
			+ "35,36,37(Click on email link,forbidden inmates message box present and "
			+ "click on ok button.)")
	public void verifyForbiddenInmateEmailMessage2() {

		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().verifyForbiddenInmatesMessagePresent();
		jpayEmail().email().clickForbiddenInmatesMessageBoxOkButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-189:: DesignSteps::"
			+ "38(Click logout.)")
	public void logoutFromWWW2() {
		
		jpayEmail().login().clickLogoutButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to facility,enter username,password,pincode and click on login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-189::DesignSteps::"
			+ "39,40,41,42,43(Navigate to facility,enter username,password,pincode and "
			+ "click on login button.)")
	public void logonToFacility() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility);
		jpayFacility().facilityLogin().enterUsername(facilityUsername);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(facilityPassword);
		jpayFacility().facilityLogin().clickLoginButton();
		
		
	}

	/*********************************************************************************
	 * 
	 * Click on show inmate ACL link,enter inmate id,click on show inmate acl list 
	 * button,click on delete button of 1st account,click on delete button of 2nd 
	 * account verify account is absent in opt-in list.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-1899::DesignSteps::"
			+ "44,45,46,47,48,49,50(Click on show inmate ACL link,enter inmateid,click on "
			+ "show inmate acl list button,click on delete button of 1st account,click "
			+ "on delete button of 2nd account verify account is absent in opt-in list.)")
	public void deleteInmateFromForbiddenListAndVerify() {

		jpayFacility().facilityAdmin().clickShowInmateACLLink();
		jpayFacility().facilityAdmin().enterSIAInmateId(inmateId);
		jpayFacility().facilityAdmin().clickSIAShowInmateACLListButton();
		jpayFacility().facilityAdmin().clickSIAInmateForbiddenDeleteButtonByaccountName(accountName1);
		jpayFacility().facilityAdmin().clickSIAInmateForbiddenDeleteButtonByaccountName(accountName2);
		jpayFacility().facilityAdmin().verifySIAInmateAbsentInInmateForbiddenList(accountName1);
		jpayFacility().facilityAdmin().verifySIAInmateAbsentInInmateForbiddenList(accountName2);
		
	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-189:: Design "
			+ "Steps::51(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_189Test(data) };
	}
	
	
	public EmailWTC_189Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		facilityPassword = data.get("facilityPassword");
		facilityUsername = data.get("facilityUsername");
		pinCode = data.get("pinCode");
		inmateId = data.get("inmateId");
		comment = data.get("comment");
		wwwPassword = data.get("wwwPassword");
		wwwUsername1 = data.get("wwwUsername1");
		wwwUsername2 = data.get("wwwUsername2");
		accountName1 = data.get("accountName1");
		accountName2 = data.get("accountName2");
		
		
		
		
		
	}

	


}
