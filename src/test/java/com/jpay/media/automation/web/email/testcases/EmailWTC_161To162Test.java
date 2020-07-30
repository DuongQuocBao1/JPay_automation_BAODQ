package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: WTC161To162 - (161.User shall be able to intel search in only for Mail & Out Mail (super user)
 *                            162.User shall be able to intel search without show older records checked (super user))
 * Author :: shasan(Shahriar Hasan) , Date ::
 * DataFile :: Email.xlsx , DataSheet :: WTC161To162
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailWTC_161To162Test extends BaseTestObject{
	

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
	

	


	/*********************************************************************************
	 * 
	 * Navigate to facility,enter username,pincode,password and click on login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-161,162::DesignSteps"
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
	 * Click on intel tab link,click on search lenk,check mail and out mail checkbox,
	 * select serach category,select search filter category, enter inmate id,check 
	 * show older records checkbox, and click on search button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-161::Design Steps"
			+ "::6,7,8,9,10,11,12,13,14,15(Click on intel tab link,click on search lenk,"
			+ "check mail and out mail checkbox,select serach category,select search "
			+ "filter category, enter inmate id,check show older records checkbox,and "
			+ "click on search button.)")
	public void searchByInmateIdForTC161() {
		
		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().checkSMailCheckbox();
		jpayFacility().facilityIntel().checkSOutMailCheckbox();
		jpayFacility().facilityIntel().selectSSearchBy(typeInmate);
		jpayFacility().facilityIntel().selectSSearchFilterBy(typeId);
		jpayFacility().facilityIntel().enterSSearchString(inmateId);
		jpayFacility().facilityIntel().checkSShowOlderRecordsCheckbox();
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().pause(10000);
		
	}
	
	/*********************************************************************************
	 * 
	 * Verify inmate id,recipient name,agency,location,total letters 
	 * sent and number of unique senders of In mail search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-161::Design Steps"
			+ "::16,17,18,19,20,21(Verify inmate id,recipient name,agency,location,total "
			+ "letters sent and number of unique senders of In mail search result.)")
	public void verifyInMailSearchResultsByInmateForTC161() {

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

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-161::Design Steps"
			+ "::22,23,24,25,26(Verify inmate id,recipient name,agency,location and total "
			+ "letters sent of Out mail search result.)")
	public void verifyOutMailSearchResultsByInmateForTC161() {

		jpayFacility().facilityIntel().verifySOutMailSearchInmateIdByInmate(inmateId);
		jpayFacility().facilityIntel().verifySOutmailSearchRecipientNameByInmate(inmateName);
		jpayFacility().facilityIntel().verifySOutMailSearchAgencyByInmate(agency);
		jpayFacility().facilityIntel().verifySOutMailSearchFacilityLocationByInmate(facilityLocation);
		jpayFacility().facilityIntel().verifySOutMailSearchTotalLettersSentByInmate();
		
	}

	/*********************************************************************************
	 * 
	 * Click on intel tab link,click on search lenk,check mail and out mail checkbox,
	 * select serach category,select search filter category, enter inmate id,check 
	 * show older records checkbox, and click on search button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-161::Design Steps"
			+ "::27,28,29,30,31,32,33,34,35,36(Click on intel tab link,click on search link,"
			+ "check mail and out mail checkbox,select serach category,select search "
			+ "filter category, enter inmate id,check show older records checkbox,and "
			+ "click on search button.)")
	public void searchByCustomerEmailForTC161() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().checkSMailCheckbox();
		jpayFacility().facilityIntel().checkSOutMailCheckbox();
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

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-161::Design Steps"
			+ "::37,38,39(Verify customer id,customer name and total letters sent of In "
			+ "mail search result.)")
	public void verifyInMailSearchResultsByCustomerForTC161() {

		jpayFacility().facilityIntel().verifySInMailSearchCustomerIdByCustomer(customerId);
		jpayFacility().facilityIntel().verifySInMailSearchCustomerNameByCustomer(customerName);
		jpayFacility().facilityIntel().verifySInMailSearchTotalLettersSentByCustomer();
		
	}

	/*********************************************************************************
	 * 
	 * Verify customer id,customer name and total letters sent of Out mail search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-161::Design Steps"
			+ "::40,41,42(Verify customer id,customer name and total letters sent of Out "
			+ "mail search result.)")
	public void verifyOutMailSearchResultsByCustomerForTC161() {

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

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-161::Design Steps"
			+ "::43,44,45,46,47(Click on view button of in mail and verify total records "
			+ "found,navigate browser back,click on view button of out mail and verify "
			+ "total records found.)")
	public void clickViewInOutMailAndVerifyForTC161() {

		jpayFacility().facilityIntel().ClickSInMailViewButtonByCustomer();
		jpayFacility().facilityIntel().verifySInMailSearchResultByCustomerPresent();
		jpayFacility().facilityIntel().navigateBrowserBack();
		jpayFacility().facilityIntel().ClickSOutMailViewButtonByCustomer();
		jpayFacility().facilityIntel().verifySOutMailSearchResultByCustomerPresent();
		
	}

	/*********************************************************************************
	 * 
	 * Click on intel,click on search,click on all checkbox,select search category,
	 * select search filter type,enter inmate id and click on search button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::WTC-162::Design Steps"
			+ "::6,7,8,9,10,11,12,13(Click on intel,click on search,click on all checkbox,"
			+ "select search category,select search filter type,enter inmate id and click "
			+ "on search button.)")
	public void searchByInmateIdForTC162() {


		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().checkSAllCheckbox();
		jpayFacility().facilityIntel().selectSSearchBy(typeInmate);
		jpayFacility().facilityIntel().selectSSearchFilterBy(typeId);
		jpayFacility().facilityIntel().enterSSearchString(inmateId);
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().pause(10000);
		
	}
	
	/*********************************************************************************
	 * 
	 * Verify inmate id,recipient name,agency and location of money search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::WTC-162::Design Steps"
			+ "::14,15,16,17(Verify inmate id,recipient name,agency and location of "
			+ "money search result.)")
	public void verifyMoneySearchResultsByInmateForTC162() {

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

	@Test(enabled = true, priority = 11, description = "TestCases::WTC-162::Design Steps"
			+ "::18,19,20,21,22,23(Verify inmate id,recipient name,agency,location,total "
			+ "letters sent and number of unique senders of In mail search result.)")
	public void verifyInMailSearchResultsByInmateForTC162() {

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

	@Test(enabled = true, priority = 12, description = "TestCases::WTC-162::Design Steps"
			+ "::24,25,26,27,28(Verify inmate id,recipient name,agency,location and total "
			+ "letters sent of Out mail search result.)")
	public void verifyOutMailSearchResultsByInmateForTC162() {

		jpayFacility().facilityIntel().verifySOutMailSearchInmateIdByInmate(inmateId);
		jpayFacility().facilityIntel().verifySOutmailSearchRecipientNameByInmate(inmateName);
		jpayFacility().facilityIntel().verifySOutMailSearchAgencyByInmate(agency);
		jpayFacility().facilityIntel().verifySOutMailSearchFacilityLocationByInmate(facilityLocation);
		jpayFacility().facilityIntel().verifySOutMailSearchTotalLettersSentByInmate();
		
	}


	/*********************************************************************************
	 * 
	 * Click on intel,click on search,click on all checkbox,select search category,
	 * select search filter type,enter customer email and click on search button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::WTC-162::Design Steps"
			+ "::28,29,30,31,32,33,34,35,36,37(Click on intel,click on search,click on "
			+ "all checkbox,select search category,select search filter type,enter "
			+ "customer email and click on search button.)")
	public void searchByCustomerEmailForTC162() {

		jpayFacility().facilityIntel().clickIntelLink();
		jpayFacility().facilityIntel().clickSearchLink(environment);
		jpayFacility().facilityIntel().checkSAllCheckbox();
		jpayFacility().facilityIntel().selectSSearchBy(typeCustomer);
		jpayFacility().facilityIntel().selectSSearchFilterBy(typeEmail);
		jpayFacility().facilityIntel().enterSSearchString(emailAddress);
		jpayFacility().facilityIntel().clickSSearchButton();
		jpayFacility().facilityIntel().pause(10000);
		
	}
	
	/*********************************************************************************
	 * 
	 * Verify inmate id,recipient name,agency and location of money search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::WTC-162::Design Steps"
			+ "::38,39,40,41(Verify inmate id,recipient name,agency and location of "
			+ "money search result.)")
	public void verifyMoneySearchResultsByCustomerForTC162() {

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

	@Test(enabled = true, priority = 15, description = "TestCases::WTC-160::Design Steps"
			+ "::42,43,44(Verify customer id,customer name and total letters sent of In "
			+ "mail search result.)")
	public void verifyInMailSearchResultsByCustomerForTC162() {

		jpayFacility().facilityIntel().verifySInMailSearchCustomerIdByCustomer(customerId);
		jpayFacility().facilityIntel().verifySInMailSearchCustomerNameByCustomer(customerName);
		jpayFacility().facilityIntel().verifySInMailSearchTotalLettersSentByCustomer();
		
	}

	/*********************************************************************************
	 * 
	 * Verify customer id,customer name and total letters sent of Out mail search result.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "TestCases::WTC-162::Design Steps"
			+ "::45,46,47(Verify customer id,customer name and total letters sent of Out "
			+ "mail search result.)")
	public void verifyOutMailSearchResultsByCustomerForTC162() {

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

	@Test(enabled = true, priority = 17, description = "TestCases::WTC-162::Design Steps"
			+ "::48,49,50,51,52(Click on view button of in mail and verify total records "
			+ "found,navigate browser back,click on view button of out mail and verify "
			+ "total records found.)")
	public void clickViewInOutMailAndVerifyForTC162() {

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

	@Test(enabled = true, priority = 18, description = "TestCases::WTC-161,162:: Design "
			+ "Steps::(Click sign out button .)")
	public void testEnd() {
		
		jpayFacility().facilityHome().clickSignOutButton();
		
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_161To162Test(data) };
	}
	
	
	public EmailWTC_161To162Test(Map<String, String> data) {
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
		
		
		
	}

	


}
