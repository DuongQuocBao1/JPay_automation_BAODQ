package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.constants.PageConstant;
import com.jpay.media.automation.web.utilities.DataCollection;



public class EmailWTC_89Test extends BaseTestObject{
	
	
	public String username = "";
	public String password = "";
	private String variation;
	private String status;
	

	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC89 - (User shall be able to view attachment from inbox and sent folder in www)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC89
	 * Status :: Completed
	 * 
	 **************************************************************************************************/


	/*********************************************************************************
	 * 
	 * Click on login link and verify page title.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-89 :: Design "
			+ "Steps::1,2(Click on login link and verify page title.)")
	public void testStart() {
		
		jpayEmail().login().loadURL(envUrlJpay,variation);
		jpayEmail().login().clickLoginLink();
		jpayEmail().login().verifyTitle(PageConstant.FIRST_TIME_USER_TITLE);
	}

	/*********************************************************************************
	 * 
	 * Enter username,password,click login button and verify title of the page.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-89 :: Design "
			+ "Steps::3,4,5,6(Enter username,password,click login button and "
			+ "verify title of the page.)")
	public void loginAndVerify1() {

		jpayEmail().login().enterUsername(username);
		jpayEmail().login().enterPassword(password);
		jpayEmail().login().clickLoginButton();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
	}
	
	/*********************************************************************************
	 * 
	 * Click on email link,click on inbox link,click on first letter to show,
	 * verify attachment link is present,click on link and verify attachment 
	 * is displayed.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-89 :: Design "
			+ "Steps::7,8,9,10,11,12(Click on email link,click on inbox link,click on "
			+ "first letter to show,verify attachment link is present,click on link "
			+ "and verify attachment is displayed.)")
	public void checkInboxLetterAttachmentAndVerify1() {

		jpayEmail().headerNavigation().clickEmailLink();
		jpayEmail().email().clickInboxLink();
		jpayEmail().email().clickFirstDiplayedNameLinkFromInbox();
		jpayEmail().email().verifyImgEcardAttachmentLinkPresent();
		jpayEmail().email().clickImgEcardAttachmentLink1();
		jpayEmail().email().verifyInboxImgEcardAttachmentPresent();
		
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on browser back button,click on inbox link,click on first letter to show,
	 * verify attachment link is present,click on link and verify attachment 
	 * is displayed.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-89 :: Design "
			+ "Steps::13,14,15,16,17,18,19(Click on browser back button,click on inbox "
			+ "link,click on first letter to show,verify attachment link is present,"
			+ "click on link and verify attachment is displayed.)")
	public void checkInboxLetterAttachmentAndVerify2() {

		jpayEmail().email().navigateBrowserBack();
		jpayEmail().email().clickInboxLink();
		jpayEmail().email().click2ndDiplayedNameLinkFromInbox();
		jpayEmail().email().verifyImgEcardAttachmentLinkPresent();
		jpayEmail().email().clickImgEcardAttachmentLink1();
		jpayEmail().email().verifyInboxImgEcardAttachmentPresent();
		jpayEmail().email().navigateBrowserBack();
		
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on browser back button,click on sent link,click on first letter to show,
	 * verify attachment link is present,click on link and verify attachment 
	 * is displayed.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-89 :: Design "
			+ "Steps::20,21,22,23,24,25(Click on browser back button,click on sent "
			+ "link,click on first letter to show,verify attachment link is present,"
			+ "click on link and verify attachment is displayed.)")
	public void checkSentLetterAttachmentAndVerify1() {

		jpayEmail().email().navigateBrowserBack();
		jpayEmail().email().clickSentLink();
		jpayEmail().email().clickFirstDiplayedNameLinkFromSent();
		jpayEmail().email().verifyImgEcardAttachmentLinkPresent();
		jpayEmail().email().clickImgEcardAttachmentLink1();
		jpayEmail().email().verifySentImgEcardAttachmentPresent();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on close button,click on sent link,click on first letter to show,
	 * verify attachment link is present,click on link1 and verify attachment 
	 * is displayed,click on close button,click on link2 and verify attachment 
	 * is displayed and click on close button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-89 :: Design "
			+ "Steps::26,27,28,29,30,31,32,33,34,35(Click on close button,click on sent "
			+ "link,click on first letter to show,verify attachment link is present,"
			+ "click on link1 and verify attachment is displayed,click on close button,"
			+ "click on link2 and verify attachment is displayed and click on close button.)")
	public void checkSentLetterAttachmentAndVerify2() {

		jpayEmail().email().clickCloseAttachmentButton();
		jpayEmail().email().clickSentLink();
		jpayEmail().email().click2ndDiplayedNameLinkFromSent();
		jpayEmail().email().verifyImgEcardAttachmentLinkPresent();
		jpayEmail().email().clickImgEcardAttachmentLink1();
		jpayEmail().email().verifySentImgEcardAttachmentPresent();
		jpayEmail().email().clickCloseAttachmentButton();
		jpayEmail().email().clickImgEcardAttachmentLink2();
		jpayEmail().email().verifySentImgEcardAttachmentPresent();
		jpayEmail().email().clickCloseAttachmentButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on sent link and verify letter status for 1st 2 letter.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-89 :: DesignSteps"
			+ "::36,37,38(Click on sent link and verify letter status for 1st 2 letter.)")
	public void verifySentLetterStatus() {

		jpayEmail().email().clickSentLink();
		jpayEmail().email().verifySentPageIstLetterStatus(status);
		jpayEmail().email().verifySentPage2ndLetterStatus(status);
		
	}


	/*********************************************************************************
	 * 
	 * Click on Home link,verify page title and click logout.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-89 :: Design "
			+ "Steps::39,40,41(Click on Home link,verify page title and click logout.)")
	public void testEnd() {
		
		jpayEmail().headerNavigation().clickHomeLink();
		jpayEmail().login().verifyTitle(PageConstant.HOME_TITLE);
		jpayEmail().login().clickLogoutButton();
	}



	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_89Test(data) };
	}
	
	
	public EmailWTC_89Test(Map<String, String> data) {
		super(data);
		
		username = data.get("username");
		password =data.get("password");
		variation = data.get("variation");
		status = data.get("status");
		
		
		
	}

	


}
