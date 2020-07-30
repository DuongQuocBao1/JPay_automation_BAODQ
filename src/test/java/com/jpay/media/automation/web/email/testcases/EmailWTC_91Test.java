package com.jpay.media.automation.web.email.testcases;

import java.util.Map;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_91Test extends BaseTestObject{

	private String variation="";
	private String personalDetails="";
	private String username="";
	private String password="";
	private String adminSystem="";
	private String facility="";
	private String emailMsg;
	
	
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC91 - (Send Spam generator letter from staging )
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC91
	 * Status :: Completed
	 * 
	 **************************************************************************************************/
	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description = "TestCases::WTC-91::Design Steps"
			+ "::1,2,3,4,5,6(Navigate to Staging website,verify personal and admin "
			+ "details,enter username,password and click Login button.)")
	public void testStart() {
		
		jpayStaging().stagingLogin().loadURL(envUrlStaging,variation);
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		jpayStaging().stagingLogin().verifyStagingAdminSystem(adminSystem);
		jpayStaging().stagingLogin().enterUsername(username);
		jpayStaging().stagingLogin().enterPassword(password);
		jpayStaging().stagingLogin().clickLoginButton();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Administration link,click on spam generator link,select facility,
	 * click add facility button,click add date button,click add inmate button,
	 * enter letter message,click on preview button,click on send button and 
	 * verify send success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-91::Design Steps"
			+ "::7,8,9,10,11,12,13,14,15,16(Click on Administration link,click on spam "
			+ "generator link,select facility,click add facility button,click add date "
			+ "button,click add inmate button,enter letter message,click on preview "
			+ "button,click on send button and verify send success message.)")
	public void sendSpamGeneratorLetterAndVerify1() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingAdmin().clickSpamGeneratorLink();
		jpayStaging().stagingAdmin().selectSGChooseFacility(facility);
		jpayStaging().stagingAdmin().clickSGAddInmateNameButton();
		jpayStaging().stagingAdmin().clickSGAddDateButton();
		jpayStaging().stagingAdmin().clickSGAddInmateNameButton();
		jpayStaging().stagingAdmin().enterSGWriteLetterContent(emailMsg);
		jpayStaging().stagingAdmin().clickSGPreviewButton();
		jpayStaging().stagingAdmin().clickSGSendButton();
		jpayStaging().stagingAdmin().verifySGLetterSentSuccessMsg();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Administration link,click on spam generator link,select facility,
	 * click add facility button,click add date button,click add inmate button,
	 * enter letter message,click on preview button,click on send button and 
	 * verify send success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-91::Design Steps"
			+ "::17,18,19,20,21,22,23,24,25(Click on spam generator link,select facility,"
			+ "click add facility button,click add date button,click add inmate button,"
			+ "enter letter message,click on preview button,click on send button and "
			+ "verify send success message.)")
	public void sendSpamGeneratorLetterAndVerify2() {
		
		jpayStaging().stagingAdmin().clickSpamGeneratorLink();
		jpayStaging().stagingAdmin().selectSGChooseFacility(facility);
		jpayStaging().stagingAdmin().clickSGAddInmateNameButton();
		jpayStaging().stagingAdmin().clickSGAddDateButton();
		jpayStaging().stagingAdmin().clickSGAddInmateNameButton();
		jpayStaging().stagingAdmin().enterSGWriteLetterContent(emailMsg);
		jpayStaging().stagingAdmin().clickSGPreviewButton();
		jpayStaging().stagingAdmin().clickSGSendButton();
		jpayStaging().stagingAdmin().verifySGLetterSentSuccessMsg();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Administration link,click on spam generator link,select facility,
	 * click add facility button,click add date button,click add inmate button,
	 * enter letter message,click on preview button,click on send button and 
	 * verify send success message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-91::Design Steps"
			+ "::26,27,28,29,30,31,32,33,34(Click on spam generator link,select facility,"
			+ "click add facility button,click add date button,click add inmate button,"
			+ "enter letter message,click on preview button,click on send button and "
			+ "verify send success message.)")
	public void sendSpamGeneratorLetterAndVerify3() {
		
		jpayStaging().stagingAdmin().clickSpamGeneratorLink();
		jpayStaging().stagingAdmin().selectSGChooseFacility(facility);
		jpayStaging().stagingAdmin().clickSGAddInmateNameButton();
		jpayStaging().stagingAdmin().clickSGAddDateButton();
		jpayStaging().stagingAdmin().clickSGAddInmateNameButton();
		jpayStaging().stagingAdmin().enterSGWriteLetterContent(emailMsg);
		jpayStaging().stagingAdmin().clickSGPreviewButton();
		jpayStaging().stagingAdmin().clickSGSendButton();
		jpayStaging().stagingAdmin().verifySGLetterSentSuccessMsg();
		
	}
	
	
	
	/*********************************************************************************
	 * 
	 * Click administration link,click signout button and verify.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-91::Design Steps"
			+ "::35,36,37(Click administration link,click signout button and verify.)")
	public void endTest() {
		
		jpayStaging().stagingHome().clickAdministration();
		jpayStaging().stagingHome().clickSignOutButton();
		jpayStaging().stagingLogin().verifyPersonalDetails(personalDetails);
		
	}
	
	
	
	
	
	
	/**********************************************************************************************
	 * Setting Up Data For The Test
	 ***********************************************************************************************/
	
	@Factory(dataProvider = "getData",dataProviderClass = DataCollection.class)
	public static Object[] createInstances(Map<String, String>data) {
		return new Object[] { new EmailWTC_91Test(data) };
	}
	
	
	public EmailWTC_91Test(Map<String, String> data) {
		super(data);
		
		
		variation = data.get("variation");
		personalDetails = data.get("personalDetails");
		username = data.get("username");
		password = data.get("password");
		adminSystem = data.get("adminSystem");
		facility = data.get("facility");
		emailMsg = data.get("emailMsg");
		
		
		
	}

}
