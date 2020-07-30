package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC74To75 - (74.User shall be able to view an archived letter.
 *                           75.User shall be able to find letter.)
 * Author :: shasan(Shahriar Hasan) , Date :: 07/15/2019
 * DataFile :: Email.xlsx , DataSheet :: WTC74To75
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_74To75Test extends BaseTestObject{
	

	private String username;
	private String pinCode;
	private String variation;
	private String password;
	private String letterId;
	private String letterSearchFailureMessage;
	private String dateSearch;
	private String dateCategory;
	private String searchDate;
	private String customerSearch;
	private String accIdCategory;
	private String accountId;
	private String customerInfoText;
	private String inmateSearch;
	private String inmateId;
	private String inmateInfoText;
	private String inmateCategory;
	private String parentLetterIdSearch;
	private String parentLetterId;
	

	


	/*********************************************************************************
	 * 
	 * Insert STATE name in search box,Insert inmate ID in search box and Click
	 * on next image button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-70::Design Steps"
			+ "::1,2,3,4,5(Insert STATE name in search box,Insert inmate ID in search "
			+ "box and Click on next button)")
	public void testStart() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(username);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(password);
		jpayFacility().facilityLogin().clickLoginButton();
		
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on mail tab link,click on search link,select search by letter 
	 * category,enter letter id to search,click on go button and verify 
	 * search result is absent and letter search failure message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-74::Design Steps"
			+ "::6,7,8,9,10,11,12(Click on mail tab link,click on search link,select "
			+ "search by letter category,enter letter id to search,click on go button "
			+ "and verify search result is absent and letter search failure message.)")
	public void searchLetterCheckStatusForTC74AndVerify1() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(letterId);
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().verifyLetterSearchResultAbsent(letterId);
		jpayFacility().facilityEmail().verifyLetterSearchFailureMessage(letterSearchFailureMessage);//The letter wasn't found
		
		
	}
	

	
	/*********************************************************************************
	 * 
	 * Check show older message check box,click on go button,verify search result 
	 * present,click on go button and verify letter status,inmate name,inmate id,
	 * inmate housing and letter date. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-74::Design Steps"
			+ "::13,14,15,16,17,18,19,20,21(Check show older message check box,click on "
			+ "go button,verify search result present,click on go button and verify "
			+ "letter status,inmate name,inmate id,inmate housing and letter date.)")
	public void searchLetterCheckStatusForTC74AndVerify2() {

		jpayFacility().facilityEmail().checkShowOlderMessageCheckbox();
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().verifyLetterSearchResultPresent(letterId);
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifySearchedLetterStatusPresent();
		jpayFacility().facilityEmail().verifySearchedLetterInmateNamePresent();
		jpayFacility().facilityEmail().verifySearchedLetterInmateIdPresent();
		jpayFacility().facilityEmail().verifySearchedLetterInmateHousingPresent();
		jpayFacility().facilityEmail().verifySearchedLetterDatePresent();
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on mail tab link,click on search link,select search by letter 
	 * category,enter date to search,check show older message checkbox,
	 * click on go button,click on view button and verify letter date is 
	 * present and verify the searched letter date
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-75::Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15(Click on mail tab link,click on search link,"
			+ "select search by letter category,enter date to search,check show older "
			+ "message checkbox,click on go button,click on view button and verify "
			+ "letter date is present and verify the searched letter date)")
	public void searchLetterByDateForTC75AndVerify() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchLetterBy(dateSearch);
		jpayFacility().facilityEmail().searchLetterBySubCategory(dateCategory);
		jpayFacility().facilityEmail().enterSearchContent();
		jpayFacility().facilityEmail().checkShowOlderMessageCheckbox();
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifySearchedLetterDatePresent();
		jpayFacility().facilityEmail().verifySearchedLetterDate();
		
	}


	/*********************************************************************************
	 * 
	 * Click on mail tab link,click on search link,select search by letter 
	 * category,enter account id to search,check show older message checkbox,
	 * click on go button,click on view button and verify letter date is 
	 * present and verify the searched letter date
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-75::Design Steps"
			+ "::16,17,18,19,20,21,22,23,24,25,26,27(Click on mail tab link,click on search link,"
			+ "select search by letter category,enter account id to search,check show older "
			+ "message checkbox,click on go button,click on view button and verify "
			+ "Customer information text,customer anme and memeber since.)")
	public void searchLetterByCustomerIdForTC75AndVerify() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchLetterBy(customerSearch);
		jpayFacility().facilityEmail().searchLetterBySubCategory(accIdCategory);
		jpayFacility().facilityEmail().enterSearchContent(accountId);
		jpayFacility().facilityEmail().checkShowOlderMessageCheckbox();
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().pause(20000);
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyCustomerInformationText(customerInfoText);
		jpayFacility().facilityEmail().verifyCustomerInformationNamePresent();
		jpayFacility().facilityEmail().verifyCustomerInformationMemberSincePresent();
		
	}

	/*********************************************************************************
	 * 
	 * Click on mail tab link,click on search link,select search by letter 
	 * category,enter inmate id to search,click on go button and verify 
	 * search result is absent and letter search failure message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-75::Design Steps"
			+ "::28,29,30,31,32,34,35,36,37,38,39(Click on mail tab link,click on search link,"
			+ "select search by letter category,enter inmate id to search,click on go "
			+ "button and verify inmate information,inmate id and location.)")
	public void searchLetterByInmateIdForTC75AndVerify() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchLetterBy(inmateSearch);
		jpayFacility().facilityEmail().searchLetterBySubCategory(inmateCategory);
		jpayFacility().facilityEmail().enterSearchContent(inmateId);
		jpayFacility().facilityEmail().checkShowOlderMessageCheckbox();
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().pause(20000);
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyInmateInformationText(inmateInfoText);
		jpayFacility().facilityEmail().verifyInmateInformationInmateIdPresent();
		jpayFacility().facilityEmail().verifyInmateInformationLocationPresent();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on mail tab link,click on search link,select search by letter 
	 * category,enter letter id to search,click on go button and verify 
	 * search result is absent and letter search failure message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-75::Design Steps"
			+ "::40,41,42,43,45,46,47,48(Click on mail tab link,click on search link,"
			+ "select search by letter category,enter parent letter id to search,click on go "
			+ "button and verify parent letter id.)")
	public void searchLetterByParentLetterIdForTC75AndVerify() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchLetterBy(parentLetterIdSearch);
		jpayFacility().facilityEmail().enterSearchContent(parentLetterId);
		jpayFacility().facilityEmail().checkShowOlderMessageCheckbox();
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().pause(30000);
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyParentLetterIdLetterIdPresent();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-74,75:: Design "
			+ "Steps::(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_74To75Test(data) };
	}
	
	
	public EmailWTC_74To75Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		password = data.get("password");
		username = data.get("username");
		pinCode = data.get("pinCode");
		letterId = data.get("letterId");
		letterSearchFailureMessage = data.get("letterSearchFailureMessage");
		dateSearch = data.get("dateSearch");
		dateCategory = data.get("dateCategory");
		searchDate = data.get("searchDate");
		customerSearch = data.get("customerSearch");
		accIdCategory = data.get("accIdCategory");
		accountId = data.get("accountId");
		customerInfoText = data.get("customerInfoText");
		inmateSearch = data.get("inmateSearch");
		inmateCategory = data.get("inmateCategory");
		inmateId = data.get("inmateId");
		inmateInfoText = data.get("inmateInfoText");
		parentLetterIdSearch = data.get("parentLetterIdSearch");
		parentLetterId = data.get("parentLetterId");
		
		
	}

	


}
