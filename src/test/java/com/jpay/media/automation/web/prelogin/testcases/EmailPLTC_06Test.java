package com.jpay.media.automation.web.prelogin.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: PLTC06 - (User shall be able to verify all the footer link Parole and Probation)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: PLTC06
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailPLTC_06Test extends BaseTestObject{
	


	private String variation;
	private String jpayComText;
	private String inmateServicesText;
	private String paroleProbationText;
	private String socialText;
	private String colorCode;
	private String restitutionText;
	private String supervisionFeesText;
	private String courtFeesText;
	private String selfReportFeesText;
	private String releaseCardsText;
	private String makeAPaymentText;
	private String makeAPaymentContentText;
	private String releaseCardsContentText;
	
	

	


	/*********************************************************************************
	 * 
	 * Navigate to the url and verify the title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::PLTC06::Design Steps::"
			+ "1,2(Navigate to the url and verify the title of the page.)")
	public void testStart() {
		
		jpayPrelogin().homeFooter().loadURL(envUrlJpay,variation);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Verify all the Header and Parole and Probation links from footer.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCase::PLTC06::Design Steps::"
			+ "3,4,5,6,7,8,9,10,11(Verify all the Header and Parole and Probation "
			+ "links from footer.)")
	public void verifyFooterLinksHeaderAndLinks() {

		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(jpayComText);
		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(inmateServicesText);
		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(paroleProbationText);
		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(socialText);
		
		jpayPrelogin().homeFooter().verifyFooterLink(paroleProbationText, restitutionText);
		jpayPrelogin().homeFooter().verifyFooterLink(paroleProbationText, supervisionFeesText);
		jpayPrelogin().homeFooter().verifyFooterLink(paroleProbationText, courtFeesText);
		jpayPrelogin().homeFooter().verifyFooterLink(paroleProbationText, selfReportFeesText);
		jpayPrelogin().homeFooter().verifyFooterLink(paroleProbationText, releaseCardsText);
		
	}

	/*********************************************************************************
	 * 
	 * Click Footer Restitution link,verify the title,color of the tab,inmate search 
	 * box and mobile app download box is present,verify the tab section header text 
	 * and content text,click on  get started link and verify the first time user 
	 * page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =3, description = "TestCase::PLTC06::Design Steps::"
			+ "12,13,14,15,16,17,18,19,20(Click Footer Restitution link,verify the title,"
			+ "color of the tab,inmate search box and mobile app download box is present,"
			+ "verify the tab section header text and content text,click on get started "
			+ "link and verify the first time user page title.)")
	public void navigateToRestitutionLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterRestitutionLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_MAKE_A_PAYMENT_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(makeAPaymentText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxSmallPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabHeaderText(makeAPaymentText);
		jpayPrelogin().homeFooter().verifyMakeAPaymentContentText(makeAPaymentContentText);
		jpayPrelogin().homeFooter().clickGetStartedLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Click Footer Supervision fees link,verify the title,color of the tab,inmate 
	 * search box and mobile app download box is present,verify the tab section 
	 * header text and content text,click on get started link and verify the 
	 * first time user page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =4, description = "TestCase::PLTC06::Design Steps::"
			+ "21,22,23,24,25,26,27,28,29(Click Footer Supervision fees link,verify the "
			+ "title,color of the tab,inmate search box and mobile app download box is "
			+ "present,verify the tab section header text and content text,click on get "
			+ "started link and verify the first time user page title.)")
	public void navigateToSupervisionFeesLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterSupervisionFeesLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_MAKE_A_PAYMENT_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(makeAPaymentText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxSmallPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabHeaderText(makeAPaymentText);
		jpayPrelogin().homeFooter().verifyMakeAPaymentContentText(makeAPaymentContentText);
		jpayPrelogin().homeFooter().clickGetStartedLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Click Footer Court Fees link,verify the title,color of the tab,inmate search 
	 * box and mobile app download box is present,verify the tab section header text 
	 * and content text,click on get started link and verify the first time user 
	 * page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =5, description = "TestCase::PLTC06::Design Steps::"
			+ "30,31,32,33,34,35,36,37,38(Click Footer Court Fees link,verify the title,"
			+ "color of the tab,inmate search box and mobile app download box is present,"
			+ "verify the tab section header text and content text,click on get started "
			+ "link and verify the first time user page title.)")
	public void navigateToCourtFeesLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterCourtFeesLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_MAKE_A_PAYMENT_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(makeAPaymentText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxSmallPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabHeaderText(makeAPaymentText);
		jpayPrelogin().homeFooter().verifyMakeAPaymentContentText(makeAPaymentContentText);
		jpayPrelogin().homeFooter().clickGetStartedLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Click Footer Self Report Fees link,verify the title,color of the tab,inmate 
	 * search box and mobile app download box is present,verify the tab section 
	 * header text and content text,click on get started link and verify the 
	 * first time user page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =6, description = "TestCase::PLTC06::Design Steps::"
			+ "40,41,42,43,44,45,46,47,48(Click Footer Self Report Fees link,verify the "
			+ "title,color of the tab,inmate search box and mobile app download box is "
			+ "present,verify the tab section header text and content text,click on get "
			+ "started link and verify the first time user page title.)")
	public void navigateToSelfReportFeesLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterSelfReportFeesLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_MAKE_A_PAYMENT_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(makeAPaymentText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxSmallPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifyInmateServicesSectionTabHeaderText(makeAPaymentText);
		jpayPrelogin().homeFooter().verifyMakeAPaymentContentText(makeAPaymentContentText);
		jpayPrelogin().homeFooter().clickGetStartedLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Click Footer Release Cards link,verify the title,color of the tab,facebook box,
	 * friends and family box and mobile app download box is present,verify the tab 
	 * section header text and content text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =7, description = "TestCase::PLTC06::Design Steps::"
			+ "49,50,51,52,53,54,55,56(Click Footer Release Cards link,verify the title,"
			+ "color of the tab,facebook box,friends and family box and mobile app download "
			+ "box is present,verify the tab section header text and content text.)")
	public void navigateToReleaseCardsLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterReleaseCardsLink();
		jpayPrelogin().homeHeader().verifyTitle(PageConstant.JPAY_RELEASE_CARDS_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(releaseCardsText,colorCode);
		jpayPrelogin().homeHeader().verifyJpayFacebookBoxPresent();
		jpayPrelogin().homeFooter().verifyReleaseCardsFriendsFamilyForumBox();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifyReleaseCardsSectionTabHeaderText(releaseCardsText);
		jpayPrelogin().homeFooter().verifyReleaseCardsContentText(releaseCardsContentText);
		
	}

	/*********************************************************************************
	 * 
	 * Click on home link and verify the title of the page. .
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCase::PLTC06::Design Steps::"
			+ "57,58( Click on home link and verify the title of the page..)")
	public void testEnd() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailPLTC_06Test(data) };
	}
	
	
	public EmailPLTC_06Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		jpayComText = data.get("jpayComText");
		inmateServicesText = data.get("inmateServicesText");
		paroleProbationText = data.get("paroleProbationText");
		socialText = data.get("socialText");
		restitutionText = data.get("restitutionText");
		supervisionFeesText = data.get("supervisionFeesText");
		courtFeesText = data.get("courtFeesText");
		selfReportFeesText = data.get("selfReportFeesText");
		releaseCardsText = data.get("releaseCardsText");
		colorCode = data.get("colorCode");
		makeAPaymentText = data.get("makeAPaymentText");
		makeAPaymentContentText = data.get("makeAPaymentContentText");
		releaseCardsContentText = data.get("releaseCardsContentText");
		
		
		
	}




}
