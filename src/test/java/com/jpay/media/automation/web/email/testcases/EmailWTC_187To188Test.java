package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC187To188 - (187.User shall not be able to find inmate from the invalid search
 *                            188.User shall not be able to find inmate from the invalid search)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: WTC187To188
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_187To188Test extends BaseTestObject{
	


	private String variation;
	private String state1;
	private String invalidInmateId1;
	private String invalidInmateAlertText;
	private String state2;
	private String invalidInmateId2;
	private String invalidInmateId3;
	private String invalidInmateNoResultText;
	private String invalidInmateId4;
	private String invalidInmateId5;
	private String invalidInmateId6;
	private String username;
	private String password;
	

	


	/*********************************************************************************
	 * 
	 * Insert STATE name in search box,Insert inmate ID in search box and Click
	 * on next image button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "Design Steps::1,2(Insert STATE name in "
			+ "search box,Insert inmate ID in search box and Click on next button)")
	public void testStart() {
		
		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().signup().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
		
	}
	
	/*********************************************************************************
	 * 
	 * Select state,enter inmate id to search,click next button and verifyalert text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-187::Design Steps::"
			+ "3,4,5,6(Select state,enter inmate id to search,click next button and "
			+ "verify alert text.)")
	public void searchInmateAndVerify1ForTC187() {

		jpayEmail().signup().clickSelectStateDropdown();
		jpayEmail().signup().selectInmateState(state1);//
		jpayEmail().signup().pressTab();
		jpayEmail().signup().enterInmateIdByRobot(invalidInmateId1);//
		jpayEmail().signup().clickNextButton();
		jpayEmail().signup().verifyInvalidInmateSearchAlertText(invalidInmateAlertText);
	
	}

	/*********************************************************************************
	 * 
	 * Refresh page,select state,enter inmate id to search,click next button and verify alert text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-187::Design Steps::"
			+ "7,8,9,10,11(Refresh page,select state,enter inmate id to search,click next "
			+ "button and verify alert text.)")
	public void searchInmateAndVerify2ForTC187() {

		jpayEmail().signup().refresh();
		jpayEmail().signup().clickSelectStateDropdown();
		jpayEmail().signup().selectInmateState(state2);
		jpayEmail().signup().enterInmateId(invalidInmateId2);//
		jpayEmail().signup().clickNextButton();
		jpayEmail().signup().verifyInvalidInmateSearchAlertText(invalidInmateAlertText);//
		
	}

	/*********************************************************************************
	 * 
	 * Refresh page,select state,enter inmate id to search,click next button and verify no result text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-187::Design Steps::"
			+ "12,13,14,15,16(Refresh page,select state,enter inmate id to search,click next "
			+ "button and verify no result text.)")
	public void searchInmateAndVerify3ForTC187() {

		jpayEmail().signup().refresh();
		jpayEmail().signup().clickSelectStateDropdown();
		jpayEmail().signup().selectInmateState(state2);
		jpayEmail().signup().enterInmateId(invalidInmateId3);//
		jpayEmail().signup().clickNextButton();
		jpayEmail().signup().verifyInvalidInmateSearchNoResultText(invalidInmateNoResultText);//
		
	}

	/*********************************************************************************
	 * 
	 * Click Home Link,select state,enter inmate id to search,click next button and verify no result text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-187::Design Steps::"
			+ "17,18,19,20,21(Click Home Link,select state,enter inmate id to search,click"
			+ " next button and verify no result text.)")
	public void searchInmateAndVerify4ForTC187() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().signup().clickSelectStateDropdown();
		jpayEmail().signup().selectInmateState(state1);
		jpayEmail().signup().enterInmateId(invalidInmateId4);//
		jpayEmail().signup().clickNextButton();
		jpayEmail().signup().verifyInvalidInmateSearchNoResultText(invalidInmateNoResultText);//
		
	}

	/*********************************************************************************
	 * 
	 * Click Home Link,select state,enter inmate id to search,click next button and verify no result text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-187::Design Steps::"
			+ "22,23,24,25,26(Click Home Link,select state,enter inmate id to search,click"
			+ " next button and verify no result text.)")
	public void searchInmateAndVerify5ForTC187() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().signup().clickSelectStateDropdown();
		jpayEmail().signup().selectInmateState(state1);
		jpayEmail().signup().enterInmateId(invalidInmateId5);//
		jpayEmail().signup().clickNextButton();
		jpayEmail().signup().verifyInvalidInmateSearchNoResultText(invalidInmateNoResultText);//
		
	}

	/*********************************************************************************
	 * 
	 * Click Home Link,select state,enter inmate id to search,click next button and verify no result text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-187::Design Steps::"
			+ "27,28,29,30(Click Home Link,select state,enter inmate id to search,click"
			+ " next button and verify no result text.)")
	public void searchInmateAndVerify6ForTC187() {

		jpayEmail().signup().clickSelectStateNoResultPage();
		jpayEmail().signup().selectInmateStateNoResultPage(state1);
		jpayEmail().signup().enterInmateIdNoResultPage(invalidInmateId5);
		jpayEmail().signup().clickSearchAgainNoResultPage();
		jpayEmail().signup().verifyInvalidInmateSearchNoResultText(invalidInmateNoResultText);
		
	}

	/*********************************************************************************
	 * 
	 * Click Home Link,select state,enter inmate id to search,click next button and verify no result text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-187::Design Steps::"
			+ "31,32,33,34,35(Click Home Link,select state,enter inmate id to search,click"
			+ " next button and verify no result text and alert text.)")
	public void searchInmateAndVerify7ForTC187() {

		jpayEmail().signup().clickSelectStateNoResultPage();
		jpayEmail().signup().selectInmateStateNoResultPage(state1);
		jpayEmail().signup().enterInmateIdNoResultPage(invalidInmateId2);
		jpayEmail().signup().clickSearchAgainNoResultPage();
		jpayEmail().signup().verifyInvalidInmateSearchNoResultText(invalidInmateNoResultText);
		jpayEmail().signup().verifyInvalidInmateSearchAlertText(invalidInmateAlertText);
		
	}

	/*********************************************************************************
	 * 
	 * Click Home Link,select state,enter inmate id to search,click next button and verify no result text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-187::Design Steps::"
			+ "36,37,38,39,40(Click Home Link,select state,enter inmate id to search,click"
			+ " next button and verify no result text and alert text.)")
	public void searchInmateAndVerify8ForTC187() {

		jpayEmail().signup().clickSelectStateNoResultPage();
		jpayEmail().signup().selectInmateStateNoResultPage(state1);
		jpayEmail().signup().enterInmateIdNoResultPage(invalidInmateId6);
		jpayEmail().signup().clickSearchAgainNoResultPage();
		jpayEmail().signup().verifyInvalidInmateSearchNoResultText(invalidInmateNoResultText);
		jpayEmail().signup().verifyInvalidInmateSearchAlertText(invalidInmateAlertText);
		
	}

	/*********************************************************************************
	 * 
	 * Click inmate search Link,select state,enter inmate id to search,click next button and verify alert text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-187::Design Steps::"
			+ "41,42,43,44,45( Click inmate search Link,select state,enter inmate id to "
			+ "search,click next button and verify alert text.)")
	public void searchInmateAndVerify9ForTC187() {

		jpayEmail().signup().clickInmateSearchLink();
		jpayEmail().signup().clickSelectStateInmateSearchPage();
		jpayEmail().signup().selectInmateStateInmateSearchPage(state1);
		jpayEmail().signup().enterInmateIdInmateSearchPage(invalidInmateId1);
		jpayEmail().signup().clickFindInmateSearchPage();
		jpayEmail().signup().verifyInvalidInmateSearchAlertText(invalidInmateAlertText);
		
	}

	/*********************************************************************************
	 * 
	 * Referesh page,select state,enter inmate id to search,click next button and verify alert text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-187::Design Steps::"
			+ "46,47,48,49,50(Referesh page,elect state,enter inmate id to "
			+ "search,click next button and verify alert text.)")
	public void searchInmateAndVerify10ForTC187() {

		jpayEmail().signup().refresh();
		jpayEmail().signup().clickSelectStateInmateSearchPage();
		jpayEmail().signup().selectInmateStateInmateSearchPage(state1);
		jpayEmail().signup().enterInmateIdInmateSearchPage(invalidInmateId3);
		jpayEmail().signup().clickFindInmateSearchPage();
		jpayEmail().signup().verifyInvalidInmateSearchNoResultText(invalidInmateNoResultText);
		
	}

	/*********************************************************************************
	 * 
	 * Referesh page,select state,enter inmate id to search,click next button and verify alert text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-187::Design Steps::"
			+ "51,52,53,54,55(Click inmate search Link,elect state,enter inmate id to "
			+ "search,click next button and verify alert text.)")
	public void searchInmateAndVerify11ForTC187() {

		jpayEmail().signup().clickInmateSearchLink();
		jpayEmail().signup().clickSelectStateInmateSearchPage();
		jpayEmail().signup().selectInmateStateInmateSearchPage(state1);
		jpayEmail().signup().enterInmateIdInmateSearchPage(invalidInmateId5);
		jpayEmail().signup().clickFindInmateSearchPage();
		jpayEmail().signup().verifyInvalidInmateSearchNoResultText(invalidInmateNoResultText);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-188:: Design Steps"
			+ "::1,2,3,4,5,6,7(Click on login link and verify page title.)")
	public void loginToWWWForTC188() {
		
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		jpayEmail().login().enterUsername(username);
		jpayEmail().login().enterPassword(password);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}
	
	/*********************************************************************************
	 * 
	 * Click inmate search Link,select state,enter inmate id to search,click next button and verify text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-188:: Design Steps::"
			+ "8,9,10,11,12(Click inmate search Link,select state,enter inmate id to search,"
			+ "click next button and verify text.)")
	public void searchInmateAndVerify1ForTC188() {

		jpayEmail().home().clickInmateSearch();
		jpayEmail().home().enterInmateState(state2);
		jpayEmail().home().enterInmateId(invalidInmateId1);
		jpayEmail().home().clickSearchButton();
		jpayEmail().home().verifyInmateSearchNoResultMsg(invalidInmateAlertText);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click inmate search Link,select state,enter inmate id to search,click next button and verify text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-188:: Design Steps::"
			+ "13,14,15,16,17(Click inmate search Link,select state,enter inmate id to search,"
			+ "click next button and verify text.)")
	public void searchInmateAndVerify2ForTC188() {

		jpayEmail().home().clickInmateSearch();
		jpayEmail().home().enterInmateState(state2);
		jpayEmail().home().enterInmateId(invalidInmateId2);
		jpayEmail().home().clickSearchButton();
		jpayEmail().home().verifyInmateSearchNoResultMsg(invalidInmateAlertText);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click inmate search Link,select state,enter inmate id to search,click next button and verify text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-188:: Design Steps::"
			+ "18,19,20,21,22(Click inmate search Link,select state,enter inmate id to search,"
			+ "click next button and verify text.)")
	public void searchInmateAndVerify3ForTC188() {

		jpayEmail().home().clickInmateSearch();
		jpayEmail().home().enterInmateState(state1);
		jpayEmail().home().enterInmateId(invalidInmateId3);
		jpayEmail().home().clickSearchButton();
		jpayEmail().home().verifyInvalidInmateSearchNoResultText(invalidInmateNoResultText);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click inmate search Link,select state,enter inmate id to search,click next button and verify text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-188:: Design Steps::"
			+ "23,24,25,26,27(Click inmate search Link,select state,enter inmate id to search,"
			+ "click next button and verify text.)")
	public void searchInmateAndVerify4ForTC188() {

		jpayEmail().home().clickSelectStateNoResultPage();
		jpayEmail().home().selectInmateStateNoResultPage(state1);
		jpayEmail().home().enterInmateIdNoResultPage(invalidInmateId5);
		jpayEmail().home().clickSearchAgainNoResultPage();
		jpayEmail().home().verifyInvalidInmateSearchNoResultText(invalidInmateNoResultText);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click inmate search Link,select state,enter inmate id to search,click next button and verify text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 18, description = "TestCases::WTC-188:: Design Steps::"
			+ "28,29,30,31,32(Click inmate search Link,select state,enter inmate id to search,"
			+ "click next button and verify text.)")
	public void searchInmateAndVerify5ForTC188() {

		jpayEmail().home().clickInmateSearch();
		jpayEmail().home().enterInmateState(state1);
		jpayEmail().home().enterInmateId(invalidInmateId3);
		jpayEmail().home().clickSearchButton();
		jpayEmail().home().verifyInvalidInmateSearchNoResultText(invalidInmateNoResultText);
		
	}
	
	
	

	/*********************************************************************************
	 * 
	 * Click on home link,verify title of the page and click logout button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 19, description = "TestCases::WTC-188::Design Steps"
			+ "::33,34,35( Click on home link and verify title of the page and click "
			+ "logout button)")
	public void testEnd() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().signup().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_187To188Test(data) };
	}
	
	
	public EmailWTC_187To188Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		state1 = data.get("state1");
		state2 = data.get("state2");
		invalidInmateId1 = data.get("invalidInmateId1");
		invalidInmateId2 = data.get("invalidInmateId2");
		invalidInmateId3 = data.get("invalidInmateId3");
		invalidInmateId4 = data.get("invalidInmateId4");
		invalidInmateId5 = data.get("invalidInmateId5");
		invalidInmateId6 = data.get("invalidInmateId6");
		invalidInmateAlertText = data.get("invalidInmateAlertText");
		invalidInmateNoResultText = data.get("invalidInmateNoResultText");
		password = data.get("password");
		username = data.get("username");
		
	}

	


}
