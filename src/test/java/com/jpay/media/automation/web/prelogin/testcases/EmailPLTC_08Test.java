package com.jpay.media.automation.web.prelogin.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: PLTC08 - (User shall be able to verify all the JPay Legal agrrements,terms and conditions.)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: PLTC08
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailPLTC_08Test extends BaseTestObject{


	private String variation;
	private String colorCode;
	private String legalAgreementsText;
	private String consumerProtectionsText;
	private String privacyPolicyText;
	private String allRightReservedText;
	private String disclaimerText;
	private String paymentTermsText;
	private String emailTermsText;
	private String videoVisitationTermsText;
	private String subpoenaTermsText;
	private String playersPurchaseTermsText;
	private String cardsAgreementsText;
	private String paymentTermsContentText;
	private String emailTermsContentText;
	private String videoVisitationTermsContentText;
	private String subpoenaTermsContentText;
	private String playersPurchaseContentText;
	private String consumerProtectionsContentText;
	private String privacyPolicyContentText;
	private String cardsAgreementsContentText;
	private String aSecurusTechCompanyText;
	
	

	


	/*********************************************************************************
	 * 
	 * Navigate to the url and verify the title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::PLTC08::Design Steps::"
			+ "1,2(Navigate to the url and verify the title of the page.)")
	public void testStart() {
		
		jpayPrelogin().homeFooter().loadURL(envUrlJpay,variation);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Verify legal agreements text and link,consumer protections text and link,
	 * privacy policy text and link,a securus technologies company text and 
	 * link,all right reserved text and disclaimer text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCase::PLTC08::Design Steps::"
			+ "3,4,5,6,7,8,9,10,11,12,13(Verify legal agreements text and link,consumer"
			+ " protections text and link,privacy policy text and link,a securustechnologies"
			+ " company text and link,all right reserved text and disclaimer text.)")
	public void verifyFooterLinksHeaderAndLinks() {

		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(legalAgreementsText);
		jpayPrelogin().homeFooter().verifyFooterHeaderIsALink(legalAgreementsText);
		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(consumerProtectionsText);
		jpayPrelogin().homeFooter().verifyFooterHeaderIsALink(consumerProtectionsText);
		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(privacyPolicyText);
		jpayPrelogin().homeFooter().verifyFooterHeaderIsALink(privacyPolicyText);
		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(aSecurusTechCompanyText);
		jpayPrelogin().homeFooter().verifyFooterHeaderIsALink(aSecurusTechCompanyText);
		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(allRightReservedText);
		jpayPrelogin().homeFooter().verifyFooterHeaderIsNotALink(allRightReservedText);
		jpayPrelogin().homeFooter().verifyDesclaimerText(disclaimerText);
		
		
		
	}

	/*********************************************************************************
	 * 
	 * Click legal agreements link,verify page title,verify all the section 
	 * header text,payment terms and services color and content text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =3, description = "TestCase::PLTC08::Design Steps::"
			+ "14,15,16,17,18,19,20,21,22,23,24,25(Click legal agreements link,verify "
			+ "page title,verify all the section header text,payment terms and "
			+ "services color and content text.)")
	public void navigateToLegalAgreementsLinkAndVerify() {

		jpayPrelogin().homeFooter().clickLegalAgreementsLink();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_LEGAL_AGREEMENTS_TITLE);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(paymentTermsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(emailTermsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(videoVisitationTermsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(subpoenaTermsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(playersPurchaseTermsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(consumerProtectionsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(privacyPolicyText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(cardsAgreementsText);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(paymentTermsText, colorCode);
		jpayPrelogin().homeFooter().verifyLegalAgreementsTermsAndConditions(paymentTermsContentText);
		
		
	}

	/*********************************************************************************
	 * 
	 * Click on email terms and services section header,verify page title,text color and content text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =4, description = "TestCase::PLTC08::Design Steps::"
			+ "26,27,28,29(Click on email terms and services section header,verify "
			+ "page title,text color and content text.)")
	public void clickEmailTermsLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterLinksSectionTab(emailTermsText);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_LEGAL_AGREEMENTS_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(emailTermsText, colorCode);
		jpayPrelogin().homeFooter().verifyLegalAgreementsTermsAndConditions(emailTermsContentText);
	}

	/*********************************************************************************
	 * 
	 * Click on video visitaion terms and service section header,verify page title,text color and content text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =5, description = "TestCase::PLTC08::Design Steps::"
			+ "30,31,32,33(Click on video visitaion terms and service section header,"
			+ "verify page title,text color and content text.)")
	public void clickVideoVisitationTermsLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterLinksSectionTab(videoVisitationTermsText);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_LEGAL_AGREEMENTS_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(videoVisitationTermsText, colorCode);
		jpayPrelogin().homeFooter().verifyLegalAgreementsTermsAndConditions(videoVisitationTermsContentText);
	}

	/*********************************************************************************
	 * 
	 * Click on Subpoena policy section header,verify 
	 * page title,text color and content text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =6, description = "TestCase::PLTC08::Design Steps::"
			+ "34,35,36,37(Click on Subpoena policy section header,verify page "
			+ "title,text color and content text.)")
	public void clickSubpoenaPolicyLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterLinksSectionTab(subpoenaTermsText);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_LEGAL_AGREEMENTS_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(subpoenaTermsText, colorCode);
		jpayPrelogin().homeFooter().verifyLegalAgreementsTermsAndConditions(subpoenaTermsContentText);
	}

	/*********************************************************************************
	 * 
	 * Click on Player Purchase Terms and Conditions and Warranty policy 
	 * section header,verify page title,text color and content text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =7, description = "TestCase::PLTC08::Design Steps::"
			+ "38,39,40,41(Click on Player Purchase Terms and Conditions and Warranty "
			+ "policy section header,verify page title,text color and content text.)")
	public void clickPlayerPurchaseTermsLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterLinksSectionTab(playersPurchaseTermsText);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_LEGAL_AGREEMENTS_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(playersPurchaseTermsText, colorCode);
		jpayPrelogin().homeFooter().verifyLegalAgreementsTermsAndConditions(playersPurchaseContentText);

	}

	/*********************************************************************************
	 * 
	 * Click on Consumer Protection section header,verify 
	 * page title,text color and content text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =8, description = "TestCase::PLTC08::Design Steps::"
			+ "42,43,44,45(Click on Consumer Protection section header,verify page "
			+ "title,text color and content text.)")
	public void clickConsumerProtectionLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterLinksSectionTab(consumerProtectionsText);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_LEGAL_AGREEMENTS_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(consumerProtectionsText, colorCode);
		jpayPrelogin().homeFooter().verifyLegalAgreementsTermsAndConditions(consumerProtectionsContentText);
	
	}

	/*********************************************************************************
	 * 
	 * Click on Privacy Policy section header,verify 
	 * page title,text color and content text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =9, description = "TestCase::PLTC08::Design Steps::"
			+ "46,47,48,49(Click on Privacy Policy section header,verify page title,"
			+ "text color and content text.)")
	public void clickPrivacyPolicyLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterLinksSectionTab(privacyPolicyText);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_LEGAL_AGREEMENTS_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(privacyPolicyText, colorCode);
		jpayPrelogin().homeFooter().verifyLegalAgreementsTermsAndConditions(privacyPolicyContentText);
	
	}

	/*********************************************************************************
	 * 
	 * Click on Card On File Agreement section header,verify 
	 * page title,text color and content text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =10, description = "TestCase::PLTC08::Design Steps::"
			+ "50,51,52,53(Click on Card On File Agreement section header,verify page "
			+ "title,text color and content text.)")
	public void clickCardAgreementsLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterLinksSectionTab(cardsAgreementsText);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_LEGAL_AGREEMENTS_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(cardsAgreementsText, colorCode);
		jpayPrelogin().homeFooter().verifyLegalAgreementsTermsAndConditions(cardsAgreementsContentText);
	
	}

	/*********************************************************************************
	 * 
	 * Click Consumer Protection link,verify page title,verify all the section 
	 * header text,Consumer Protection section header color and content text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =11, description = "TestCase::PLTC08::Design Steps::"
			+ "54,55,56,57,58,59,60,61,62,63,64,65(Click Consumer Protection link,verify "
			+ "page title,verify all the section header text,Consumer Protection section "
			+ "header color and content text.)")
	public void navigateToConsumerProtectionLinkAndVerify() {

		jpayPrelogin().homeFooter().clickConsumerProtectionLink();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_LEGAL_AGREEMENTS_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(consumerProtectionsText, colorCode);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(paymentTermsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(emailTermsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(videoVisitationTermsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(subpoenaTermsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(playersPurchaseTermsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(consumerProtectionsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(privacyPolicyText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(cardsAgreementsText);
		jpayPrelogin().homeFooter().verifyLegalAgreementsTermsAndConditions(consumerProtectionsContentText);
		
	}

	/*********************************************************************************
	 * 
	 * Click Privacy Policy link,verify page title,verify all the section header text,Privacy Policy section header color and content text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =11, description = "TestCase::PLTC08::Design Steps::"
			+ "66,67,68,69,70,71,72,73,74,75,76,77(Click Privacy Policy link,verify page "
			+ "title,verify all the section header text,Privacy Policy section header "
			+ "color and content text.)")
	public void navigateToPrivacyPolicyLinkAndVerify() {

		jpayPrelogin().homeFooter().clickPrivacyPolicyLink();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_LEGAL_AGREEMENTS_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(privacyPolicyText, colorCode);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(paymentTermsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(emailTermsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(videoVisitationTermsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(subpoenaTermsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(playersPurchaseTermsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(consumerProtectionsText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(privacyPolicyText);
		jpayPrelogin().homeFooter().verifyFooterLinksSectionTab(cardsAgreementsText);
		jpayPrelogin().homeFooter().verifyLegalAgreementsTermsAndConditions(privacyPolicyContentText);
		
	}

	/*********************************************************************************
	 * 
	 * Click on A Securus Technologies Company link,navigate to child window and verify the page title and url.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =13, description = "TestCase::PLTC08::Design Steps::"
			+ "78,79,80,81(Click on A Securus Technologies Company link,navigate to "
			+ "child window and verify the page title and url.)")
	public void navigateToSecurusTechnologiesCompanyLinkAndVerify() {
		
		jpayPrelogin().homeFooter().clickSecurusTechnologiesCompanyLink();
		jpayPrelogin().homeFooter().navigateToChildWindow();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_A_SECURUS_TECHNOLOGIES_COMPANY_TITLE);
		jpayPrelogin().homeFooter().verifyUrl(PageConstant.JPAY_A_SECURUS_TECHNOLOGIES_COMPANY_URL);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on home link and verify the title of the page. .
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 14, description = "TestCase::PLTC08::Design Steps::"
			+ "82,83,84,85( Click on home link and verify the title of the page..)")
	public void testEnd() {


		jpayPrelogin().homeFooter().closeChildWindowUsingRobot();
		jpayPrelogin().homeFooter().switchToMainWindow();
		jpayEmail().headerNavigation().clickHomeLink();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
	}
	
	
	
	
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailPLTC_08Test(data) };
	}
	
	
	public EmailPLTC_08Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		legalAgreementsText = data.get("legalAgreementsText");
		consumerProtectionsText = data.get("consumerProtectionsText");
		privacyPolicyText = data.get("privacyPolicyText");
		allRightReservedText = data.get("allRightReservedText");
		disclaimerText = data.get("disclaimerText");
		paymentTermsText = data.get("paymentTermsText");
		emailTermsText = data.get("emailTermsText");
		videoVisitationTermsText = data.get("videoVisitationTermsText");
		subpoenaTermsText = data.get("subpoenaTermsText");
		playersPurchaseTermsText = data.get("playersPurchaseTermsText");
		cardsAgreementsText = data.get("cardsAgreementsText");
		paymentTermsContentText = data.get("paymentTermsContentText");
		emailTermsContentText = data.get("emailTermsContentText");
		videoVisitationTermsContentText = data.get("videoVisitationTermsContentText");
		subpoenaTermsContentText = data.get("subpoenaTermsContentText");
		playersPurchaseContentText = data.get("playersPurchaseContentText");
		consumerProtectionsContentText = data.get("consumerProtectionsContentText");
		privacyPolicyContentText = data.get("privacyPolicyContentText");
		cardsAgreementsContentText = data.get("cardsAgreementsContentText");
		aSecurusTechCompanyText = data.get("aSecurusTechCompanyText");
		colorCode = data.get("colorCode");
		
	
		
		
		
		
	}

	

}
