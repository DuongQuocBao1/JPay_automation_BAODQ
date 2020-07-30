package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC157To158 - (157.Intel search with inmate, customer, other and verify the results displayed, check export report
 *                       158.Intel search with inmate, customer, other and verify the results displayed)
 * Author :: shasan(Shahriar Hasan) , Date ::
 * DataFile :: Email.xlsx , DataSheet :: WTC157To158
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_157To158Test extends BaseTestObject{
	

	private String variation;
	private String passwordConsolidate;
	private String usernameConsolidate;
	private String passwordSuper;
	private String usernameSuper;
	private String pinCode;
	private String typeInmate;
	private String typeId;
	private String inmateId;
	private String inmateName;
	private String agency;
	private String facilityLocation;
	private String byMail;
	private String typeCustomer;
	private String typeEmail;
	private String emailAddress;
	private String customerId;
	private String customerName;
	

	


	/*********************************************************************************
	 * 
	 * Navigate to facility,enter username,pincode,password and click on login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-157::DesignSteps"
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
	 * show older records checkbox, and click on search button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-157::Design Steps"
			+ "::6,7,8,9,10,11,12,13(Click on INTEL tab link,click on search link,check "
			+ "all checkbox,select serach category,select search filter category,enter "
			+ "inmate id,check show older records checkbox, and click on search button.)")
	public void searchByInmateIdForTC157() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().checkSAllCheckbox();
		jpayFacility().facilityIntel().selectSSearchBy(typeInmate);//Inmate
		jpayFacility().facilityIntel().selectSSearchFilterBy(typeId);//ID
		jpayFacility().facilityIntel().enterSSearchString(inmateId);
		jpayFacility().facilityIntel().checkSShowOlderRecordsCheckbox();
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().pause(15000);
		
	}
	
	/*********************************************************************************
	 * 
	 * Verify inmate id,recipient name,agency and location of money search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-157::Design Steps"
			+ "::14,15,16,17(Verify inmate id,recipient name,agency and location of "
			+ "money search result.)")
	public void verifyMoneySearchResultsByInmateForTC157() {

		jpayFacility().facilityIntel().verifySMoneySearchInmateId(inmateId);
		jpayFacility().facilityIntel().verifySMoneySearchRecipientName(inmateName);
		jpayFacility().facilityIntel().verifySMoneySearchAgency(agency);
		jpayFacility().facilityIntel().verifySMoneySearchFacilityLocation(facilityLocation);
		
	}
	
	/*********************************************************************************
	 * 
	 * Verify inmate id,recipient name,agency,location,total letters 
	 * sent and number of unique senders of In mail search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-157::Design Steps"
			+ "::18,19,20,21,22,23(Verify inmate id,recipient name,agency,location,total "
			+ "letters sent and number of unique senders of In mail search result.)")
	public void verifyInMailSearchResultsByInmateForTC157() {

		jpayFacility().facilityIntel().verifySInMailSearchInmateIdByInmate(inmateId);
		jpayFacility().facilityIntel().verifySInMailSearchInmateNameByInmate(inmateName);
		jpayFacility().facilityIntel().verifySInmailSearchAgencyByInmate(agency);
		jpayFacility().facilityIntel().verifySInmailSearchFacilityLocationByInmate(facilityLocation);
		jpayFacility().facilityIntel().verifySInMailSearchTotalLettersSentByInmate();
		jpayFacility().facilityIntel().verifySInMailSearchNumOfUniqueSendersByInmate();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Verify inmate id,recipient name,agency,location and total letters 
	 * sent of Out mail search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-157::Design Steps"
			+ "::24,25,26,27,28(Verify inmate id,recipient name,agency,location and total "
			+ "letters sent of Out mail search result.)")
	public void verifyOutMailSearchResultsByInmateForTC157() {

		jpayFacility().facilityIntel().verifySOutMailSearchInmateIdByInmate(inmateId);
		jpayFacility().facilityIntel().verifySOutmailSearchRecipientNameByInmate(inmateName);
		jpayFacility().facilityIntel().verifySOutMailSearchAgencyByInmate(agency);
		jpayFacility().facilityIntel().verifySOutMailSearchFacilityLocationByInmate(facilityLocation);
		jpayFacility().facilityIntel().verifySOutMailSearchTotalLettersSentByInmate();
		
	}
	
	/*********************************************************************************
	 * 
	 * Select result type,enter from and to date to print and click on export button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-157::Design Steps"
			+ "::29,30,31,32(Select result type,enter from and to date to print and "
			+ "click on export button.)")
	public void printSearchResultByInmateForTC157() {

		jpayFacility().facilityIntel().selectSResultTypes(byMail);//Mail
		jpayFacility().facilityIntel().enterSDatesToPrintReport();
		jpayFacility().facilityIntel().clickSExportButton();
		jpayFacility().facilityIntel().pause(10000);
		
	}
	

	/*********************************************************************************
	 * 
	 * Navigate browser back,select serach category,select search filter category,
	 * enter inmate id,check show older records checkbox, and click on search button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-157::Design Steps"
			+ "::33,34,35,36,37,38(Navigate browser back,select serach category,select "
			+ "search filter category,enter inmate id,check show older records checkbox "
			+ "and click on search button.)")
	public void searchByCustomerEmailForTC157() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().checkSAllCheckbox();
		jpayFacility().facilityIntel().selectSSearchBy(typeCustomer);//Customer
		jpayFacility().facilityIntel().selectSSearchFilterBy(typeEmail);//Email Address
		jpayFacility().facilityIntel().enterSSearchString(emailAddress);
		jpayFacility().facilityIntel().checkSShowOlderRecordsCheckbox();
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().pause(10000);
		
	}
	
	/*********************************************************************************
	 * 
	 * Verify customer id,customer name and total letters sent of In mail search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-157::Design Steps"
			+ "::39,40,41(Verify customer id,customer name and total letters sent of In "
			+ "mail search result.)")
	public void verifyInMailSearchResultsByCustomerForTC157() {

		jpayFacility().facilityIntel().verifySInMailSearchCustomerIdByCustomer(customerId);
		jpayFacility().facilityIntel().verifySInMailSearchCustomerNameByCustomer(customerName);
		jpayFacility().facilityIntel().verifySInMailSearchTotalLettersSentByCustomer();
		
	}
	
	/*********************************************************************************
	 * 
	 * Verify customer id,customer name and total letters sent of Out mail search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-157::Design Steps"
			+ "::42,43,44(Verify customer id,customer name and total letters sent of Out "
			+ "mail search result.)")
	public void verifyOutMailSearchResultsByCustomerForTC157() {

		jpayFacility().facilityIntel().verifySOutMailSearchCustomerIdByCustomer(customerId);
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerNameByCustomer(customerName);
		jpayFacility().facilityIntel().verifySOutMailSearchTotalLettersSentByCustomer();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Select result type,enter from and to date to print and click on export button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-157::Design Steps"
			+ "::45,46,47,48,49,50(Select result type,enter from and to date to print and "
			+ "click on export button.)")
	public void printSearchResultByCustomerForTC157() {

		jpayFacility().facilityIntel().ClickSOutMailViewButtonByCustomer();
		jpayFacility().facilityIntel().verifySOutMailSearchResultByCustomerPresent();
		jpayFacility().facilityIntel().selectSResultTypes(byMail);//Mail
		jpayFacility().facilityIntel().enterSDatesToPrintReport();
		jpayFacility().facilityIntel().clickSExportButton();
		jpayFacility().facilityIntel().pause(10000);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-157:: Design "
			+ "Steps::51(Click sign out button .)")
	public void logoutForTC158() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}

	/*********************************************************************************
	 * 
	 * Navigate to facility,enter username,pincode,password and click on login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-158::DesignSteps"
			+ "::1,2,3,4,5(Navigate to facility,enter username,pincode,password and "
			+ "click on login button.)")
	public void loginForTC158() {
		
		jpayFacility().facilityLogin().loadURL(envUrlFacility,variation);
		jpayFacility().facilityLogin().enterUsername(usernameConsolidate);
		jpayFacility().facilityLogin().enterPincodee(pinCode );
		jpayFacility().facilityLogin().enterPassword(passwordConsolidate);
		jpayFacility().facilityLogin().clickLoginButton();
		
		
	}

	/*********************************************************************************
	 * 
	 * Click on INTEL tab link,click on search link,check all checkbox,select 
	 * serach category,select search filter category,enter inmate id,check 
	 * show older records checkbox, and click on search button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-158::Design Steps"
			+ "::6,7,8,9,10,11,12,13(Click on INTEL tab link,click on search link,check "
			+ "all checkbox,select serach category,select search filter category,enter "
			+ "inmate id,check show older records checkbox, and click on search button.)")
	public void searchByInmateIdForTC158() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().checkSAllCheckbox();
		jpayFacility().facilityIntel().selectSSearchBy(typeInmate);//Inmate
		jpayFacility().facilityIntel().selectSSearchFilterBy(typeId);//ID
		jpayFacility().facilityIntel().enterSSearchString(inmateId);
		jpayFacility().facilityIntel().checkSShowOlderRecordsCheckbox();
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().pause(10000);
		
	}
	
	/*********************************************************************************
	 * 
	 * Verify inmate id,recipient name,agency and location of money search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-158::Design Steps"
			+ "::14,15,16,17(Verify inmate id,recipient name,agency and location of "
			+ "money search result.)")
	public void verifyMoneySearchResultsByInmateForTC158() {

		jpayFacility().facilityIntel().verifySMoneySearchInmateId(inmateId);
		jpayFacility().facilityIntel().verifySMoneySearchRecipientName(inmateName);
		jpayFacility().facilityIntel().verifySMoneySearchAgency(agency);
		jpayFacility().facilityIntel().verifySMoneySearchFacilityLocation(facilityLocation);
		
	}
	
	/*********************************************************************************
	 * 
	 * Verify inmate id,recipient name,agency,location,total letters 
	 * sent and number of unique senders of In mail search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-158::Design Steps"
			+ "::18,19,20,21,22,23(Verify inmate id,recipient name,agency,location,total "
			+ "letters sent and number of unique senders of In mail search result.)")
	public void verifyInMailSearchResultsByInmateForTC158() {

		jpayFacility().facilityIntel().verifySInMailSearchInmateIdByInmate(inmateId);
		jpayFacility().facilityIntel().verifySInMailSearchInmateNameByInmate(inmateName);
		jpayFacility().facilityIntel().verifySInmailSearchAgencyByInmate(agency);
		jpayFacility().facilityIntel().verifySInmailSearchFacilityLocationByInmate(facilityLocation);
		jpayFacility().facilityIntel().verifySInMailSearchTotalLettersSentByInmate();
		jpayFacility().facilityIntel().verifySInMailSearchNumOfUniqueSendersByInmate();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Verify inmate id,recipient name,agency,location and total letters 
	 * sent of Out mail search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-158::Design Steps"
			+ "::24,25,26,27,28(Verify inmate id,recipient name,agency,location and total "
			+ "letters sent of Out mail search result.)")
	public void verifyOutMailSearchResultsByInmateForTC158() {

		jpayFacility().facilityIntel().verifySOutMailSearchInmateIdByInmate(inmateId);
		jpayFacility().facilityIntel().verifySOutmailSearchRecipientNameByInmate(inmateName);
		jpayFacility().facilityIntel().verifySOutMailSearchAgencyByInmate(agency);
		jpayFacility().facilityIntel().verifySOutMailSearchFacilityLocationByInmate(facilityLocation);
		jpayFacility().facilityIntel().verifySOutMailSearchTotalLettersSentByInmate();
		
	}
	
	/*********************************************************************************
	 * 
	 * Select result type,enter from and to date to print and click on export button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-158::Design Steps"
			+ "::29,30,31,32(Select result type,enter from and to date to print and "
			+ "click on export button.)")
	public void printSearchResultByInmateForTC158() {

		jpayFacility().facilityIntel().selectSResultTypes(byMail);//Mail
		jpayFacility().facilityIntel().enterSDatesToPrintReport();
		jpayFacility().facilityIntel().clickSExportButton();
		jpayFacility().facilityIntel().pause(10000);
		
	}
	

	/*********************************************************************************
	 * 
	 * Navigate browser back,select serach category,select search filter category,
	 * enter inmate id,check show older records checkbox, and click on search button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 18, description = "TestCases::WTC-158::Design Steps"
			+ "::33,34,35,36,37,38(Navigate browser back,select serach category,select "
			+ "search filter category,enter inmate id,check show older records checkbox "
			+ "and click on search button.)")
	public void searchByCustomerEmailForTC158() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().checkSAllCheckbox();
		jpayFacility().facilityIntel().selectSSearchBy(typeCustomer);//Customer
		jpayFacility().facilityIntel().selectSSearchFilterBy(typeEmail);//Email Address
		jpayFacility().facilityIntel().enterSSearchString(emailAddress);
		jpayFacility().facilityIntel().checkSShowOlderRecordsCheckbox();
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().pause(10000);
		
	}
	
	/*********************************************************************************
	 * 
	 * Verify customer id,customer name and total letters sent of In mail search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 19, description = "TestCases::WTC-158::Design Steps"
			+ "::39,40,41(Verify customer id,customer name and total letters sent of In "
			+ "mail search result.)")
	public void verifyInMailSearchResultsByCustomerForTC158() {

		jpayFacility().facilityIntel().verifySInMailSearchCustomerIdByCustomer(customerId);
		jpayFacility().facilityIntel().verifySInMailSearchCustomerNameByCustomer(customerName);
		jpayFacility().facilityIntel().verifySInMailSearchTotalLettersSentByCustomer();
		
	}
	
	/*********************************************************************************
	 * 
	 * Verify customer id,customer name and total letters sent of Out mail search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 20, description = "TestCases::WTC-158::Design Steps"
			+ "::42,43,44(Verify customer id,customer name and total letters sent of Out "
			+ "mail search result.)")
	public void verifyOutMailSearchResultsByCustomerForTC158() {

		jpayFacility().facilityIntel().verifySOutMailSearchCustomerIdByCustomer(customerId);
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerNameByCustomer(customerName);
		jpayFacility().facilityIntel().verifySOutMailSearchTotalLettersSentByCustomer();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Select result type,enter from and to date to print and click on export button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 21, description = "TestCases::WTC-158::Design Steps"
			+ "::45,46,47,48,49,50(Select result type,enter from and to date to print and "
			+ "click on export button.)")
	public void printSearchResultByCustomerForTC158() {

		jpayFacility().facilityIntel().ClickSOutMailViewButtonByCustomer();
		jpayFacility().facilityIntel().verifySOutMailSearchResultByCustomerPresent();
		jpayFacility().facilityIntel().selectSResultTypes(byMail);//Mail
		jpayFacility().facilityIntel().enterSDatesToPrintReport();
		jpayFacility().facilityIntel().clickSExportButton();
		jpayFacility().facilityIntel().pause(10000);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 22, description = "TestCases::WTC-158:: Design "
			+ "Steps::51(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_157To158Test(data) };
	}
	
	
	public EmailWTC_157To158Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		passwordSuper = data.get("passwordSuper");
		usernameSuper = data.get("usernameSuper");
		passwordConsolidate = data.get("passwordConsolidate");
		usernameConsolidate = data.get("usernameConsolidate");
		pinCode = data.get("pinCode");
		typeInmate = data.get("typeInmate");
		typeId = data.get("typeId");
		inmateId = data.get("inmateId");
		inmateName = data.get("inmateName");
		agency = data.get("agency");
		facilityLocation = data.get("facilityLocation");
		byMail = data.get("byMail");
		typeCustomer = data.get("typeCustomer");
		typeEmail = data.get("typeEmail");
		emailAddress = data.get("emailAddress");
		customerId = data.get("customerId");
		customerName = data.get("customerName");

		
		
		
	}

	


}
