package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_99To100Test extends BaseTestObject {

	
	
	private String variation;
	private String pinCode;
	private String username;
	private String password;
	private String domainName;
	private String deleteMessage;
	private String addMessage;
	private String domainExistMessage;
	private String inboundLetterId;
	private String releasedVideoStatus;
	private String outboundLetterId;
	
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC99To100 - (99.User shall be able to Add/Delete Restricted Domains in facility 
	 *                           100.User shall be able to Repair & Download Videogram  in facility )
	 * Author :: shasan(Shahriar Hasan) , 
	 * Date :: DataFile :: 
	 * Email.xlsx ,
	 * DataSheet :: WTC99To100      Status :: Completed
	 * 
	 **************************************************************************************************/

	
	/*********************************************************************************
	 * 
	 * Enter username,pincode,password,click login button and verify Facility 
	 * system and Communications tab is absent.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-88:: Design "
			+ "Steps::1,2,3,4,5(Navigate to facility site,enter username,pincode,"
			+ "password and click on login button .)")
	public void testStart() {

		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(username);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(password);
		jpayFacility().facilityLogin().clickLoginButton();

	}

	/*********************************************************************************
	 * 
	 * Click on mail tab link,click on restricted domain link,verify restricted 
	 * domain present in list,check delete checkbox,click on delete button,
	 * verify the delete message and domain absent in the list.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-99:: Design Steps"
			+ "::6,7,8,9,10,11,12(Click on mail tab link,click on restricted domain link,"
			+ "verify restricted domain present in list,check delete checkbox,click on "
			+ "delete button,verify the delete message and domain absent in the list.)")
	public void deleteRestrictedDomainForTC99AndVerify() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickRestrictedDomainLink();
		jpayFacility().facilityEmail().prerequisiteRDAddDomain(domainName);
		jpayFacility().facilityEmail().verifyRestrictedDomainPresentInList(domainName);
		jpayFacility().facilityEmail().clickRDDeleteCheckBoxByDomain(domainName);
		jpayFacility().facilityEmail().clickRDDeleteButton();
		jpayFacility().facilityEmail().verifyRDAddDeleteDomainMessage(deleteMessage);//
		jpayFacility().facilityEmail().verifyRestrictedDomainAbsentInList(domainName);
		
	}

	/*********************************************************************************
	 * 
	 * Enter domain name to add,click on add domain button,
	 * verify the add domain message and domain present in list.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-99:: Design Steps"
			+ "::13,14,15,16(Enter domain name to add,click on add domain button,verify "
			+ "the add domain message and domain present in list.)")
	public void addRestrictedDomainForTC99AndVerify() {
		
		jpayFacility().facilityEmail().enterRDAddDomainName(domainName);
		jpayFacility().facilityEmail().clickRDAddDomainButton();
		jpayFacility().facilityEmail().verifyRDAddDeleteDomainMessage(addMessage);//
		jpayFacility().facilityEmail().verifyRestrictedDomainPresentInList(domainName);
		
	}

	/*********************************************************************************
	 * 
	 * Enter domain name to add,click on add domain button and 
	 * verify the already domain exist message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-99:: Design Steps"
			+ "::17,18,19(Enter domain name to add,click on add domain button and "
			+ "verify the already domain exist message.)")
	public void addDuplicateRestrictedDomainForTC99AndVerify() {
		
		jpayFacility().facilityEmail().enterRDAddDomainName(domainName);
		jpayFacility().facilityEmail().clickRDAddDomainButton();
		jpayFacility().facilityEmail().verifyRDAddDeleteDomainMessage(domainExistMessage);//
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on mail tab link,click on search link,select search letter by id,
	 * enter letter id fof inbound mail,check show older message checkbox,
	 * click on go button,click on view button,verify the letter status,click 
	 * on repair videogram link,wait for videogram to repair and click on 
	 * download link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-100:: Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15,16,17(Click on mail tab link,click on search link,"
			+ "select search letter by id,enter letter id fof inbound mail,check show older "
			+ "message checkbox,click on go button,click on view button,verify the letter "
			+ "status,click on repair videogram link,wait for videogram to repair and click "
			+ "on download link and accept alert to download)")
	public void inboundVideogramForTC100AndVerify() {
		
		jpayFacility().facilityEmail().clickMailTabLink();
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(inboundLetterId);
		jpayFacility().facilityEmail().checkShowOlderMessageCheckbox();
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(releasedVideoStatus);
		jpayFacility().facilityEmail().clickRepairVideogramLink();
		jpayFacility().facilityEmail().pause(10000);
		jpayFacility().facilityEmail().clickDownloadVideogramLink();
		jpayFacility().facilityEmail().acceptAlert();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on search link,select search letter by id,
	 * enter letter id fof inbound mail,check show older message checkbox,
	 * click on go button,click on view button,verify the letter status,click 
	 * on repair videogram link,wait for videogram to repair and click on 
	 * download link.
	 * 
	 **********************************************************************************/

	@Test(enabled = false, priority = 6, description = "TestCases::WTC-100:: Design Steps"
			+ "::18,19,20,21,22,23,24,25,26,27(Click on search link,select search letter "
			+ "by id,enter letter id fof inbound mail,check show older message checkbox,"
			+ "click on go button,click on view button,verify the letter status,click on "
			+ "repair videogram link,wait for videogram to repair and click on download "
			+ "link and accept alert to download)")
	public void outboundVideogramForTC100AndVerify() {
		
		jpayFacility().facilityEmail().clickSearchButton();
		jpayFacility().facilityEmail().searchByLetterId();
		jpayFacility().facilityEmail().enterSearchContent(outboundLetterId);
		jpayFacility().facilityEmail().checkShowOlderMessageCheckbox();
		jpayFacility().facilityEmail().clickSearchGoButton();
		jpayFacility().facilityEmail().clickSearchViewButton();
		jpayFacility().facilityEmail().verifyLetterStatus(releasedVideoStatus);
		jpayFacility().facilityEmail().clickRepairVideogramLink();
		jpayFacility().facilityEmail().pause(10000);
		jpayFacility().facilityEmail().clickDownloadVideogramLink();
		jpayFacility().facilityEmail().acceptAlert();
		
	}


	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-99,100 :: Design "
			+ "Steps::(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}



	
	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/

	@Factory(dataProvider = "getData", dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String> data) {
		return new Object[] { new EmailWTC_99To100Test(data) };
	}

	public EmailWTC_99To100Test(Map<String, String> data) {
		super(data);

		username = data.get("username");
		password = data.get("password");
		variation = data.get("variation");
		pinCode = data.get("pinCode");
		
		domainName= data.get("domainName");
		deleteMessage = data.get("deleteMessage");
		addMessage = data.get("addMessage");
		domainExistMessage = data.get("domainExistMessage");
		
		outboundLetterId = data.get("outboundLetterId");
		releasedVideoStatus = data.get("releasedVideoStatus");
		inboundLetterId = data.get("inboundLetterId");

	}

	
	
}
