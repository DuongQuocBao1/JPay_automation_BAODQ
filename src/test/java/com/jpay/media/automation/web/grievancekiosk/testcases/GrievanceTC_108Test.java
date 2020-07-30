package com.jpay.media.automation.web.grievancekiosk.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;

/************************************************************************************************
 * 
 * TestCase :: GrievanceTC_1.08Test - (Validate number of character allowed for Communication.) 
 * Author :: shasan(Shahriar Hasan) , Date :: DataFile ::
 * KioskEmail.xlsx , DataSheet :: TC_1.08 Status :: Completed
 * 
 **************************************************************************************************/

public class GrievanceTC_108Test extends BaseTestObject {

    private String variation = "";
    private String personalDetails = "";
    private String username = "";
    private String password = "";
    private String adminSystem = "";
    private String facility = "";
    private String freePrintNum;
    private String costPerPrint;
	private String agency;
	private String successMsg;



	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::TC_1.08::Design "
			+ "Steps::1,2,3,4,5,6(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void testStart() {

		jpayStaging().stagingLogin().loadURL(envUrlStaging, variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on facility management link,select facility,
	 * select permlock,check grievance enabled checkbox,enter desired minimum number 
	 * in communication message limit,click on save settings and verify update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCase::TC_1.08::Design Steps::7,"
			+ "8,9,10,11,12,13,14,15,16(Click on Administration link,click on facility management link,"
			+ "select facility,select permlock,check grievance enabled checkbox,enter number in free "
			+ "input box and cost of print,click on save settings and verify update message.)")
	public void changeSettingsOfStagingAndVerify() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdminCommunicationsSettings().clickCommunicationSettingsLink();
		jpayStaging().stagingAdminCommunicationsSettings().selectAgency(agency);
		jpayStaging().stagingAdminCommunicationsSettings().selectFacility(facility);
		jpayStaging().stagingAdminCommunicationsSettings().checkGrievanceEnabledCheckbox();
		jpayStaging().stagingAdminCommunicationsSettings().enterNumFreeCommPrints(freePrintNum);
        jpayStaging().stagingAdminCommunicationsSettings().enterCommCostPerPrint(costPerPrint);
		jpayStaging().stagingAdminCommunicationsSettings().clickCommunicationSaveSettingsButton();
		jpayStaging().stagingAdminCommunicationsSettings().verifyCommunicationSettingsUpdateMessage(successMsg);

	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCase::TC_1.08::Design "
			+ "Steps::17,18,19,20(Click sign out button and verify Login details.)")
	public void endTest() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);

	}


	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/

	@Factory(dataProvider = "getData", dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String> data) {
		return new Object[] { new GrievanceTC_108Test(data) };
	}

	public GrievanceTC_108Test(Map<String, String> data) {
		super(data);

        variation = data.get("variation");
        personalDetails = data.get("personalDetails");
        username = data.get("username");
        password = data.get("password");
        adminSystem = data.get("adminSystem");
        facility = data.get("facility");
		agency = data.get("agency");
		freePrintNum = data.get("freePrintNum");
        costPerPrint = data.get("costPerPrint");
        successMsg = data.get("successMsg");

        


        

	}
	
	

}
