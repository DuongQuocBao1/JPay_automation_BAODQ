package com.jpay.media.automation.web.prelogin.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;


/************************************************************************************************
 * 
 * TestCase :: PLTC03 - (User shall be able to verify all the Home Page Middle Part link)
 * Author :: shasan(Shahriar Hasan) , Date :: 07/15/2019
 * DataFile :: Email.xlsx , DataSheet :: PLTC03
 * Status :: Completed
 * 
 **************************************************************************************************/

public class EmailPLTC_03Test extends BaseTestObject{
	


	private String variation;
	private String friendsFamilyForumText;
	private String connectShareText;
	private String comeVisitText;
	private String paroleProbationText;
	private String makePaymentText;
	private String getStartedText;
	private String makingPaymentHeaderText;
	private String makingPaymentContentText;
	private String releaseCardsText;
	private String makeAPaymentText;
	private String jpayBlogImage;
	private String jpayStoriesText;
	private String importantMessageText;
	private String jpayDayText;
	private String winnersText;
	private String jpayHolidayArtText;
	private String jpayBreastCancerText;
	private String jpayArt2016Text;
	private String jpayInfoText;
	private String downloadJpayAppText;
	private String downloadSmartPhoneText;
	

	


	/*********************************************************************************
	 * 
	 * Navigate to the url and verify the title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCase::PLTC03::Design Steps::"
			+ "1,2(Navigate to the url and verify the title of the page.)")
	public void testStart() {
		
		jpayPrelogin().homeMiddle().loadURL(envUrlJpay,variation);
		jpayPrelogin().homeMiddle().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Verify JPay friends and family forum,parole and probation,JPay blog,send 
	 * money information box and mobile app download box is present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCase::PLTC03::Design Steps::"
			+ "3,4,5,6,7(erify JPay friends and family forum,parole and probation,JPay "
			+ "blog,send money information box and mobile app download box is present.)")
	public void verifyHomePageMiddleBox() {

		jpayPrelogin().homeMiddle().verifyFriendsFamilyForumBox();
		jpayPrelogin().homeMiddle().verifyParoleProbationBox();
		jpayPrelogin().homeMiddle().verifyJPayBlogBox();
		jpayPrelogin().homeMiddle().verifySendMoneyInformationBox();
		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
		
	}

	/*********************************************************************************
	 * 
	 * Verify texts in the friends and family forum box,click on come and visit,navigate 
	 * to child window and verify the title and url of the child window.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =3, description = "TestCase::PLTC03::Design Steps::"
			+ "8,9,10,11,12,13,14(Verify texts in the friends and family forum box,click "
			+ "on come and visit,navigate to child window and verify the title and url "
			+ "of the child window.)")
	public void navigateToFriendsAndFamilyForumAndVerify() {

		jpayPrelogin().homeMiddle().verifyTextIsPresent(friendsFamilyForumText);
		jpayPrelogin().homeMiddle().verifyTextIsPresent(connectShareText);
		jpayPrelogin().homeMiddle().verifyTextIsPresent(comeVisitText);
		jpayPrelogin().homeMiddle().clickFamilyForumComeAndVisitLink();
		jpayPrelogin().homeMiddle().navigateToChildWindow();
		jpayPrelogin().homeMiddle().verifyUrl(PageConstant.JPAY_FRIENDS_FAMILY_FORUM_URL);
		jpayPrelogin().homeMiddle().verifyTitle(PageConstant.JPAY_FRIENDS_FAMILY_FORUM_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Close the child window,verify the texts of parole and probation box texts,
	 * click on get started link,verify page title,verify header text,content 
	 * text and links.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =4, description = "TestCase::PLTC03::Design Steps::"
			+ "15,16,17,18,19,20,21,22,23,24,25,26(Close the child window,verify the texts "
			+ "of parole and probation box texts,click on get started link,verify page "
			+ "title,verify header text,content text and links.)")
	public void navigateToParoleProbationAndVerify() {

		jpayPrelogin().homeMiddle().closeChildWindowUsingRobot();
		jpayPrelogin().homeHeader().switchToMainWindow();
		jpayPrelogin().homeMiddle().verifyTextIsPresent(paroleProbationText);
		jpayPrelogin().homeMiddle().verifyTextIsPresent(makePaymentText);
		jpayPrelogin().homeMiddle().verifyTextIsPresent(getStartedText);
		jpayPrelogin().homeMiddle().clickParoleProbationGetStartedLink();
		jpayPrelogin().homeMiddle().verifyTitle(PageConstant.PAROLE_AND_PROBATION_TITLE);
		jpayPrelogin().homeMiddle().verifyMakingPaymentHeaderText(makingPaymentHeaderText);
		jpayPrelogin().homeMiddle().verifyMakingPaymentContentText(makingPaymentContentText);
		jpayPrelogin().homeMiddle().verifyTextIsPresent(makeAPaymentText);
		jpayPrelogin().homeMiddle().verifyMakeAPaymentIsALink();
		jpayPrelogin().homeMiddle().verifyTextIsPresent(releaseCardsText);
		jpayPrelogin().homeMiddle().verifyReleaseCardsIsALink();
		
	}

	/*********************************************************************************
	 * 
	 * Navigate browser back,verify the jpay blog box,navigate to different blog 
	 * content and verify their page title, url and header text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =5, description = "TestCase::PLTC03::Design Steps::"
			+ "24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,"
			+ "48,49,50,51,52,53,54,55,56,57(Navigate browser back,verify the jpay blog "
			+ "box,navigate to different blog content and verify their page title,"
			+ "url and header text.)")
	public void navigateToJpayBlogBoxAndVerify() {

		jpayPrelogin().homeMiddle().navigateBrowserBack();
		jpayPrelogin().homeMiddle().verifyTitle(PageConstant.HOME_CORRECTION_SERVICES_TITLE);
		jpayPrelogin().homeMiddle().verifyJPayBlogBox();
		jpayPrelogin().homeMiddle().verifyJpayBlogImageName(jpayBlogImage);
		jpayPrelogin().homeMiddle().clickJpayBlogLink();
		jpayPrelogin().homeMiddle().navigateToChildWindow();
		jpayPrelogin().homeMiddle().verifyUrl(PageConstant.JPAY_DEV_BLOG_URL);
		jpayPrelogin().homeMiddle().verifyTitle(PageConstant.JPAY_DEV_BLOG_TITLE);
		
	}

	/*********************************************************************************
	 * 
	 * Navigate browser back,verify the jpay information box and information text.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =6, description = "TestCase::PLTC03::Design Steps::"
			+ "58,59,60(Navigate browser back,verify the jpay information box and "
			+ "information text.)")
	public void navigateToJpayInformationBoxAndVerify() {

		jpayPrelogin().homeMiddle().closeChildWindowUsingRobot();
		jpayPrelogin().homeMiddle().switchToMainWindow();
		jpayPrelogin().homeMiddle().verifySendMoneyInformationBox();
		jpayPrelogin().homeMiddle().verifyJpaySendMoneyInformationText(jpayInfoText);

	}

	/*********************************************************************************
	 * 
	 * Verify mobile app download box,navigate to apple app store link and verify
	 *  and navigate to google play store link and verify.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority =7, description = "TestCase::PLTC03::Design Steps::"
			+ "61,62,63,64,65,66,67,68,69,70,71,72,73,74,75(Verify mobile app download "
			+ "box,navigate to apple app store link and verify and navigate to google "
			+ "play store link and verify.)")
	public void navigateToJpayAppDownloadBoxAndVerify() {

		jpayPrelogin().homeMiddle().verifyJPayMobileAppDownloadBox();
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
		
		
	}


	
	/*********************************************************************************
	 * 
	 * Click on home link.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCase::PLTC03::Design Steps::"
			+ "76( Click on home link.)")
	public void testEnd() {

		jpayPrelogin().homeHeader().closeChildWindowUsingRobot();
		jpayPrelogin().homeHeader().switchToMainWindow();
		jpayEmail().headerNavigation().clickHomeLink();
	}
	

	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailPLTC_03Test(data) };
	}
	
	
	public EmailPLTC_03Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		friendsFamilyForumText = data.get("friendsFamilyForumText");
		connectShareText = data.get("connectShareText");
		comeVisitText = data.get("comeVisitText");
		paroleProbationText = data.get("paroleProbationText");
		makePaymentText = data.get("makePaymentText");
		getStartedText = data.get("getStartedText");
		makingPaymentHeaderText = data.get("makingPaymentHeaderText");
		makingPaymentContentText = data.get("makingPaymentContentText");
		releaseCardsText = data.get("releaseCardsText");
		makeAPaymentText = data.get("makeAPaymentText");
		jpayBlogImage = data.get("jpayBlogImage");
		jpayStoriesText = data.get("jpayStoriesText");
		importantMessageText = data.get("importantMessageText");
		jpayDayText = data.get("jpayDayText");
		winnersText = data.get("winnersText");
		jpayHolidayArtText = data.get("jpayHolidayArtText");
		jpayBreastCancerText = data.get("jpayBreastCancerText");
		jpayArt2016Text = data.get("jpayArt2016Text");
		jpayInfoText = data.get("jpayInfoText");
		downloadJpayAppText = data.get("downloadJpayAppText");
		downloadSmartPhoneText = data.get("downloadSmartPhoneText");
		
	}

	


}
