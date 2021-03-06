package com.jpay.media.automation.web.grievancekiosk.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: GrievanceTC_1.03Test(Part2) - (Disable/Enable Print button in Kiosks.)
 * Author :: shasan(Shahriar Hasan) , Date ::
 * DataFile :: KioskEmail.xlsx , DataSheet :: TC_1.03
 * Status :: Completed
 * 
 **************************************************************************************************/

public class GrievanceTC_103Part2Test extends BaseTestObject{

	private String variation="";
	private String personalDetails="";
	private String username="";
	private String password="";
	private String adminSystem="";
	private String facility="";
	private String agency;
	private String successMsg;
	
	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::TC_1.03(Part2)::Design "
			+ "Steps::33,34,35,36,37,38(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void testStart() {
		
		jpayStaging().stagingLogin().loadURL(envUrlStaging,variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Administration link,click on facility management,click on communication 
	 * settings,select facility,select permlock,uncheck print button checkbox,click 
	 * save settings and verify update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCase::TC_1.03(Part2)::Design Steps::"
			+ "39,40,41,42,43,44,45,46(Click on Administration link,click on facility management,"
			+ "click on communication settings,select facility,select permlock,check print button "
			+ "checkbox,click save settings and verify update message.)")
	public void changeSettingsOfStagingAndVerify() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdminCommunicationsSettings().clickCommunicationSettingsLink();
		jpayStaging().stagingAdminCommunicationsSettings().selectAgency(agency);
		jpayStaging().stagingAdminCommunicationsSettings().selectFacility(facility);
		jpayStaging().stagingAdminCommunicationsSettings().checkKioskPrintButtonEnabledCheckbox();
		jpayStaging().stagingAdminCommunicationsSettings().clickCommunicationSaveSettingsButton();
		jpayStaging().stagingAdminCommunicationsSettings().verifyCommunicationSettingsUpdateMessage(successMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCase::TC_1.03(Part2)::Design "
			+ "Steps::47,48,49,50(Click sign out button and verify Login details.)")
	public void endTest() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		
	}
	
	
	
	
	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new GrievanceTC_103Part2Test(data) };
	}
	
	
	public GrievanceTC_103Part2Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		personalDetails = data.get("personalDetails");
		username = data.get("username");
		password = data.get("password");
		adminSystem = data.get("adminSystem");
		facility = data.get("facility");
		agency = data.get("agency");
		successMsg = data.get("successMsg");
		
		
	}

}
