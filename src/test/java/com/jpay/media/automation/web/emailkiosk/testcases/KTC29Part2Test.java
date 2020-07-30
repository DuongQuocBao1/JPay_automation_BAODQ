package com.jpay.media.automation.web.emailkiosk.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: KTC29(Part-2) - (Suspended user shall not be able to allow VG)
 *                          
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: KTC29To30
 * Status :: Completed
 * 
 **************************************************************************************************/

public class KTC29Part2Test extends BaseTestObject{
	

	private String username;
	private String pinCode;
	private String variation;
	private String password;
	private String accountId;
	private String updateRestVideogramDeleteMsg;
	private String facilitySystemText;
	private String emailTab;
	private String loginDetailsText;
	

	


	/*********************************************************************************
	 * 
	 * Navigate to facility website,verify login details, enter username,pincode,
	 * password,click login button and verify admin systems text and mail tab is present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::KTC-29(Part2)::DesignSteps"
			+ "::1,2,3,4,5,6,7,8(Navigate to facility website,verify login details, enter "
			+ "username,pincode,password,click login button and verify admin systems text "
			+ "and mail tab is present.)")
	public void testStart() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().verifyLoginDetails(loginDetailsText);
		jpayFacility().facilityLogin().enterUsername(username);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(password);
		jpayFacility().facilityLogin().clickLoginButton();
		jpayFacility().facilityHome().verifyFacilitySystem(facilitySystemText);
		jpayFacility().facilityHome().verifyFacilityHeaderTabPresent(emailTab);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on mail tab link,click on restricted videogram customers link,search 
	 * button,enter account id to search,click on go button and verify search result,
	 * click on delete button and verify delete success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::KTC-29(Part2)::DesignSteps"
			+ "::9,10,11,12,13,14,15,16(Click on mail tab link,click on restricted videogram "
			+ "customers link,search button,enter account id to search,click on go button "
			+ "and verify search result,click on delete button and verify delete success message.)")
	public void searchRestrictedAccountForTC72AndVerify() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickRestrictedVideogramCustomersLink();
		jpayFacility().facilityEmail().clickRestVideogramSearchButton();
		jpayFacility().facilityEmail().enterRestVideogramAccIdToSearch(accountId);
		jpayFacility().facilityEmail().clickRestVideogramSearchGoButton();
		jpayFacility().facilityEmail().verifySearchedRestVideogramAccVisible(accountId);
		jpayFacility().facilityEmail().clickRestVideogramDeleteButton();
		jpayFacility().facilityEmail().verifyRestricedVideogramActionUpdateMsg(updateRestVideogramDeleteMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::KTC-29(Part2):: Design "
			+ "Steps::17(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new KTC29Part2Test(data) };
	}
	
	
	public KTC29Part2Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		loginDetailsText = data.get("loginDetailsText");
		password = data.get("password");
		username = data.get("username");
		pinCode = data.get("pinCode");
		facilitySystemText = data.get("facilitySystemText");
		emailTab = data.get("emailTab");
		accountId = data.get("accountId");
		updateRestVideogramDeleteMsg = data.get("updateRestVideogramDeleteMsg");
	
	
	
	}

	


}
