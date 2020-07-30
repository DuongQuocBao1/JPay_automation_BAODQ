package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC71To72 - (71.User shall be able to add & delete inmate to the "Suspend Videogram Inmate"
 *                          72.User shall be able to add & delete  User to "Restricted Videogram Customers")
 *                          
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: WTC71to72
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_71To72Test extends BaseTestObject{
	

	private String username;
	private String pinCode;
	private String variation;
	private String password;
	private String susVideogramMsg;
	private String inmateId;
	private String inmateName;
	private String inmateHouse;
	private String inmateLocation;
	private String inmateStatus;
	private String susVideogramUpdateMsg;
	private String accountId;
	private String updateRestVideogramAddMsg;
	private String updateRestVideogramDeleteMsg;
	

	


	/*********************************************************************************
	 * 
	 * Insert STATE name in search box,Insert inmate ID in search box and Click
	 * on next image button
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-70::Design Steps"
			+ "::1,2,3,4,5(Insert STATE name in search box,Insert inmate ID in search "
			+ "box and Click on next button)")
	public void testStart() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(username);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(password);
		jpayFacility().facilityLogin().clickLoginButton();
		
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on mail tab link,click on suspend videogram inmate link,verify 
	 * suspend videogram inmate message,enter inmate id,click view inmate 
	 * details button and verify inmate id,inmate name,inmate location,
	 * inmate house and inmate status.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-71::Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15(Click on mail tab link,click on suspend "
			+ "videogram inmate link,verify suspend videogram inmate message,enter inmate "
			+ "id,click view inmate details button and verify inmate id,inmate name,inmate "
			+ "location,inmate house and inmate status..)")
	public void enterInmateToSusVideogramForTC71AndVerifyInmateDetails() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSuspendVideogramInmateLink();
		jpayFacility().facilityEmail().verifySuspendVideogramInmateMsg(susVideogramMsg);
		jpayFacility().facilityEmail().enterSuspendVideogramInmateId(inmateId);
		jpayFacility().facilityEmail().clickSuspendVideogramViewInmateDetails();
		jpayFacility().facilityEmail().verifySuspendVideogramInmateId(inmateId);
		jpayFacility().facilityEmail().verifySuspendVideogramInmateName(inmateName);
		jpayFacility().facilityEmail().verifySuspendVideogramInmateLocation(inmateLocation);
		jpayFacility().facilityEmail().verifySuspendVideogramInmateHousing(inmateHouse);
		jpayFacility().facilityEmail().verifySuspendVideogramInmateStatus(inmateStatus);
		
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on cancel button and verify suspend videogram inmate message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-71::Design Steps"
			+ "::16,17(Click on cancel button and verify suspend videogram inmate message.)")
	public void clickCancelForTC71AndVerify() {

		jpayFacility().facilityEmail().clickSuspendVideogramCancelSusDateButton();
		jpayFacility().facilityEmail().verifySuspendVideogramInmateMsg(susVideogramMsg);
		
	}
	

	/*********************************************************************************
	 * 
	 * Click view inmate details button and verify inmate id,inmate name,inmate 
	 * location,inmate house and inmate status,enter suspend date,click on update 
	 * suspend date button and verify update succeed message and inmate added to 
	 * the suspend videogram table..
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-71::Design Steps"
			+ "::18,19,20,21,22,23,24,25,26,27(Click view inmate details button and verify "
			+ "inmate id,inmate name,inmate location,inmate house and inmate status,enter "
			+ "suspend date,click on update suspend date button and verify update succeed "
			+ "message and inmate added to the suspend videogram table.)")
	public void suspendInmateToVideogramForTC71AndVerify() {

		jpayFacility().facilityEmail().clickSuspendVideogramViewInmateDetails();
		jpayFacility().facilityEmail().verifySuspendVideogramInmateId(inmateId);
		jpayFacility().facilityEmail().verifySuspendVideogramInmateName(inmateName);
		jpayFacility().facilityEmail().verifySuspendVideogramInmateLocation(inmateLocation);
		jpayFacility().facilityEmail().verifySuspendVideogramInmateHousing(inmateHouse);
		jpayFacility().facilityEmail().verifySuspendVideogramInmateStatus(inmateStatus);
		jpayFacility().facilityEmail().enterCurrentSusVideogramSuspendDate();
		jpayFacility().facilityEmail().clickSusVideogramUpdateSusDateButton();
		jpayFacility().facilityEmail().verifySusVideogramUpdateSuccessMsg(susVideogramUpdateMsg);
		jpayFacility().facilityEmail().verifyAddedSusVideogramInmateVisible(inmateId);
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on edit button,click on cancel button,click on remove button,
	 * verify update succeed message and inmate deleted from the suspend 
	 * videogram table.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-71::Design Steps"
			+ "::28,29,30,31,32(Click on edit button,click on cancel button,click on "
			+ "remove button,verify update succeed message and inmate deleted from "
			+ "the suspend videogram table.)")
	public void removeSuspensionForTC71AndVerify() {

		jpayFacility().facilityEmail().clickSusVideogramEditButtonAfterSus();
		jpayFacility().facilityEmail().clickSuspVideogramCancelButtonSus();
		jpayFacility().facilityEmail().clickSusVideogramRemoveButtonSus();
		jpayFacility().facilityEmail().verifySusVideogramUpdateSuccessMsg(susVideogramUpdateMsg);
		jpayFacility().facilityEmail().verifyDeletedSusVideogramInmateNotVisible(inmateId);
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on mail tab link,click on restricted videogram customers link,
	 * click on add button,enter account id to restrict,enter suspend date,
	 * click add customers button and verify added update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-72::Design Steps"
			+ "::6,7,8,9,10,11,12(Click on mail tab link,click on restricted videogram "
			+ "customers link,click on add button,enter account id to restrict,enter "
			+ "suspend date,click add customers button and verify added update message.)")
	public void addAccountToRestrictVideogramForTC72AndVerify() {

		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickRestrictedVideogramCustomersLink();
		jpayFacility().facilityEmail().clickRestVideogramAddButton();
		jpayFacility().facilityEmail().enterRestVideogramAccIdToBlock(accountId);
		jpayFacility().facilityEmail().enterCurrRestrictedVideogramSuspendDate();
		jpayFacility().facilityEmail().clickRestVideogramAddCustomerButton();
		jpayFacility().facilityEmail().verifyRestricedVideogramActionUpdateMsg(updateRestVideogramAddMsg);
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on search button,enter account id to search,click on go button and verify search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-72::Design Steps"
			+ "::13,14,15,16(Click on search button,enter account id to search,click on "
			+ "go button and verify search result.)")
	public void searchRestrictedAccountForTC72AndVerify() {

		jpayFacility().facilityEmail().clickRestVideogramSearchButton();
		jpayFacility().facilityEmail().enterRestVideogramAccIdToSearch(accountId);
		jpayFacility().facilityEmail().clickRestVideogramSearchGoButton();
		jpayFacility().facilityEmail().verifySearchedRestVideogramAccVisible(accountId);
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on delete button and verify delete update message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-72::Design Steps"
			+ "::17,18(Click on delete button and verify delete update message.)")
	public void deleteRestrictedAccountForTC72AndVerify() {

		jpayFacility().facilityEmail().clickRestVideogramDeleteButton();
		jpayFacility().facilityEmail().verifyRestricedVideogramActionUpdateMsg(updateRestVideogramDeleteMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-71,72:: Design "
			+ "Steps::(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_71To72Test(data) };
	}
	
	
	public EmailWTC_71To72Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		password = data.get("password");
		username = data.get("username");
		pinCode = data.get("pinCode");
		susVideogramMsg = data.get("susVideogramMsg");
		inmateId = data.get("inmateId");
		inmateName = data.get("inmateName");
		inmateLocation = data.get("inmateLocation");
		inmateHouse = data.get("inmateHouse");
		inmateStatus = data.get("inmateStatus");
		susVideogramUpdateMsg = data.get("susVideogramUpdateMsg");
		accountId = data.get("accountId");//
		updateRestVideogramAddMsg = data.get("updateRestVideogramAddMsg");//
		updateRestVideogramDeleteMsg = data.get("updateRestVideogramDeleteMsg");//
	
	
	
	}

	


}
