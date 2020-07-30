package com.jpay.media.automation.web.prelogin.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: PLTC02 - (Verifying the prelogin Home Header Banner links.)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: PLTC02
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailPLTC_02Test extends BaseTestObject{
	


	private String variation;
	private String colorCode;
	private String inmateServicesPageContentText;
	private String sendMoneyLinkText;
	private String emailLinkText;
	private String musicLinkText;
	private String videoVisitationLinkText;
	private String educationLinkText;
	private String getStartedLinkText;
	private String sendMoneyLinkContentText;
	private String emailLinkContentText;
	private String buyMediaText;
	private String buyMediaContentText;
	private String videoVisitationLinkContentText;
	private String educationLinkContentText;
	private String paroleProbationPageContentText;
	private String makeAPaymentLinkText;
	private String releaseCardsLinkText;
	private String makeAPaymentLinkContentText;
	private String releaseCardsLinkContentText;
	

	


	/*********************************************************************************
	 * 
	 * Navigate to the url and verify the title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::PLTC02::Design Steps::"
			+ "1,2(Navigate to the url and verify the title of the page.)")
	public void testStart() {
		
		jpayPrelogin().homeFooter().loadURL(envUrlJpay,variation);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Click on inmate search link,verify home header banner is present,home link,
	 * inmate search link and parole & probation link is present in the banner.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =2, description = "TestCase::PLTC02::Design Steps::"
			+ "3,4,5,6,7(Click on inmate search link,verify home header banner is present,"
			+ "home link,inmate search link and parole & probation link is present in the banner.)")
	public void navigateToHeaderBannerAndVerify() {

		jpayPrelogin().homeHeader().clickHeaderInmateSearchLink();
		jpayPrelogin().homeHeader().verifyHomeHeaderBannerPresent();
		jpayPrelogin().homeHeader().verifyHomeHeaderBannerHomeLinkPresent();
		jpayPrelogin().homeHeader().verifyHomeHeaderBannerInmateServicesLinkPresent();
		jpayPrelogin().homeHeader().verifyHomeHeaderBannerParoleProbationLinkPresent();
		
	}

	/*********************************************************************************
	 * 
	 * Click on home link of header banner and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =3, description = "TestCase::PLTC02::Design Steps::"
			+ "8,9(Click on home link of header banner and verify page title.)")
	public void navigateToHomeLinkAndVerify() {

		jpayPrelogin().homeHeader().clickHeaderBannerHomeLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Click on inmate services lnik of header banner,verify title and url,verify 
	 * inmate services new customer box is present,facebook box is present,mobile 
	 * app download box is present,verify page content text,verify send money,
	 * email,music,video visitation and education link is present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =4, description = "TestCase::PLTC02::Design Steps::"
			+ "10,11,12,13,14,15,16,17,18,19,20,21,22(Click on inmate services lnik of "
			+ "header banner,verify title and url,verify inmate services new customer "
			+ "box is present,facebook box is present,mobile app download box is present,"
			+ "verify page content text,verify send money,email,music,video visitation "
			+ "and education link is present.)")
	public void navigateToInmateServicesLinkAndVerify() {

		jpayPrelogin().homeHeader().navigateBrowserBack();
		jpayPrelogin().homeHeader().clickHeaderBannerInamteServicesLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.FRIENDS_FAMILY_INMATE_SERVICES_TITLE);
		jpayPrelogin().homeHeader().verifyUrl(PageConstant.FRIENDS_FAMILY_INMATE_SERVICES_URL);
		jpayPrelogin().homeHeader().verifyInmateServicesNewCustomerBoxPresent();
		jpayPrelogin().homeHeader().verifyJpayFacebookBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeHeader().verifyInmateServicesPageContentText(inmateServicesPageContentText);
		jpayPrelogin().homeHeader().verifyInmateServicesPageLinkPresent(sendMoneyLinkText);
		jpayPrelogin().homeHeader().verifyInmateServicesPageLinkPresent(emailLinkText);
		jpayPrelogin().homeHeader().verifyInmateServicesPageLinkPresent(musicLinkText);
		jpayPrelogin().homeHeader().verifyInmateServicesPageLinkPresent(videoVisitationLinkText);
		jpayPrelogin().homeHeader().verifyInmateServicesPageLinkPresent(educationLinkText);
		jpayPrelogin().homeHeader().verifyInmateServicesPageLinkPresent(getStartedLinkText);
		
	}

	/*********************************************************************************
	 * 
	 * Click on send money link,verify page tile,clor of the tab, inmate search box,
	 * send money,mobile app download,moneygram and friends and family box is present,
	 * verify the tab section header text and content tet,click on get started link 
	 * and verify the first time user page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =5, description = "TestCase::PLTC02::Design Steps::"
			+ "23,24,25,26,27,28,29,30,31,32,33,34(Click on send money link,verify page tile,"
			+ "clor of the tab, inmate search box,send money,mobile app download,moneygram and"
			+ " friends and family box is present,verify the tab section header text and "
			+ "content tet,click on get started link and verify the first time user page title.)")
	public void navigateToInmateServicesSendMoneyLinkAndVerify() {

		jpayPrelogin().homeHeader().clickInmateServicesPageLink(sendMoneyLinkText);
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_SEND_MONEY_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(sendMoneyLinkText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxPresent();
		jpayPrelogin().homeFooter().verifyJpaySendMoneyInformationkBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifySendmoneyMoneygramBox();
		jpayPrelogin().homeFooter().verifyFriendsFamilyForumBox();
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabHeaderText(sendMoneyLinkText);
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabContentText(sendMoneyLinkContentText);
		
		jpayPrelogin().homeFooter().clickBOPInmateLocatorLink();
		jpayPrelogin().homeFooter().navigateToChildWindow();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_INMATE_LOCATOR_TITLE);
		jpayPrelogin().homeFooter().verifyUrl(PageConstant.JPAY_INMATE_LOCATOR_URL);
		jpayPrelogin().homeFooter().closeChildWindowUsingRobot();
		jpayPrelogin().homeFooter().switchToMainWindow();
		
		jpayPrelogin().homeFooter().clickSendMoneyRatesLink();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.AVAILABILITY_PRICING_TITLE);
		jpayPrelogin().homeHeader().navigateBrowserBack();
		
		jpayPrelogin().homeFooter().clickSendMoneyHereLink();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_MONEY_ORDER_TITLE);
		jpayPrelogin().homeHeader().navigateBrowserBack();
		
		jpayPrelogin().homeFooter().clickGetStartedLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Navigate browser back,click on emaillink,verify the title,clor of the tab, inmate 
	 * search box,mobile app download,send videogram and send photo box is present,
	 * verify the tab section header text and content tet,click on get started link 
	 * and verify the first time user page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =6, description = "TestCase::PLTC02::Design Steps::"
			+ "35,36,37,38,39,40,41,42,43,44,45,46(Navigate browser back,click on email "
			+ "link,verify the title,clor of the tab, inmate search box,mobile app "
			+ "download,send videogram and send photo box is present,verify the tab "
			+ "section header text and content tet,click on get started link and verify "
			+ "the first time user page title.)")
	public void navigateToInmateServicesEmailLinkAndVerify() {

		jpayPrelogin().homeHeader().navigateBrowserBack();
		jpayPrelogin().homeHeader().navigateBrowserBack();
		jpayPrelogin().homeHeader().clickInmateServicesPageLink(emailLinkText);
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_EMAIL_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(emailLinkText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifySendVideogramBox();
		jpayPrelogin().homeFooter().verifySendPhotoBox();
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabHeaderText(emailLinkText);
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabContentText(emailLinkContentText);
		jpayPrelogin().homeFooter().clickGetStartedLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Navigate browser back,click on music link,verify the title,color of the tab, inmate 
	 * search box,mobile app download  and friends and family box is present,
	 * verify the tab section header text and content text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =7, description = "TestCase::PLTC02::Design Steps::"
			+ "47,48,49,50,51,52,53,54,55(Navigate browser back,click on music link,"
			+ "verify the title,color of the tab, inmate search box,mobile app download"
			+ " and friends and family box is present,verify the tab section header text "
			+ "and content text.)")
	public void navigateToInmateServicesMusicLinkAndVerify() {

		jpayPrelogin().homeHeader().navigateBrowserBack();
		jpayPrelogin().homeHeader().navigateBrowserBack();
		jpayPrelogin().homeHeader().clickInmateServicesPageLink(musicLinkText);
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_BUY_MEDIA_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(buyMediaText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifyFriendsFamilyForumBox();
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabHeaderText(buyMediaText);
		jpayPrelogin().homeFooter().verifyInmateServicesBuyMediaContentText(buyMediaContentText);
		jpayPrelogin().homeHeader().navigateBrowserBack();
		
	}

	/*********************************************************************************
	 * 
	 * Navigate browser back,click on video visitation link,verify the title,color of the tab,
	 * inmate search box,mobile app download,send video visitation and send 
	 * friends and family box is present,verify the tab section header text 
	 * and content text,click on rates link and verify availability and pricing 
	 * page title,click on video visitation footer link,click on get started 
	 * link and verify the first time user page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =8, description = "TestCase::PLTC02::Design Steps::"
			+ "56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71(Navigate browser back,click "
			+ "on video visitation link,verify the title,color of the tab, inmate search "
			+ "box,mobile app download,send video visitation and send friends and family box "
			+ "is present,verify the tab section header text and content text,click on rates "
			+ "link and verify availability and pricing page title,click on video visitation "
			+ "footer link,click on get started link and verify the first time user page title.)")
	public void navigateToInmateServicesVideoVisitationLinkAndVerify() {

		jpayPrelogin().homeHeader().clickInmateServicesPageLink(videoVisitationLinkText);
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_VIDEO_VISITATION_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(videoVisitationLinkText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifyVideoVisitationBox();
		jpayPrelogin().homeFooter().verifyFriendsFamilyForumBox();
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabHeaderText(videoVisitationLinkText);
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabContentText(videoVisitationLinkContentText);
		jpayPrelogin().homeFooter().clickVideoVisitationRatesLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.AVAILABILITY_PRICING_TITLE);
		
		jpayPrelogin().homeHeader().navigateBrowserBack();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_VIDEO_VISITATION_TITLE);
		jpayPrelogin().homeFooter().clickGetStartedLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Navigate browser back,click on education link,verify the title,color of 
	 * the tab, inmate search box and mobile app download box is present,verify 
	 * the tab section header text and content text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =9, description = "TestCase::PLTC02::Design Steps::"
			+ "72,73,74,75,76,77,78,79(Navigate browser back,click on education link,"
			+ "verify the title,color of the tab, inmate search box and mobile app "
			+ "download box is present,verify the tab section header text and content text.)")
	public void navigateToEducationLinkAndVerify() {

		jpayPrelogin().homeHeader().navigateBrowserBack();
		jpayPrelogin().homeHeader().navigateBrowserBack();
		jpayPrelogin().homeHeader().clickInmateServicesPageLink(educationLinkText);
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_EDUCATION_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(educationLinkText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabHeaderText(educationLinkText);
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabContentText(educationLinkContentText);
		
	}

	/*********************************************************************************
	 * 
	 * Click on parole and probation lnik of header banner,verify title and url,verify 
	 * parole and probation new customer box is present,facebook box is present,mobile 
	 * app download box is present,verify page content text,verify make a payment and 
	 * release cards link is present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =10, description = "TestCase::PLTC02::Design Steps::"
			+ "79,80,81,82,83,84,85,86,87,88(Click on parole and probation lnik of header"
			+ " banner,verify title and url,verify parole and probation new customer box "
			+ "is present,facebook box is present,mobile app download box is present,verify "
			+ "page content text,verify make a payment and release cards link is present.)")
	public void navigateToParoleProbationLinkAndVerify() {

		jpayPrelogin().homeHeader().clickHeaderBannerParoleProbationLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.PAROLE_AND_PROBATION_TITLE);
		jpayPrelogin().homeHeader().verifyUrl(PageConstant.PAROLE_AND_PROBATION_URL);
		jpayPrelogin().homeHeader().verifyParoleProbationNewCustomerBoxPresent();
		jpayPrelogin().homeHeader().verifyJpayFacebookBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeHeader().verifyParoleProbationPageContentText(paroleProbationPageContentText);
		jpayPrelogin().homeHeader().verifyParoleProbationPageLinkPresent(makeAPaymentLinkText);
		jpayPrelogin().homeHeader().verifyParoleProbationPageLinkPresent(releaseCardsLinkText);
		
	}

	/*********************************************************************************
	 * 
	 * Click on make a payment link,verify the title,color of the tab,inmate 
	 * search box and mobile app download box is present,verify the tab section 
	 * header text and content text,click on get started link and verify the 
	 * first time user page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =11, description = "TestCase::PLTC02::Design Steps::"
			+ "89,90,91,92,93,94,95,96,97(Click on make a payment link,verify the "
			+ "title,color of the tab,inmate search box and mobile app download box is "
			+ "present,verify the tab section header text and content text,click on get "
			+ "started link and verify the first time user page title.)")
	public void navigateToMakeAPaymentLinkAndVerify() {

		jpayPrelogin().homeHeader().clickParoleProbationPageLink(makeAPaymentLinkText);
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_MAKE_A_PAYMENT_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(makeAPaymentLinkText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxSmallPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabHeaderText(makeAPaymentLinkText);
		jpayPrelogin().homeFooter().verifyMakeAPaymentContentText(makeAPaymentLinkContentText);
		jpayPrelogin().homeFooter().clickGetStartedLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Navigate browser back,click on Release Cards link,verify the title,color of 
	 * the tab,facebook box,friends and family box and mobile app download box is 
	 * present,verify the tab section header text and content text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =12, description = "TestCase::PLTC02::Design Steps::"
			+ "98,99,100,101,102,103,104,105,106(Navigate browser back,click on Release "
			+ "Cards link,verify the title,color of the tab,facebook box,friends and family"
			+ " box and mobile app download box is present,verify the tab section header "
			+ "text and content text.)")
	public void navigateToReleaseCardsLinkAndVerify() {

		jpayPrelogin().homeHeader().navigateBrowserBack();
		jpayPrelogin().homeHeader().clickParoleProbationPageLink(releaseCardsLinkText);
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_RELEASE_CARDS_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(releaseCardsLinkText,colorCode);
		jpayPrelogin().homeHeader().verifyJpayFacebookBoxPresent();
		jpayPrelogin().homeFooter().verifyReleaseCardsFriendsFamilyForumBox();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifyReleaseCardsSectionTabHeaderText(releaseCardsLinkText);
		jpayPrelogin().homeFooter().verifyReleaseCardsContentText(releaseCardsLinkContentText);
		
	}


	/*********************************************************************************
	 * 
	 * Click on home link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 13, description = "TestCase::PLTC02::Design Steps::"
			+ "107,108( Click on home link.)")
	public void testEnd() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailPLTC_02Test(data) };
	}
	
	
	public EmailPLTC_02Test(Map<String, String> data) {
		super(data);
		
		
		
		variation = data.get("variation");
		colorCode = data.get("colorCode");
		inmateServicesPageContentText = data.get("inmateServicesPageContentText");
		sendMoneyLinkText = data.get("sendMoneyLinkText");
		emailLinkText = data.get("emailLinkText");
		musicLinkText = data.get("musicLinkText");
		videoVisitationLinkText = data.get("videoVisitationLinkText");
		educationLinkText = data.get("educationLinkText");
		getStartedLinkText = data.get("getStartedLinkText");
		sendMoneyLinkContentText = data.get("sendMoneyLinkContentText");
		emailLinkContentText = data.get("emailLinkContentText");
		buyMediaText = data.get("buyMediaText");
		buyMediaContentText = data.get("buyMediaContentText");
		videoVisitationLinkContentText = data.get("videoVisitationLinkContentText");
		educationLinkContentText = data.get("educationLinkContentText");
		
		paroleProbationPageContentText = data.get("paroleProbationPageContentText");
		makeAPaymentLinkText = data.get("makeAPaymentLinkText");
		makeAPaymentLinkContentText = data.get("makeAPaymentLinkContentText");
		releaseCardsLinkText = data.get("releaseCardsLinkText");
		releaseCardsLinkContentText = data.get("releaseCardsLinkContentText");
		
		
	}




}
