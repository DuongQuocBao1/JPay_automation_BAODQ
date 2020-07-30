package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC160 - (User should not be able to do the invaild Intel search)
 * Author :: shasan(Shahriar Hasan) , Date ::
 * DataFile :: Email.xlsx , DataSheet :: WTC160
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_160Test extends BaseTestObject{
	

	private String variation;
	private String passwordSuper;
	private String usernameSuper;
	private String pinCode;
	private String typeInmate;
	private String typeId;
	private String inmateId;
	private String inmateName;
	private String agency;
	private String facilityLocation;
	private String typeCustomer;
	private String typeEmail;
	private String emailAddress;
	private String customerId;
	private String customerName;
	private String searchErrorMessage;
	

	


	/*********************************************************************************
	 * 
	 * Navigate to facility,enter username,pincode,password and click on login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-160::DesignSteps"
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
	 * Click on INTEL tab link,click on search link,Click on search button and verify the error message,check all checkbox,Click on search button and verify the error message,select serach category,select search filter category,Click on search button and verify the error message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-160::Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15,16(Click on INTEL tab link,click on search link,"
			+ "Click on search button and verify the error message,check all checkbox,Click "
			+ "on search button and verify the error message,select serach category,select "
			+ "search filter category,Click on search button and verify the error message.)")
	public void verifySerachErrorMessagesForTC160() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().verifySSearchErrorMessage(searchErrorMessage);
		jpayFacility().facilityIntel().checkSAllCheckbox();
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().verifySSearchErrorMessage(searchErrorMessage);
		jpayFacility().facilityIntel().selectSSearchBy(typeInmate);//Inmate
		jpayFacility().facilityIntel().selectSSearchFilterBy(typeId);//ID
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().verifySSearchErrorMessage(searchErrorMessage);
		
	}
	

	/*********************************************************************************
	 * 
	 * Enter inmate id,check show older records checkbox, and click on search button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-160::Design Steps"
			+ "::17,18,19(Enter inmate id,check show older records checkbox "
			+ "and click on search button.)")
	public void searchByInmateIdForTC160() {

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

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-160::Design Steps"
			+ "::20,21,22,23(Verify inmate id,recipient name,agency and location of "
			+ "money search result.)")
	public void verifyMoneySearchResultsByInmateForTC160() {

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

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-160::Design Steps"
			+ "::24,25,26,27,28,29(Verify inmate id,recipient name,agency,location,total "
			+ "letters sent and number of unique senders of In mail search result.)")
	public void verifyInMailSearchResultsByInmateForTC160() {

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

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-160::Design Steps"
			+ "::30,31,32,33,34(Verify inmate id,recipient name,agency,location and total "
			+ "letters sent of Out mail search result.)")
	public void verifyOutMailSearchResultsByInmateForTC160() {

		jpayFacility().facilityIntel().verifySOutMailSearchInmateIdByInmate(inmateId);
		jpayFacility().facilityIntel().verifySOutmailSearchRecipientNameByInmate(inmateName);
		jpayFacility().facilityIntel().verifySOutMailSearchAgencyByInmate(agency);
		jpayFacility().facilityIntel().verifySOutMailSearchFacilityLocationByInmate(facilityLocation);
		jpayFacility().facilityIntel().verifySOutMailSearchTotalLettersSentByInmate();
		
	}

	/*********************************************************************************
	 * 
	 * Navigate browser back,select serach category,select search filter category,
	 * enter inmate id,check show older records checkbox, and click on search button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-160::Design Steps"
			+ "::35,36,37,38,39,40,41(Navigate browser back,select serach category,select "
			+ "search filter category,enter inmate id,check show older records checkbox "
			+ "and click on search button.)")
	public void searchByCustomerEmailForTC160() {

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
	 * Verify inmate id,recipient name,agency and location of money search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-160::Design Steps"
			+ "::42,43,44,45(Verify inmate id,recipient name,agency and location of "
			+ "money search result.)")
	public void verifyMoneySearchResultsByCustomerForTC160() {

		jpayFacility().facilityIntel().verifySMoneySearchInmateId(inmateId);
		jpayFacility().facilityIntel().verifySMoneySearchRecipientName(inmateName);
		jpayFacility().facilityIntel().verifySMoneySearchAgency(agency);
		jpayFacility().facilityIntel().verifySMoneySearchFacilityLocation(facilityLocation);
		
	}
	
	/*********************************************************************************
	 * 
	 * Verify customer id,customer name and total letters sent of In mail search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-160::Design Steps"
			+ "::46,47,48(Verify customer id,customer name and total letters sent of In "
			+ "mail search result.)")
	public void verifyInMailSearchResultsByCustomerForTC160() {

		jpayFacility().facilityIntel().verifySInMailSearchCustomerIdByCustomer(customerId);
		jpayFacility().facilityIntel().verifySInMailSearchCustomerNameByCustomer(customerName);
		jpayFacility().facilityIntel().verifySInMailSearchTotalLettersSentByCustomer();
		
	}

	/*********************************************************************************
	 * 
	 * Verify customer id,customer name and total letters sent of Out mail search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-160::Design Steps"
			+ "::49,50,51(Verify customer id,customer name and total letters sent of Out "
			+ "mail search result.)")
	public void verifyOutMailSearchResultsByCustomerForTC160() {

		jpayFacility().facilityIntel().verifySOutMailSearchCustomerIdByCustomer(customerId);
		jpayFacility().facilityIntel().verifySOutMailSearchCustomerNameByCustomer(customerName);
		jpayFacility().facilityIntel().verifySOutMailSearchTotalLettersSentByCustomer();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click on view button of in mail and verify total records found,navigate 
	 * browser back,click on view button of out mail and verify total records found.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-160::Design Steps"
			+ "::52,53,54,55,56(Click on view button of in mail and verify total records "
			+ "found,navigate browser back,click on view button of out mail and verify "
			+ "total records found.)")
	public void clickViewInOutMailAndVerifyForTC160() {

		jpayFacility().facilityIntel().ClickSInMailViewButtonByCustomer();
		jpayFacility().facilityIntel().verifySInMailSearchResultByCustomerPresent();
		jpayFacility().facilityIntel().navigateBrowserBack();
		jpayFacility().facilityIntel().ClickSOutMailViewButtonByCustomer();
		jpayFacility().facilityIntel().verifySOutMailSearchResultByCustomerPresent();
		
	}
	
	
	/*********************************************************************************
	 * 
	 * Click sign out button and verify Login details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-160:: Design "
			+ "Steps::57(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_160Test(data) };
	}
	
	
	public EmailWTC_160Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		passwordSuper = data.get("passwordSuper");
		usernameSuper = data.get("usernameSuper");
		pinCode = data.get("pinCode");
		typeInmate = data.get("typeInmate");
		typeId = data.get("typeId");
		inmateId = data.get("inmateId");
		inmateName = data.get("inmateName");
		agency = data.get("agency");
		facilityLocation = data.get("facilityLocation");
		typeCustomer = data.get("typeCustomer");
		typeEmail = data.get("typeEmail");
		emailAddress = data.get("emailAddress");
		customerId = data.get("customerId");
		customerName = data.get("customerName");
		searchErrorMessage = data.get("searchErrorMessage");
		
		
		
	}

	


}
