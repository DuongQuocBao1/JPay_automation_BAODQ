package com.jpay.media.automation.web.grievancekiosk.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;

/************************************************************************************************
 * 
 * TestCase :: GrievanceTC_1.04Test(Part2) - (Disable/Enable location for
 * Communication.) Author :: shasan(Shahriar Hasan) , Date :: DataFile ::
 * KioskEmail.xlsx , DataSheet :: TC_1.04 Status :: Completed
 * 
 **************************************************************************************************/

public class GrievanceTC_104Part2Test extends BaseTestObject {

	private String variation = "";
	private String personalDetails = "";
	private String username = "";
	private String password = "";
	private String adminSystem = "";
	private String facility = "";
	private String agency;
	private String successMsg;
	private String loginDetails;
	private String usernameFacility;
	private String pinCode;
	private String passwordFacility;
	private String facilitySystem;
	private String communicationLink;
	private String inmateId;

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::TC_1.04(Part2)::Design "
			+ "Steps::45,46,47,48,49,50(Navigate to Staging website,verify personal and admin "
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
	 * Click on Administration link,click on facility management,click on
	 * communication settings,select facility,select permlock,uncheck print
	 * button checkbox,click save settings and verify update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCase::TC_1.04(Part2)::Design Steps::7,"
			+ "51,52,53,54,55,56,57,58(Click on Administration link,click on facility management,click "
			+ "on communication settings,select facility,select permlock,check Grievance enabled button "
			+ "checkbox,click save settings and verify update message.)")
	public void changeSettingsOfStagingAndVerify() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdminCommunicationsSettings().clickCommunicationSettingsLink();
		jpayStaging().stagingAdminCommunicationsSettings().selectAgency(agency);
		jpayStaging().stagingAdminCommunicationsSettings().selectFacility(facility);
		jpayStaging().stagingAdminCommunicationsSettings().checkGrievanceEnabledCheckbox();
		jpayStaging().stagingAdminCommunicationsSettings().clickCommunicationSaveSettingsButton();
		jpayStaging().stagingAdminCommunicationsSettings().verifyCommunicationSettingsUpdateMessage(successMsg);

	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCase::TC_1.04(Part2)::Design "
			+ "Steps::59,60,61,62(Click sign out button and verify Login details.)")
	public void logoutFromSatging() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);

	}

	/*********************************************************************************
	 * 
	 * Navigate to Facility website and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCase::TC_1.04(Part2)::Design "
			+ "Steps::63,64(Navigate to Facility website and verify Login details.)")
	public void navigateToFacilitySiteAndVerify1() {

		jpayFacility().facilityLogin().loadURL(envUrlFacility);
		jpayFacility().facilityLogin().verifyLoginDetails(loginDetails);

	}

	/*********************************************************************************
	 * 
	 * Enter username,pincode,password,click login button and verify Facility
	 * system and Communications tab is Present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCase::TC_1.04(Part2)::Design "
			+ "Steps::65,66,67,68,69,70(Enter username,pincode,password,click login button"
			+ " and verify Facility system and Communications tab is present.)")
	public void loginToFacilityAndVerify1() {

		jpayFacility().facilityLogin().enterUsername(usernameFacility);
		jpayFacility().facilityLogin().enterPincodee(pinCode);
		jpayFacility().facilityLogin().enterPassword(passwordFacility);
		jpayFacility().facilityLogin().clickLoginButton();
		jpayFacility().facilityHome().verifyFacilitySystem(facilitySystem);
		jpayFacility().facilityHome().verifyFacilityHeaderTabPresent(communicationLink);

	}

	/*********************************************************************************
	 * 
	 * Click on Communications link,click on create communications, enter
	 * inmateId,hit tab from keyboard,verify create communications failure
	 * message present,verify create communication failure message and click
	 * close button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCase::TC_1.04(Part2)::Design "
			+ "Steps::71,72,73,74,75(Click on Communications link,click on create "
			+ "communications,enter inmateId,hit tab from keyboard,verify create "
			+ "communications failure message present,verify create communication failure"
			+ " message absent.)")
	public void clickCreateCommunicationAndVerify1() {

		jpayFacility().facilityCommunications().clickCommunicationsLink();
		jpayFacility().facilityCommunications().clickCreateCommunicationsLink();
		jpayFacility().facilityCommunications().enterInmateId(inmateId);
		jpayFacility().facilityCommunications().tabOutInsertInmateId();
		jpayFacility().facilityCommunications().verifyCreateCommunicationErrorMsgAbsent();

	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCase::TC_1.04(Part2)::Design "
			+ "Steps::76,77,78,79(Click sign out button and verify Login details.)")
	public void endTest() {

		jpayFacility().facilityHome().clickSignOutButton();
		jpayFacility().facilityLogin().verifyLoginDetails(loginDetails);

	}

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/

	@Factory(dataProvider = "getData", dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String> data) {
		return new Object[] { new GrievanceTC_104Part2Test(data) };
	}

	public GrievanceTC_104Part2Test(Map<String, String> data) {
		super(data);

		variation = data.get("variation");
		personalDetails = data.get("personalDetails");
		username = data.get("username");
		password = data.get("password");
		adminSystem = data.get("adminSystem");
		facility = data.get("facility");
		agency = data.get("agency");
		successMsg = data.get("successMsg");
		loginDetails = data.get("loginDetails");
        usernameFacility = data.get("usernameFacility");
        pinCode = data.get("pinCode");
        passwordFacility = data.get("passwordFacility");
        facilitySystem = data.get("facilitySystem");
        communicationLink = data.get("communicationLink");
        inmateId = data.get("userid");

        

	}
	
	

}
