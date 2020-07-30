package com.jpay.media.automation.web.email.testcases;

import java.util.Map;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.jpay.media.automation.web.baseobjects.BaseTestObject;
import com.jpay.media.automation.web.utilities.DataCollection;

public class EmailWTC_126Test extends BaseTestObject{

	
	
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
	private String phoneTypeIos;
	private String draftMsg;
	private String sentMsg;
	private String searchMsg;
	private String notificationConfirmMessageDraft;
	private String notificationConfirmMessageSent;
	
	private static String Draft_Notifications_No;
	private static String Send_Notifications_No;
	
	/************************************************************************************************
	 * 
	 * TestCase :: WTC126 - (User shall be able to search marketing notification.)
	 * Author :: shasan(Shahriar Hasan) , Date :: 
	 * DataFile :: Email.xlsx , DataSheet :: WTC126
	 * Status :: Completed
	 * 
	 **************************************************************************************************/
	
	
	
	/*********************************************************************************
	 * 
	 * Navigate to Staging website,verify personal and admin details,
	 * enter username,password and click Login button.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 1, description ="TestCases::WTC-126::DesignSteps"
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
	 * message,click on source,click on draft button,verify confirmation message 
	 * and confirmation message id present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 2, description = "TestCases::WTC-126::DesignSteps::"
			+ "7,8,9,10,11,12,13,14,15,16,17,18(Click on Notification link,click create "
			+ "new link,select category and phone type,check Notification to send location,"
			+ "click on source,enter notification message,click on source,click on draft "
			+ "button,verify confirmation message and confirmation message id present.)")
	public void draftNotificationAndVerify() {
		
		jpayStaging().stagingMarketing().clickMarketingLink();
		jpayStaging().stagingMarketing().clickNotificationsCreateNewLink();
		jpayStaging().stagingMarketing().selectNotificationCategory(notificationCategory);
		jpayStaging().stagingMarketing().selectNotificationSendToPhoneType(phoneTypeAndroid);
		jpayStaging().stagingMarketing().checkNotificationsUserWithInmatesFrom(agency1);
		jpayStaging().stagingMarketing().checkNotificationsUserWithInmatesFrom(agency2);
		jpayStaging().stagingMarketing().clickNotificationsSourceButton();
		jpayStaging().stagingMarketing().enterNotificationsMessage(messageWithoutImage);
		jpayStaging().stagingMarketing().clickNotificationsSourceButton();
		jpayStaging().stagingMarketing().clickNotificationsDraftButton();
		jpayStaging().stagingMarketing().verifyNotificationSendConfirmMessage(notificationConfirmMessageDraft);
		jpayStaging().stagingMarketing().verifyNotificationSendConfirmMessageIdPresent();
		Draft_Notifications_No = jpayStaging().stagingMarketing().getNotificationsMessageId();
		
	}
	
	/*********************************************************************************
	 * 
	* Click on Notification link,click create new link,select category and phone 
	 * type,check Notification to send location,click on source,enter notification 
	 * message,click on source,click on send now button,verify confirmation message 
	 * and confirmation message id present.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 3, description = "TestCases::WTC-126::DesignSteps::"
			+ "19,20,21,22,23,24,25,26,27,28,29,30(Click on Notification link,click create "
			+ "new link,select category and phone type,check Notification to send location,"
			+ "click on source,enter notification message,click on source,click on send now "
			+ "button,verify confirmation message and confirmation message id present.)")
	public void sendNotificationAndVerify() {
		
		jpayStaging().stagingMarketing().clickNotificationsCreateNewLink();
		jpayStaging().stagingMarketing().selectNotificationCategory(notificationCategory);
		jpayStaging().stagingMarketing().selectNotificationSendToPhoneType(phoneTypeIos);
		jpayStaging().stagingMarketing().checkNotificationsUserWithInmatesFrom(agency1);
		jpayStaging().stagingMarketing().checkNotificationsUserWithInmatesFrom(agency2);
		jpayStaging().stagingMarketing().clickNotificationsSourceButton();
		jpayStaging().stagingMarketing().enterNotificationsMessage(messageWithoutImage);
		jpayStaging().stagingMarketing().clickNotificationsSourceButton();
		jpayStaging().stagingMarketing().clickNotificationsSendNowButton();
		jpayStaging().stagingMarketing().verifyNotificationSendConfirmMessage(notificationConfirmMessageSent);
		jpayStaging().stagingMarketing().verifyNotificationSendConfirmMessageIdPresent();
		Send_Notifications_No  = jpayStaging().stagingMarketing().getNotificationsMessageId();
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Notification draft link,click last page button if enabled,verify 
	 * drafted notification is present,click view/edit button,verify notification 
	 * message id and draft message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 4, description = "TestCases::WTC-126::DesignSteps::"
			+ "31,32,33,34,35(Click on Notification draft link,click last page button if "
			+ "enabled,verify drafted notification is present,click view/edit button,"
			+ "verify notification message id and draft message.)")
	public void clickDraftedBucketAndVerify() {
		
		jpayStaging().stagingMarketing().clickNotificationsDraftedLink();
		jpayStaging().stagingMarketing().clickNotificationsLastPageButton();
		jpayStaging().stagingMarketing().verifyNotificationIsPresent(Draft_Notifications_No);
		jpayStaging().stagingMarketing().clickNotificationsViewEditButton(Draft_Notifications_No);
		jpayStaging().stagingMarketing().verifyNotificationsMessageId(Draft_Notifications_No);
		jpayStaging().stagingMarketing().verifyViewSentNotificationInformationMsg(draftMsg);//
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Notification sent link,click last page button if enabled,verify 
	 * sent notification is present,click view/edit button,verify notification 
	 * message id and sent message.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 5, description = "TestCases::WTC-126::DesignSteps::"
			+ "36,37,38,39,40,41(Click on Notification sent link,click last page button if "
			+ "enabled,verify sent notification is present,click view/edit button,verify "
			+ "notification message id and draft message.)")
	public void clickSentBucketAndVerify() {
		
		jpayStaging().stagingMarketing().clickNotificationsSentLink();
		jpayStaging().stagingMarketing().clickNotificationsLastPageButton();
		jpayStaging().stagingMarketing().verifyNotificationIsPresent(Send_Notifications_No);
		jpayStaging().stagingMarketing().clickNotificationsViewEditButton(Send_Notifications_No);
		jpayStaging().stagingMarketing().verifyNotificationsMessageId(Send_Notifications_No);
		jpayStaging().stagingMarketing().verifyViewSentNotificationInformationMsg(sentMsg);// 
		
	}
	
	/*********************************************************************************
	 * 
	 * Click on Notification search link,verify search message,enter notification 
	 * message id to search,click on search button,verify message id and created 
	 * by,click view button, verify message id and draft message. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 6, description = "TestCases::WTC-126::DesignSteps::"
			+ "42,43,44,45,46,47,48,49,50(Click on Notification search link,verify search "
			+ "message,enter notification message id to search,click on search button,verify "
			+ "message id and created by,click view button, verify message id and draft message.)")
	public void clickSearchBucketAndVerifyDraftNotification() {
		
		jpayStaging().stagingMarketing().clickNotificationsSearchLink();
		jpayStaging().stagingMarketing().verifySearchNotificationMsg(searchMsg);
		jpayStaging().stagingMarketing().enterSearchNotificationMessageId(Draft_Notifications_No);
		jpayStaging().stagingMarketing().clickNotificationsSearchButton();
		jpayStaging().stagingMarketing().verifySearchedNotificationsMessageId(Draft_Notifications_No);
		jpayStaging().stagingMarketing().verifySearchedNotificationsCreatedBy(username);
		jpayStaging().stagingMarketing().clickSearchedNotificationsViewButton();
		jpayStaging().stagingMarketing().verifyNotificationsMessageId(Draft_Notifications_No);
		jpayStaging().stagingMarketing().verifyViewSentNotificationInformationMsg(draftMsg);
		
	}
	/*********************************************************************************
	 * 
	 * Click on Notification search link,verify search message,enter notification 
	 * message id to search,click on search button,verify message id and created 
	 * by,click view button, verify message id and draft message. 
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 7, description = "TestCases::WTC-126::DesignSteps::"
			+ "51,52,53,54,55,56,57,58,59(Click on Notification search link,verify search "
			+ "message,enter notification message id to search,click on search button,verify "
			+ "message id and created by,click view button, verify message id and sent message.)")
	public void clickSearchBucketAndVerifySentNotification() {
		
		jpayStaging().stagingMarketing().clickNotificationsSearchLink();
		jpayStaging().stagingMarketing().verifySearchNotificationMsg(searchMsg);
		jpayStaging().stagingMarketing().enterSearchNotificationMessageId(Send_Notifications_No);
		jpayStaging().stagingMarketing().clickNotificationsSearchButton();
		jpayStaging().stagingMarketing().verifySearchedNotificationsMessageId(Send_Notifications_No);
		jpayStaging().stagingMarketing().verifySearchedNotificationsCreatedBy(username);
		jpayStaging().stagingMarketing().clickSearchedNotificationsViewButton();
		jpayStaging().stagingMarketing().verifyNotificationsMessageId(Send_Notifications_No);
		jpayStaging().stagingMarketing().verifyViewSentNotificationInformationMsg(sentMsg);
		
	}
	
	/*********************************************************************************
	 * 
	 * Click administration link,click signout button and verify.
	 * 
	 **********************************************************************************/

	@Test(enabled = true, priority = 8, description = "TestCases::WTC-126::DesignSteps"
			+ "::60,61,62(Click administration link,click signout button and verify.)")
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
		return new Object[] { new EmailWTC_126Test(data) };
	}
	
	
	
	public EmailWTC_126Test(Map<String, String> data) {
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
		messageWithoutImage = data.get("messageWithoutImage");
		notificationConfirmMessageSent = data.get("notificationConfirmMessageSent");
		notificationConfirmMessageDraft = data.get("notificationConfirmMessageDraft");
		draftMsg = data.get("draftMsg");
		sentMsg = data.get("sentMsg");
		searchMsg = data.get("searchMsg");
		
		
	}

}
