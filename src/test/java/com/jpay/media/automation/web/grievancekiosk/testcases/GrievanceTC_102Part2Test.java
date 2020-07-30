package com.jpay.media.automation.web.grievancekiosk.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;

/************************************************************************************************
 * 
 * TestCase :: GrievanceTC_1.02Test(Part2) - (Disable/Enable Communications in Kiosks.)
 * Author :: shasan(Shahriar Hasan) , Date ::
 * DataFile :: KioskEmail.xlsx , DataSheet :: TC_1.03
 * Status :: Completed
 * 
 **************************************************************************************************/

public class GrievanceTC_102Part2Test extends BaseTestObject{

	private String variation="";
	private String personalDetails="";
	private String username="";
	private String password="";
	private String adminSystem="";
	private String facility="";
	private String agency;
	private String kioskId;
	private String successMsg;
	
	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::TC_1.02(Part2)::Design "
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
	 * Click on Administration link,click on kiosk/wifi tablet management link,
	 * click on inmate kiosk details management link,click on choose agency,
	 * select agency,click on choose facility,select facility,eneter kiosk id,
	 * click on search button,click on edit button,uncheck grievance enable 
	 * check box,click on save button and verify success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCase::TC_1.02(Part2)::39,40,41,"
			+ "42,43,44,45,46,47,48,49,50,51:Design Steps::(Click on Administration link,"
			+ "click on kiosk/wifi tablet management link,click on inmate kiosk details "
			+ "management link,click on choose agency,select agency,click on choose facility,"
			+ "select facility,eneter kiosk id,click on search button,click on edit button,uncheck"
			+ " grievance enable check box,click on save button and verify success message.)")
	public void changeSettingsOfStagingAndVerify() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdminKioskWifiManagement().clickKioskWifiTabletMangementLink();
		jpayStaging().stagingAdminKioskWifiManagement().clickInmateKioskDetailsMangementLink();
		jpayStaging().stagingAdminKioskWifiManagement().clickInmateKioskMangementChooseAgency();
		jpayStaging().stagingAdminKioskWifiManagement().selectInmateKioskMangementAgency( agency, environment);
		jpayStaging().stagingAdminKioskWifiManagement().clickInmateKioskMangementChooseFacility();
		jpayStaging().stagingAdminKioskWifiManagement().selectInmateKioskMangementFacility(facility);
		jpayStaging().stagingAdminKioskWifiManagement().enterKioskId(kioskId);
		jpayStaging().stagingAdminKioskWifiManagement().clickSearchButton();
		jpayStaging().stagingAdminKioskWifiManagement().clickInmateKioskManagementEditButton(kioskId);
		jpayStaging().stagingAdminKioskWifiManagement().checkInmateKioskManagementGrievanceCheckbox();
		jpayStaging().stagingAdminKioskWifiManagement().clickInmateKioskMangementSaveButton();
		jpayStaging().stagingAdminKioskWifiManagement().verifyInmateKioskManagementSaveSuccessText(successMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCase::TC_1.02(Part2)::Design Steps"
			+ "::,52,53,54:(Click sign out button and verify Login details.)")
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
		return new Object[] { new GrievanceTC_102Part2Test(data) };
	}
	
	
	public GrievanceTC_102Part2Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		personalDetails = data.get("personalDetails");
		username = data.get("username");
		password = data.get("password");
		adminSystem = data.get("adminSystem");
		facility = data.get("facility");
		agency = data.get("agency");
		kioskId = data.get("kioskId");
		successMsg = data.get("successMsg");
		
		
	}

}
