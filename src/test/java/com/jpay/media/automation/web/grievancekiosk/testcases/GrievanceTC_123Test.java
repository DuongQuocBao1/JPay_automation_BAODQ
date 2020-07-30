package com.jpay.media.automation.web.grievancekiosk.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;


public class GrievanceTC_123Test extends BaseTestObject{

	private String variation="QA";
	private String loginDetails="";
	private String usernameFacility="";
	private String pinCode = "";
	private String passwordFacility="";
	private String facilitySystem = "";
	private String communicationLink = "";
	private String inmateId;
	private String warningText;
	
	
	/*********************************************************************************
	 * 
	 * Navigate to Facility website and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "Design Steps::1,2(Navigate "
			+ "to Facility website and verify Login details.)")
	public void testStart() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().verifyLoginDetails(loginDetails);
		
	}
	
	/*********************************************************************************
	 * 
	 * Enter username,pincode,password,click login button and verify Facility 
	 * system and Communications tab is absent.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "Design Steps::3,4,5,6,7,8"
			+ "(Enter username,pincode,password,click login button and verify "
			+ "Facility system and Communications tab is present.)")
	public void loginAndVerify1() {
		
		jpayFacility().facilityLogin().enterUsername(usernameFacility);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordFacility);
		jpayFacility().facilityLogin().clickLoginButton();
		jpayFacility().facilityHome().verifyFacilitySystem(facilitySystem);
		jpayFacility().facilityHome().verifyFacilityHeaderTabPresent(communicationLink );
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on Communications,click on create communications,enter inmateId,tabOut from keyboard,verify warning is present,verify warning header text and warning text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "Design Steps::9,10,11,12,13,14,15,16"
			+ "(Click on Communications,click on create communications,enter inmateId,"
			+ "tabOut from keyboard,verify warning is present,verify warning header "
			+ "text and warning text.)")
	public void goToAdminNotesAndVerify() {
		
		jpayFacility().facilityCommunications().clickCommunicationsLink();
		jpayFacility().facilityCommunications().clickCreateCommunicationsLink();
		jpayFacility().facilityCommunications().enterInmateId(inmateId);
		jpayFacility().facilityCommunications().tabOutInsertInmateId();
		jpayFacility().facilityCommunications().verifyWarningHeaderTextPresent();
		jpayFacility().facilityCommunications().verifyWarningHeaderText(warningText);
		jpayFacility().facilityCommunications().verifyWarningText(inmateId);
		
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on close button,click on sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "Design Steps::17,18,19(Click on "
			+ "close button,click on sign out button and verify Login details.)")
	public void endTest() {
		
		jpayFacility().facilityCommunications().clickCreateCommunicationCloseButton();
		jpayFacility().facilityHome().clickSignOutButton();
		jpayFacility().facilityLogin().verifyLoginDetails(loginDetails);
		
	}
	
	
	
	
	
	
	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new GrievanceTC_123Test(data) };
	}
	
	
	public GrievanceTC_123Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		loginDetails = data.get("loginDetails");
		usernameFacility = data.get("usernameFacility");
	    passwordFacility = data.get("passwordFacility");
		pinCode = data.get("pinCode");
		facilitySystem = data.get("facilitySystem");
		communicationLink = data.get("communicationLink");
		inmateId = data.get("inmateId");
		warningText = data.get("warningText");
		
	
		
	}

}
