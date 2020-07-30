package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_122To123Test extends BaseTestObject{

	private String variation="";
	private String personalDetails="";
	private String username="";
	private String password="";
	private String adminSystem="";
	private String notificationCategory;
	private String phoneTypeAndroid;
	private String agency1;
	private String agency2;
	private String messageWithoutImage;
	private String notificationConfirmMessage;
	private String phoneTypeIos;
	private String agency3;
	private String agency4;
	private String messageWithImage;
	
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC122To123 - (122.User shall be able to send marketing notification(Plain)
	 *                            123.User shall be able to send marketing notification(Image))
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC122To123
	 * Status :: Completed
	 * 
	 **************************************************************************************************/
	
	
	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description ="TestCases::WTC-122,123::DesignSteps"
			+ "::1,2,3,4,5,6(Navigate to Staging website,verify personal and admin details,"
			+ "enter username,password and click Login button.)")
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
	 * Click on Notification link,click create new link,select category and phone 
	 * type,check Notification to send location,click on source,enter notification 
	 * message,click on source,click on send now button,verify confirmation message 
	 * and confirmation message id present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-122::DesignSteps::"
			+ "7,8,9,10,11,12,13,14,15,16,17,18(Click on Notification link,click create "
			+ "new link,select category and phone type,check Notification to send location,"
			+ "click on source,enter notification message,click on source,click on send now "
			+ "button,verify confirmation message and confirmation message id present.)")
	public void sendNotification1AndVerifyForTC122() {
		
		jpayStaging().stagingMarketing().clickMarketingLink();
		jpayStaging().stagingMarketing().clickNotificationsCreateNewLink();
		jpayStaging().stagingMarketing().selectNotificationCategory(notificationCategory);
		jpayStaging().stagingMarketing().selectNotificationSendToPhoneType(phoneTypeAndroid);
		jpayStaging().stagingMarketing().checkNotificationsUserWithInmatesFrom(agency1);
		jpayStaging().stagingMarketing().checkNotificationsUserWithInmatesFrom(agency2);
		jpayStaging().stagingMarketing().clickNotificationsSourceButton();
		jpayStaging().stagingMarketing().enterNotificationsMessage(messageWithoutImage);
		jpayStaging().stagingMarketing().clickNotificationsSourceButton();
		jpayStaging().stagingMarketing().clickNotificationsSendNowButton();
		jpayStaging().stagingMarketing().verifyNotificationSendConfirmMessage(notificationConfirmMessage);
		jpayStaging().stagingMarketing().verifyNotificationSendConfirmMessageIdPresent();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Notification back button,select category and phone 
	 * type,check Notification to send location,click on source,enter notification 
	 * message,click on source,click on send now button,verify confirmation message 
	 * and confirmation message id present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-122::DesignSteps::"
			+ "19,20,21,22,23,24,25,26(Click on Notification back button,select "
			+ "category and phone type,check Notification to send location,click on source,"
			+ "enter notification message,click on source,click on send now button,verify "
			+ "confirmation message and confirmation message id present.)")
	public void sendNotification2AndVerifyForTC122() {
		
		jpayStaging().stagingMarketing().clickNotificationsBackButton();;
		jpayStaging().stagingMarketing().selectNotificationSendToPhoneType(phoneTypeIos);
		jpayStaging().stagingMarketing().clickNotificationsSourceButton();
		jpayStaging().stagingMarketing().enterNotificationsMessage(messageWithoutImage);
		jpayStaging().stagingMarketing().clickNotificationsSourceButton();
		jpayStaging().stagingMarketing().clickNotificationsSendNowButton();
		jpayStaging().stagingMarketing().verifyNotificationSendConfirmMessage(notificationConfirmMessage);
		jpayStaging().stagingMarketing().verifyNotificationSendConfirmMessageIdPresent();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Notification link,click create new link,select category and phone 
	 * type,check Notification to send location,click on source,enter notification 
	 * message,click on source,click on send now button,verify confirmation message 
	 * and confirmation message id present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-123::DesignSteps::"
			+ "7,8,9,10,11,12,13,14,15,16,17,18(Click on Notification link,click create "
			+ "new link,select category and phone type,check Notification to send location,"
			+ "click on source,enter notification message,click on source,click on send now "
			+ "button,verify confirmation message and confirmation message id present.)")
	public void sendNotification1AndVerifyForTC123() {
		
		jpayStaging().stagingMarketing().clickNotificationsCreateNewLink();
		jpayStaging().stagingMarketing().selectNotificationCategory(notificationCategory);
		jpayStaging().stagingMarketing().selectNotificationSendToPhoneType(phoneTypeAndroid);
		jpayStaging().stagingMarketing().checkNotificationsUserWithInmatesFrom(agency1);
		jpayStaging().stagingMarketing().checkNotificationsUserWithInmatesFrom(agency2);
		jpayStaging().stagingMarketing().clickNotificationsSourceButton();
		jpayStaging().stagingMarketing().enterNotificationsMessage(messageWithImage);
		jpayStaging().stagingMarketing().clickNotificationsSourceButton();
		jpayStaging().stagingMarketing().clickNotificationsSendNowButton();
		jpayStaging().stagingMarketing().verifyNotificationSendConfirmMessage(notificationConfirmMessage);
		jpayStaging().stagingMarketing().verifyNotificationSendConfirmMessageIdPresent();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Notification back button,select category and phone 
	 * type,check Notification to send location,click on source,enter notification 
	 * message,click on source,click on send now button,verify confirmation message 
	 * and confirmation message id present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-123::DesignSteps::"
			+ "19,20,21,22,23,24,25,26(Click on Notification back button,select "
			+ "category and phone type,check Notification to send location,click on source,"
			+ "enter notification message,click on source,click on send now button,verify "
			+ "confirmation message and confirmation message id present.)")
	public void sendNotification2AndVerifyForTC123() {
		
		jpayStaging().stagingMarketing().clickNotificationsBackButton();
		jpayStaging().stagingMarketing().selectNotificationSendToPhoneType(phoneTypeIos);
		jpayStaging().stagingMarketing().clickNotificationsSourceButton();
		jpayStaging().stagingMarketing().enterNotificationsMessage(messageWithoutImage);
		jpayStaging().stagingMarketing().clickNotificationsSourceButton();
		jpayStaging().stagingMarketing().clickNotificationsSendNowButton();
		jpayStaging().stagingMarketing().verifyNotificationSendConfirmMessage(notificationConfirmMessage);
		jpayStaging().stagingMarketing().verifyNotificationSendConfirmMessageIdPresent();
		
	}

	/*********************************************************************************
	 * 
	 * Click administration link,click signout button and verify.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-122,123::DesignSteps"
			+ "::27,28,29(Click administration link,click signout button and verify.)")
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
		return new Object[] { new EmailWTC_122To123Test(data) };
	}
	
	
	
	public EmailWTC_122To123Test(Map<String, String> data) {
		super(data);
		
		
		
		variation = data.get("variation");
		personalDetails = data.get("personalDetails");
		username = data.get("username");
		password = data.get("password");
		adminSystem = data.get("adminSystem");
		
		notificationCategory = data.get("notificationCategory");
		phoneTypeAndroid = data.get("phoneTypeAndroid");
		phoneTypeIos = data.get("phoneTypeIos");
		agency1 = data.get("agency1");
		agency2 = data.get("agency2");
		agency3 = data.get("agency3");
		agency4 = data.get("agency4");
		messageWithoutImage = data.get("messageWithoutImage");
		messageWithImage = data.get("messageWithImage");
		notificationConfirmMessage = data.get("notificationConfirmMessage");
		
		
		
	}

}
