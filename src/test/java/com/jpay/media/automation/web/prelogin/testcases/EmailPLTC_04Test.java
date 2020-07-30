package com.jpay.media.automation.web.prelogin.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: PLTC04 - (User shall be able to verify all the footer link under JPay.com)
 * Author :: shasan(Shahriar Hasan) , Date :: 07/15/2019
 * DataFile :: Email.xlsx , DataSheet :: PLTC04
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailPLTC_04Test extends BaseTestObject{
	


	private String variation;
	private String availibilityText;
	private String facilityLookText;
	private String facilityLookDetailsText;
	private String jpayComText;
	private String inmateServicesText;
	private String paroleProbationText;
	private String socialText;
	private String homeText;
	private String aboutText;
	private String inmateSearchText;
	private String prisonSearchText;
	private String contactUsText;
	private String helpText;
	private String aboutJpayHeaderText;
	private String aboutJpayContentText;
	private String callOrWriteUsText;
	private String emailUsTabText;
	private String callWriteUsTabText;
	private String contactSalesTabText;
	private String emailUsFormHeaderText;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private String message;
	private String successMessage;
	private String contactSalesFormHeaderText;
	private String colorCode;
	

	


	/*********************************************************************************
	 * 
	 * Navigate to the url and verify the title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::PLTC04::Design Steps::"
			+ "1,2(Navigate to the url and verify the title of the page.)")
	public void testStart() {
		
		jpayPrelogin().homeFooter().loadURL(envUrlJpay,variation);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Verify all the Header and jpay.com links from footer.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCase::PLTC04::Design Steps::"
			+ "3,4,5,6,7,8,9,10,11,12(Verify all the Header and jpay.com links from footer.)")
	public void verifyFooterLinksHeaderAndLinks() {

		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(jpayComText);
		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(inmateServicesText);
		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(paroleProbationText);
		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(socialText);
		
		jpayPrelogin().homeFooter().verifyFooterLink(jpayComText, homeText);
		jpayPrelogin().homeFooter().verifyFooterLink(jpayComText, aboutText);
		jpayPrelogin().homeFooter().verifyFooterLink(jpayComText, inmateSearchText);
		jpayPrelogin().homeFooter().verifyFooterLink(jpayComText, prisonSearchText);
		jpayPrelogin().homeFooter().verifyFooterLink(jpayComText, contactUsText);
		jpayPrelogin().homeFooter().verifyFooterLink(jpayComText, helpText);
		
	}

	/*********************************************************************************
	 * 
	 * Click Footer home link and verify the title and url of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =3, description = "TestCase::PLTC04::Design Steps::"
			+ "13,14,15,16(Click Footer home link and verify the title and url of the page.)")
	public void navigateToHomeLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterHomeLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
		jpayPrelogin().homeHeader().verifyUrl(envUrlJpay);
		
	}

	/*********************************************************************************
	 * 
	 * Click JPay footer about link, verify header and content text,page 
	 * title,verify facebook box and mobile app download box is present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =4, description = "TestCase::PLTC04::Design Steps::"
			+ "17,18,19,20,21,22(Click JPay footer about link, verify header and content text"
			+ " and page title,verify facebook box and mobile app download box is present.)")
	public void navigateToAboutLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterAboutLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_ABOUT_US_TITLE);
		jpayPrelogin().homeFooter().verifyAboutJpayHeaderText(aboutJpayHeaderText);
		jpayPrelogin().homeFooter().verifyAboutJpayContentText(aboutJpayContentText);
		jpayPrelogin().homeHeader().verifyJpayFacebookBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		
	}

	/*********************************************************************************
	 * 
	 * Click inmate search link,verify page title and url,verify inmate 
	 * search,facebook and mobile app download box is present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =6, description = "TestCase::PLTC04::Design Steps::"
			+ "23,24,25,26,27,28,29(Click inmate search link,verify page title and url,"
			+ "verify inmate search,facebook and mobile app download box is present.)")
	public void navigateToInmateSearchLinkAndVerifyTitle() {

		jpayPrelogin().homeFooter().clickFooterInmateSearchLink();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		jpayPrelogin().homeFooter().verifyUrl(PageConstant.JPAY_INMATE_SEARCH_URL);
		jpayPrelogin().homeHeader().verifyLoginBoxPresent();
		jpayPrelogin().homeHeader().verifyInmateSearchBoxPresent();
		jpayPrelogin().homeHeader().verifyJpayFacebookBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		
	}

	/*********************************************************************************
	 * 
	 * Click prison search link,verify page title and url,JPay logo,Twitter,Facebook,
	 * Inmate search,Prison search,Help and login links are present,verify inmate 
	 * search page header texts,verify state map list and state list of service.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =7, description = "TestCase::PLTC04::Design Steps::"
			+ "30,31,32,33,34,35,36(Click prison search link,verify page title and url,"
			+ "verify inmate search page header texts,verify state map list and state "
			+ "list of service.)")
	public void navigateToPrisonSearchLinkAndVerifyTitle() {

		jpayPrelogin().homeFooter().clickFooterPrisonSearchLink();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.AVAILABILITY_PRICING_TITLE);
		jpayPrelogin().homeFooter().verifyUrl(PageConstant.JPAY_PRISON_SEARCH_URL);
		jpayPrelogin().homeHeader().verifyPrisonSearchAvailabilityPricingText(availibilityText);
		jpayPrelogin().homeHeader().verifyPrisonSearchFacilityLookupText(facilityLookText);
		jpayPrelogin().homeHeader().verifyPrisonSearchFacilityLookupDetailsText(facilityLookDetailsText);
		jpayPrelogin().homeHeader().verifyStateList(PageConstant.STATE_LIST);
		
	}

	/*********************************************************************************
	 * 
	 * Click on contact us link,verify page title,section header tabs,click on email 
	 * us tab,verify inmate search,facebook box and mobile app box is present,verify 
	 * the form header text,fill out the form,verify success message and submit 
	 * button is disabled, click on call or write us tab and verify content text,
	 * inmate search box and mobile app box is present but facebook box is absent, 
	 * click on contact sales tab,,verify inmate search and mobile app box is present 
	 * and facebook box is absent,verify the form header text,fill out the form,verify 
	 * success message and submit button is disabled.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =8, description = "TestCase::PLTC04::Design Steps::"
			+ "37,38,39,40,41,42,43,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,"
			+ "62,63,64,65,66,67,68,69,70,71,72,73,74(Click on contact us link,verify page title,"
			+ "section header tabs,click on email us tab,verify inmate search,facebook "
			+ "box and mobile app box is present,verify the form header text,fill out "
			+ "the form,verify success message and submit button is disabled, click on "
			+ "call or write us tab and verify content text,inmate search box and mobile "
			+ "app box is present but facebook box is absent, click on contact sales tab,"
			+ "verify inmate search and mobile app box is present and facebook box is "
			+ "absent,verify the form header text,fill out the form,verify success "
			+ "message and submit button is disabled.)")
	public void navigateToContactUsLinkAndVerifyTitle() {

		jpayPrelogin().homeFooter().clickFooterContactUsLink();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_CONTACT_INFO_TITLE);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(emailUsTabText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(callWriteUsTabText);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(callWriteUsTabText,colorCode);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(contactSalesTabText);
		
		jpayPrelogin().homeFooter().clickFooterLinksSectionTab(emailUsTabText);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_CONTACT_US_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(emailUsTabText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxPresent();
		jpayPrelogin().homeHeader().verifyJpayFacebookBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();/*
		jpayPrelogin().homeFooter().verifyEmailUsContactFormHeaderText(emailUsFormHeaderText);
		jpayPrelogin().homeFooter().fillOutEmailUsContactForm(firstname, lastname, email, phone, message);
		jpayPrelogin().homeFooter().verifyEmailUsContactFormSubmitSuccessMsg(successMessage);
		jpayPrelogin().homeFooter().verifyEmailUsFormSubmitButtonDisabled();*/
		
		jpayPrelogin().homeFooter().clickFooterLinksSectionTab(callWriteUsTabText);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_CONTACT_INFO_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(callWriteUsTabText,colorCode);
		jpayPrelogin().homeFooter().verifyContactUsCallOrWriteUsInfo(callOrWriteUsText);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeHeader().verifyJpayFacebookBoxAbsent();
		
		jpayPrelogin().homeFooter().clickFooterLinksSectionTab(contactSalesTabText);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_CONTACT_US_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(contactSalesTabText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeHeader().verifyJpayFacebookBoxAbsent();/*
		jpayPrelogin().homeFooter().verifyContactSalesContactFormHeaderText(contactSalesFormHeaderText);
		jpayPrelogin().homeFooter().fillOutContactSalesContactForm(firstname, lastname, email, phone, message);
		jpayPrelogin().homeFooter().verifyContactSalesContactFormSubmitSuccessMsg(successMessage);
		jpayPrelogin().homeFooter().verifyContactSalesFormSubmitButtonDisabled();*/
		
	}

	/*********************************************************************************
	 * 
	 * Click help link,navigate to child window,verify page title and url and close child window.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =9, description = "TestCase::PLTC04::Design Steps::"
			+ "75,76,77,78(Click help link,navigate to child window,verify page title "
			+ "and url and close child window.)")
	public void clickHelpLinkAndVerifyTitle() {

		jpayPrelogin().homeHeader().clickHelpLink();
		jpayPrelogin().homeHeader().navigateToChildWindow();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.WEB_HELP_TITLE);
		jpayPrelogin().homeHeader().verifyUrl(PageConstant.WEB_HELP_URL);
		
	}

	/*********************************************************************************
	 * 
	 * Click on home link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 10, description = "TestCase::PLTC04::Design Steps::"
			+ "79( Click on home link.)")
	public void testEnd() {

		jpayPrelogin().homeFooter().closeChildWindowUsingRobot();
		jpayPrelogin().homeFooter().switchToMainWindow();
		jpayEmail().headerNavigation().clickHomeLink();
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailPLTC_04Test(data) };
	}
	
	
	public EmailPLTC_04Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		availibilityText = data.get("availibilityText");
		facilityLookText = data.get("facilityLookText");
		facilityLookDetailsText = data.get("facilityLookDetailsText");
		jpayComText = data.get("jpayComText");
		inmateServicesText = data.get("inmateServicesText");
		paroleProbationText = data.get("paroleProbationText");
		socialText = data.get("socialText");
		homeText = data.get("homeText");
		aboutText = data.get("aboutText");
		inmateSearchText = data.get("inmateSearchText");
		prisonSearchText = data.get("prisonSearchText");
		contactUsText = data.get("contactUsText");
		helpText = data.get("helpText");
		aboutJpayHeaderText = data.get("aboutJpayHeaderText");
		aboutJpayContentText = data.get("aboutJpayContentText");
		callOrWriteUsText = data.get("callOrWriteUsText");
	
		emailUsTabText = data.get("emailUsTabText");
		callWriteUsTabText = data.get("callWriteUsTabText");
		contactSalesTabText = data.get("contactSalesTabText");
		emailUsFormHeaderText = data.get("emailUsFormHeaderText");
		firstname = data.get("firstname");
		lastname = data.get("lastname");
		email = data.get("email");
		phone = data.get("phone");
		message = data.get("message");
		successMessage = data.get("successMessage");
		contactSalesFormHeaderText = data.get("contactSalesFormHeaderText");
		colorCode = data.get("colorCode");
		
		
	}




}
