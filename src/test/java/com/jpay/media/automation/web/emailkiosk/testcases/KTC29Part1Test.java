package com.jpay.media.automation.web.emailkiosk.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;

/************************************************************************************************
 * 
 * TestCase :: KTC29(Part-1) - (Suspended user shall not be able to allow VG)
 *                          
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: KTC29To30
 * Status :: Completed
 * 
 **************************************************************************************************/

public class KTC29Part1Test extends BaseTestObject{

	private String username;
	private String pinCode;
	private String variation;
	private String password;
	private String accountId;
	private String updateRestVideogramAddMsg;
	private String facilitySystemText;
	private String emailTab;
	private String loginDetailsText;

	/*********************************************************************************
	 * 
	 * Navigate to facility website,verify login details, enter username,pincode,
	 * password,click login button and verify admin systems text and mail tab is present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::KTC-29(Part1)::DesignSteps"
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
	 * Click on mail tab link,click on restricted videogram customers link,
	 * click on add button,enter account id to restrict,enter suspend date,
	 * click add customers button and verify added update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::KTC29(Part-1)::Design Steps"
			+ "::9,10,11,12,13,14,15(Click on mail tab link,click on restricted videogram "
			+ "customers link,click on add button,enter account id to restrict,enter "
			+ "suspend date,click add customers button and verify added update message.)")
	public void addAccountToRestrictVideogramForTC72AndVerify() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickRestrictedVideogramCustomersLink();
		jpayFacility().facilityEmail().clickRestVideogramAddButton();
		jpayFacility().facilityEmail().enterRestVideogramAccIdToBlock(accountId);
		jpayFacility().facilityEmail().enterCurrRestrictedVideogramSuspendDate();
		jpayFacility().facilityEmail().clickRestVideogramAddCustomerButton();
		jpayFacility().facilityEmail().verifyRestricedVideogramActionUpdateMsg(updateRestVideogramAddMsg);
		
	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::KTC29(Part-1):: Design "
			+ "Steps::16(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new KTC29Part1Test(data) };
	}
	
	
	public KTC29Part1Test(Map<String, String> data) {
		super(data);

		variation = data.get("variation");
		loginDetailsText = data.get("loginDetailsText");
		password = data.get("password");
		username = data.get("username");
		pinCode = data.get("pinCode");
		facilitySystemText = data.get("facilitySystemText");
		emailTab = data.get("emailTab");
		accountId = data.get("accountId");
		updateRestVideogramAddMsg = data.get("updateRestVideogramAddMsg");

	}

}
