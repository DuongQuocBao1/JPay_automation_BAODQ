package com.jpay.media.automation.web.prelogin.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: PLTC07 - (User shall be able to verify all the footer link under Social)
 * Author :: shasan(Shahriar Hasan) , Date :: 
 * DataFile :: Email.xlsx , DataSheet :: PLTC07
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailPLTC_07Test extends BaseTestObject{
	


	private String variation;
	private String jpayComText;
	private String inmateServicesText;
	private String paroleProbationText;
	private String socialText;
	private String jpayBlogText;
	private String jpayForumText;
	private String FacebookText;
	private String twitterText;
	private String ourCommunityText;
	private String communityHeaderText;
	private String communityContentText;
	private String kidsInDistress;
	private String habitatForHumanity;
	private String lifeNet4;
	private String neighbors4;
	private String studentsInNeed;
	private String otherAdvocacy;
	private String angencyPartnershipHeaderText;
	private String angencyPartnershipContentText;
	private String contactSalesTabText;
	private String contactSalesFormHeaderText;
	private String colorCode;
	
	

	


	/*********************************************************************************
	 * 
	 * Navigate to the url and verify the title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::PLTC07::Design Steps::"
			+ "1,2(Navigate to the url and verify the title of the page.)")
	public void testStart() {
		
		jpayPrelogin().homeFooter().loadURL(envUrlJpay,variation);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Verify all the Header and Social links from footer.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCase::PLTC07::Design Steps::"
			+ "3,4,5,6,7,8,9,10,11(Verify all the Header and Social links from footer.)")
	public void verifyFooterLinksHeaderAndLinks() {

		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(jpayComText);
		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(inmateServicesText);
		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(paroleProbationText);
		jpayPrelogin().homeFooter().verifyFooterLinksHeaderText(socialText);
		
		jpayPrelogin().homeFooter().verifyFooterLink(socialText, jpayBlogText);
		jpayPrelogin().homeFooter().verifyFooterLink(socialText, jpayForumText);
		jpayPrelogin().homeFooter().verifyFooterLink(socialText, FacebookText);
		jpayPrelogin().homeFooter().verifyFooterLink(socialText, twitterText);
		jpayPrelogin().homeFooter().verifyFooterLink(socialText, ourCommunityText);
		
	}

	/*********************************************************************************
	 * 
	 * Click footer Devblog link,navigate to child window and verify the page title and url.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =3, description = "TestCase::PLTC07::Design Steps::"
			+ "12,13,14,15(Click footer Devblog link,navigate to child window and verify"
			+ " the page title and url.)")
	public void navigateToJpayDevblogLinkAndVerify() {

		jpayPrelogin().homeFooter().clickFooterDevblogLink();
		jpayPrelogin().homeFooter().navigateToChildWindow();
		jpayPrelogin().homeFooter().verifyUrl(PageConstant.JPAY_DEV_BLOG_URL);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_DEV_BLOG_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Close child window,navigate to main window,click footer forum link,navigate
	 *  to child window and verify the page title and url.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =4, description = "TestCase::PLTC07::Design Steps::"
			+ "16,17,18,19,20,21(Close child window,navigate to main window,click footer "
			+ "forum link,navigate to child window and verify the page title and url.)")
	public void navigateToJpayForumLinkAndVerify() {

		jpayPrelogin().homeFooter().closeChildWindowUsingRobot();
		jpayPrelogin().homeFooter().switchToMainWindow();
		jpayPrelogin().homeFooter().clickFooterForumLink();
		jpayPrelogin().homeFooter().navigateToChildWindow();
		jpayPrelogin().homeFooter().verifyUrl(PageConstant.JPAY_FRIENDS_FAMILY_FORUM_URL);
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_FRIENDS_FAMILY_FORUM_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Close child window,navigate to main window,click footer Facebook link,
	 * navigate to child window and verify the page title and url.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =5, description = "TestCase::PLTC07::Design Steps::"
			+ "22,23,24,25,26,27(Close child window,navigate to main window,click footer "
			+ "Facebook link,navigate to child window and verify the page title and url.)")
	public void navigateToFacebookLinkAndVerify() {

		jpayPrelogin().homeFooter().closeChildWindowUsingRobot();
		jpayPrelogin().homeFooter().switchToMainWindow();
		jpayPrelogin().homeFooter().clickFooterFacebookLink();
		jpayPrelogin().homeFooter().navigateToChildWindow();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_FACEBOOK_TITLE);
		jpayPrelogin().homeFooter().verifyUrl(PageConstant.JPAY_FACEBOOK_URL);
		
	}

	/*********************************************************************************
	 * 
	 * Close child window,navigate to main window,click footer Twitter link,
	 * navigate to child window and verify the page title and url.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =6, description = "TestCase::PLTC07::Design Steps::"
			+ "28,29,30,31,32,33(Close child window,navigate to main window,click footer "
			+ "Twitter link,navigate to child window and verify the page title and url.)")
	public void navigateToTwitterLinkAndVerify() {

		jpayPrelogin().homeFooter().closeChildWindowUsingRobot();
		jpayPrelogin().homeFooter().switchToMainWindow();
		jpayPrelogin().homeFooter().clickFooterTwitterLink();
		jpayPrelogin().homeFooter().navigateToChildWindow();
		jpayPrelogin().homeFooter().verifyUrl(PageConstant.JPAY_TWITTER_URL);
		
	}

	/*********************************************************************************
	 * 
	 * Close child window,navigate to main window,click footer Facebook link,
	 * verify the page title,verify mobile app download box present,verify 
	 * community title header and content text and comminity organizations 
	 * link present in the page.
	 **********************************************************************************/

	@Test(enabled = true, priority =7, description = "TestCase::PLTC07::Design Steps::"
			+ "34,35,36,37,38,39,40,41,42,43,44,45,46(Close child window,navigate to main "
			+ "window,click footer Facebook link,verify the page title,verify mobile app "
			+ "download box present,verify community title header and content text and "
			+ "comminity organizations link present in the page.)")
	public void navigateToOurCommunityLinkAndVerify() {

		jpayPrelogin().homeFooter().closeChildWindowUsingRobot();
		jpayPrelogin().homeFooter().switchToMainWindow();
		jpayPrelogin().homeFooter().clickFooterOurCommunityLink();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_OUR_COMMUNITY_TITLE);
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifyOurCommunityHeaderText(communityHeaderText);
		jpayPrelogin().homeFooter().verifyOurCommunityContentText(communityContentText);
		jpayPrelogin().homeFooter().verifyOrganizationsPresentInOurCommunityPage(kidsInDistress);
		jpayPrelogin().homeFooter().verifyOrganizationsPresentInOurCommunityPage(habitatForHumanity);
		jpayPrelogin().homeFooter().verifyOrganizationsPresentInOurCommunityPage(lifeNet4);
		jpayPrelogin().homeFooter().verifyOrganizationsPresentInOurCommunityPage(neighbors4);
		jpayPrelogin().homeFooter().verifyOrganizationsPresentInOurCommunityPage(studentsInNeed);
		jpayPrelogin().homeFooter().verifyOrganizationsPresentInOurCommunityPage(otherAdvocacy);

	}

	/*********************************************************************************
	 * 
	 * Click on Kids in distress link,navigate to child window and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =8, description = "TestCase::PLTC07::Design Steps::"
			+ "57,58,59(Click on Kids in distress link,navigate to child window and "
			+ "verify page title.)")
	public void navigateToKidsInDistressLinkAndVerify() {

		jpayPrelogin().homeFooter().clickOurCommunityOrganization(kidsInDistress);
		jpayPrelogin().homeFooter().navigateToChildWindow();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_KIDS_IN_DISTRESS_TITLE);
	
	}

	/*********************************************************************************
	 * 
	 * Close child window,navigate to main window,click on Habitat for 
	 * Humanity link navigate to child window and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =9, description = "TestCase::PLTC07::Design Steps::"
			+ "60,61,62,63,64(Close child window,navigate to main window,click on Habitat "
			+ "for Humanity link navigate to child window and verify page title.)")
	public void navigateToHabitatForHumanityLinkAndVerify() {

		jpayPrelogin().homeFooter().closeChildWindowUsingRobot();
		jpayPrelogin().homeFooter().switchToMainWindow();
		jpayPrelogin().homeFooter().clickOurCommunityOrganization(habitatForHumanity);
		jpayPrelogin().homeFooter().navigateToChildWindow();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_HABITAT_FOR_HUMANITY_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Close child window,navigate to main window,click on Life Net 
	 * link navigate to child window and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =10, description = "TestCase::PLTC07::Design Steps::"
			+ "65,66,67,68,69(Close child window,navigate to main window,click on Life "
			+ "Net link navigate to child window and verify page title.)")
	public void navigateToLifeNetLinkAndVerify() {

		jpayPrelogin().homeFooter().closeChildWindowUsingRobot();
		jpayPrelogin().homeFooter().switchToMainWindow();
		jpayPrelogin().homeFooter().clickOurCommunityOrganization(lifeNet4);
		jpayPrelogin().homeFooter().navigateToChildWindow();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_LIFE_NET_FAMILY_TITLE);
	
	}

	/*********************************************************************************
	 * 
	 * Close child window,navigate to main window,click on Neighbors 
	 * link navigate to child window and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =11, description = "TestCase::PLTC07::Design Steps::"
			+ "70,71,72,73,74(Close child window,navigate to main window,click on Neighbors"
			+ " link navigate to child window and verify page title.)")
	public void navigateToNeighborsLinkAndVerify() {

		jpayPrelogin().homeFooter().closeChildWindowUsingRobot();
		jpayPrelogin().homeFooter().switchToMainWindow();
		jpayPrelogin().homeFooter().clickOurCommunityOrganization(neighbors4);
		jpayPrelogin().homeFooter().navigateToChildWindow();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_NEIGHBORS_4_NEIGHBORS_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Close child window,navigate to main window,click on Students in 
	 * need link navigate to child window and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =12, description = "TestCase::PLTC07::Design Steps::"
			+ "75,76,77,78,79(Close child window,navigate to main window,click on Students"
			+ " in need link navigate to child window and verify page title.)")
	public void navigateToStudentInNeedLinkAndVerify() {

		jpayPrelogin().homeFooter().closeChildWindowUsingRobot();
		jpayPrelogin().homeFooter().switchToMainWindow();
		jpayPrelogin().homeFooter().clickOurCommunityOrganization(studentsInNeed);
		jpayPrelogin().homeFooter().navigateToChildWindow();
		//jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_STUDENTS_IN_NEED_TITLE);
		
	}
	
	/*********************************************************************************
	 * 
	 * Close child window,navigate to main window,click on others advocacy 
	 * link navigate to child window and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =13, description = "TestCase::PLTC07::Design Steps::"
			+ "80,81,82,83,84(Close child window,navigate to main window,click on others "
			+ "advocacy link navigate to child window and verify page title.)")
	public void navigateToOtherAdvocacyLinkAndVerify() {
		
		jpayPrelogin().homeFooter().closeChildWindowUsingRobot();
		jpayPrelogin().homeFooter().switchToMainWindow();
		jpayPrelogin().homeFooter().clickOurCommunityOrganization(otherAdvocacy);
		jpayPrelogin().homeFooter().navigateToChildWindow();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_OTHER_ADVOCACY_TITLE);
		
	}
	/*********************************************************************************
	 * 
	 * Click on others advocacy link,navigate to child window and verify page title and url.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =14, description = "TestCase::PLTC07::Design Steps::"
			+ "85,86,87,88(Click on others advocacy link,navigate to child window and "
			+ "verify page title and url.)")
	public void verifyAccreditedBusinessLinkAbsent() {

		jpayPrelogin().homeFooter().verifyFooterAccreditedBusinessLinkAbsent();
		
	}

	/*********************************************************************************
	 * 
	 * Close child window,navigate to main window,click on are you a corrections 
	 * agency link,verify page title,agency partnerships header title and content 
	 * text,click on contact form link and verify.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =15, description = "TestCase::PLTC07::Design Steps::"
			+ "89,90,91,92,93,94,95,96,97,98,99,100(Close child window,navigate to main "
			+ "window,click on are you a corrections agency link,verify page title,agency"
			+ " partnerships header title and content text,click on contact form link "
			+ "and verify.)")
	public void navigateToCorrectionsAgencyLinkAndVerify() {

		jpayPrelogin().homeFooter().clickAreYouACorrectionsAgencyLink();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_AGENCY_PARTNERSHIPS_TITLE);
		jpayPrelogin().homeFooter().verifyAgencyPartnershipHeaderText(angencyPartnershipHeaderText);
		jpayPrelogin().homeFooter().verifyAgencyPartnershipContentText(angencyPartnershipContentText);
		jpayPrelogin().homeFooter().clickAgencyContactFormLink();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.JPAY_CONTACT_US_TITLE);
		jpayPrelogin().homeFooter().verifySelectedFooterLinksSectionTabTextColor(contactSalesTabText,colorCode);
		jpayPrelogin().homeFooter().verifyInmateSearchBoxPresent();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		jpayPrelogin().homeFooter().verifyContactSalesContactFormHeaderText(contactSalesFormHeaderText);
		
	}

	/*********************************************************************************
	 * 
	 * Click on home link and verify the title of the page. .
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 16, description = "TestCase::PLTC07::Design Steps::"
			+ "101,102( Click on home link and verify the title of the page..)")
	public void testEnd() {

		jpayEmail().headerNavigation().clickHomeLink();
		jpayPrelogin().homeFooter().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailPLTC_07Test(data) };
	}
	
	
	public EmailPLTC_07Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		jpayComText = data.get("jpayComText");
		inmateServicesText = data.get("inmateServicesText");
		paroleProbationText = data.get("paroleProbationText");
		socialText = data.get("socialText");
		jpayBlogText = data.get("jpayBlogText");
		jpayForumText = data.get("jpayForumText");
		FacebookText = data.get("FacebookText");
		twitterText = data.get("twitterText");
		ourCommunityText = data.get("ourCommunityText");
		communityHeaderText = data.get("ourCommunityText");
		communityContentText = data.get("communityContentText");
		kidsInDistress = data.get("kidsInDistress");
		habitatForHumanity = data.get("habitatForHumanity");
		lifeNet4 = data.get("lifeNet4");
		neighbors4 = data.get("neighbors4");
		studentsInNeed = data.get("studentsInNeed");
		otherAdvocacy = data.get("otherAdvocacy");
		angencyPartnershipHeaderText = data.get("angencyPartnershipHeaderText");
		angencyPartnershipContentText = data.get("angencyPartnershipContentText");
		contactSalesTabText = data.get("contactSalesTabText");
		contactSalesFormHeaderText = data.get("contactSalesFormHeaderText");
		colorCode = data.get("colorCode");
		
		
		
		
		
	}




}
