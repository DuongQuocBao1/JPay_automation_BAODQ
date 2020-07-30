package com.jpay.media.automation.web.prelogin.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailPLTC_11Test extends BaseTestObject {

	
	
	private String variation;
	private String personalDetails;
	private String adminSystem;
	private String username;
	private String password;
	private String facility;
	private String facilityManagementMainPagetext;
	private String locationCode;
	private String locationDesc;
	private String address;
	private String city;
	private String zip;
	private String phone;
	private String timeZone;
	private String state;
	private String availableJapyServicesText;
	private String stateCode;
	private String locationDescUpdated;
	private String addressUpdated;
	private String cityUpdated;
	private String zipUpdated;
	private String phoneUpdated;
	private String locationCodeUpdated;
	
	
	

	/************************************************************************************************
	 * 
	 * TestCase :: PLTC11 - (User shall be able to add and update facility in staging and verify in www.)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: PLTC11
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::PLTC11 :: Design "
			+ "Steps::34,35(Navigate to www and verify page title.)")
	public void testStart() {

		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().login().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Click prison search link and verify state list which are giving service.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =2, description = "TestCase::PLTC11::Design Steps::"
			+ "36,37,38(Click prison search link and verify state list which are giving service.)")
	public void clickPrisonSearchLinkAndVerify() {

		jpayPrelogin().homeHeader().clickHeaderPrisonSearchLink();
		jpayEmail().login().verifyTitle(PageConstant.AVAILABILITY_PRICING_TITLE);
		jpayPrelogin().homeHeader().verifyStateList(PageConstant.STATE_LIST);
		
	}

	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::PLTC11 :: Design "
			+ "Steps::39,40,41,42,43,44,45,46(Select random inmate and click on email link.)")
	public void searchAddedPrisonAndVerify() {

		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(locationDesc);
		jpayPrelogin().availabilityPricing().verifyPermlocName(locationDesc);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facility);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddressOne(address);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddressTwo(city, stateCode, zip);
		jpayPrelogin().availabilityPricing().verifyFormatedPhoneNumber(phone);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::PLTC11 :: Design "
			+ "Steps::47,48(Click on Home link,verify page title and click logout.)")
	public void logoutFromJpay() {
		
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
		
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::PLTC11 ::Design Steps"
			+ "::49,50,51,52,53,54(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void loginToStaging() {

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
	 * text,click manage locations link,click choose agency,select facility,click 
	 * on delete button and verify added description,location code,alias,address,
	 * city,zip,phone number and timezone is deleted.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::PLTC11 ::Design Steps"
			+ "::55,56,57,58,59,60,61,62,63,64,65,66,67,68(Click on Administration link,"
			+ "click on facility management link,verify header text,click manage locations "
			+ "link,click choose agency,select facility,click on delete button and verify "
			+ "added description,location code,alias,address,city,zip,phone number and "
			+ "timezone is deleted.)")
	public void editManageLocationFacilityOfStagingAndVerify1() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageLocationLink();
		jpayStaging().stagingAdmin().clickFMMLChooseAgency();
		jpayStaging().stagingAdmin().selectFMMLFacility(facility, environment);
		jpayStaging().stagingAdmin().clickFMMLEditButton(locationDesc);
		jpayStaging().stagingAdmin().editFMMLAddress(locationDesc,addressUpdated);
		jpayStaging().stagingAdmin().editFMMLCity(locationDesc,cityUpdated);
		jpayStaging().stagingAdmin().editFMMLZip(locationDesc,zipUpdated);
		jpayStaging().stagingAdmin().editFMMLPhone(locationDesc,phoneUpdated);
		jpayStaging().stagingAdmin().clickFMMLEditUpdateButton(locationDesc);
		
		jpayStaging().stagingAdmin().verifyFMMLFacilityAddressPresent(locationDesc, addressUpdated);
		jpayStaging().stagingAdmin().verifyFMMLFacilityCityPresent(locationDesc, cityUpdated);
		jpayStaging().stagingAdmin().verifyFMMLFacilityZipPresent(locationDesc, zipUpdated);
		jpayStaging().stagingAdmin().verifyFMMLFacilityPhonePresent(locationDesc, phoneUpdated);
		jpayStaging().stagingAdmin().verifyFMMLShowInServiceMapCheckBoxSelected(locationDesc);
		jpayStaging().stagingAdmin().verifyFMMLEnableJpayDollarsCheckBoxSelected(locationDesc);

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::PLTC11::Design Steps"
			+ "::31,32,33(Click on Administration link,click on sign out button and "
			+ "verify personal details.)")
	public void logoutFromStaging2() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);

	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::PLTC11 :: Design "
			+ "Steps::34,35(Navigate to www and verify page title.)")
	public void loginToJpayAndVerify2() {

		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().login().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Click prison search link and verify state list which are giving service.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =9, description = "TestCase::PLTC11::Design Steps::"
			+ "36,37,38(Click prison search link and verify state list which are giving service.)")
	public void clickPrisonSearchLinkAndVerify2() {

		jpayPrelogin().homeHeader().clickHeaderPrisonSearchLink();
		jpayEmail().login().verifyTitle(PageConstant.AVAILABILITY_PRICING_TITLE);
		jpayPrelogin().homeHeader().verifyStateList(PageConstant.STATE_LIST);
		
	}

	/*********************************************************************************
	 * 
	 * Select random inmate and click on email link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::PLTC11 :: Design "
			+ "Steps::39,40,41,42,43,44,45,46(Select random inmate and click on email link.)")
	public void searchUpdatedPrisonAndVerify() {

		jpayPrelogin().availabilityPricing().clickStateButton(state);
		jpayPrelogin().availabilityPricing().clickPermlocLink(locationDesc);
		jpayPrelogin().availabilityPricing().verifyPermlocName(locationDesc);
		jpayPrelogin().availabilityPricing().verifyFacilityNamePermlocPage(facility);
		jpayPrelogin().availabilityPricing().verifyAvailableServicesText(availableJapyServicesText);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddressOne(addressUpdated);
		jpayPrelogin().availabilityPricing().verifyPhysicalAddressTwo(cityUpdated, stateCode, zipUpdated);
		jpayPrelogin().availabilityPricing().verifyFormatedPhoneNumber(phoneUpdated);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::PLTC11 :: Design "
			+ "Steps::47,48(Click on Home link,verify page title and click logout.)")
	public void logoutFromJpay2() {
		
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
		
	}
	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::PLTC11 ::Design Steps"
			+ "::49,50,51,52,53,54(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void loginToStaging2() {

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
	 * text,click manage locations link,click choose agency,select facility,click 
	 * on delete button and verify added description,location code,alias,address,
	 * city,zip,phone number and timezone is deleted.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::PLTC-05 ::Design Steps"
			+ "::55,56,57,58,59,60,61,62,63,64,65,66,67,68(Click on Administration link,"
			+ "click on facility management link,verify header text,click manage locations "
			+ "link,click choose agency,select facility,click on delete button and verify "
			+ "added description,location code,alias,address,city,zip,phone number and "
			+ "timezone is deleted.)")
	public void editManageLocationFacilityOfStagingAndVerify2() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageLocationLink();
		jpayStaging().stagingAdmin().clickFMMLChooseAgency();
		jpayStaging().stagingAdmin().selectFMMLFacility(facility, environment);
		jpayStaging().stagingAdmin().clickFMMLEditButton(locationDesc);
		jpayStaging().stagingAdmin().editFMMLAddress(locationDesc,address);
		jpayStaging().stagingAdmin().editFMMLCity(locationDesc,city);
		jpayStaging().stagingAdmin().editFMMLZip(locationDesc,zip);
		jpayStaging().stagingAdmin().editFMMLPhone(locationDesc,phone);
		jpayStaging().stagingAdmin().clickFMMLEditUpdateButton(locationDesc);
		
		jpayStaging().stagingAdmin().verifyFMMLFacilityAddressPresent(locationDesc, address);
		jpayStaging().stagingAdmin().verifyFMMLFacilityCityPresent(locationDesc, city);
		jpayStaging().stagingAdmin().verifyFMMLFacilityZipPresent(locationDesc, zip);
		jpayStaging().stagingAdmin().verifyFMMLFacilityPhonePresent(locationDesc, phone);
		jpayStaging().stagingAdmin().verifyFMMLShowInServiceMapCheckBoxSelected(locationDesc);
		jpayStaging().stagingAdmin().verifyFMMLEnableJpayDollarsCheckBoxSelected(locationDesc);

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::PLTC11::Design Steps"
			+ "::69,70,71(Click on Administration link,click on sign out button and "
			+ "verify personal details.)")
	public void testEnd() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);

	}

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/

	@Factory(dataProvider = "getData", dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String> data) {
		return new Object[] { new EmailPLTC_11Test(data) };
	}

	public EmailPLTC_11Test(Map<String, String> data) {
		super(data);

		username = data.get("username");
		password = data.get("password");
		personalDetails = data.get("personalDetails");
		adminSystem = data.get("adminSystem");
		variation = data.get("variation");
		facilityManagementMainPagetext = data.get("facilityManagementMainPagetext");
		facility = data.get("facility");
		locationCode = data.get("locationCode");
		locationDesc = data.get("locationDesc");
		address = data.get("address");
		city = data.get("city");
		zip = data.get("zip");//
		phone = data.get("phone");
		timeZone = data.get("timeZone");
		state = data.get("state");
		availableJapyServicesText = data.get("availableJapyServicesText");
		stateCode = data.get("stateCode");
		
		locationDescUpdated = data.get("locationDescUpdated");//
		addressUpdated = data.get("addressUpdated");
		cityUpdated = data.get("cityUpdated");
		zipUpdated = data.get("zipUpdated");
		phoneUpdated = data.get("phoneUpdated");
		locationCodeUpdated = data.get("locationCodeUpdated");
		
	
	}

	
	
}
