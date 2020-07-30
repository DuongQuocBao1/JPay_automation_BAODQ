package com.jpay.media.automation.web.grievancekiosk.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;

/************************************************************************************************
 * 
 * TestCase :: GrievanceTC_1.04Test(Part1) - (Disable/Enable location for
 * Communication.) Author :: shasan(Shahriar Hasan) , Date :: DataFile ::
 * KioskEmail.xlsx , DataSheet :: TC_1.04 Status :: Completed
 * 
 **************************************************************************************************/

public class GrievanceTC_104Part1Test extends BaseTestObject {

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
	private String createCommunicationFailureMsg;

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::TC_1.04(Part1)::Design "
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
	 * Click on Administration link,click on facility management,click on
	 * communication settings,select facility,select permlock,uncheck print
	 * button checkbox,click save settings and verify update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCase::TC_1.04(Part1)::Design Steps::7,"
			+ "8,9,10,11,12,13,14,15(Click on Administration link,click on facility management,click "
			+ "on communication settings,select facility,select permlock,uncheck Grievance enabled button "
			+ "checkbox,click save settings and verify update message.)")
	public void changeSettingsOfStagingAndVerify() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdminCommunicationsSettings().clickCommunicationSettingsLink();
		jpayStaging().stagingAdminCommunicationsSettings().selectAgency(agency);
		jpayStaging().stagingAdminCommunicationsSettings().selectFacility(facility);
		jpayStaging().stagingAdminCommunicationsSettings().uncheckGrievanceEnabledCheckbox();
		jpayStaging().stagingAdminCommunicationsSettings().clickCommunicationSaveSettingsButton();
		jpayStaging().stagingAdminCommunicationsSettings().verifyCommunicationSettingsUpdateMessage(successMsg);

	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCase::TC_1.04(Part1)::Design "
			+ "Steps::16,17,18,19(Click sign out button and verify Login details.)")
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

	@Test(enabled = true, priority = 4, description = "TestCase::TC_1.04(Part1)::Design "
			+ "Steps::20,21(Navigate to Facility website and verify Login details.)")
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

	@Test(enabled = true, priority = 5, description = "TestCase::TC_1.04(Part1)::Design "
			+ "Steps::22,23,24,25,26,27(Enter username,pincode,password,click login button"
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

	@Test(enabled = true, priority = 6, description = "TestCase::TC_1.04(Part1)::Design "
			+ "Steps::28,29,30,31,32,33(Click on Communications link,click on create "
			+ "communications,enter inmateId,hit tab from keyboard,verify create "
			+ "communications failure message present,verify create communication failure"
			+ " message and click close button.)")
	public void clickCreateCommunicationAndVerify1() {

		jpayFacility().facilityCommunications().clickCommunicationsLink();
		jpayFacility().facilityCommunications().clickCreateCommunicationsLink();
		jpayFacility().facilityCommunications().enterInmateId(inmateId);
		jpayFacility().facilityCommunications().tabOutInsertInmateId();
		jpayFacility().facilityCommunications().verifyCreateCommunicationErrorMsgPresent();
		jpayFacility().facilityCommunications().verifyCreateCommunicationErrorMessage(createCommunicationFailureMsg);

	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCase::TC_1.04(Part1)::Design "
			+ "Steps::34,354,36,37(Click sign out button and verify Login details.)")
	public void endTest() {

		jpayFacility().facilityCommunications().clickCreateCommunicationCloseButton();
		jpayFacility().facilityHome().clickSignOutButton();
		jpayFacility().facilityLogin().verifyLoginDetails(loginDetails);

	}

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/

	@Factory(dataProvider = "getData", dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String> data) {
		return new Object[] { new GrievanceTC_104Part1Test(data) };
	}

	public GrievanceTC_104Part1Test(Map<String, String> data) {
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
        createCommunicationFailureMsg = data.get("createCommunicationFailureMsg");

        

	}
	
	

}
