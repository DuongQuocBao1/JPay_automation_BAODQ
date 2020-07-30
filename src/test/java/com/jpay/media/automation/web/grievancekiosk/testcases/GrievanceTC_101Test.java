package com.jpay.media.automation.web.grievancekiosk.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class GrievanceTC_101Test extends BaseTestObject{

	private String variation="";
	private String personalDetails="";
	private String username="";
	private String password="";
	private String adminSystem="";
	private String facility="";
	private String agencySettings="";
	private String loginDetails="";
	private String usernameFacility="";
	private String pinCode = "";
	private String passwordFacility="";
	private String facilitySystem = "";
	private String communicationLink = "";
	
	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::TC_1.01::Design Steps::"
			+ "1,2,3,4,5,6(Navigate to Staging website,verify personal and admin details,"
			+ "enter username,password and click Login button.)")
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
	 * Click on Administration link,click on agency settings and 
	 * verify agency settings text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCase::TC_1.01::Design Steps::7,8,9(Click on "
			+ "Administration link,click on agency settings and verify agency settings text.)")
	public void clickAdministrationAndVerify1() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickAgencySettings();
		jpayStaging().stagingAdmin().verifyAgencySettingsText(agencySettings);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Choose Facility,select facility and verify selected facility name.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCase::TC_1.01::Design Steps::10,11,12(Click "
			+ "on Choose Facility,select facility and verify selected facility name.)")
	public void chooseFacilityAndVerify1() {

		jpayStaging().stagingAdmin().clickChooseFacility();
		jpayStaging().stagingAdmin().selectFacility(facility);
		jpayStaging().stagingAdmin().verifyFacilityName(facility);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Facility website,verify tab grievance button is disabled,
	 * click on edit, verify tab grievance button is enabled,uncheck tab 
	 * grievance checkbox and click on update button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCase::TC_1.01::Design Steps::13,14,15,16,17,18"
			+ "(Click on Facility website,verify tab grievance button is disabled,"
			+ "click on edit,verify tab grievance button is enabled,uncheck tab "
			+ "grievance checkbox and click on update button.)")
	public void clickFacilityWebsiteAndUncheckTabGrievance1() {

		jpayStaging().stagingAdmin().clickFacilityWebsite();
		jpayStaging().stagingAdmin().verifyTabGrievanceDisabled();
		jpayStaging().stagingAdmin().clickFacilityTabEditButton();
		jpayStaging().stagingAdmin().verifyTabGrievanceEnabled();
		jpayStaging().stagingAdmin().uncheckTabGrievance();
		jpayStaging().stagingAdmin().clickFacilityTabUpdateButton();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCase::TC_1.01::Design Steps::19,20,21(Click on "
			+ "Administration link,click on sign out button and verify personal details.)")
	public void clickAdministrationAndLogout1() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Facility website and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCase::TC_1.01::Design Steps::22,23(Navigate "
			+ "to Facility website and verify Login details.)")
	public void navigateToFacilitySiteAndVerify1() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility);
		jpayFacility().facilityLogin().verifyLoginDetails(loginDetails);
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter username,pincode,password,click login button and verify Facility 
	 * system and Communications tab is absent.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCase::TC_1.01::Design Steps::24,25,26,27,28,29"
			+ "(Enter username,pincode,password,click login button and verify "
			+ "Facility system and Communications tab is absent.)")
	public void loginAndVerify1() {
		
		jpayFacility().facilityLogin().enterUsername(usernameFacility);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordFacility);
		jpayFacility().facilityLogin().clickLoginButton();
		jpayFacility().facilityHome().verifyFacilitySystem(facilitySystem);
		jpayFacility().facilityHome().verifyFacilityHeaderTabAbsent(communicationLink );
		
	}
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCase::TC_1.01::Design Steps::30,31"
			+ "(Click sign out button and verify Login details.)")
	public void logoutAndVerify1() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		jpayFacility().facilityLogin().verifyLoginDetails(loginDetails);
		
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCase::TC_1.01::Design Steps:32,33,34,35,36,37(Navigate "
			+ "to Staging website,verify personal and admin details,enter username,"
			+ "password and click Login button.)")
	public void navigateToStagingAndLogin() {
		
		jpayStaging().stagingLogin().loadURL(envUrlStaging);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Administration link,click on agency settings and 
	 * verify agency settings text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCase::TC_1.01::Design Steps::38,39,40(Click on "
			+ "Administration link,click on agency settings and verify agency settings text.)")
	public void clickAdministrationAndVerify2() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickAgencySettings();
		jpayStaging().stagingAdmin().verifyAgencySettingsText(agencySettings);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Choose Facility,select facility and verify selected facility name.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCase::TC_1.01::Design Steps::41,42,43(Click "
			+ "on Choose Facility,select facility and verify selected facility name.)")
	public void chooseFacilityAndVerify2() {

		jpayStaging().stagingAdmin().clickChooseFacility();
		jpayStaging().stagingAdmin().selectFacility(facility);
		jpayStaging().stagingAdmin().verifyFacilityName(facility);

		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Facility website,verify tab grievance button is disabled,
	 * click on edit, verify tab grievance button is enabled,check tab 
	 * grievance checkbox and click on update button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCase::TC_1.01::Design Steps::44,45,46,47,48,49"
			+ "(Click on Facility website,verify tab grievance button is disabled,"
			+ "click on edit,verify tab grievance button is enabled,check tab "
			+ "grievance checkbox and click on update button.)")
	public void clickFacilityWebsiteAndUncheckTabGrievance2() {

		jpayStaging().stagingAdmin().clickFacilityWebsite();
		jpayStaging().stagingAdmin().verifyTabGrievanceDisabled();
		jpayStaging().stagingAdmin().clickFacilityTabEditButton();
		jpayStaging().stagingAdmin().verifyTabGrievanceEnabled();
		jpayStaging().stagingAdmin().checkTabGrievance();
		jpayStaging().stagingAdmin().clickFacilityTabUpdateButton();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCase::TC_1.01::Design Steps::50,51,52(Click on "
			+ "Administration link,click on sign out button and verify personal details.)")
	public void clickAdministrationAndLogout2() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Facility website and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCase::TC_1.01::Design Steps::53,54(Navigate "
			+ "to Facility website and verify Login details.)")
	public void navigateToFacilitySiteAndVerify2() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility);
		jpayFacility().facilityLogin().verifyLoginDetails(loginDetails);
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter username,pincode,password,click login button and verify Facility 
	 * system and Communications tab is absent.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCase::TC_1.01::Design Steps::55,56,57,58,59,60"
			+ "(Enter username,pincode,password,click login button and verify "
			+ "Facility system and Communications tab is absent.)")
	public void loginAndVerify2() {
		
		jpayFacility().facilityLogin().enterUsername(usernameFacility);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordFacility);
		jpayFacility().facilityLogin().clickLoginButton();
		jpayFacility().facilityHome().verifyFacilitySystem(facilitySystem);
		jpayFacility().facilityHome().verifyFacilityHeaderTabPresent(communicationLink );
		
	}
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "TestCase::TC_1.01::Design Steps::61,62"
			+ "(Click sign out button and verify Login details.)")
	public void endTest() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		jpayFacility().facilityLogin().verifyLoginDetails(loginDetails);
		
	}
	
	
	
	
	
	
	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new GrievanceTC_101Test(data) };
	}
	
	
	public GrievanceTC_101Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		personalDetails = data.get("personalDetails");
		username = data.get("username");
		password = data.get("password");
		adminSystem = data.get("adminSystem");
		facility = data.get("facility");
		agencySettings = data.get("agencySettings");
		loginDetails = data.get("loginDetails");
		usernameFacility = data.get("usernameFacility");
		pinCode = data.get("pinCode");
	    passwordFacility = data.get("passwordFacility");
		facilitySystem = data.get("facilitySystem");
		communicationLink = data.get("communicationLink");
		
		
	}

}
