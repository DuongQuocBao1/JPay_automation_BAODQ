package com.jpay.media.automation.web.prelogin.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: PLTC05 - (User shall be able to verify all the footer link under Inmate Services)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: PLTC05
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailPLTC_05Test extends BaseTestObject{
	


	private String variation;
	private String jpayComText;
	private String inmateServicesText;
	private String paroleProbationText;
	private String socialText;
	private String moneyTransferText;
	private String educationText;
	private String emailVideogramText;
	private String jpayTabletText;
	private String videoVisitationText;
	private String colorCode;
	private String sendMoneyText;
	private String sendMoneyContentText;
	private String emailText;
	private String emailContentText;
	private String educationContentText;
	private String buyMediaText;
	private String buyMediaContentText;
	private String videoVisitationContentText;
	
	

	


	/*********************************************************************************
	 * 
	 * Navigate to the url and verify the title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::PLTC05::Design Steps::"
			+ "1,2(Navigate to the url and verify the title of the page.)")
	public void testStart() {
		
		jpayPrelogin().homeFooter().loadURL(envUrlJpay,variation);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Verify all the Header and Inmate Services links from footer.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCase::PLTC05::Design Steps::"
			+ "3,4,5,6,7,8,9,10,11(Verify all the Header and Inmate Services "
			+ "links from footer.)")
	public void verifyFooterLinksHeaderAndLinks() {

		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(jpayComText);
		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(inmateServicesText);
		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(paroleProbationText);
		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(socialText);
		
		jpayPrelogin().homeFooter().verifyFooterLink(inmateServicesText, moneyTransferText);
		jpayPrelogin().homeFooter().verifyFooterLink(inmateServicesText, emailVideogramText);
		jpayPrelogin().homeFooter().verifyFooterLink(inmateServicesText, educationText);
		jpayPrelogin().homeFooter().verifyFooterLink(inmateServicesText, jpayTabletText);
		jpayPrelogin().homeFooter().verifyFooterLink(inmateServicesText, videoVisitationText);
		
	}

	/*********************************************************************************
	 * 
	 * Click Footer money transfer link,verify the title,clor of the tab, inmate 
	 * search box,send money,mobile app download,moneygram and friends and family 
	 * box is present,verify the tab section header text and content tet,click on 
	 * get started link and verify the first time user page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =3, description = "TestCase::PLTC05::Design Steps::"
			+ "12,13,14,15,16,17,18,19,20,21,22,23(Click Footer money transfer link,verify"
			+ " the title,clor of the tab, inmate search box,send money,mobile app download,"
			+ "moneygram and friends and family box is present,verify the tab section header"
			+ " text and content tet,click on get started link and verify the first time "
			+ "user page title.)")
	public void navigateToMoneyTransferLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterMoneyTransferLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_SEND_MONEY_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(sendMoneyText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxPresent();
		jpayPrelogin().homeFooter().verifyJpaySendMoneyInformationkBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifySendmoneyMoneygramBox();
		jpayPrelogin().homeFooter().verifyFriendsFamilyForumBox();
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabHeaderText(sendMoneyText);
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabContentText(sendMoneyContentText);
		jpayPrelogin().homeFooter().clickGetStartedLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Click Footer email and videogram link,verify the title,clor of the tab, inmate 
	 * search box,mobile app download,send videogram and send photo box is present,
	 * verify the tab section header text and content tet,click on get started link 
	 * and verify the first time user page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =4, description = "TestCase::PLTC05::Design Steps::"
			+ "24,25,26,27,28,29,30,31,32,33(Click Footer email and videogram link,verify "
			+ "the title,clor of the tab, inmate search box,mobile app download,send "
			+ "videogram and send photo box is present,verify the tab section header text "
			+ "and content tet,click on get started link and verify the first time "
			+ "user page title.)")
	public void navigateToEmailVideogramLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterEmailVideogramLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_EMAIL_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(emailText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifySendVideogramBox();
		jpayPrelogin().homeFooter().verifySendPhotoBox();
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabHeaderText(emailText);
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabContentText(emailContentText);
		jpayPrelogin().homeFooter().clickGetStartedLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Click Footer education link,verify the title,color of the tab, inmate search 
	 * box and mobile app download box is present,verify the tab section header 
	 * text and content text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =5, description = "TestCase::PLTC05::Design Steps::"
			+ "35,36,37,38,39,40,41(Click Footer education link,verify the title,color of the "
			+ "tab, inmate search box and mobile app download box is present,verify the "
			+ "tab section header text and content text.)")
	public void navigateToEducationLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterEducationLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_EDUCATION_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(educationText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabHeaderText(educationText);
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabContentText(educationContentText);
		
	}

	/*********************************************************************************
	 * 
	 * Click Footer JPay Tablet link,verify the title,color of the tab, inmate 
	 * search box,mobile app download  and friends and family box is present,
	 * verify the tab section header text and content text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =6, description = "TestCase::PLTC05::Design Steps::"
			+ "42,43,44,45,46,47,48,49(Click Footer JPay Tablet link,verify the title,color "
			+ "of the tab, inmate search box,mobile app download  and friends and family box "
			+ "is present,verify the tab section header text and content text.)")
	public void navigateToJpayTabletLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterJpayTabletLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_BUY_MEDIA_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(buyMediaText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifyFriendsFamilyForumBox();
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabHeaderText(buyMediaText);
		jpayPrelogin().homeFooter().verifyInmateServicesBuyMediaContentText(buyMediaContentText);
		
	}

	/*********************************************************************************
	 * 
	 * Click Footer email and videogram link,verify the title,color of the tab,
	 * inmate search box,mobile app download,send video visitation and send 
	 * friends and family box is present,verify the tab section header text 
	 * and content text,click on rates link and verify availability and pricing 
	 * page title,click on video visitation footer link,click on get started 
	 * link and verify the first time user page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =7, description = "TestCase::PLTC05::Design Steps::"
			+ "50,51,52,53,54,55,56,57,58,59,60,61,62,63(Click Footer email and videogram "
			+ "link,verify the title,color of the tab, inmate search box,mobile app download,"
			+ "send video visitation and send friends and family box is present,verify the "
			+ "tab section header text and content text,click on rates link and verify "
			+ "availability and pricing page title,click on video visitation footer link,"
			+ "click on get started link and verify the first time user page title.)")
	public void navigateToVideoVisitationLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterVideoVisitationLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_VIDEO_VISITATION_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(videoVisitationText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifyVideoVisitationBox();
		jpayPrelogin().homeFooter().verifyFriendsFamilyForumBox();
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabHeaderText(videoVisitationText);
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabContentText(videoVisitationContentText);
		jpayPrelogin().homeFooter().clickVideoVisitationRatesLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.AVAILABILITY_PRICING_TITLE);
		
		jpayPrelogin().homeFooter().clickFooterVideoVisitationLink();
		jpayPrelogin().homeFooter().clickGetStartedLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Click on home link and verify the title of the page. .
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCase::PLTC05::Design Steps::"
			+ "64,65( Click on home link and verify the title of the page..)")
	public void testEnd() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailPLTC_05Test(data) };
	}
	
	
	public EmailPLTC_05Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		jpayComText = data.get("jpayComText");
		inmateServicesText = data.get("inmateServicesText");
		paroleProbationText = data.get("paroleProbationText");
		socialText = data.get("socialText");
		moneyTransferText = data.get("moneyTransferText");
		educationText = data.get("educationText");
		emailVideogramText = data.get("emailVideogramText");
		jpayTabletText = data.get("jpayTabletText");
		videoVisitationText = data.get("videoVisitationText");
		colorCode = data.get("colorCode");
		sendMoneyText = data.get("sendMoneyText");
		sendMoneyContentText = data.get("sendMoneyContentText");
		emailText = data.get("emailText");
		emailContentText = data.get("emailContentText");
		educationContentText = data.get("educationContentText");
		buyMediaText = data.get("buyMediaText");
		buyMediaContentText = data.get("buyMediaContentText");
		videoVisitationContentText = data.get("videoVisitationContentText");
		
	}




}
