package com.jpay.media.automation.web.grievancekiosk.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: GrievanceTC_1.02Test(Part1) - (Disable/Enable Communications in Kiosks.)
 * Author :: shasan(Shahriar Hasan) , Date ::
 * DataFile :: KioskEmail.xlsx , DataSheet :: TC_1.03
 * Status :: Completed
 * 
 **************************************************************************************************/

public class GrievanceTC_102Part1Test extends BaseTestObject{

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

	@Test(enabled = true, priority = 1, description = "TestCase::TC_1.02(Part1)::Design "
			+ "Steps::1,2,3,4,5,6(Navigate to Staging website,verify personal and admin "
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

	@Test(enabled = true, priority = 2, description = "TestCase::TC_1.02(Part1)::Design Steps::7,"
			+ "8,9,10,11,12,13,14,15,16,17,18(Click on Administration link,click on kiosk/"
			+ "wifi tablet management link,click on inmate kiosk details management link,"
			+ "click on choose agency,select agency,click on choose facility,select "
			+ "facility,eneter kiosk id,click on search button,click on edit button,uncheck"
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
		jpayStaging().stagingAdminKioskWifiManagement().uncheckInmateKioskManagementGrievanceCheckbox();
		jpayStaging().stagingAdminKioskWifiManagement().clickInmateKioskMangementSaveButton();
		jpayStaging().stagingAdminKioskWifiManagement().verifyInmateKioskManagementSaveSuccessText(successMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCase::TC_1.02(Part1)::Design "
			+ "Steps::19,20,21(Click sign out button and verify Login details.)")
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
		return new Object[] { new GrievanceTC_102Part1Test(data) };
	}
	
	
	public GrievanceTC_102Part1Test(Map<String, String> data) {
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
