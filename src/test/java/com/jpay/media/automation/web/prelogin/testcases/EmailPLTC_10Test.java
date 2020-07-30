package com.jpay.media.automation.web.prelogin.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailPLTC_10Test extends BaseTestObject {

	
	
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
	
	
	

	/************************************************************************************************
	 * 
	 * TestCase :: PLTC10 - (User shall be able to add facility in staging and verify in www.)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: PLTC10
	 * Status :: Completed
	 * 
	 **************************************************************************************************/

	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details, enter
	 * username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::PLTC10 ::Design Steps"
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
	 * text,click manage locations link,click choose agency,select facility,enter 
	 * location code,alias,description,address,city,zip,select timezone,phone number 
	 * and click add location button and verify added description,location code,alias,
	 * address,city,zip,phone number,timezone and show in service map and enable 
	 * jpay dollar checkbox is selected.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::PLTC10 ::Design Steps"
			+ "::7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30"
			+ "(Click on Administration link,click on facility management link,verify "
			+ "header text,click manage locations link,click choose agency,select facility,"
			+ "enter location code,alias,description,address,city,zip,select timezone,phone "
			+ "number and click add location button and verify added description,location "
			+ "code,alias,address,city,zip,phone number,timezone and show in service map and "
			+ "enable jpay dollar checkbox is selected.)")
	public void addManageLocationFacilityOfStagingAndVerify() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageLocationLink();
		jpayStaging().stagingAdmin().clickFMMLChooseAgency();
		jpayStaging().stagingAdmin().selectFMMLFacility(facility, environment);
		jpayStaging().stagingAdmin().enterFMMLLocationCode(locationCode);
		jpayStaging().stagingAdmin().enterFMMLLocationAlias(locationCode);
		jpayStaging().stagingAdmin().enterFMMLLocationDescription(locationDesc);
		jpayStaging().stagingAdmin().enterFMMLAddress(address);
		jpayStaging().stagingAdmin().enterFMMLCity(city);
		jpayStaging().stagingAdmin().enterFMMLZip(zip);
		jpayStaging().stagingAdmin().selectFMMLTimezone(timeZone);
		jpayStaging().stagingAdmin().enterFMMLPhone(phone);
		jpayStaging().stagingAdmin().clickFMMLAddLocationButton();
		
		jpayStaging().stagingAdmin().verifyFMMLFacilityDescriptionPresent(locationDesc);
		jpayStaging().stagingAdmin().verifyFMMLFacilityCodePresent(locationDesc, locationCode);
		jpayStaging().stagingAdmin().verifyFMMLFacilityAliasPresent(locationDesc, locationCode);
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

	@Test(enabled = true, priority = 3, description = "TestCases::PLTC10::Design Steps"
			+ "::31,32,33(Click on Administration link,click on sign out button and "
			+ "verify personal details.)")
	public void logoutFromStaging() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().pause(200000);

	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::PLTC10 :: Design "
			+ "Steps::34,35(Navigate to www and verify page title.)")
	public void loginToJpayAndVerify1() {

		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().login().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Click prison search link and verify state list which are giving service.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =5, description = "TestCase::PLTC05::Design Steps::"
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

	@Test(enabled = true, priority = 6, description = "TestCases::PLTC05 :: Design "
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

	@Test(enabled = true, priority = 7, description = "TestCases::PLTC05 :: Design "
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

	@Test(enabled = true, priority = 8, description = "TestCases::PLTC05 ::Design Steps"
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

	@Test(enabled = true, priority = 9, description = "TestCases::PLTC10 ::Design Steps"
			+ "::55,56,57,58,59,60,61,62,63,64,65,66,67,68(Click on Administration link,"
			+ "click on facility management link,verify header text,click manage locations "
			+ "link,click choose agency,select facility,click on delete button and verify "
			+ "added description,location code,alias,address,city,zip,phone number and "
			+ "timezone is deleted.)")
	public void deleteManageLocationFacilityOfStagingAndVerify() {

		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickfacilitiesManagementLink();
		jpayStaging().stagingAdmin().verifyfacilityManagementMainPagetext(facilityManagementMainPagetext);
		jpayStaging().stagingAdmin().clickManageLocationLink();
		jpayStaging().stagingAdmin().clickFMMLChooseAgency();
		jpayStaging().stagingAdmin().selectFMMLFacility(facility, environment);
		jpayStaging().stagingAdmin().clickFMMLDeleteButton(locationDesc);
		
		jpayStaging().stagingAdmin().verifyFMMLFacilityDescriptionAbsent(locationDesc);
		jpayStaging().stagingAdmin().verifyFMMLFacilityCodeAbsent(locationDesc, locationCode);
		jpayStaging().stagingAdmin().verifyFMMLFacilityAliasAbsent(locationDesc, locationCode);
		jpayStaging().stagingAdmin().verifyFMMLFacilityAddressAbsent(locationDesc, address);
		jpayStaging().stagingAdmin().verifyFMMLFacilityCityAbsent(locationDesc, city);
		jpayStaging().stagingAdmin().verifyFMMLFacilityZipAbsent(locationDesc, zip);
		jpayStaging().stagingAdmin().verifyFMMLFacilityPhoneAbsent(locationDesc, phone);

	}

	/*********************************************************************************
	 * 
	 * Click on Administration link,click on sign out button and verify personal
	 * details.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::PLTC10::Design Steps"
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
		return new Object[] { new EmailPLTC_10Test(data) };
	}

	public EmailPLTC_10Test(Map<String, String> data) {
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
		
		

	}

	
	
}
