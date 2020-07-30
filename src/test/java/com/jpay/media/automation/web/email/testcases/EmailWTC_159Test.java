package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC159 - (Intel search (customer: Full Name, First Name, Last Name, Phone Number, Address, Zipcode, Account ID, IP Address) (super user))
 * Author :: shasan(Shahriar Hasan) , Date ::
 * DataFile :: Email.xlsx , DataSheet :: WTC159
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_159Test extends BaseTestObject{
	

	private String variation;
	private String passwordSuper;
	private String usernameSuper;
	private String pinCode;
	private String typeCustomer;
	private String typeEmail;
	private String emailAddress;
	private String typeFullname;
	private String custFullname;
	private String inmateIdByName;
	private String inmateNameByName;
	private String agencyByName;
	private String facilityLocationByName;
	private String customerIdByName;
	private String customerNameByName;
	private String typeFirstname;
	private String custFirstname;
	private String typeLastname;
	private String custLastname;
	private String typePhoneNumber;
	private String custPhoneNumber;
	private String typeZipcode;
	private String custZipcode;
	private String typeAccountId;
	private String custAccountId;
	private String typeIPAddress;
	private String custIPAddress;
	

	


	/*********************************************************************************
	 * 
	 * Navigate to facility,enter username,pincode,password and click on login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-159::DesignSteps"
			+ "::1,2,3,4,5(Navigate to facility,enter username,pincode,password and "
			+ "click on login button.)")
	public void testStart() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(usernameSuper);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordSuper);
		jpayFacility().facilityLogin().clickLoginButton();
		
		
	}

	/*********************************************************************************
	 * 
	 * Click on INTEL tab link,click on search link,check all checkbox,select 
	 * serach category,select search filter category,enter inmate id,check 
	 * show older records checkbox,click on search button,wait for results to load,
	 * verify inmate id,name,agency and facility location of money search results,
	 * verify customer id,name and total letters sent from in mail and out mail 
	 * search results.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-159::DesignSteps::"
			+ "6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23(Click on INTEL tab link,"
			+ "click on search link,check all checkbox,select serach category,select search "
			+ "filter category,enter inmate id,check show older records checkbox, and click "
			+ "on search button,wait for results to load,verify inmate id,name,agency and "
			+ "facility location of money search results,verify customer id,name and total "
			+ "letters sent from in mail and out mail search results.)")
	public void searchByCustomerFullnameAndVerifyForTC159() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().checkSAllCheckbox();
		jpayFacility().facilityIntel().selectSSearchBy(typeCustomer);//Inmate
		jpayFacility().facilityIntel().selectSSearchFilterBy(typeFullname);//
		jpayFacility().facilityIntel().enterSSearchString(custFullname);//
		jpayFacility().facilityIntel().checkSShowOlderRecordsCheckbox();
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().pause(15000);
		
		jpayFacility().facilityIntel().verifySMoneySearchInmateId(inmateIdByName);//
		jpayFacility().facilityIntel().verifySMoneySearchRecipientName(inmateNameByName);//
		jpayFacility().facilityIntel().verifySMoneySearchAgency(inmateIdByName,agencyByName);//
		jpayFacility().facilityIntel().verifySMoneySearchFacilityLocation(inmateIdByName,facilityLocationByName);//
		
		jpayFacility().facilityIntel().verifySInMailSearchCustomerIdByCustomer(customerIdByName);//
		jpayFacility().facilityIntel().verifySInMailSearchCustomerNameByCustomer(customerNameByName);//
		jpayFacility().facilityIntel().verifySInMailSearchTotalLettersSentByCustomer();
		
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerIdByCustomer(customerIdByName);
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerNameByCustomer(customerNameByName);
		jpayFacility().facilityIntel().verifySOutMailSearchTotalLettersSentByCustomer();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on INTEL tab link,click on search link,check all checkbox,select 
	 * serach category,select search filter category,enter inmate id,check 
	 * show older records checkbox,click on search button,wait for results to load,
	 * verify inmate id,name,agency and facility location of money search results,
	 * verify customer id,name and total letters sent from in mail and out mail 
	 * search results.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-159::DesignSteps::"
			+ "24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41(Click on INTEL tab link,"
			+ "click on search link,check all checkbox,select serach category,select search "
			+ "filter category,enter inmate id,check show older records checkbox, and click "
			+ "on search button,wait for results to load,verify inmate id,name,agency and "
			+ "facility location of money search results,verify customer id,name and total "
			+ "letters sent from in mail and out mail search results.)")
	public void searchByCustomerEmailAndVerifyForTC159() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().checkSAllCheckbox();
		jpayFacility().facilityIntel().selectSSearchBy(typeCustomer);//Customer
		jpayFacility().facilityIntel().selectSSearchFilterBy(typeEmail);//Email Address
		jpayFacility().facilityIntel().enterSSearchString(emailAddress);
		jpayFacility().facilityIntel().checkSShowOlderRecordsCheckbox();
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().pause(15000);
		
		jpayFacility().facilityIntel().verifySMoneySearchInmateId(inmateIdByName);//0000000014
		jpayFacility().facilityIntel().verifySMoneySearchRecipientName(inmateNameByName);//MICHAEL JORDAN
		jpayFacility().facilityIntel().verifySMoneySearchAgency(inmateIdByName,agencyByName);//JPAY
		jpayFacility().facilityIntel().verifySMoneySearchFacilityLocation(inmateIdByName,facilityLocationByName);//S_50000222
		
		jpayFacility().facilityIntel().verifySInMailSearchCustomerIdByCustomer(customerIdByName);//13192179
		jpayFacility().facilityIntel().verifySInMailSearchCustomerNameByCustomer(customerNameByName);//ANYTIME QA
		jpayFacility().facilityIntel().verifySInMailSearchTotalLettersSentByCustomer();
		
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerIdByCustomer(customerIdByName);
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerNameByCustomer(customerNameByName);
		jpayFacility().facilityIntel().verifySOutMailSearchTotalLettersSentByCustomer();
		
	}
	

	/*********************************************************************************
	 * 
	 * Click on INTEL tab link,click on search link,check all checkbox,select 
	 * serach category,select search filter category,enter inmate id,check 
	 * show older records checkbox,click on search button,wait for results to load,
	 * verify inmate id,name,agency and facility location of money search results,
	 * verify customer id,name and total letters sent from in mail and out mail 
	 * search results.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-159::DesignSteps::"
			+ "42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59(Click on INTEL tab link,"
			+ "click on search link,check all checkbox,select serach category,select search "
			+ "filter category,enter inmate id,check show older records checkbox, and click "
			+ "on search button,wait for results to load,verify inmate id,name,agency and "
			+ "facility location of money search results,verify customer id,name and total "
			+ "letters sent from in mail and out mail search results.)")
	public void searchByCustomerFirstnameAndVerifyForTC159() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().checkSAllCheckbox();
		jpayFacility().facilityIntel().selectSSearchBy(typeCustomer);//Customer
		jpayFacility().facilityIntel().selectSSearchFilterBy(typeFirstname);//
		jpayFacility().facilityIntel().enterSSearchString(custFirstname);//
		jpayFacility().facilityIntel().checkSShowOlderRecordsCheckbox();
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().pause(15000);
		
		jpayFacility().facilityIntel().verifySMoneySearchInmateId(inmateIdByName);//0000000014
		jpayFacility().facilityIntel().verifySMoneySearchRecipientName(inmateNameByName);//MICHAEL JORDAN
		jpayFacility().facilityIntel().verifySMoneySearchAgency(inmateIdByName,agencyByName);//JPAY
		jpayFacility().facilityIntel().verifySMoneySearchFacilityLocation(inmateIdByName,facilityLocationByName);//S_50000222
		
		jpayFacility().facilityIntel().verifySInMailSearchCustomerIdByCustomer(customerIdByName);//13192179
		jpayFacility().facilityIntel().verifySInMailSearchCustomerNameByCustomer(customerNameByName);//ANYTIME QA
		jpayFacility().facilityIntel().verifySInMailSearchTotalLettersSentByCustomer();
		
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerIdByCustomer(customerIdByName);
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerNameByCustomer(customerNameByName);
		jpayFacility().facilityIntel().verifySOutMailSearchTotalLettersSentByCustomer();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on INTEL tab link,click on search link,check all checkbox,select 
	 * serach category,select search filter category,enter inmate id,check 
	 * show older records checkbox,click on search button,wait for results to load,
	 * verify inmate id,name,agency and facility location of money search results,
	 * verify customer id,name and total letters sent from in mail and out mail 
	 * search results.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-159::DesignSteps::"
			+ "60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77(Click on INTEL tab link,"
			+ "click on search link,check all checkbox,select serach category,select search "
			+ "filter category,enter inmate id,check show older records checkbox, and click "
			+ "on search button,wait for results to load,verify inmate id,name,agency and "
			+ "facility location of money search results,verify customer id,name and total "
			+ "letters sent from in mail and out mail search results.)")
	public void searchByCustomerLastnameAndVerifyForTC159() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().checkSAllCheckbox();
		jpayFacility().facilityIntel().selectSSearchBy(typeCustomer);//Customer
		jpayFacility().facilityIntel().selectSSearchFilterBy(typeLastname);//
		jpayFacility().facilityIntel().enterSSearchString(custLastname);//
		jpayFacility().facilityIntel().checkSShowOlderRecordsCheckbox();
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().pause(15000);
		
		jpayFacility().facilityIntel().verifySMoneySearchInmateId(inmateIdByName);//0000000014
		jpayFacility().facilityIntel().verifySMoneySearchRecipientName(inmateNameByName);//MICHAEL JORDAN
		jpayFacility().facilityIntel().verifySMoneySearchAgency(inmateIdByName,agencyByName);//JPAY
		jpayFacility().facilityIntel().verifySMoneySearchFacilityLocation(inmateIdByName,facilityLocationByName);//S_50000222
		
		jpayFacility().facilityIntel().verifySInMailSearchCustomerIdByCustomer(customerIdByName);//13192179
		jpayFacility().facilityIntel().verifySInMailSearchCustomerNameByCustomer(customerNameByName);//ANYTIME QA
		jpayFacility().facilityIntel().verifySInMailSearchTotalLettersSentByCustomer();
		
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerIdByCustomer(customerIdByName);
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerNameByCustomer(customerNameByName);
		jpayFacility().facilityIntel().verifySOutMailSearchTotalLettersSentByCustomer();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on INTEL tab link,click on search link,check all checkbox,select 
	 * serach category,select search filter category,enter inmate id,check 
	 * show older records checkbox,click on search button,wait for results to load,
	 * verify inmate id,name,agency and facility location of money search results,
	 * verify customer id,name and total letters sent from in mail and out mail 
	 * search results.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-159::DesignSteps::"
			+ "78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95(Click on INTEL tab link,"
			+ "click on search link,check all checkbox,select serach category,select search "
			+ "filter category,enter inmate id,check show older records checkbox, and click "
			+ "on search button,wait for results to load,verify inmate id,name,agency and "
			+ "facility location of money search results,verify customer id,name and total "
			+ "letters sent from in mail and out mail search results.)")
	public void searchByCustomerPhoneNumberAndVerifyForTC159() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().checkSAllCheckbox();
		jpayFacility().facilityIntel().selectSSearchBy(typeCustomer);//Customer
		jpayFacility().facilityIntel().selectSSearchFilterBy(typePhoneNumber);//
		jpayFacility().facilityIntel().enterSSearchString(custPhoneNumber);//QA
		jpayFacility().facilityIntel().checkSShowOlderRecordsCheckbox();
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().pause(15000);
		
		jpayFacility().facilityIntel().verifySMoneySearchInmateId(inmateIdByName);//0000000014
		jpayFacility().facilityIntel().verifySMoneySearchRecipientName(inmateNameByName);//MICHAEL JORDAN
		jpayFacility().facilityIntel().verifySMoneySearchAgency(inmateIdByName,agencyByName);//JPAY
		jpayFacility().facilityIntel().verifySMoneySearchFacilityLocation(inmateIdByName,facilityLocationByName);//S_50000222
		
		jpayFacility().facilityIntel().verifySInMailSearchCustomerIdByCustomer(customerIdByName);//13192179
		jpayFacility().facilityIntel().verifySInMailSearchCustomerNameByCustomer(customerNameByName);//ANYTIME QA
		jpayFacility().facilityIntel().verifySInMailSearchTotalLettersSentByCustomer();
		
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerIdByCustomer(customerIdByName);
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerNameByCustomer(customerNameByName);
		jpayFacility().facilityIntel().verifySOutMailSearchTotalLettersSentByCustomer();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on INTEL tab link,click on search link,check all checkbox,select 
	 * serach category,select search filter category,enter inmate id,check 
	 * show older records checkbox,click on search button,wait for results to load,
	 * verify inmate id,name,agency and facility location of money search results,
	 * verify customer id,name and total letters sent from in mail and out mail 
	 * search results.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-159::DesignSteps::"
			+ "96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113(Click "
			+ "on INTEL tab link,click on search link,check all checkbox,select serach "
			+ "category,select search filter category,enter inmate id,check show older "
			+ "records checkbox, and click on search button,wait for results to load,verify "
			+ "inmate id,name,agency and facility location of money search results,verify "
			+ "customer id,name and total letters sent from in mail and out mail search results.)")
	public void searchByCustomerZipcodeAndVerifyForTC159() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().checkSAllCheckbox();
		jpayFacility().facilityIntel().selectSSearchBy(typeCustomer);//Customer
		jpayFacility().facilityIntel().selectSSearchFilterBy(typeZipcode);//
		jpayFacility().facilityIntel().enterSSearchString(custZipcode);//
		jpayFacility().facilityIntel().checkSShowOlderRecordsCheckbox();
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().pause(15000);
		
		jpayFacility().facilityIntel().verifySMoneySearchInmateId(inmateIdByName);//0000000014
		jpayFacility().facilityIntel().verifySMoneySearchRecipientName(inmateNameByName);//MICHAEL JORDAN
		jpayFacility().facilityIntel().verifySMoneySearchAgency(inmateIdByName,agencyByName);//JPAY
		jpayFacility().facilityIntel().verifySMoneySearchFacilityLocation(inmateIdByName,facilityLocationByName);//S_50000222
		
		jpayFacility().facilityIntel().verifySInMailSearchCustomerIdByCustomer(customerIdByName);//13192179
		jpayFacility().facilityIntel().verifySInMailSearchCustomerNameByCustomer(customerNameByName);//ANYTIME QA
		jpayFacility().facilityIntel().verifySInMailSearchTotalLettersSentByCustomer();
		
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerIdByCustomer(customerIdByName);
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerNameByCustomer(customerNameByName);
		jpayFacility().facilityIntel().verifySOutMailSearchTotalLettersSentByCustomer();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on INTEL tab link,click on search link,check all checkbox,select 
	 * serach category,select search filter category,enter inmate id,check 
	 * show older records checkbox,click on search button,wait for results to load,
	 * verify inmate id,name,agency and facility location of money search results,
	 * verify customer id,name and total letters sent from in mail and out mail 
	 * search results.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-159::DesignSteps::"
			+ "114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131(Click "
			+ "on INTEL tab link,click on search link,check all checkbox,select serach "
			+ "category,select search filter category,enter inmate id,check show older "
			+ "records checkbox, and click on search button,wait for results to load,verify "
			+ "inmate id,name,agency and facility location of money search results,verify "
			+ "customer id,name and total letters sent from in mail and out mail search results.)")
	public void searchByCustomerAccountIdAndVerifyForTC159() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().checkSAllCheckbox();
		jpayFacility().facilityIntel().selectSSearchBy(typeCustomer);//Customer
		jpayFacility().facilityIntel().selectSSearchFilterBy(typeAccountId);//
		jpayFacility().facilityIntel().enterSSearchString(custAccountId);//
		jpayFacility().facilityIntel().checkSShowOlderRecordsCheckbox();
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().pause(15000);
		
		jpayFacility().facilityIntel().verifySMoneySearchInmateId(inmateIdByName);//0000000014
		jpayFacility().facilityIntel().verifySMoneySearchRecipientName(inmateNameByName);//MICHAEL JORDAN
		jpayFacility().facilityIntel().verifySMoneySearchAgency(inmateIdByName,agencyByName);//JPAY
		jpayFacility().facilityIntel().verifySMoneySearchFacilityLocation(inmateIdByName,facilityLocationByName);//S_50000222
		
		jpayFacility().facilityIntel().verifySInMailSearchCustomerIdByCustomer(customerIdByName);//13192179
		jpayFacility().facilityIntel().verifySInMailSearchCustomerNameByCustomer(customerNameByName);//ANYTIME QA
		jpayFacility().facilityIntel().verifySInMailSearchTotalLettersSentByCustomer();
		
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerIdByCustomer(customerIdByName);
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerNameByCustomer(customerNameByName);
		jpayFacility().facilityIntel().verifySOutMailSearchTotalLettersSentByCustomer();
		
	}

	
	/*********************************************************************************
	 * 
	 * Click on INTEL tab link,click on search link,check all checkbox,select 
	 * serach category,select search filter category,enter inmate id,check 
	 * show older records checkbox,click on search button,wait for results to load,
	 * verify inmate id,name,agency and facility location of money search results,
	 * verify customer id,name and total letters sent from in mail and out mail 
	 * search results.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-159::DesignSteps::"
			+ "132,133,134,135,136,137,138,139,140,141,142,143,144,145,146(Click "
			+ "on INTEL tab link,click on search link,check all checkbox,select serach "
			+ "category,select search filter category,enter inmate id,check show older "
			+ "records checkbox, and click on search button,wait for results to load,verify "
			+ "inmate id,name,agency and facility location of money search results,verify "
			+ "customer id,name and total letters sent of in mail search results.)")
	public void searchByCustomerIPAddressAndVerifyForTC159() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().checkSAllCheckbox();
		jpayFacility().facilityIntel().selectSSearchBy(typeCustomer);//Customer
		jpayFacility().facilityIntel().selectSSearchFilterBy(typeIPAddress);//
		jpayFacility().facilityIntel().enterSSearchString(custIPAddress);//
		jpayFacility().facilityIntel().checkSShowOlderRecordsCheckbox();
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().pause(15000);
		
		jpayFacility().facilityIntel().verifySMoneySearchInmateId(inmateIdByName);//0000000014
		jpayFacility().facilityIntel().verifySMoneySearchRecipientName(inmateNameByName);//MICHAEL JORDAN
		jpayFacility().facilityIntel().verifySMoneySearchAgency(inmateIdByName,agencyByName);//JPAY
		jpayFacility().facilityIntel().verifySMoneySearchFacilityLocation(inmateIdByName,facilityLocationByName);//S_50000222
		
		jpayFacility().facilityIntel().verifySInMailSearchCustomerIdByCustomer(customerIdByName);//13192179
		jpayFacility().facilityIntel().verifySInMailSearchCustomerNameByCustomer(customerNameByName);//ANYTIME QA
		jpayFacility().facilityIntel().verifySInMailSearchTotalLettersSentByCustomer();
		
		
	}
	


	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-159:: Design "
			+ "Steps::147(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_159Test(data) };
	}
	
	
	public EmailWTC_159Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		passwordSuper = data.get("passwordSuper");
		usernameSuper = data.get("usernameSuper");
		pinCode = data.get("pinCode");
		typeCustomer = data.get("typeCustomer");
		typeEmail = data.get("typeEmail");
		emailAddress = data.get("emailAddress");
		typeFullname = data.get("typeFullname");
		custFullname = data.get("custFullname");
		inmateIdByName = data.get("inmateIdByName");
		inmateNameByName = data.get("inmateNameByName");
		agencyByName = data.get("agencyByName");
		facilityLocationByName = data.get("facilityLocationByName");
		customerIdByName = data.get("customerIdByName");
		customerNameByName = data.get("customerNameByName");
		typeFirstname = data.get("typeFirstname");
		custFirstname = data.get("custFirstname");
		typeLastname = data.get("typeLastname");
		custLastname = data.get("custLastname");
		typePhoneNumber = data.get("typePhoneNumber");
		custPhoneNumber = data.get("custPhoneNumber");
		typeZipcode = data.get("typeZipcode");
		custZipcode = data.get("custZipcode");
		typeAccountId = data.get("typeAccountId");
		custAccountId = data.get("custAccountId");
		typeIPAddress = data.get("typeIPAddress");
		custIPAddress = data.get("custIPAddress");
		
		
		
	}

	


}
