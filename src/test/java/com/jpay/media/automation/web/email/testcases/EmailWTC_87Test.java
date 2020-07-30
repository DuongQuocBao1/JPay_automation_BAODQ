package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_87Test extends BaseTestObject {

	
	
	private String variation;
	private String pinCode;
	private String username;
	private String password;
	private String searchText;
	private String letterReceivedText;
	private String letterSentText;
	
	
	
	

	/************************************************************************************************
	 * 
	 * TestCase :: WTC87 - (User shall be able to search free text)
	 * Author :: shasan(Shahriar Hasan) , 
	 * Date :: DataFile :: 
	 * Email.xlsx ,
	 * DataSheet :: WTC87      Status :: Completed
	 * 
	 **************************************************************************************************/

	
	/*********************************************************************************
	 * 
	 * Enter username,pincode,password,click login button and verify Facility 
	 * system and Communications tab is absent.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-87 :: Design "
			+ "Steps::1,2,3,4,5(Navigate to facility site,enter username,pincode,"
			+ "password and click on login button .)")
	public void testStart() {

		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(username);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(password);
		jpayFacility().facilityLogin().clickLoginButton();

	}

	/*********************************************************************************
	 * 
	 * Click on email link,click on search link,click on free text search radio 
	 * button,enter free text to search,check search a phrase checkbox,click on 
	 * go button,wait for page to load,verify letter received and sent header 
	 * text,click view button verify the letter id is present and the searched 
	 * text is present in the letter content.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-87 :: Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15,16,17,18(Click on email link,click on search "
			+ "link,click on free text search radio button,enter free text to search,"
			+ "check search a phrase checkbox,click on go button,wait for page to load,"
			+ "verify letter received and sent header text,click view button verify the "
			+ "letter id is present and the searched text is present in the letter content.)")
	public void verifyLetterStatusOfLetterWithoutAttachment() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().clickMailSearchFreeTextRadioButton();
		jpayFacility().facilityEmail().enterMailSearchFreeText(searchText);
		jpayFacility().facilityEmail().checkMailSearchAPhraseCheckbox();
		jpayFacility().facilityEmail().clickMailFreeTextSearchGoButton();
		jpayFacility().facilityEmail().pause(25000);
		jpayFacility().facilityEmail().verifyFreeTextSearchLetterReceivedText(letterReceivedText);
		jpayFacility().facilityEmail().verifyFreeTextSearchLetterSentText(letterSentText);
		jpayFacility().facilityEmail().clickLetterReceivedViewButton();
		jpayFacility().facilityEmail().verifyParentLetterIdLetterIdPresent();
		jpayFacility().facilityEmail().verifySearchedContentPresentInLetter(searchText);
		
	}
	

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-87 :: Design "
			+ "Steps::19(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}

	
	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/

	@Factory(dataProvider = "getData", dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String> data) {
		return new Object[] { new EmailWTC_87Test(data) };
	}

	public EmailWTC_87Test(Map<String, String> data) {
		super(data);

		username = data.get("username");
		password = data.get("password");
		variation = data.get("variation");
		searchText = data.get("searchText");
		pinCode = data.get("pinCode");
		letterReceivedText = data.get("letterReceivedText");
		letterSentText = data.get("letterSentText");
		
		

	}

	
	
}
