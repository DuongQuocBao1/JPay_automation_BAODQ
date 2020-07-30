package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC169To170 - (169.
 *                            170.
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: WTC169To170
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_169To170Test extends BaseTestObject{
	

	private String pinCode;
	private String variation;
	private String usernameSuper;
	private String passwordSuper;
	private String usernameConsolidate;
	private String passwordConsolidate;
	

	


	/*********************************************************************************
	 * 
	 * Navigate to facility, enter username,pincode,password,click on 
	 * login button and click on mail link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-169::Design Steps"
			+ "::1,2,3,4,5,6(Navigate to facility, enter username,pincode,password,click "
			+ "on login button and click on mail link.)")
	public void testStart() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(usernameSuper);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordSuper);
		jpayFacility().facilityLogin().clickLoginButton();
		jpayFacility().facilityEmail().clickMailTabLink();
		
	}

	
	/*********************************************************************************
	 * 
	 * Verify All Inbound Buckets letter count. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-169::Design Steps"
			+ "::7,8,9,10,11,12,13,14,15,16(Verify All Inbound Buckets letter count.)")
	public void inboundBucketsLetterCountForTC169() {

		jpayFacility().facilityEmail().verifyInboundRequiresApprovalLetterCount();
		jpayFacility().facilityEmail().verifyInboundPhotoApprovalLetterCount();
		jpayFacility().facilityEmail().verifyInboundVideoRequiresApprovalLetterCount();
		jpayFacility().facilityEmail().verifyInboundReadyToPrintOrReleaseApprovalLetterCount();
		jpayFacility().facilityEmail().verifyInboundPrintedLetterCount();
		jpayFacility().facilityEmail().verifyInboundReleasedLetterCount();
		jpayFacility().facilityEmail().verifyInboundSentToSecurityLetterCount();
		jpayFacility().facilityEmail().verifyInboundReturnedToCustomerLetterCount();
		jpayFacility().facilityEmail().verifyInboundCensoredLetterCount();
		jpayFacility().facilityEmail().verifyInboundReleasedVideoLetterCount();
		
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Verify All Outbound Buckets letter count. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-169::Design Steps"
			+ "::17,18,19,20,21,22,23,24,25,26(Verify All Outbound Buckets letter count.)")
	public void outboundBucketsLetterCountForTC169() {

		jpayFacility().facilityEmail().verifyOutboundRequiresApprovalLetterCount();
		jpayFacility().facilityEmail().verifyOutboundPhotoApprovalLetterCount();
		jpayFacility().facilityEmail().verifyOutboundVideoRequiresApprovalLetterCount();
		jpayFacility().facilityEmail().verifyOutboundReadyToPrintOrReleaseApprovalLetterCount();
		jpayFacility().facilityEmail().verifyOutboundReleasedLetterCount();
		jpayFacility().facilityEmail().verifyOutboundSentToSecurityLetterCount();
		jpayFacility().facilityEmail().verifyOutboundCensoredLetterCount();
		jpayFacility().facilityEmail().verifyOutboundPendingPrintItemsLetterCount();
		jpayFacility().facilityEmail().verifyOutboundPrintedItemsLetterCount();
		jpayFacility().facilityEmail().verifyOutboundReleasedVideoLetterCount();
		
		
	}
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-169:: Design "
			+ "Steps::27(Click sign out button .)")
	public void logoutFromFacilityForTC169() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}

	/*********************************************************************************
	 * 
	 * Navigate to facility, enter username,pincode,password,click on login button and click on mail link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-170::Design Steps"
			+ "::1,2,3,4,5,6(Navigate to facility, enter username,pincode,password,click "
			+ "on login button and click on mail link.)")
	public void loginToFacilityForTC170() {
		
		jpayFacility().facilityLogin().enterUsername(usernameConsolidate);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordConsolidate);
		jpayFacility().facilityLogin().clickLoginButton();
		jpayFacility().facilityEmail().clickMailTabLink();
		
	}

	
	/*********************************************************************************
	 * 
	 * Verify All Inbound Buckets letter count. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-170::Design Steps"
			+ "::7,8,9,10,11,12,13,14,15,16(Verify All Inbound Buckets letter count.)")
	public void inboundBucketsLetterCountForTC170() {

		jpayFacility().facilityEmail().verifyInboundRequiresApprovalLetterCount();
		jpayFacility().facilityEmail().verifyInboundPhotoApprovalLetterCount();
		jpayFacility().facilityEmail().verifyInboundVideoRequiresApprovalLetterCount();
		jpayFacility().facilityEmail().verifyInboundReadyToPrintOrReleaseApprovalLetterCount();
		jpayFacility().facilityEmail().verifyInboundPrintedLetterCount();
		jpayFacility().facilityEmail().verifyInboundReleasedLetterCount();
		jpayFacility().facilityEmail().verifyInboundSentToSecurityLetterCount();
		jpayFacility().facilityEmail().verifyInboundReturnedToCustomerLetterCount();
		jpayFacility().facilityEmail().verifyInboundCensoredLetterCount();
		jpayFacility().facilityEmail().verifyInboundReleasedVideoLetterCount();
		
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Verify All Outbound Buckets letter count. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-170::Design Steps"
			+ "::17,18,19,20,21,22,23,24,25,26(Verify All Outbound Buckets letter count.)")
	public void outboundBucketsLetterCountForTC170() {

		jpayFacility().facilityEmail().verifyOutboundRequiresApprovalLetterCount();
		jpayFacility().facilityEmail().verifyOutboundPhotoApprovalLetterCount();
		jpayFacility().facilityEmail().verifyOutboundVideoRequiresApprovalLetterCount();
		jpayFacility().facilityEmail().verifyOutboundReadyToPrintOrReleaseApprovalLetterCount();
		jpayFacility().facilityEmail().verifyOutboundReleasedLetterCount();
		jpayFacility().facilityEmail().verifyOutboundSentToSecurityLetterCount();
		jpayFacility().facilityEmail().verifyOutboundCensoredLetterCount();
		jpayFacility().facilityEmail().verifyOutboundPendingPrintItemsLetterCount();
		jpayFacility().facilityEmail().verifyOutboundPrintedItemsLetterCount();
		jpayFacility().facilityEmail().verifyOutboundReleasedVideoLetterCount();
		
		
	}
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-170:: Design "
			+ "Steps::27(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_169To170Test(data) };
	}
	
	
	public EmailWTC_169To170Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		passwordSuper = data.get("passwordSuper");
		usernameSuper = data.get("usernameSuper");
		pinCode = data.get("pinCode");
		passwordConsolidate = data.get("passwordConsolidate");
		usernameConsolidate = data.get("usernameConsolidate");
		
		
	}

	


}
