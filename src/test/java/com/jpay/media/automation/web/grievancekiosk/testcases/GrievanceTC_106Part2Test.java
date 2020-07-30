package com.jpay.media.automation.web.grievancekiosk.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;

/************************************************************************************************
 * 
 * TestCase :: GrievanceTC_1.06Test(Part2) - (Validate Communication allow for certain Inmate.) 
 * Author :: shasan(Shahriar Hasan) , 
 * Date :: DataFile ::KioskEmail.xlsx , 
 * DataSheet :: TC_1.06 
 * Status :: Completed
 * 
 **************************************************************************************************/

public class GrievanceTC_106Part2Test extends BaseTestObject {

    private String variation = "";
    private String personalDetails = "";
    private String username = "";
    private String password = "";
    private String adminSystem = "";
    private String facility = "";
    private String accManagementText = "";
    private String inmateId;


	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::TC_1.06(Part2)::Design "
			+ "Steps::30,31,32,33,34,35(Navigate to Staging website,verify personal and admin "
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
	 * Click on Administration link,click on inmate account management link and verify 
	 * inmate account management text,click on choose facility,select facility,enter 
	 * inmate id,click view inmate account details,click edit,check grievance 
	 * allowed and click update. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCase::TC_1.06(Part2)::Design Steps::"
			+ "36,37,38,39,40,41,42,43,44,45(Click on Administration link,click on inmate account "
			+ "management link and verify inmate account management text,click on choose facility,"
			+ "select facility,enter inmate id,click view inmate account details,click edit,"
			+ "check grievance allowed and click update.)")
	public void changeSettingsOfStagingAndVerify() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdminInmateAccountManagement().clickInmateAccountManagement();
        jpayStaging().stagingAdminInmateAccountManagement().verifyInmateAccountManagementText(accManagementText);
        jpayStaging().stagingAdminInmateAccountManagement().clickChooseFacility();
        jpayStaging().stagingAdminInmateAccountManagement().selectFacility(facility);
        jpayStaging().stagingAdminInmateAccountManagement().enterInmateId(inmateId);
        jpayStaging().stagingAdminInmateAccountManagement().clickViewInmateAccDetailsButton();
        jpayStaging().stagingAdminInmateAccountManagement().clickEditButton();
        jpayStaging().stagingAdminInmateAccountManagement().checkGrievanceAllowedCheckBox();
        jpayStaging().stagingAdminInmateAccountManagement().clickUpdateButton();

	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCase::TC_1.06(Part2)::Design "
			+ "Steps::46,47,48,49(Click sign out button and verify Login details.)")
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
		return new Object[] { new GrievanceTC_106Part2Test(data) };
	}

	public GrievanceTC_106Part2Test(Map<String, String> data) {
		super(data);

        variation = data.get("variation");
        personalDetails = data.get("personalDetails");
        username = data.get("username");
        password = data.get("password");
        adminSystem = data.get("adminSystem");
        facility = data.get("facility");
        accManagementText = data.get("accManagementText");
        inmateId = data.get("userid");
        


        

	}
	
	

}
