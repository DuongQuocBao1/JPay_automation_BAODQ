package com.jpay.media.automation.web.prelogin.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: PLTC09 - (User shall be able to verify Facility information in www.)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: PLTC09
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailPLTC_09Test extends BaseTestObject{
	


	private String variation;
	private String personalDetails;
	private String adminSystem;
	private String username;
	private String password;
	private String facility;
	private String facilityManagementMainPagetext;
	private String state;
	private String availableJapyServicesText;
	private String stateCode;
	
	
	public static String Location_Desc;
	public static String Address;
	public static String City;
	public static String Zip;
	public static String Phone;
	

	/************************************************************************************************
	 * 
	 * TestCase :: PLTC09 - (User shall be able to add facility in staging and verify in www.)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: PLTC09
	 * Status :: Completed
	 * 
	 **************************************************************************************************/

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::PLTC09 ::Design Steps"
			+ "::1,2,3,4,5,6(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void testStart() {

		jpayStaging().stagingLogin().loadURL(envUrlStaging, variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on facility management link,verify header 
	 * text,click manage locations link,click choose agency,select facility and get 
	 * the first checked location desc,address,city,zip and phone number.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::PLTC09 ::Design Steps"
			+ "::7,8,9,10,11,12,13,14,15,16,17(Click on Administration link,click on "
			+ "facility management link,verify header text,click manage locations link,"
			+ "click choose agency,select facility, and get the first checked location "
			+ "desc,address,city,zip and phone number.)")
	public void getFacilityInformation() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageLocationLink();
		jpayStaging().stagingAdmin().clickFMMLChooseAgency();
		jpayStaging().stagingAdmin().selectFMMLFacility(facility, environment);
		
		Location_Desc = jpayStaging().stagingAdmin().getFMMLLocationDescription();
		Address = jpayStaging().stagingAdmin().getFMMLAddress();
		City = jpayStaging().stagingAdmin().getFMMLCity();
		Zip = jpayStaging().stagingAdmin().getFMMLZip();
		Phone = jpayStaging().stagingAdmin().getFMMLPhone();
		
	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::PLTC09::Design Steps"
			+ "::18,19,20(Click on Administration link,click on sign out button and "
			+ "verify personal details.)")
	public void logoutFromStaging() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);

	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::PLTC09 :: Design "
			+ "Steps::21,22(Navigate to www and verify page title.)")
	public void loginToJpayAndVerify1() {

		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().login().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Click prison search link and verify state list which are giving service.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =5, description = "TestCase::PLTC09::Design Steps::"
			+ "23,24,25(Click prison search link and verify state list which are giving service.)")
	public void clickPrisonSearchLinkAndVerify() {

		jpayPrelogin().homeHeader().clickHeaderPrisonSearchLink();
		jpayEmail().login().verifyTitle(PageConstant.AVAILABILITY_PRICING_TITLE);
		jpayPrelogin().homeHeader().verifyStateList(PageConstant.STATE_LIST);
		
	}

	/*********************************************************************************
	 * 
	 * Click on state,click on facility and verify information.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::PLTC09 :: Design "
			+ "Steps::26,27,28,29,30,31,32,33(Click on state,click on facility and "
			+ "verify information.)")
	public void searchPrisonAndVerifyInformation() {

		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(Location_Desc);
		jpayPrelogin().availabilityPricing().verifyPermlocName(Location_Desc);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facility);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddressOne(Address);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddressTwo(City, stateCode, Zip);
		jpayPrelogin().availabilityPricing().verifyFormatedPhoneNumber(Phone);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::PLTC09 :: Design "
			+ "Steps::34,35(Click on Home link,verify page title and click logout.)")
	public void testEnd() {
		
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
		
	}
	


	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/

	@Factory(dataProvider = "getData", dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String> data) {
		return new Object[] { new EmailPLTC_09Test(data) };
	}

	public EmailPLTC_09Test(Map<String, String> data) {
		super(data);

		username = data.get("username");
		password = data.get("password");
		personalDetails = data.get("personalDetails");
		adminSystem = data.get("adminSystem");
		variation = data.get("variation");
		facilityManagementMainPagetext = data.get("facilityManagementMainPagetext");
		facility = data.get("facility");
		state = data.get("state");
		availableJapyServicesText = data.get("availableJapyServicesText");
		stateCode = data.get("stateCode");
		
		

	}

	
	

}
