package com.jpay.media.automation.web.prelogin.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailPLTC_12Test extends BaseTestObject {

	
	
	private String variation;
	private String jpayFirstTimeUrl;
	private String facebookThanksUrl;
	private String incomingMailsUrl;
	private String inmateInfoUrl;
	private String jPayDollarsPurchaseHistoryUrl;
	private String jVisitPurchaseHistory;
	private String newCustomerUrl;
	private String onsiteVideoVisitationApplicationStep1Url;
	private String onsiteVideoVisitationApplicationStep2Url;
	private String onsiteVideoVisitationApplicationStep3Url;
	private String purchaseHistoryUrl;
	private String scheduleVideoSessionSteps2Url;
	private String searchResultUrl;
	private String sendMailUrl;
	private String facilityServiceDetailsOutUrl;
	private String supportUrl;
	
	
	

	/************************************************************************************************
	 * 
	 * TestCase :: PLTC12 - (User shall be able to Select State From State select dropdown list.)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: PLTC12
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::PLTC12 :: Design "
			+ "Steps::1,2(Navigate to www and verify page title.)")
	public void testStart() {

		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().login().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::PLTC12 :: Design Steps::"
			+ "3 to 43(Navigate to first time user page url and verify state dropdown list.)")
	public void verifySelectDropdownOfJpayFirstTimeUrl() {

		jpayEmail().login().loadURL(jpayFirstTimeUrl);
		jpayPrelogin().stateSelect().verifyStateDropdownList1(PageConstant.STATE_LIST_FOR_DROPDOWN);	
		//jpayPrelogin().stateSelect().selectInmateState1AndVerify(PageConstant.STATE_LIST);
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::PLTC12 :: Design Steps::"
			+ "44 to 83(Navigate to facebook thanks page url and verify state dropdown list.)")
	public void verifySelectDropdownOfFacebookThanksUrl() {

		jpayEmail().login().loadURL(facebookThanksUrl);
		jpayPrelogin().stateSelect().verifyStateDropdownList2(PageConstant.STATE_LIST_FOR_DROPDOWN);	
		//jpayPrelogin().stateSelect().selectInmateState2AndVerify(PageConstant.STATE_LIST);		
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::PLTC12 :: Design Steps::"
			+ "84 to 123(Navigate to incoming mails page url and verify state dropdown list.)")
	public void verifySelectDropdownOfIncomingMailsUrl() {

		jpayEmail().login().loadURL(incomingMailsUrl);
		jpayPrelogin().stateSelect().verifyStateDropdownList2(PageConstant.STATE_LIST_FOR_DROPDOWN);	
		//jpayPrelogin().stateSelect().selectInmateState2AndVerify(PageConstant.STATE_LIST);		
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::PLTC12 :: Design Steps::"
			+ "124 to 163(Navigate to inmate info page url and verify state dropdown list.)")
	public void verifySelectDropdownOfInmateInfoUrl() {

		jpayEmail().login().loadURL(inmateInfoUrl);
		jpayPrelogin().stateSelect().verifyStateDropdownList2(PageConstant.STATE_LIST_FOR_DROPDOWN);	
		//jpayPrelogin().stateSelect().selectInmateState2AndVerify(PageConstant.STATE_LIST);		
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::PLTC12 :: Design Steps::"
			+ "164 to 203(Navigate to JPay dollar Purchase History page url and verify "
			+ "state dropdown list.)")
	public void verifySelectDropdownOfJPayDollarsPurchaseHistoryUrl() {

		jpayEmail().login().loadURL(jPayDollarsPurchaseHistoryUrl);
		jpayPrelogin().stateSelect().verifyStateDropdownList2(PageConstant.STATE_LIST_FOR_DROPDOWN);	
		//jpayPrelogin().stateSelect().selectInmateState2AndVerify(PageConstant.STATE_LIST);		
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::PLTC12 :: Design Steps::"
			+ "204 to 243(Navigate to JPay visit Purchase History page url and verify state dropdown list.)")
	public void verifySelectDropdownOfJVisitPurchaseHistoryUrl() {

		jpayEmail().login().loadURL(jVisitPurchaseHistory);
		jpayPrelogin().stateSelect().verifyStateDropdownList2(PageConstant.STATE_LIST_FOR_DROPDOWN);	
		//jpayPrelogin().stateSelect().selectInmateState2AndVerify(PageConstant.STATE_LIST);		
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::PLTC12 :: Design Steps::"
			+ "244 to 283(Navigate to New Customer page url and verify state dropdown list.)")
	public void verifySelectDropdownOfNewCustomerUrl() {

		jpayEmail().login().loadURL(newCustomerUrl);
		jpayPrelogin().stateSelect().verifyStateDropdownList2(PageConstant.STATE_LIST_FOR_DROPDOWN);	
		//jpayPrelogin().stateSelect().selectInmateState2AndVerify(PageConstant.STATE_LIST);		
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 9, description = "TestCases::PLTC12 :: Design Steps::"
			+ "284 to 323(Navigate to Onsite Video Visitation Application Step1 page url "
			+ "and verify state dropdown list.)")
	public void verifySelectDropdownOfOnsiteVideoVisitationApplicationStep1Url() {

		jpayEmail().login().loadURL(onsiteVideoVisitationApplicationStep1Url);
		jpayPrelogin().stateSelect().verifyStateDropdownList2(PageConstant.STATE_LIST_FOR_DROPDOWN);	
		//jpayPrelogin().stateSelect().selectInmateState2AndVerify(PageConstant.STATE_LIST);		
	}
	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCases::PLTC12 :: Design Steps::"
			+ "324 to 363(Navigate to Onsite Video Visitation Application Step2 page url and "
			+ "verify state dropdown list.)")
	public void verifySelectDropdownOfOnsiteVideoVisitationApplicationStep2Url() {

		jpayEmail().login().loadURL(onsiteVideoVisitationApplicationStep2Url);
		jpayPrelogin().stateSelect().verifyStateDropdownList2(PageConstant.STATE_LIST_FOR_DROPDOWN);	
		//jpayPrelogin().stateSelect().selectInmateState2AndVerify(PageConstant.STATE_LIST);		
	}
	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 11, description = "TestCases::PLTC12 :: Design Steps::"
			+ "364 to 403(Navigate to Onsite Video Visitation Application Step3 page url "
			+ "and verify state dropdown list.)")
	public void verifySelectDropdownOfOnsiteVideoVisitationApplicationStep3Url() {

		jpayEmail().login().loadURL(onsiteVideoVisitationApplicationStep3Url);
		jpayPrelogin().stateSelect().verifyStateDropdownList2(PageConstant.STATE_LIST_FOR_DROPDOWN);	
		//jpayPrelogin().stateSelect().selectInmateState2AndVerify(PageConstant.STATE_LIST);		
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 12, description = "TestCases::PLTC12 :: Design Steps::"
			+ "404 to 443(Navigate to JPay dollar Purchase page url and verify state dropdown list.)")
	public void verifySelectDropdownOfPurchaseHistoryUrL() {

		jpayEmail().login().loadURL(purchaseHistoryUrl);
		jpayPrelogin().stateSelect().verifyStateDropdownList2(PageConstant.STATE_LIST_FOR_DROPDOWN);	
		//jpayPrelogin().stateSelect().selectInmateState2AndVerify(PageConstant.STATE_LIST);		
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCases::PLTC12 :: Design "
			+ "Steps::444 to 483(Navigate to Schedule Video Session Steps2 page url and verify state dropdown list.)")
	public void verifySelectDropdownOfScheduleVideoSessionSteps2Url() {

		jpayEmail().login().loadURL(scheduleVideoSessionSteps2Url);
		jpayPrelogin().stateSelect().verifyStateDropdownList2(PageConstant.STATE_LIST_FOR_DROPDOWN);	
		//jpayPrelogin().stateSelect().selectInmateState2AndVerify(PageConstant.STATE_LIST);		
	}
	
	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCases::PLTC12 :: Design "
			+ "Steps::484 to 523(Navigate to Search Result page url and verify state dropdown list.)")
	public void verifySelectDropdownOfSearchResultUrl() {

		jpayEmail().login().loadURL(searchResultUrl);
		jpayPrelogin().stateSelect().verifyStateDropdownList2(PageConstant.STATE_LIST_FOR_DROPDOWN);	
		//jpayPrelogin().stateSelect().selectInmateState2AndVerify(PageConstant.STATE_LIST);		
	}
	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 15, description = "TestCases::PLTC12 :: Design "
			+ "Steps::524 to 563(Navigate to Send Mail page url and verify state dropdown list.)")
	public void verifySelectDropdownOfSendMailUrl() {

		jpayEmail().login().loadURL(sendMailUrl);
		jpayPrelogin().stateSelect().verifyStateDropdownList2(PageConstant.STATE_LIST_FOR_DROPDOWN);	
		//jpayPrelogin().stateSelect().selectInmateState2AndVerify(PageConstant.STATE_LIST);		
	}
	
	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "TestCases::PLTC12 :: Design "
			+ "Steps::564 to 603(Navigate to Facility Service Details Out page url and verify state dropdown list.)")
	public void verifySelectDropdownOfFacilityServiceDetailsOutUrl() {

		jpayEmail().login().loadURL(facilityServiceDetailsOutUrl);
		jpayPrelogin().stateSelect().verifyStateDropdownList3(PageConstant.STATE_LIST_FOR_DROPDOWN);	
		//jpayPrelogin().stateSelect().selectInmateState3AndVerify(PageConstant.STATE_LIST);		
	}
	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 17, description = "TestCases::PLTC12 :: Design "
			+ "Steps::604 to 643(Navigate to Support page url and verify state dropdown list.)")
	public void verifySelectDropdownOfSupportUrl() {

		jpayEmail().login().loadURL(supportUrl);
		jpayPrelogin().stateSelect().verifyStateDropdownList3(PageConstant.STATE_LIST_FOR_DROPDOWN);	
		//jpayPrelogin().stateSelect().selectInmateState3AndVerify(PageConstant.STATE_LIST);		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 18, description = "TestCases::PLTC12 :: Design "
			+ "Steps::644,645(Click on Home link,verify page title.)")
	public void testEnd() {
		
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
		
	}
	
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/

	@Factory(dataProvider = "getData", dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String> data) {
		return new Object[] { new EmailPLTC_12Test(data) };
	}

	public EmailPLTC_12Test(Map<String, String> data) {
		super(data);

		
		
		
		jpayFirstTimeUrl = data.get("jpayFirstTimeUrl");
		facebookThanksUrl = data.get("facebookThanksUrl");
		incomingMailsUrl = data.get("incomingMailsUrl");
		inmateInfoUrl = data.get("inmateInfoUrl");
		jPayDollarsPurchaseHistoryUrl = data.get("jPayDollarsPurchaseHistoryUrl");
		jVisitPurchaseHistory = data.get("jVisitPurchaseHistory");
		newCustomerUrl = data.get("newCustomerUrl");
		onsiteVideoVisitationApplicationStep1Url = data.get("onsiteVideoVisitationApplicationStep1Url");
		onsiteVideoVisitationApplicationStep2Url = data.get("onsiteVideoVisitationApplicationStep2Url");
		onsiteVideoVisitationApplicationStep3Url = data.get("onsiteVideoVisitationApplicationStep3Url");
		purchaseHistoryUrl = data.get("purchaseHistoryUrl");
		scheduleVideoSessionSteps2Url = data.get("scheduleVideoSessionSteps2Url");
		searchResultUrl = data.get("searchResultUrl");
		sendMailUrl = data.get("sendMailUrl");
		facilityServiceDetailsOutUrl = data.get("facilityServiceDetailsOutUrl");
		supportUrl = data.get("supportUrl");
		variation = data.get("variation");
		
		
		
		
	
	}

	
	
	
	
}
