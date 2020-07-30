package com.jpay.media.automation.web.emailkiosk.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: KTC31 - (Email & VG tab will disappeared from kiosk)
 * Author :: shasan(Shahriar Hasan) , Date ::
 * DataFile :: KioskEmail.xlsx , DataSheet :: KTC31
 * Status :: Completed
 * 
 **************************************************************************************************/

public class KTC31Part2Test extends BaseTestObject{
	

	private String variation;
	private String pinCode;
	private String inmateId;
	private String usernameFacility;
	private String passwordFacility;
	

	

	/*********************************************************************************
	 * 
	 * Navigate to facility,enter username,pincode,password and click on login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::KTC-31::DesignSteps"
			+ "::33,34,35,37,38,39(Navigate to facility,enter username,pincode,password and "
			+ "click on login button.)")
	public void testStart() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(usernameFacility);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordFacility);
		jpayFacility().facilityLogin().clickLoginButton();
		
	}

	/*********************************************************************************
	 * 
	 * Click on handle inmate account link,enter inmate id,click on view inmate 
	 * account details button,click on edit button,uncheck inbound and outbound 
	 * mail enabled checkbox,click on update button and verify update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::KTC-31::DesignSteps::"
			+ "40,41,42,43,44,45,46,47(Click on handle inmate account link,enter inmateid,"
			+ "click on view inmate account details button,click on edit button,check "
			+ "inbound and outbound mail enabled checkbox,click on update button and "
			+ "verify update message.)")
	public void changeSettingsAndVerify() {

		jpayFacility().facilityAdmin().clickHandleInmateAccountLink();
		jpayFacility().facilityAdmin().enterHIAInsertInmateId(inmateId);
		jpayFacility().facilityAdmin().clickHIAViewInmateAccountDetailsButton();
		jpayFacility().facilityAdmin().clickHIAEditButton();
		jpayFacility().facilityAdmin().checkHIAInboundMailEnabledCheckbox();
		jpayFacility().facilityAdmin().checkHIAOutboundMailEnabledCheckbox();
		jpayFacility().facilityAdmin().clickHIAUpdateButton();
		jpayFacility().facilityAdmin().verifyHIAActionsSuccessfullMessage();//
		
	}

	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::KTC-31:: DesignSteps::"
			+ "49(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new KTC31Part2Test(data) };
	}
	
	
	public KTC31Part2Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		passwordFacility = data.get("passwordFacility");
		usernameFacility = data.get("usernameFacility");
		pinCode = data.get("pinCode");
		inmateId = data.get("inmateId");
		
	}


}
