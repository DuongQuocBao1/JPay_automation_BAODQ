package com.jpay.media.automation.web.prelogin.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: PLTC01 - (User shall be able to verify all the header link)
 * Author :: shasan(Shahriar Hasan) , Date :: 07/15/2019
 * DataFile :: Email.xlsx , DataSheet :: PLTC01
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailPLTC_01Test extends BaseTestObject{
	


	private String variation;
	private String availibilityText;
	private String facilityLookText;
	private String facilityLookDetailsText;
	private String stateColor;
	private String downloadJpayAppText;
	private String downloadSmartPhoneText;
	private String jpayImage;
	private String twitterImage;
	private String facebookImage;
	

	


	/*********************************************************************************
	 * 
	 * Navigate to the url and verify the title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::PLTC01::Design Steps::"
			+ "1,2(Navigate to the url and verify the title of the page.)")
	public void testStart() {
		
		jpayPrelogin().homeHeader().loadURL(envUrlJpay,variation);
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Verify JPay logo,Twitter,Facebook,Inmate search,Prison search,Help 
	 * and Login link are present and a link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCase::PLTC01::Design Steps::"
			+ "3,4,5,6,7,8,9,10,11,12,13,14,15,16(Verify JPay logo,Twitter,Facebook,Inmate"
			+ " search,Prison search,Help and Login link are present and a link.)")
	public void verifyHeaderLink() {

		jpayPrelogin().homeHeader().verifyJPayLogoPresent();
		jpayPrelogin().homeHeader().verifyHeaderJPayTwitterPresent();
		jpayPrelogin().homeHeader().verifyHeaderJPayFacerbookPresent();
		jpayPrelogin().homeHeader().verifyHeaderInmateSearchPresent();
		jpayPrelogin().homeHeader().verifyHeaderPrisonSearchPresent();
		jpayPrelogin().homeHeader().verifyHelpLinkPresent();
		jpayPrelogin().homeHeader().verifyHeaderLoginLinkPresent();
		jpayPrelogin().homeHeader().verifyHeaderJPayBannerSlideshowPresent();
		jpayPrelogin().homeHeader().verifyJPayLogoLink();
		jpayPrelogin().homeHeader().verifyJPayTwitterLink();
		jpayPrelogin().homeHeader().verifyJPayFacebookLink();
		jpayPrelogin().homeHeader().verifyInmateSearchLink();
		jpayPrelogin().homeHeader().verifyPrisonSearchLink();
		jpayPrelogin().homeHeader().verifyHelpLink();
		jpayPrelogin().homeHeader().verifyLoginLink();
		
	}

	/*********************************************************************************
	 * 
	 * Click JPay logo link and verify the title and url of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =3, description = "TestCase::PLTC01::Design Steps::"
			+ "17,18,19(Click JPay logo link and verify the title and url of the page.)")
	public void clickJPayLogoLinkAndVerifyTitle() {

		jpayPrelogin().homeHeader().verifyJpayLogoImageName(jpayImage);
		jpayPrelogin().homeHeader().clickHeaderJPayLogoLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
		jpayPrelogin().homeHeader().verifyUrl(envUrlJpay);
		
	}

	/*********************************************************************************
	 * 
	 * Click JPay Twitter link,navigate to child window and verify the title 
	 *  and url of the page and close the child window.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =4, description = "TestCase::PLTC01::Design Steps::"
			+ "20,21,22,23(Click JPay Twitter link,navigate to child window and verify "
			+ "the title and url of the page and close the child window.)")
	public void clickJPayTwitterLinkAndVerifyTitle() {

		jpayPrelogin().homeHeader().verifyJpayTwitterImageName(twitterImage);
		jpayPrelogin().homeHeader().clickHeaderJPayTwitterLink();
		jpayPrelogin().homeHeader().navigateToChildWindow();
		jpayPrelogin().homeHeader().verifyUrl(PageConstant.JPAY_TWITTER_URL);
		
	}

	/*********************************************************************************
	 * 
	 * Click JPay Facebook link,navigate to child window and verify the title 
	 * and url of the page and close the child window.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =5, description = "TestCase::PLTC01::Design Steps::"
			+ "24,25,26,27(Click JPay Facebook link,navigate to child window and verify "
			+ "the title and url of the page and close the child window.)")
	public void clickJPayFacebookLinkAndVerifyTitle() {

		jpayPrelogin().homeHeader().closeChildWindowUsingRobot();
		jpayPrelogin().homeHeader().switchToMainWindow();
		jpayPrelogin().homeHeader().verifyJpayFacebookImageName(facebookImage);
		jpayPrelogin().homeHeader().clickHeaderJPayFacebookLink();
		jpayPrelogin().homeHeader().navigateToChildWindow();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_FACEBOOK_TITLE);
		jpayPrelogin().homeHeader().verifyUrl(PageConstant.JPAY_FACEBOOK_URL);
		
	}

	/*********************************************************************************
	 * 
	 * Click inmate search link,verify page title and url,JPay logo,Twitter,Facebook,
	 * Inmate search,Prison search,Help links are present and login link is absent,
	 * login box and inmate search box is present,navigate to facebook logo and text 
	 * link and verify,navigate to apple app store link and verify and navigate to 
	 * google play store link and verify.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =6, description = "TestCase::PLTC01::Design Steps::"
			+ "20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,"
			+ "45,46,47,48,49,50,51,52,53,54,55,56,58,59,60(Click inmate search link,verify "
			+ "page title and url,JPay logo,Twitter,Facebook,Inmate search,Prison search,Help "
			+ "links are present and login link is absent,login box and inmate search box is "
			+ "present,navigate to facebook logo and text link and verify,navigate to apple app "
			+ "store link and verify and navigate to google play store link and verify.)")
	public void clickInmateSearchLinkAndVerifyTitle() {

		jpayPrelogin().homeHeader().closeChildWindowUsingRobot();
		jpayPrelogin().homeHeader().switchToMainWindow();
		jpayPrelogin().homeHeader().clickHeaderInmateSearchLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		jpayPrelogin().homeHeader().verifyUrl(PageConstant.JPAY_INMATE_SEARCH_URL);
		jpayPrelogin().homeHeader().verifyJPayLogoPresent();
		jpayPrelogin().homeHeader().verifyHeaderJPayTwitterPresent();
		jpayPrelogin().homeHeader().verifyHeaderJPayFacerbookPresent();
		jpayPrelogin().homeHeader().verifyHeaderInmateSearchPresent();
		jpayPrelogin().homeHeader().verifyHeaderPrisonSearchPresent();
		jpayPrelogin().homeHeader().verifyHelpLinkPresent();
		jpayPrelogin().homeHeader().verifyHeaderLoginLinkAbsent();
		jpayPrelogin().homeHeader().verifyLoginBoxPresent();
		jpayPrelogin().homeHeader().verifyInmateSearchBoxPresent();
		
		jpayPrelogin().homeHeader().verifyJpayFacebookBoxPresent();
		
		jpayPrelogin().homeHeader().clickJpayFacebookBoxJpayLogoButton();
		jpayPrelogin().homeHeader().navigateToChildWindow();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_FACEBOOK_TITLE);
		jpayPrelogin().homeHeader().closeChildWindowUsingRobot();
		jpayPrelogin().homeHeader().switchToMainWindow();
		
		jpayPrelogin().homeHeader().clickJpayFacebookBoxJpayTextButton();
		jpayPrelogin().homeHeader().navigateToChildWindow();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_FACEBOOK_TITLE);
		jpayPrelogin().homeHeader().closeChildWindowUsingRobot();
		jpayPrelogin().homeHeader().switchToMainWindow();
		
		jpayPrelogin().homeHeader().clickJpayFacebookBoxJpayLikePageButton();
		jpayPrelogin().homeHeader().navigateToChildWindow();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.FACEBOOK_LOGIN_TITLE);
		jpayPrelogin().homeHeader().closeChildWindowUsingRobot();
		jpayPrelogin().homeHeader().switchToMainWindow();
		
		jpayPrelogin().homeHeader().verifyJPayAppBoxDownloadText(downloadJpayAppText);
		jpayPrelogin().homeHeader().verifyJPayAppBoxSmartphoneText(downloadSmartPhoneText);
		jpayPrelogin().homeHeader().clickDownloadJpayAppStoreButton();
		jpayPrelogin().homeHeader().navigateToChildWindow();
		//jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_APPLE_APP_STORE_TITLE);
		jpayPrelogin().homeHeader().verifyUrl(PageConstant.JPAY_APPLE_APP_STORE_URL);
		jpayPrelogin().homeHeader().closeChildWindowUsingRobot();
		jpayPrelogin().homeHeader().switchToMainWindow();
		jpayPrelogin().homeHeader().clickDownloadJpayGooglePlayButton();
		jpayPrelogin().homeHeader().navigateToChildWindow();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_GOOGLE_PLAY_STORE_TITLE);
		jpayPrelogin().homeHeader().verifyUrl(PageConstant.JPAY_GOOGLE_PLAY_STORE_URL);
		jpayPrelogin().homeHeader().closeChildWindowUsingRobot();
		jpayPrelogin().homeHeader().switchToMainWindow();
		
	}


	/*********************************************************************************
	 * 
	 * Click prison search link,verify page title and url,JPay logo,Twitter,Facebook,
	 * Inmate search,Prison search,Help and login links are present,verify inmate 
	 * search page header texts,verify state map list and state list of service.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =7, description = "TestCase::PLTC01::Design Steps::"
			+ "61,62,63,64,65,66,67,68,69,70,71,72,73,74,75(Click prison search link,"
			+ "verify page title and url,JPay logo,Twitter,Facebook,Inmate search,Prison "
			+ "search,Help and login links are present,verify inmate search page header "
			+ "texts,verify state map list and state list of service.)")
	public void clickPrisonSearchLinkAndVerifyTitle() {

		jpayPrelogin().homeHeader().clickHeaderPrisonSearchLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.AVAILABILITY_PRICING_TITLE);
		jpayPrelogin().homeHeader().verifyUrl(PageConstant.JPAY_PRISON_SEARCH_URL);
		jpayPrelogin().homeHeader().verifyJPayLogoPresent();
		jpayPrelogin().homeHeader().verifyHeaderJPayTwitterPresent();
		jpayPrelogin().homeHeader().verifyHeaderJPayFacerbookPresent();
		jpayPrelogin().homeHeader().verifyHeaderInmateSearchPresent();
		jpayPrelogin().homeHeader().verifyHeaderPrisonSearchPresent();
		jpayPrelogin().homeHeader().verifyHelpLinkPresent();
		jpayPrelogin().homeHeader().verifyHeaderLoginLinkPresent();
		jpayPrelogin().homeHeader().verifyPrisonSearchAvailabilityPricingText(availibilityText);
		jpayPrelogin().homeHeader().verifyPrisonSearchFacilityLookupText(facilityLookText);
		jpayPrelogin().homeHeader().verifyPrisonSearchFacilityLookupDetailsText(facilityLookDetailsText);
		jpayPrelogin().homeHeader().verifyStateMapList(PageConstant.STATE_MAP_LIST,stateColor);
		jpayPrelogin().homeHeader().verifyStateList(PageConstant.STATE_LIST);
		
	}

	/*********************************************************************************
	 * 
	 * Click help link,navigate to child window,verify page title and url and close child window.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =8, description = "TestCase::PLTC01::Design Steps::"
			+ "76,77,78,79,80(Click help link,navigate to child window,verify page title "
			+ "and url and close child window.)")
	public void clickHelpLinkAndVerifyTitle() {

		jpayPrelogin().homeHeader().clickHelpLink();
		jpayPrelogin().homeHeader().navigateToChildWindow();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.WEB_HELP_TITLE);
		jpayPrelogin().homeHeader().verifyUrl(PageConstant.WEB_HELP_URL);
		
	}

	/*********************************************************************************
	 * 
	 * Click login link,verify page title and url,JPay logo,Twitter,Facebook,
	 * Inmate search,Prison search,Help links are present and login link is absent,
	 * login box and inmate search box is present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =9, description = "TestCase::PLTC01::Design Steps::"
			+ "81,82,83,84,85,86,87,88,89,90,91,92(Click login link,verify page title "
			+ "and url,JPay logo,Twitter,Facebook,Inmate search,Prison search,Help links "
			+ "are present and login link is absent,login box and inmate search box is present.)")
	public void clickLoginLinkAndVerifyTitle() {

		jpayPrelogin().homeHeader().closeChildWindowUsingRobot();
		jpayPrelogin().homeHeader().switchToMainWindow();
		jpayPrelogin().homeHeader().clickLoginLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		jpayPrelogin().homeHeader().verifyUrl(PageConstant.JPAY_LOGIN_URL);
		jpayPrelogin().homeHeader().verifyJPayLogoPresent();
		jpayPrelogin().homeHeader().verifyHeaderJPayTwitterPresent();
		jpayPrelogin().homeHeader().verifyHeaderJPayFacerbookPresent();
		jpayPrelogin().homeHeader().verifyHeaderInmateSearchPresent();
		jpayPrelogin().homeHeader().verifyHeaderPrisonSearchPresent();
		jpayPrelogin().homeHeader().verifyHelpLinkPresent();
		jpayPrelogin().homeHeader().verifyHeaderLoginLinkAbsent();
		jpayPrelogin().homeHeader().verifyLoginBoxPresent();
		jpayPrelogin().homeHeader().verifyInmateSearchBoxPresent();
		
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on home link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCase::PLTC01::Design Steps::"
			+ "93( Click on home link.)")
	public void testEnd() {

		jpayEmail().headerNavigation().clickHomeLink();
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailPLTC_01Test(data) };
	}
	
	
	public EmailPLTC_01Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		availibilityText = data.get("availibilityText");
		facilityLookText = data.get("facilityLookText");
		facilityLookDetailsText = data.get("facilityLookDetailsText");
		stateColor = data.get("stateColor");
		downloadJpayAppText = data.get("downloadJpayAppText");
		downloadSmartPhoneText = data.get("downloadSmartPhoneText");
		jpayImage = data.get("jpayImage");
		twitterImage = data.get("twitterImage");
		facebookImage = data.get("facebookImage");
		
		
		
	}

	


}
