package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC01 - (User shall be able to Delete/Add Inmate in WWW & Staging)
 * Author :: shasan(Shahriar Hasan) , Date :: 07/15/2019
 * DataFile :: Email.xlsx , DataSheet :: WTC56
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_56Test extends BaseTestObject{
	


	private String variation;
	private String state;
	private String inmateId;
	public String password = "";
	private String username;
	private String relation;
	private String personalDetails;
	private String adminSystem;
	private String usernameStaging;
	private String passwordStaging;
	private String account;
	private String prison;
	

	



	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-56:: Design Steps"
			+ "::1,2(Click on login link and verify page title.)")
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

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-56 :: Design Steps"
			+ "::3,4,5,6(Enter username,password,click login button and verify title of the page.)")
	public void loginAndVerify1() {

		jpayEmail().login().enterUsername(username);
		jpayEmail().login().enterPassword(password);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}
	
	/*********************************************************************************
	 * 
	 * Click on inmate search link,click on delete button and click on ok button from popup.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-56:: Design Steps"
			+ "::7,8,9(Click on inmate search link,click on delete button and click "
			+ "on ok button from popup.)")
	public void deleteInmateFromWWW() {

		jpayEmail().home().clickInmateSearch();
		jpayEmail().home().clickDeleteButton();
		jpayEmail().home().acceptAlert();
		jpayEmail().home().verifyInmateDeleted();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Enter inmate state,inmate id,click on search button,click inmate name,select relation and click on continue button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-56:: Design Steps"
			+ "::10,11,12,13,14,15(Enter inmate state,inmate id,click on search button,"
			+ "click inmate name,select relation and click on continue button.)")
	public void addInmateToWWW() {

		jpayEmail().home().enterInmateState(state);
		jpayEmail().home().enterInmateId(inmateId);
		jpayEmail().home().clickSearchButton();
		jpayEmail().home().clickInmateNameLink();
		jpayEmail().home().selectRelationWithInmate(relation);
		jpayEmail().home().clickAddInmateContinueButton();
		jpayEmail().home().verifyInmateAdded();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on home link,verify title of the page and click logout button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-56::Design Steps::"
			+ "16,17,18( Click on home link,verify title of the page and click logout button)")
	public void logoutFromWWW() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().signup().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
	}
	

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-56 ::Design Steps"
			+ "::19,20,21,22,23,24(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void loginToStaging() {
		
		jpayStaging().stagingLogin().loadURL(envUrlStaging);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(usernameStaging);
		jpayStaging().stagingLogin().enterPassword(passwordStaging);
		jpayStaging().stagingLogin().clickLoginButton();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on Transfers,click lookup account link,select search inmate by 
	 * account#,enter inmate account number,click search button,click on 
	 * inmate account,click on inmate details,check delete checkbox,
	 * click on delete button and verify inmate deleted.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-56 ::Design Steps"
			+ "::25,26,27,28,29,30,31,32,33,34,35(Click on Transfers,click lookup account "
			+ "link,select search inmate by account#,enter inmate account number,click "
			+ "search button,click on inmate account,click on inmate details,check "
			+ "delete checkbox,click on delete button and verify inmate deleted.)")
	public void deleteInmateFromStaging() {
		
		jpayStaging().stagingHome().clickTransfers();
		jpayStaging().stagingTransfers().clickLookupAccountLink();
		jpayStaging().stagingTransfers().selectSearchInmateByAccount();
		jpayStaging().stagingTransfers().enterInmateAccount(account);
		jpayStaging().stagingTransfers().clickInmateAccSearchButton();
		jpayStaging().stagingTransfers().clickInmateAccLink();
		jpayStaging().stagingTransfers().clickInmateAccountDetailsLink();
		jpayStaging().stagingTransfers().checkInmateRemovebox();
		jpayStaging().stagingTransfers().clickInmateDeleteButton();
		jpayStaging().stagingTransfers().acceptAlert();
		jpayStaging().stagingTransfers().verifyInmateDeleted();
		
	}
	
	
	
	/*********************************************************************************
	 * 
	 * Click on add inmate button,navigate to child window,select inmate state,
	 * click on continue button,enter inmateid,select relationship,click on 
	 * continue button,click add button,navigate to main window,refresh and 
	 * verify inmate added.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-56 ::Design Steps"
			+ "::36,37,38,39,40,41,42,43,44,45,46,47(Click on add inmate button,navigate "
			+ "to child window,select inmate state,click on continue button,enter inmateid,"
			+ "select relationship,click on continue button,click add button,navigate to "
			+ "main window,refresh and verify inmate added.)")
	public void addInmateToStaging() {
		
		jpayStaging().stagingTransfers().clickAddAnInmateButton();
		jpayStaging().stagingTransfers().navigateToChildWindow();
		jpayStaging().stagingTransfers().selectAddAnInmateState(state);
		jpayStaging().stagingTransfers().clickAddInmateStateSelContinueButton();
		jpayStaging().stagingTransfers().selectAddAnInmatePrison(prison);
		jpayStaging().stagingTransfers().clickAddInmatePrisonSelContinueButton();
		jpayStaging().stagingTransfers().enterAddInmateId(inmateId);
		jpayStaging().stagingTransfers().selectAddAnInmateRelation(relation);
		jpayStaging().stagingTransfers().clickAddInmateRelationContinueButton();
		jpayStaging().stagingTransfers().clickFinalAddInmateAddButton();
		jpayStaging().stagingTransfers().navigateToWindowByTitle(PageConstant.SEARCH_ACCOUNTS_TITLE);
		jpayStaging().stagingTransfers().verifyInmateAdded();
		
		
	}
	

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-56 ::Design Steps::"
			+ "48,49(Click sign out button and verify Login details.)")
	public void endTest() {
		
		jpayStaging().stagingTransfers().navigateToWindowByTitle(PageConstant.SEARCH_ACCOUNTS_TITLE);
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		
	}
	
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_56Test(data) };
	}
	
	
	public EmailWTC_56Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		state = data.get("state");
		inmateId = data.get("inmateId");
		password = data.get("password");
		username = data.get("username");
		relation = data.get("relation");
		personalDetails = data.get("personalDetails");
		usernameStaging = data.get("usernameStaging");
		passwordStaging = data.get("passwordStaging");
		adminSystem = data.get("adminSystem");
		account = data.get("account");
		prison = data.get("prison");
		
		
	}

	


}
